package singleton_bean_scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ClientBeanScope {
	public static void main(String[] args) {
		ApplicationContext context=
				new ClassPathXmlApplicationContext("SingletonScope.xml");
		Hello obj1=(Hello)context.getBean("helloBean");
		obj1.setMsg("This is a singleton bean");
		System.out.println("obj1:");
		obj1.getMsg();
		
		Hello obj2=(Hello)context.getBean("helloBean");
		obj2.setMsg("This is set from second bean object...");
		System.out.println("obj2:");
		obj2.getMsg();
		System.out.println("obj2:");
		obj1.getMsg();
	}
	
}
