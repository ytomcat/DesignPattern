package com.yuanfeng.factory.simplefactory.pizzastore.pizza;

/**
 * @Author ??
 * @Date 2022/4/12 15:07
 * @Version 1.0
 */
public class PepperPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("给胡椒披萨准备原材料");
    }
}
