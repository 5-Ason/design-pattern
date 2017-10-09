import command.CreateCommand;
import command.EditCommand;
import command.OpenCommand;
import menu.Menu;
import menu.MenuItem;

/**
 * Created by Ason on 2017/10/9.
 */
public class Client {
    public static void main(String[] args) {
        //初始化菜单项
        MenuItem menuItem1, menuItem2, menuItem3;
        menuItem1 = new MenuItem("【新建】");
        menuItem2 = new MenuItem("【打开】");
        menuItem3 = new MenuItem("【编辑】");
        //将命令对象注入菜单项
        menuItem1.setCommand(new CreateCommand());
        menuItem2.setCommand(new OpenCommand());
        menuItem3.setCommand(new EditCommand());
        //将菜单项加入菜单
        Menu menu = new Menu();
        menu.addMenuItem(menuItem1);
        menu.addMenuItem(menuItem2);
        menu.addMenuItem(menuItem3);
        menu.display();
        //调用菜单项的业务方法
        menuItem1.click();
        menuItem2.click();
        menuItem3.click();
    }
}
