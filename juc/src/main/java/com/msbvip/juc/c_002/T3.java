/**
 * Copyright (C), 2019-2020, 宇信融汇
 * FileName: T3
 * Author:   xbliu
 * Date:     2020/6/1 16:32
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * xbliu           修改时间           版本号              描述
 */
package com.msbvip.juc.c_002;

/**
 * @Classname T3
 * @Description TODO
 * @Date 2020/6/1 16:32
 * @Created by xbliu
 */
public class T3 {
    public synchronized void method1() {
        System.out.println("Method 1 start");
        try {
            System.out.println("Method 1 execute");
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Method 1 end");
    }
    public synchronized void method2() {
        System.out.println("Method 2 start");
        try {
            System.out.println("Method 2 execute");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Method 2 end");
    }

    public static void main(String[] args) {
         T3 test = new T3();

        new Thread(test::method1).start();

        new Thread(test::method2).start();
    }

}
