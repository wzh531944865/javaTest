package single;

/**
 * Created by zhonghao.wang on 2016/5/31.
 */
//双重判断
public class SingleTon {
    public static SingleTon instance = null;

    public static SingleTon getInstance() {
        if (instance == null) {
            synchronized (SingleTon.class) {
                if (instance == null) {
                    instance = new SingleTon();

                }
            }
        }
        return instance;
    }
}
