package service;

/**
 * 验证用户身份
 * Created by Ason on 2017/10/9.
 */
public class AccessValidator {

    //模拟实现登录验证
    public Boolean validator(String account){
        System.out.println("在数据库进行对用户 " + account + " 的验证");
        if ("123456".equals(account)){
            System.out.println("验证通过");
            return true;
        }
        System.out.println("验证不通过");
        return false;
    }
}
