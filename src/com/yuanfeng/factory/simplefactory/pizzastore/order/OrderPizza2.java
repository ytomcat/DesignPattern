package com.yuanfeng.factory.simplefactory.pizzastore.order;

import com.yuanfeng.factory.simplefactory.pizzastore.pizza.Pizza;
import com.yuanfeng.factory.simplefactory.pizzastore.pizza.SimpleFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author Ԭ��
 * @Date 2022/4/12 15:20
 * @Version 1.0
 */
//��������
public class OrderPizza2 {

    Pizza pizza = null;

    public OrderPizza2( ) {
        setFactory();
    }

    public void setFactory() {
        String orderType = ""; // �û������
        do {
            orderType = getType();
            pizza = SimpleFactory.createPizza2(orderType);
            //���pizza
            if (pizza != null) { // �����ɹ�
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println(" ��������ʧ�� ");
                break;
            }
        } while (true);
    }

    // дһ�����������Ի�ȡ�ͻ�ϣ����������������
    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza ����:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
