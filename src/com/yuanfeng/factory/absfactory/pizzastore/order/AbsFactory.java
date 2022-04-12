package com.yuanfeng.factory.absfactory.pizzastore.order;

import com.yuanfeng.factory.absfactory.pizzastore.pizza.Pizza;

/**
 * @Author 袁峰
 * @Date 2022/4/12 18:10
 * @Version 1.0
 */
//一个抽象工厂模式的抽象层(接口)
public interface AbsFactory {
    //让下面的工厂子类来 具体实现
    public Pizza createPizza(String orderType);
}

