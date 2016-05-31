package bean;

/**
 * Created by zhonghao.wang on 2016/5/31.
 */
public class BeanA implements BeanInterface {
    private String test = "testA";

    public Integer testM(String s) {
        System.out.println(s);
        return 0;
    }

    public Integer testM2(String s, String s2) {
        System.out.println(new StringBuilder(s).append(s2));
        return 0;
    }

    @Override
    public String toString() {
        return "BeanA{}";
    }
}
