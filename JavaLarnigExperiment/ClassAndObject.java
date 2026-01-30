package JavaLarnigExperiment;

class store{
    private int mic;
    private int cam;
    void setvalue(){
        mic = 2;
        cam = 4;
    }
    void display(){
        System.out.println(mic);
        System.out.println(cam);
    }
}
public class ClassAndObject {
    public static void main(String[] args) {
        store S1 = new store();
        S1.setvalue(); 
        S1.display();

    }
}