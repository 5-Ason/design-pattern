package adapter;

import adapter.adapter.UsesAdapter;
import adapter.adapter.UserOperation;

/**
 * Created by Ason on 2017-10-02.
 */
public class Client {
    public static void main(String[] args) {
        UserOperation userOperation = new UsesAdapter();
        userOperation.encrypt("test");
    }
}
