package exercise.subject;

import exercise.observer.Observer;

/**
 * 具体目标类：股票
 * Created by Ason on 2017/10/10.
 */
public class StockSubject extends Subject {
    private String name;  //股票名
    private Double oldPrice;
    private Double newPrice;

    public StockSubject(String name){
        this.name = name;
    }

    public void setOldPrice(Double oldPrice) {
        this.oldPrice = oldPrice;
    }

    public void setNewPrice(Double newPrice) {
        this.newPrice = newPrice;
    }

    public void notice() {
        Double changePrice = oldPrice * 0.05;  //变化幅度达到5%
        if ( newPrice >= oldPrice + changePrice || newPrice <= oldPrice - changePrice){
            for (Observer observer : observers){
                observer.getMessage("【"+ name +"】股票原本价格为："+ oldPrice +",新价格为："+ newPrice + ",股票价格变化幅度达5%");
            }
        }
    }
}
