class Student {
    int rollNo;
    String name;

    Student() {
        rollNo = 0;
        name = "Not Assigned";
    }

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(101, "Rahul");

        s1.display();
        System.out.println();
        s2.display();
    }
}
