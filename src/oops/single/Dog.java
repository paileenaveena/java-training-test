package oops.single;

public class Dog extends Animal{
    int legs =4;
    public void bark(){
        System.out.println("dog can bark");
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
        d.eat();
        System.out.println("animal has eyes"+d.eyes);
        System.out.println("dog has legs"+d.legs);
    }
}
