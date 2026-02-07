class Calculator {
    int a = 20;
    int b = 10;

    void add() {
        System.out.println("Addition: " + (a + b));
    }

    void subtract() {
        System.out.println("Subtraction: " + (a - b));
    }
}

class AdvancedCalculator extends Calculator {

    void multiply() {
        System.out.println("Multiplication: " + (a * b));
    }

    void divide() {
        System.out.println("Division: " + (a / b));
    }

    public static void main(String[] args) {
        AdvancedCalculator calc = new AdvancedCalculator();

        calc.add();
        calc.subtract();
        calc.multiply();
        calc.divide();
    }
}
