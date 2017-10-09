package service;

/**
 * 记录用户查询日志
 * Created by Ason on 2017/10/9.
 */
public class Logger {

    //模拟实现日志记录
    public void log(String account){
        System.out.println("对用户" + account + "的操作进行记录");
    }
}
