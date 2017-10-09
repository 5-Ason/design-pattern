package facade;

import subsystem.SubSystemA;
import subsystem.SubSystemB;
import subsystem.SubSystemC;

/**
 * 外观角色
 * Created by Ason on 2017/10/9.
 */
public class Facade {
    private SubSystemA obj1 = new SubSystemA();
    private SubSystemB obj2 = new SubSystemB();
    private SubSystemC obj3 = new SubSystemC();

    public void Method(){
        obj1.MethodA();
        obj2.MethodB();
        obj3.MethodC();
    }
}
