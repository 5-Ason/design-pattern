package factory;

import factory.controller.InterfaceController;
import factory.controller.OperationController;
import factory.factory.AndroidControllerFactory;
import factory.factory.ControllerFactory;
import factory.factory.SymbianControllerFactory;
import factory.factory.WindowsMobileControllerFactory;

/**
 * Created by Ason on 2017-10-01.
 */
public class Client {
    public static void main(String[] args) {
        ControllerFactory controllerFactory = null;

//        System.out.println("Android设备");
//        controllerFactory = new AndroidControllerFactory();
//
//        System.out.println("Symbian设备");
//        controllerFactory = new SymbianControllerFactory();

        System.out.println("WindowsMobile设备");
        controllerFactory = new WindowsMobileControllerFactory();
        InterfaceController interfaceController = controllerFactory.createInterfaceController();
        OperationController operationController = controllerFactory.createOperationController();
        interfaceController.doInterfaceController();
        operationController.doOperationController();

    }
}
