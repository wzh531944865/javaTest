package reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import bean.BeanA;

/**
 * Created by zhonghao.wang on 2016/5/31.
 */
public class testReflect {
    public static void main(String[] args) throws Exception{
        BeanA beana = new BeanA();
        Class<?> clazz = beana.getClass();
//        Class clazz = BeanA.class;
//        Class clazz = Class.forName("bean.BeanA");
        Field field=clazz.getDeclaredField("test");
        Method m=clazz.getDeclaredMethod("toString", new Class[]{});
        Method m2=clazz.getDeclaredMethod("testM",String.class);
        Method m3=clazz.getDeclaredMethod("testM2",new Class<?>[]{String.class,String.class});
        System.out.println(m.invoke(beana));
        System.out.println(m2.invoke(beana,"s1"));
        System.out.println(m3.invoke(beana,"s1","s2"));
        System.out.println(m2.invoke(beana,new Object[]{"s1"}));
        System.out.println(m3.invoke(beana, new Object[]{"s1", "s2"}));
        field.setAccessible(true);
        System.out.println(field.get(beana));
        field.set(beana,"changToB");
        System.out.println(field.get(beana));
    }

}
