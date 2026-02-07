class Employee {
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

        e.empId = 106;
        e.empName = "Ronit Nagpal";
        e.department = "BCA";
        e.salary = 70000;

        e.display();
    }
}
