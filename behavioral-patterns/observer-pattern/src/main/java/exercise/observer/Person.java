package exercise.observer;

/**
 * 具体观察者：股民
 * Created by Ason on 2017/10/10.
 */
public class Person implements Observer {
    private String name;

    public Person(String name){
        this.name = name;
    }
    public void getMessage(String message) {
        System.out.println("股民【"+ name +"】收到通知："+ message);
    }
}
