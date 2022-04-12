package com.yuanfeng.factory.absfactory.pizzastore.order;

import com.yuanfeng.factory.absfactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author 袁峰
 * @Date 2022/4/12 15:20
 * @Version 1.0
 */
//订购披萨
public class OrderPizza {


    AbsFactory absFactory;

    public OrderPizza(AbsFactory absFactory) {
        setFactory(absFactory);
    }

    public void setFactory(AbsFactory absFactory) {
        Pizza pizza = null;
        String orderType = ""; // 用户输入
        this.absFactory = absFactory;
        do {
            orderType = getType();
            // factory 可能是北京的工厂子类，也可能是伦敦的工厂子类
            pizza = absFactory.createPizza(orderType);
            if (pizza != null) { // 订购ok
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("订购失败");
                break;
            }
        } while (true);
    }


    // 写一个方法，可以获取客户希望订购的披萨种类
    private static String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza 种类:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
