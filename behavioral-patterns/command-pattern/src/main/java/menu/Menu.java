package menu;

import java.util.ArrayList;
import java.util.List;

/**
 * 主菜单
 * Created by Ason on 2017/10/9.
 */
public class Menu {
    //定义一个ArrayList来存储所有菜单项
    private List<MenuItem> menuItemList = new ArrayList<MenuItem>();

    public void addMenuItem(MenuItem menuItem){
        menuItemList.add(menuItem);
    }

    //显示菜单项
    public void display() {
        System.out.println("显示菜单项：");
        for (MenuItem mi : menuItemList) {
            System.out.println(mi.getName());
        }
        System.out.println("------------------------------");
    }
}
