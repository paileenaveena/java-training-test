package com.mini.project.sim;

public class Mobile {
    private SIM sim;
    public void insertSIM(String simName)throws Exception{
        String simBasepackage ="com.mini.project.sim."+simName;
        Class simclass = Class.forName(simBasepackage);
       Object simobject = simclass.newInstance();
       if (simobject instanceof SIM){
           sim =(SIM)simobject;
       }else {
           throw new  Exception("invalid SIM inserted");
       }
    }
    public String dailCall(long mobileNo){
       return sim.dailCall(mobileNo);
    }
    public String sendAnSMS(long mobileNo,String message){
        return sim.sendAnSMS(mobileNo,message);
    }
}
