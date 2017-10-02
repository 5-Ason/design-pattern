package adapter.adapter;

/**
 * 适配器类
 * Created by Ason on 2017-10-02.
 */
public class UsesAdapter implements UserOperation {
    private EncryptOperation encryptOperation = null;

    public UsesAdapter(){
        encryptOperation = new EncryptOperation();
    }

    public void encrypt(String o){
        encryptOperation.encrypt(o);
    }
}
