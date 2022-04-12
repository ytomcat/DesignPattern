package com.yuanfeng.factory.simplefactory.pizzastore.pizza;

/**
 * @Author 袁峰
 * @Date 2022/4/12 15:07
 * @Version 1.0
 */
public class ChinaPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println(" 给制作中式披萨 准备原材料 ");
    }
}
