package factory.factory;

import factory.controller.AndroidInterfaceController;
import factory.controller.AndroidOperationController;
import factory.controller.InterfaceController;
import factory.controller.OperationController;

/**
 * Created by Ason on 2017-10-01.
 */
public class AndroidControllerFactory implements ControllerFactory {
    public InterfaceController createInterfaceController(){
        return new AndroidInterfaceController();
    }
    public OperationController createOperationController(){
        return new AndroidOperationController();
    }
}
