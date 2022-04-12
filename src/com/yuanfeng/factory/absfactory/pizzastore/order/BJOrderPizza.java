package com.yuanfeng.factory.absfactory.pizzastore.order;

import com.yuanfeng.factory.absfactory.pizzastore.pizza.BJCheesePizza;
import com.yuanfeng.factory.absfactory.pizzastore.pizza.BJPepperPizza;
import com.yuanfeng.factory.absfactory.pizzastore.pizza.Pizza;

/**
 * @Author 袁峰
 * @Date 2022/4/12 16:42
 * @Version 1.0
 */
public class BJOrderPizza implements AbsFactory {


    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("~使用的是抽象工厂模式~");
        // TODO Auto-generated method stub
        Pizza pizza = null;
        if(orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")){
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
