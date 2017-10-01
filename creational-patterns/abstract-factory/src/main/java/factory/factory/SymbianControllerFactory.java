package factory.factory;

import factory.controller.InterfaceController;
import factory.controller.OperationController;
import factory.controller.SymbianInterfaceController;
import factory.controller.SymbianOperationController;

/**
 * Created by Ason on 2017-10-01.
 */
public class SymbianControllerFactory implements ControllerFactory {
    public InterfaceController createInterfaceController(){
        return new SymbianInterfaceController();
    }
    public OperationController createOperationController(){
        return new SymbianOperationController();
    }
}
