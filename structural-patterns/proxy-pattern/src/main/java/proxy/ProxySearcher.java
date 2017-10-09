package proxy;

import service.AccessValidator;
import service.Logger;

/**
 * 代理主题
 * Created by Ason on 2017/10/9.
 */
public class ProxySearcher implements Searcher{
    private RealSearcher realSearcher = new RealSearcher();  //维持一个对真实主题的引用
    private AccessValidator accessValidator;
    private Logger logger;

    public String DoSearch(String account, String keyword) {
        //如果身份验证成功，则执行查询
        if (validator(account)){
            String result = realSearcher.DoSearch(account, keyword); //调用真实主题对象的查询方法
            log(account); //记录查询日志
            return result; //返回查询结果
        }
        return null;
    }

    //创建日志记录对象并调用其log()方法实现日志记录
    public void log(String account){
        logger = new Logger();
        logger.log(account);
    }

    //创建访问验证对象并调用其validate()方法实现身份验证
    public Boolean validator(String account){
        accessValidator = new AccessValidator();
        return accessValidator.validator(account);
    }
}
