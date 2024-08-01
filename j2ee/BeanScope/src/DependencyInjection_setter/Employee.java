package DependencyInjection_setter;

public class Employee {
    private int empId;
    private String name;
    private String dept;
    private Department department;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void displayEmployeeInfo() {
        System.out.println("Employee id " + empId);
        System.out.println("Name : " + name);
        System.out.println("Dept type : " + dept);
        department.displayDepartment(dept);
    }
}
