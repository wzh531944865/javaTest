package single;

/**
 * Created by zhonghao.wang on 2016/5/31.
 */
public class SingleTonByFactory {

    private SingleTonByFactory(){}

    private static class SingleTonFactory{
        private  static  SingleTonByFactory instance = new SingleTonByFactory();
    }

    public SingleTonByFactory getInstance(){
        return SingleTonFactory.instance;
    }
}
