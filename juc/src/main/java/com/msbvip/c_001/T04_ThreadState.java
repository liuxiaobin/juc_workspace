/**
 * Copyright (C), 2019-2020, 宇信融汇
 * FileName: T04_ThreadState
 * Author:   xbliu
 * Date:     2020/5/29 8:06
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * xbliu           修改时间           版本号              描述
 */
package com.msbvip.c_001;

/**
 * @Classname T04_ThreadState
 * @Description TODO
 * @Date 2020/5/29 8:06
 * @Created by xbliu
 *  多线程的启动流程   start之前是new  之后是RUNNABLE状态（ready\running），运行结束状态TERMINATED
 */
public class T04_ThreadState {
    static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println(this.getState());

            for(int i=0; i<10; i++) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Thread t = new MyThread();

        System.out.println(t.getState());

        t.start();

        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(t.getState());

    }
}
