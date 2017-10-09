import proxy.ProxySearcher;
import proxy.Searcher;

/**
 * Created by Ason on 2017/10/9.
 */
public class Client {
    public static void main(String[] args) {
        Searcher searcher = new ProxySearcher();
        String result = searcher.DoSearch("123456","测试");
        System.out.println(result);
    }
}
