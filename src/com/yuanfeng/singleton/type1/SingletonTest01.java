package com.yuanfeng.singleton.type1;

/**
 * @Author 袁峰
 * @Date 2022/4/11 14:07
 * @Version 1.0
 */

public class SingletonTest01 {
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

    private final static Singleton instance = new Singleton();

    public static Singleton getInstance() {
        return instance;
    }
}
