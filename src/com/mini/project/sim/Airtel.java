package com.mini.project.sim;

public class Airtel implements SIM {
    @Override
    public String sendAnSMS(long mobileNo, String message) {
        System.out.println("processing the implementation for sending an SMS.Mobile No :"+ mobileNo +",Message :"+message);
      String ack = "Airtel :your SMS send successfully";
        return ack;
    }

    @Override
    public String dailCall(long mobileNo) {
        System.out.println("Calling Number :"+ mobileNo);
        String ack = "Airtel : the number your dailing is busy please call after some time.";
        return ack;
    }
}
