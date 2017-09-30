package simple.factory;

import simple.shape.RoundShape;
import simple.shape.Shape;
import simple.shape.TriangleShape;

/**
 * 工厂类
 * Created by Ason on 2017/9/30.
 */
public class ShapeFactory {
    public static Shape getShape(String shapeStr){
        Shape shape = null;
        if ("round".equals(shapeStr)){
            shape = new RoundShape();
        } else if("triangle".equals(shapeStr)){
            shape = new TriangleShape();
        } else {
            throw new UnsupportedOperationException("不支持该几何图形");
        }
        return shape;
    }
}
