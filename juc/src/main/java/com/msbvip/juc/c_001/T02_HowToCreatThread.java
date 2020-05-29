/**
 * Copyright (C), 2019-2020, 宇信融汇
 * FileName: T01_HowToCreatThread
 * Author:   xbliu
 * Date:     2020/5/26 16:52
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * xbliu           修改时间           版本号              描述
 */
package com.msbvip.juc.c_001;

/**
 * @version
 * @Classname T01_HowToCreatThread
 * @Description TODO
 * @Date 2020/5/26 16:52
 * @Created by xbliu
 * 1、启动线程的三种方式 （Thread \Runnable\线程池）
 */
public class T02_HowToCreatThread {
    static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println("Hello MyThread");
        }
    }

    //实现Runnable
    static class Myrun implements Runnable {
        @Override
        public void run() {
            System.out.println("Hello Myrun");
        }
    }

    //lambda表达式启动线程
    public static void main(String[] args) {
        new MyThread().start();
        new Thread(new Myrun()).start();
        new Thread(() -> {
            System.out.println("Hello lambda");
        }).start();
    }

}
