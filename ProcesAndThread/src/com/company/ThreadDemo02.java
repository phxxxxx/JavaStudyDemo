package com.company;

public class ThreadDemo02 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("runnable的run方法执行");
        }
    }
}
