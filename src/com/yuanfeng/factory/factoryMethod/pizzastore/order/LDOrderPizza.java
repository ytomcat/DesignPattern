package com.yuanfeng.factory.factoryMethod.pizzastore.order;

import com.yuanfeng.factory.factoryMethod.pizzastore.pizza.LDCheesePizza;
import com.yuanfeng.factory.factoryMethod.pizzastore.pizza.LDPepperPizza;
import com.yuanfeng.factory.factoryMethod.pizzastore.pizza.Pizza;

/**
 * @Author 袁峰
 * @Date 2022/4/12 16:41
 * @Version 1.0
 */
public class LDOrderPizza extends OrderPizza{

    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
        }
        // TODO Auto-generated method stub
        return pizza;
    }
}
