package DependencyInjection_constructor;

public class Department {
    public void displayDepartment(String empType) {
        if (empType.equals("HR")) {
            System.out.println("HR Department, Role: Recruitment, Employee Benefits");
        } else if (empType.equals("Admin")) {
            System.out.println("Admin dept: Transportation to employees, food coupons etc.");
        } else if (empType.equals("Technology")) {
            System.out.println("Technology dept: Research and development, training etc.");
        } else {
            System.out.println("Unknown Department");
        }
    }
}
