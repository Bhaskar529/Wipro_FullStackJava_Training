package datastructures.linear;
import java.util.Queue;
import java.util.LinkedList;
public class QueueImplementation {


		public static void main(String[] args) {
			Queue<String> que=new LinkedList<>();
			que.add("one");
			que.add("two");
			que.add("three");
			que.add("four");
			que.add("five");
			
			System.out.println(que.size());
			System.out.println(que);
			System.out.println("------------------------");
			que.remove("five");
			System.out.println(que.size());
			System.out.println(que);
			System.out.println("--------------------");
			que.clear();
			System.out.println(que.size());
			System.out.println(que);

		}

	
}
