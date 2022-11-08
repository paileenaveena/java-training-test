package returntype;

public class DemoReturn {
    public static void main(String[] args) {
        DemoReturn dr = new DemoReturn();
        int result = dr.m1();
        System.out.println(result);
        double result1 = dr.m2();
        System.out.println(result1);
        char result2 = dr.m3();
        System.out.println(result2);

    }

    public int m1() {
        System.out.println("HelloWorld");
        int a = 100;
        return a;
    }

    public double m2() {
        System.out.println("Hello");
        double a = 2000;
        return a;
    }

    public char m3() {
        System.out.println("Hi");
        char a = 'A';
        return a;
    }
}




