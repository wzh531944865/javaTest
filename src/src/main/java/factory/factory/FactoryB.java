package factory.factory;

import bean.BeanA;
import bean.BeanB;
import bean.BeanInterface;

/**
 * Created by zhonghao.wang on 2016/5/31.
 */
public class FactoryB {
    public BeanInterface producerA() {
            return new BeanA();
    }

    public BeanInterface producerB() {
        return new BeanB();
    }

    public static void main(String[] args) {
        FactoryB factoryB = new FactoryB();
        BeanInterface s =factoryB.producerA();
        BeanInterface s2 =factoryB.producerB();
        System.out.println(s.toString());
        System.out.println(s2.toString());
    }
}
