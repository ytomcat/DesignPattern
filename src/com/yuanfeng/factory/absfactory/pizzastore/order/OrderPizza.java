package com.yuanfeng.factory.absfactory.pizzastore.order;

import com.yuanfeng.factory.absfactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author Ԭ��
 * @Date 2022/4/12 15:20
 * @Version 1.0
 */
//��������
public class OrderPizza {


    AbsFactory absFactory;

    public OrderPizza(AbsFactory absFactory) {
        setFactory(absFactory);
    }

    public void setFactory(AbsFactory absFactory) {
        Pizza pizza = null;
        String orderType = ""; // �û�����
        this.absFactory = absFactory;
        do {
            orderType = getType();
            // factory �����Ǳ����Ĺ������࣬Ҳ�������׶صĹ�������
            pizza = absFactory.createPizza(orderType);
            if (pizza != null) { // ����ok
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("����ʧ��");
                break;
            }
        } while (true);
    }


    // дһ�����������Ի�ȡ�ͻ�ϣ����������������
    private static String getType() {
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
