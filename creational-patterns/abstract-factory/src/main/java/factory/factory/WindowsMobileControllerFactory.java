package factory.factory;

import factory.controller.InterfaceController;
import factory.controller.OperationController;
import factory.controller.WindowsMobileInterfaceController;
import factory.controller.WindowsMobileOperationController;

/**
 * Created by Ason on 2017-10-01.
 */
public class WindowsMobileControllerFactory implements ControllerFactory {
    public InterfaceController createInterfaceController(){
        return new WindowsMobileInterfaceController();
    }
    public OperationController createOperationController(){
        return new WindowsMobileOperationController();
    }
}
