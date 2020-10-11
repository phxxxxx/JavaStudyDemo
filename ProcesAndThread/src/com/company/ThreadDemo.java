package com.company;

public class ThreadDemo extends Thread {
    @Override
    public void run() {
//        super.run();
        for (int i = 0; i < 5; i++) {
            System.out.println("thread");

        }
    }
}
