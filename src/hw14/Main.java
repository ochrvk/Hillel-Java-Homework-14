package hw14;

import java.lang.reflect.Method;

public class Main {
    public static final int a = 5;
    public static final int b = 3;

    public static void reflection(String name) {
        try {
            Calc calc = new Calc(a, b);
            Method method = calc.getClass().getDeclaredMethod(name);
            method.setAccessible(true);
            method.invoke(calc);
        } catch (Exception e) {
            System.out.println(name + " not found");
        }
    }

    public static void main(String[] args) {
        String line = "plus";
        reflection(line);
    }
}
