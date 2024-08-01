package Defaultpackage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class client {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("helloBean.xml");
        Employee obj = (Employee) context.getBean("empBean");
        System.out.println("Printing employee details..");
        System.out.println("Employee Id: " + obj.getEmpId());
        System.out.println("Employee Name: " + obj.getName());
        System.out.println("Employee Department: " + obj.getDept());
        System.out.println("Employee Designation: " + obj.getDesignation());
    }
}
