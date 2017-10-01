package factory.factory;

import factory.controller.InterfaceController;
import factory.controller.OperationController;

/**
 * Created by Ason on 2017-10-01.
 */
public interface ControllerFactory {
    InterfaceController createInterfaceController();
    OperationController createOperationController();
}
