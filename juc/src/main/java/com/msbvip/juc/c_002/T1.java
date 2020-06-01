/**
 * Copyright (C), 2019-2020, 宇信融汇
 * FileName: T1
 * Author:   xbliu
 * Date:     2020/5/29 11:36
 * Description: synchronized关键字this
 * History:
 * <author>          <time>          <version>          <desc>
 * xbliu           修改时间           版本号              描述
 */
package com.msbvip.juc.c_002;

/**
 * @Classname T1
 * @Description   synchronized (this)   private synchronized void m(){\
 * synchronized (this)相当于当前对象持有这把锁
 * @Date 2020/5/29 11:36
 * @Created by xbliu
 */
public class T1 {
    private Integer count = 10;
    private synchronized void m(){
        count--;
        System.out.println(Thread.currentThread().getName()+"----count="+count);
    }
   /* private void m(){    synchronized (this)   private synchronized void m(){
        synchronized (this){
        count--;
        System.out.println(Thread.currentThread().getName()+"----count="+count);
        }
    }*/
}
