package factory.factory;

import factory.type.GifImageType;
import factory.type.ImageType;

/**
 * Created by Ason on 2017-10-01.
 */
public class GifImageTypeFactory implements ImageTypeFactory {

    public ImageType createImageType(){
        return new GifImageType();
    }
}
