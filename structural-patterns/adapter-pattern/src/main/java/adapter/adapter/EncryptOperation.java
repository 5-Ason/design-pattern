package adapter.adapter;

/**
 * 第三方加密类，适配者
 * Created by Ason on 2017-10-02.
 */
public class EncryptOperation {
    public void encrypt(String o){
        System.out.println("对参数 "+ o +" 进行加密");
    }
}
