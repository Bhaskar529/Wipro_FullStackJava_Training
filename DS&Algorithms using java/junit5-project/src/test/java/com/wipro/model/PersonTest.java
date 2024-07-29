package com.wipro.model;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class PersonTest {
	private Person person=null;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("JUnit testing begins..");
	}
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("End of junit testing");
	}
	@BeforeEach
	void setUp() throws Exception {
		person = new Person(987676767891L,"Smith",GenderTyp.MALE,LocalDate.of(1998, 10,10),"Hyderabad",8767543255L);
	}
	@AfterEach
	void tearDown() throws Exception {
		person=null;
	}
	@Test
	void testPersonLongStringGenderTypLocalDateStringLong() {
		assertEquals(987676767891L, person.getAdharCard());
	}
	@Test
	void testGetAdharCard() {
		assertEquals(987676767891L, person.getAdharCard());
	}
	@Test
	void testSetAdharCardForTrue() {
		person.setAdharCard(1L);
		assertEquals(1L,person.getAdharCard());
	}
	
	@Test
	void testSetAdharCardForFalse() {
		person.setAdharCard(1L);
		assertNotEquals(2L,person.getAdharCard());
	}
	
}
