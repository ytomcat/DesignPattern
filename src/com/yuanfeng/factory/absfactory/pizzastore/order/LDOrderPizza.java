package com.yuanfeng.factory.absfactory.pizzastore.order;

import com.yuanfeng.factory.absfactory.pizzastore.pizza.LDCheesePizza;
import com.yuanfeng.factory.absfactory.pizzastore.pizza.LDPepperPizza;
import com.yuanfeng.factory.absfactory.pizzastore.pizza.Pizza;

/**
 * @Author 袁峰
 * @Date 2022/4/12 16:41
 * @Version 1.0
 */
public class LDOrderPizza implements AbsFactory {


    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("~使用的是抽象工厂模式~");
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
