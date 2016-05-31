package factory.factory;

import org.apache.commons.lang3.StringUtils;

import bean.BeanA;
import bean.BeanB;
import bean.BeanInterface;

/**
 * Created by zhonghao.wang on 2016/5/31.
 */
//工厂模式
public class FactoryA {
    public BeanInterface producer(String s) {
        if(StringUtils.equals(s,"A")){
            return new BeanA();
        }else if(StringUtils.equals(s,"B")){
            return new BeanB();
        }
        return new BeanA();
    }

    public static void main(String[] args) {
        FactoryA A = new FactoryA();
        BeanInterface s =A.producer("A");
        System.out.println(s.toString());
    }
}
