package singleton3;

/**
 * IoDH技术实现负载均衡器LoadBalancer
 * Created by Ason on 2017-10-02.
 */
public class LoadBalancer3 {
    private LoadBalancer3(){

    }

    private static class HolderClass{
        private static final LoadBalancer3 instance = new LoadBalancer3();
    }

    public static LoadBalancer3 getInstance(){
        return HolderClass.instance;
    }
}
