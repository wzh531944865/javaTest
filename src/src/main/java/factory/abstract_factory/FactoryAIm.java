package factory.abstract_factory;

import bean.BeanA;
import bean.BeanInterface;

/**
 * Created by zhonghao.wang on 2016/5/31.
 */
public class FactoryAIm implements AbstractFactory {
    @Override
    public  BeanInterface producer(){
        return new BeanA();
    }
}
