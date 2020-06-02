/**
 * Copyright (C), 2019-2020, 宇信融汇
 * FileName: T1
 * Author:   xbliu
 * Date:     2020/6/2 11:04
 * Description:interrupt的使用
 * History:
 * <author>          <time>          <version>          <desc>
 * xbliu           修改时间           版本号              描述
 */
package com.msbvip.juc.c_003;

import java.util.Date;

/**
 * @Classname T1
 * @Description TODO
 * @Date 2020/6/2 11:04
 * @Created by xbliu
 */
public class T1 {
    public static void main(String[] args) {
        MyThread m = new MyThread();
        m.start();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        m.interrupt();
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        while (true){
            System.out.println("计时器：" + new Date() + "========");
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
