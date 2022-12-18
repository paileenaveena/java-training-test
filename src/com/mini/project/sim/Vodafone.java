package com.mini.project.sim;

public class Vodafone implements SIM{
    @Override
    public String sendAnSMS(long mobileNo, String message) {
        System.out.println("processing the implementation for sending an SMS.Mobile No :"+ mobileNo +",Message :"+message);
        String ack = "Vodafone :your SMS send successfully";
        return ack;
    }

    @Override
    public String dailCall(long mobileNo) {
        System.out.println("calling Number : " +mobileNo);
         String ack = "Vodafone : the number your dialing is busy please call after some time.";
         return ack;
    }
}
