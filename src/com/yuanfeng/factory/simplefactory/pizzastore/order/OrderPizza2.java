package com.yuanfeng.factory.simplefactory.pizzastore.order;

import com.yuanfeng.factory.simplefactory.pizzastore.pizza.Pizza;
import com.yuanfeng.factory.simplefactory.pizzastore.pizza.SimpleFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author 袁峰
 * @Date 2022/4/12 15:20
 * @Version 1.0
 */
//订购披萨
public class OrderPizza2 {

    Pizza pizza = null;

    public OrderPizza2( ) {
        setFactory();
    }

    public void setFactory() {
        String orderType = ""; // 用户输入的
        do {
            orderType = getType();
            pizza = SimpleFactory.createPizza2(orderType);
            //输出pizza
            if (pizza != null) { // 订购成功
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println(" 订购披萨失败 ");
                break;
            }
        } while (true);
    }

    // 写一个方法，可以获取客户希望订购的披萨种类
    private String getType() {
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
