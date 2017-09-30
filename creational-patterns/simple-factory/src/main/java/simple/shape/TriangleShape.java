package simple.shape;

/**
 * 三角形具体实现类
 * Created by Ason on 2017/9/30.
 */
public class TriangleShape implements Shape{
    public void draw(){
        System.out.println("绘制一个三角形");
    }

    public void erase(){
        System.out.println("擦除一个三角形");
    }
}
