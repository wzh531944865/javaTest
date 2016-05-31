package factory.static_factory;

import bean.BeanA;
import bean.BeanB;
import bean.BeanInterface;

/**
 * Created by zhonghao.wang on 2016/5/31.
 */
public class StaticFactory {
    public static BeanInterface producerA() {
        return new BeanA();
    }

    public static BeanInterface producerB() {
        return new BeanB();
    }

    public static void main(String[] args) {
        BeanInterface s = StaticFactory.producerA();
        System.out.println(s.toString());
    }
}
