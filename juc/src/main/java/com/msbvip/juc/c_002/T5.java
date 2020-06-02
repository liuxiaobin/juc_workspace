/**
 * Copyright (C), 2019-2020, 宇信融汇
 * FileName: T5
 * Author:   xbliu
 * Date:     2020/6/2 14:38
 * Description: prority的使用
 * History:
 * <author>          <time>          <version>          <desc>
 * xbliu           修改时间           版本号              描述
 */
package com.msbvip.juc.c_002;

/**
 * @Classname T5
 * @Description TODO
 * @Date 2020/6/2 14:38
 * @Created by xbliu
 */
public class T5 {
    public static void main(String[] args) {
        new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("t1");
            }
        }, "t1").start();


        new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("t2");
            }
        },"t2").start();
    }
}
