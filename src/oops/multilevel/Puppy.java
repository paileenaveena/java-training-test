package oops.multilevel;

public class Puppy extends Dog{
    public void weep(){
        System.out.println("puppy can weep");
    }

    public static void main(String[] args) {
        Puppy p =new Puppy();
        p.eat();
        p.weep();
        p.bark();
    }
}
