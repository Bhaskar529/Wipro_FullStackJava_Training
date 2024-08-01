package DependencyInjection_constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientDI {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("BeansAutowired.xml");
        Employee employee = (Employee) context.getBean("Employee");
        employee.displayEmployeeInfo();
    }
}
