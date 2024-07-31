package DependencyInjection_setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientDI {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Employee employee = (Employee) context.getBean("employee");
        employee.displayEmployeeInfo();
    }
}
