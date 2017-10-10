package exercise.subject;

import exercise.observer.Observer;

import java.util.ArrayList;

/**
 * 抽象目标类
 * Created by Ason on 2017/10/10.
 */
public abstract class Subject {
    //定义一个观察者集合用于存储所有观察者对象
    protected ArrayList<Observer> observers = new ArrayList();

    //注册方法，用于向观察者集合中增加一个观察者
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    //注销方法，用于在观察者集合中删除一个观察者
    public void delObserver(Observer observer) {
        observers.remove(observer);
    }

    //声明抽象通知方法
    public abstract void notice();
}
