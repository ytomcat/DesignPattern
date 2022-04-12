package com.yuanfeng.singleton.type5;

/**
 * @Author 袁峰
 * @Date 2022/4/11 14:07
 * @Version 1.0
 */

public class SingletonTest05 {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println(instance1.equals(instance2));
    }
}

//饿汉式(静态变量)
class Singleton {
    //1、构造器私有化，外部能new
    private Singleton() {
    }

    private static Singleton instance;


    public static  Singleton getInstance() {
        synchronized(Singleton.class){
            if (null == instance) {
                instance = new Singleton();
            }
        }
        return instance;
    }
}
