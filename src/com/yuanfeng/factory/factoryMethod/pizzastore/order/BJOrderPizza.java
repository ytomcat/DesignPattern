package com.yuanfeng.factory.factoryMethod.pizzastore.order;

import com.yuanfeng.factory.factoryMethod.pizzastore.pizza.BJCheesePizza;
import com.yuanfeng.factory.factoryMethod.pizzastore.pizza.BJPepperPizza;
import com.yuanfeng.factory.factoryMethod.pizzastore.pizza.Pizza;

/**
 * @Author 袁峰
 * @Date 2022/4/12 16:42
 * @Version 1.0
 */
public class BJOrderPizza extends OrderPizza {

    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new BJPepperPizza();
        }
        // TODO Auto-generated method stub
        return pizza;
    }
}
