package backtracking;

import com.devskiller.library.model.Book;
import com.devskiller.library.model.User;
import com.devskiller.library.model.BookBorrowing;
import com.devskiller.library.repository.BooksRepository;
import com.devskiller.library.repository.BorrowingsRepository;
import com.devskiller.library.exception.*;

import java.util.List;
import java.util.Optional;

public class BookService {

    private final BooksRepository booksRepository;
    private final BorrowingsRepository borrowingsRepository;

    public BookService(BooksRepository booksRepository, BorrowingsRepository borrowingsRepository) {
        this.booksRepository = booksRepository;
        this.borrowingsRepository = borrowingsRepository;
    }

    public void borrowBook(User user, Book book) {
        Optional<Integer> bookCountOpt = booksRepository.getBookCount(book);
        if (!bookCountOpt.isPresent()) {
            throw new BookNotFoundException();
        }

        int availableCopies = bookCountOpt.get();
        if (availableCopies == 0) {
            throw new BookNotAvailableException();
        }

        List<BookBorrowing> borrowings = borrowingsRepository.getByUser(user);
        for (BookBorrowing borrowing : borrowings) {
            if (borrowing.getBook().equals(book)) {
                throw new BookAlreadyBorrowedException();
            }
        }

        borrowings.add(new BookBorrowing(user, book));
        borrowingsRepository.save(user, borrowings);
        booksRepository.save(book, availableCopies - 1);
    }

    public void returnBook(User user, Book book) {
        List<BookBorrowing> borrowings = borrowingsRepository.getByUser(user);
        boolean bookFound = false;

        for (BookBorrowing borrowing : borrowings) {
            if (borrowing.getBook().equals(book)) {
                borrowings.remove(borrowing);
                bookFound = true;
                break;
            }
        }

        if (!bookFound) {
            throw new BookBorrowingNotFoundException();
        }

        borrowingsRepository.save(user, borrowings);
        Optional<Integer> bookCountOpt = booksRepository.getBookCount(book);
        booksRepository.save(book, bookCountOpt.orElse(0) + 1);
    }

    public void addBookCopy(Book book) {
        Optional<Integer> bookCountOpt = booksRepository.getBookCount(book);
        int newCount = bookCountOpt.orElse(0) + 1;
        booksRepository.save(book, newCount);
    }

    public void removeBookCopy(Book book) {
        Optional<Integer> bookCountOpt = booksRepository.getBookCount(book);
        if (!bookCountOpt.isPresent()) {
            throw new BookNotFoundException();
        }

        int availableCopies = bookCountOpt.get();
        if (availableCopies == 0) {
            throw new BookNotAvailableException();
        }

        booksRepository.save(book, availableCopies - 1);
    }

    public int getAvailableBookCopies(Book book) {
        Optional<Integer> bookCountOpt = booksRepository.getBookCount(book);
        if (!bookCountOpt.isPresent()) {
            throw new BookNotFoundException();
        }
        return bookCountOpt.get();
    }
}