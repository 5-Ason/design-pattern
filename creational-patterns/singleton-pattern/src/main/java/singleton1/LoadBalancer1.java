package singleton1;

/**
 * 饿汉式单例实现负载均衡器LoadBalancer
 * Created by Ason on 2017-10-02.
 */
public class LoadBalancer1 {
    private static final LoadBalancer1 instantce = new LoadBalancer1();

    private LoadBalancer1(){

    }

    public static LoadBalancer1 getInstantce(){
        return instantce;
    }
}
