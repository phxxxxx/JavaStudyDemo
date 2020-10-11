package com.company;

public class Ticket02 implements Runnable{
    private int tickets = 100;

    @Override
    public void run() {
        while (true){
          synchronized (this){
              try {
                  if (tickets>0){
                      Thread.sleep(10);
                      String name = Thread.currentThread().getName();
                      System.out.println(name+"正在卖第"+tickets--+"张票");
                  }else{
                      break;
                  }
              }catch (InterruptedException e){
                  e.printStackTrace();
              }
          }
        }
    }
}
