class LAB5_1 {
    int empId;
    String empName;
    String department;
    double salary;

    void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee e = new Employee();

        e.empId = 291056;
        e.empName = "xyz";
        e.department = "Sales";
        e.salary = 525000;

        e.display();
    }
}
