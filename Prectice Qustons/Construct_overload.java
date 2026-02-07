public class Construct_overload {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.display();

        Student s2 = new Student(52, "mahek");
        s2.display();
    }
}

class Student {
    int id;
    String name;

    Student() {
        id = 106;
        name = "ronit";
    }

    public Student(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println("id=" + id);
        System.out.println("name=" + name);
    }
}
