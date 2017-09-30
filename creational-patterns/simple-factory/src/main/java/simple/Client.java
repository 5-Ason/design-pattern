package simple;

import simple.factory.ShapeFactory;
import simple.shape.Shape;

/**
 * 客户端，调用
 * Created by Ason on 2017/9/30.
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("三角形");
        Shape shape = ShapeFactory.getShape("triangle"); //三角形
        shape.draw();
        shape.erase();
        System.out.println("圆形");
        Shape shape1 = ShapeFactory.getShape("round"); // 圆形
        shape1.draw();
        shape1.erase();
//        System.out.println("其他形状");
//        Shape shape2 = ShapeFactory.getShape("othershape"); //其他不支持的形状
//        shape2.draw();
//        shape2.erase();
    }
}
