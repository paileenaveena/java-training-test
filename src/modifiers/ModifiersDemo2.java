package modifiers;

public class ModifiersDemo2 {
    public static void main(String[] args) {
        System.out.println(" in main method ModifierDemo2 ");
        ModifiersDemo1 md = new ModifiersDemo1();
        System.out.println(md.intvariable);
        System.out.println(md.stringvariable);
        md.method1();
        md.method2();
    }
}
