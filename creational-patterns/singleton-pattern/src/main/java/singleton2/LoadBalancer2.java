package singleton2;

/**
 * 带双重检查锁定机制的懒汉式单例实现负载均衡器LoadBalancer
 * Created by Ason on 2017-10-02.
 */
public class LoadBalancer2 {
    /**
     * 如果使用双重检查锁定来实现懒汉式单例类，
     * 需要在静态成员变量instance之前增加修饰符volatile，
     * 被volatile修饰的成员变量可以确保多个线程都能够正确处理，
     * 且该代码只能在JDK 1.5及以上版本中才能正确执行。
     * 由于volatile关键字会屏蔽Java虚拟机所做的一些代码优化，可能会导致系统运行效率降低，
     * 因此即使使用双重检查锁定来实现单例模式也不是一种完美的实现方式。
     */
    private volatile static LoadBalancer2 instantce = null;

    private LoadBalancer2(){

    }
    private static LoadBalancer2 getInstant(){
        //第一重判断
        if (instantce == null) {
            //锁定代码块
            synchronized (LoadBalancer2.class){
                //第二重判断
                if (instantce == null){
                    instantce = new LoadBalancer2();
                }
            }
        }
        return instantce;
    }
}
