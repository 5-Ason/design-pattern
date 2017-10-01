package factory;

import factory.factory.GifImageTypeFactory;
import factory.factory.JpgImageTypeFactory;
import factory.type.ImageType;

/**
 * 客户端，调用
 * Created by Ason on 2017-10-01.
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("读取jpg图片格式");
        ImageType imageType = new JpgImageTypeFactory().createImageType();
        imageType.readType();
        System.out.println("============================================");
        System.out.println("读取gif图片格式");
        ImageType imageType1 = new GifImageTypeFactory().createImageType();
        imageType1.readType();
    }
}
