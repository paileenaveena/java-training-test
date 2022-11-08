package controlstatements;

public class DemoIfCase {
    public static void main(String[] args) {
        int i = 100;
        if (i == 100) { // 100 == 100 ==>true
            System.out.println("I value is 100 .executing if condition");
        } else if (i == 90) { // 90 == 100 ==. false
            System.out.println("i value is 90 .executing else if condition");
        } else { // false block
            System.out.println("i value is not 100. execute else condition");
        }
    }

}


