package proxy;

/**
 * 抽象主题
 * Created by Ason on 2017/10/9.
 */
public interface Searcher {
    String DoSearch(String account, String keyword);
}
