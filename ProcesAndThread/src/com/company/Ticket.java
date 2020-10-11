package com.company;

public class Ticket extends Thread{
    private int tickets = 100;
    private  String name;

    public Ticket(String name){
        this.name = name;
    }

    public void run(){
        while (true){
            if (tickets>0){
                System.out.println(name + "正在发售"+tickets--+"张票");
            }else{
                break;
            }
        }
    }
}
