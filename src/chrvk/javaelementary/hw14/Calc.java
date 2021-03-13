package chrvk.javaelementary.hw14;

public class Calc {
    private int a;
    private int b;

    public Calc(int a, int b) {
        this.a = a;
        this.b = b;
    }

    private void plus() {
        System.out.println("a + b = " + (a + b));
    }

    private void divided() {
        System.out.println("a / b = " + ((double)a / (double)b));
    }

    private void minus() {
        System.out.println("a - b = " + (a - b));
    }

    private void times() {
        System.out.println("a * b = " + (a * b));
    }
}
