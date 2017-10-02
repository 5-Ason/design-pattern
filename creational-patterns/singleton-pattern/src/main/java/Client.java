import singleton3.LoadBalancer3;

/**
 * Created by Ason on 2017-10-02.
 */
public class Client {
    public static void main(String[] args) {
        LoadBalancer3 lb1, lb2;
        lb1 = LoadBalancer3.getInstance();
        lb2 = LoadBalancer3.getInstance();
        System.out.println(lb1 == lb2);
    }
}
