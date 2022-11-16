package modifiers;

public class ModifiersDemo1 {
    public int intvariable = 10;
    public String stringvariable = "Hello";


    public int method1() {
        System.out.println("invoked method1()");
        return 100;

    }

    public void method2() {
        System.out.println("invoked method2()");
    }

    public static void main(String[] args) {
        System.out.println("in main method");
        ModifiersDemo1 md = new ModifiersDemo1();

        System.out.println(md.intvariable);
        System.out.println(md.stringvariable);

        md.method1();
        md.method2();
    }
}


