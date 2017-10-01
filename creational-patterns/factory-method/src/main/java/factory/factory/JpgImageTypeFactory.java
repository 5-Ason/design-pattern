package factory.factory;

import factory.type.ImageType;
import factory.type.JpgImageType;

/**
 * Created by Ason on 2017-10-01.
 */
public class JpgImageTypeFactory implements ImageTypeFactory {

    public ImageType createImageType(){
        return new JpgImageType();
    }
}
