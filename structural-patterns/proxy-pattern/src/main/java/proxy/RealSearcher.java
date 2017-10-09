package proxy;

/**
 * 真实主题
 * Created by Ason on 2017/10/9.
 */
public class RealSearcher implements Searcher {

    //模拟查询商务信息
    public String DoSearch(String account, String keyword) {
        System.out.println("用户 "+ account + " 使用关键词 " + keyword + " 进行查询商务信息");
        return "返回查询结果";
    }
}
