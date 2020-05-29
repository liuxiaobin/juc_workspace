package com.msbvip.juc.c_001;

import java.util.concurrent.TimeUnit;

/**
 * @Classname T01_WhatIsThread
 * @Description TODO
 * @Date 2020/5/26 10:50
 * @Created by xbliu
 */
public class T01_WhatIsThread {
    //程序是一个最小单元叫做线程，一个程序内不同的执行路径；
    private static class T1 extends Thread {

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                try {
                    TimeUnit.MICROSECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("T1");
            }

        }
    }

    public static void main(String[] args) {
        //new T1().run();
        new T1().start();
        for (int j = 0; j < 10; j++) {
            try {
                TimeUnit.MICROSECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("main");
        }

    }
}
