package single;

/**
 * Created by zhonghao.wang on 2016/5/31.
 */
public class SingTonInit {
    public static SingTonInit instance = new SingTonInit();

    public static SingTonInit getInstance() {
        return instance;
    }
}
