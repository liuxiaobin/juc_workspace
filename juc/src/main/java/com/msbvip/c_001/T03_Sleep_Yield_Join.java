/**
 * Copyright (C), 2019-2020, 宇信融汇
 * FileName: T01_Sleep_Yield_Join
 * Author:   xbliu
 * Date:     2020/5/28 11:44
 * Description: 线程的基本方法
 * History:
 * <author>          <time>          <version>          <desc>
 * xbliu           修改时间           版本号              描述
 */
package com.msbvip.c_001;

/**
 * @Classname T01_Sleep_Yield_Join
 * @Description TODO
 * @Date 2020/5/28 11:44
 * @Created by xbliu
 * 1、sleep  让出线程休息对应的时间，重新进入队列就绪
 * 2、Yield  重新进入队列就绪
 * 3、Join  T1 线程 T2线程，如果T2线程中加入t1.join，需要等待T1线程执行完毕以后才能执行T2
 */
public class T03_Sleep_Yield_Join {
    public static void main(String[] args) {
        //testSleep();
        //testYield();
        testJoin();
    }
    //sleep当前队列休息500ms后，重新进去队列就绪
    static void testSleep() {
        new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("A"+i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
    static void testYield() {
        new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("A"+i);
                if(i%10==0){
                    Thread.yield();
                }
            }
        }).start();
        new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("B--------------"+i);
                if(i%10==0){
                    Thread.yield();
                }
            }
        }).start();
    }
    static void testJoin() {
        Thread t1 = new Thread(()->{
            for(int i=0; i<100; i++) {
                System.out.println("T1----" + i);
                try {
                    Thread.sleep(500);
                    //TimeUnit.Milliseconds.sleep(500)
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(()->{

            try {
                t1.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            for(int i=0; i<100; i++) {
                System.out.println("T2-----" + i);
                try {
                    Thread.sleep(500);
                    //TimeUnit.Milliseconds.sleep(500)
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();
    }

}
