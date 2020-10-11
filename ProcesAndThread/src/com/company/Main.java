package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//    ThreadDemo demo = new ThreadDemo();
//        demo.start();
//        for (int i = 0; i < 5; i++) {
//            System.out.println("主方法main（）执行了");
//        }
//    ThreadDemo02 demo02 = new ThreadDemo02();
//    Thread thread = new Thread(demo02);
//    thread.start();
//        for (int i = 0; i < 5 ; i++) {
//            System.out.println("main methed is running");
//        }
        /****************************************************************************/
        Ticket02 ticket02 = new Ticket02();

        Thread t1 = new Thread(ticket02,"窗口1");
        Thread t2 = new Thread(ticket02,"窗口2");
        Thread t3 = new Thread(ticket02,"窗口3");
        Thread t4 = new Thread(ticket02,"窗口4");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        /********************************************************************************/
    }
}
