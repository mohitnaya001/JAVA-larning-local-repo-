public class ThisKeyword {

    public static void main(String[] args) {
        Student s1 = new Student(106, "Ronit", 5000);
        Student s2 = new Student(53, "Mahek", 6000);

        s1.display();
        s2.display();
    }
}

class Student {
    int rollNo;
    String name;
    float fee;

    Student(int rollNo, String name, float fee) {
        this.rollNo = rollNo;
        this.name = name;
        this.fee = fee;
    }

    void display() {
        System.out.println(rollNo + " " + name + " " + fee);
    }
}
