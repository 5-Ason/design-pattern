package exercise;

import exercise.subject.StockSubject;
import exercise.observer.Observer;
import exercise.observer.Person;

/**
 * Created by Ason on 2017/10/10.
 */
public class Client {
    public static void main(String[] args) {
        Observer observer1, observer2, observer3;
        observer1 = new Person("小马");
        observer2 = new Person("小明");
        observer3 = new Person("小涛");
        StockSubject subject = new StockSubject("阿里巴巴");
        subject.setOldPrice(16.4);
        subject.setNewPrice(12.0);
        subject.addObserver(observer1);
        subject.addObserver(observer2);
        subject.addObserver(observer3);
        subject.notice();

    }
}
