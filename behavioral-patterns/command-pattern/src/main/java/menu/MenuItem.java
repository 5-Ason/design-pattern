package menu;

import command.Command;

/**
 * 菜单项：请求发送者
 * Created by Ason on 2017/10/9.
 */
public class MenuItem {
    private String name;  //菜单项名称
    private Command command;

    public MenuItem(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void click(){
        System.out.print("点击菜单项：");
        command.exexecute();
    }
}
