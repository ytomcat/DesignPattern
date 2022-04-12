package com.yuanfeng.factory.simplefactory.pizzastore.pizza;

/**
 * @Author Ԭ��
 * @Date 2022/4/12 15:08
 * @Version 1.0
 */
public class SimpleFactory {

    //����orderType ���ض�Ӧ��Pizza ����
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        System.out.println("ʹ�ü򵥹���ģʽ");
        if (orderType.equals("greek")) {
            pizza = new PepperPizza();
            pizza.setName(" ϣ������ ");
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName(" �������� ");
        } else if (orderType.equals("pepper")) {
            pizza = new PepperPizza();
            pizza.setName("��������");
        }
        return pizza;
    }

    //����orderType ���ض�Ӧ��Pizza ����
    public static Pizza createPizza2(String orderType) {
        Pizza pizza = null;
        System.out.println("ʹ�ü򵥹���ģʽ");
        if (orderType.equals("greek")) {
            pizza = new PepperPizza();
            pizza.setName(" ϣ������ ");
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName(" �������� ");
        } else if (orderType.equals("pepper")) {
            pizza = new PepperPizza();
            pizza.setName("��������");
        }
        return pizza;
    }

}
