import com.mini.project.sim.Mobile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class MobileUser {
    public static void main(String[] args) throws Exception {
        Mobile iphone = new Mobile();
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.println("please Insert SIM");
       String userSIM = br.readLine();
       iphone.insertSIM(userSIM);
        System.out.println("Type 1 and press <Enter> key to send an SMS");
        System.out.println("Type 2 and press <Enter> key to make a call");
        System.out.println( "Enter your option");
        String option = br.readLine();
        if (option.equals("1")) {
            System.out.println("type the message and press <Enter>key");
            String message = br.readLine();
            System.out.println("please enter mobileNo.");
            long mobileNo = Long.parseLong(br.readLine());
           String response = iphone.sendAnSMS(mobileNo, message);
        } else if (option.equals("2")) {
            System.out.println("please Enter mobileNo.");
            String mobileNo = br.readLine();
            String mobileNo1 = mobileNo;
            long mobileNumber = Long.parseLong(mobileNo1);
            iphone.dailCall(mobileNumber);
        }else {
            System.out.println("Invalid option selected");



        }
    }

    }

