package com.yuanfeng.factory.simplefactory.pizzastore.pizza;

/**
 * @Author ??
 * @Date 2022/4/12 14:30
 * @Version 1.0
 */
public abstract class Pizza {

    protected String name;


    public abstract void prepare();


    public void bake() {
        System.out.println(this.name + "?????-----------");
    }

    public void cut() {
        System.out.println(this.name + "???--------------");
    }

    public void box() {
        System.out.println(this.name + "???--------------");
    }

    public void setName(String name) {
        this.name = name;
    }

}
