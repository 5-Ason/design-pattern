package simple.shape;

/**
 * 圆形具体实现类
 * Created by Ason on 2017/9/30.
 */
public class RoundShape implements Shape{
    public void draw(){
        System.out.println("绘制一个圆形");
    }

    public void erase(){
        System.out.println("擦除一个圆形");
    }
}
