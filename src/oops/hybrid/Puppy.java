package oops.hybrid;

public class Puppy extends Dog{
    public void woof(){
        System.out.println("puppy says woof");
    }

    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.see();
        p.smell();
        p.woof();
    }
}
