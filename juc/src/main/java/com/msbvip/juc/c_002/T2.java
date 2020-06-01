/**
 * Copyright (C), 2019-2020, 宇信融汇
 * FileName: T2
 * Author:   xbliu
 * Date:     2020/5/29 11:45
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * xbliu           修改时间           版本号              描述
 */
package com.msbvip.juc.c_002;

/**
 * @Classname T2
 * @Description TODO
 * @Date 2020/5/29 11:45
 * @Created by xbliu
 */
public class T2 {
    private static  Integer count = 10;
    public synchronized static void m(){ //这里等同于 synchronized (T.class)
        count--;
        System.out.println(Thread.currentThread().getName()+"----count="+count);
    }
    public  static void mm(){
      synchronized (T.class){
          count--;
      }
    }

}
