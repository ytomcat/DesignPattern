package com.yuanfeng.principle.segregation.improve;

/**
 * @author yuanfeng
 * @version 1.0.0
 * @ClassName Segregation1.java
 * @Description TODO
 * DesignPattern
 * @createTime 2022年04月09日 12:50:00
 */
public class Segregation1 {
    public static void main(String[] args) {

    }
}

//接口1
interface Interface1 {
    void operation1();
}

//接口2
interface Interface2 {
    void operation2();

    void operation3();
}

//接口3
interface Interface3 {
    void operation4();

    void operation5();
}

class A {   //A类通过接口interface依赖（使用）B类，但是只会用到1,2,3方法

    public void depend1(Interface1 i) {
        i.operation1();
    }

    public void depend2(Interface2 i) {
        i.operation2();
    }

    public void depend3(Interface2 i) {
        i.operation3();
    }

}

class B implements Interface1, Interface2 {

    @Override
    public void operation1() {
        System.out.println("B 实现了operation1");
    }

    @Override
    public void operation2() {
        System.out.println("B 实现了operation2");
    }

    @Override
    public void operation3() {
        System.out.println("B 实现了operation3");
    }
}

class C {
}

class D implements Interface1, Interface3 {

    @Override
    public void operation1() {
        System.out.println("D 实现了operation1");
    }

    @Override
    public void operation4() {
        System.out.println("D 实现了operation4");
    }

    @Override
    public void operation5() {
        System.out.println("D 实现了operation5");
    }
}