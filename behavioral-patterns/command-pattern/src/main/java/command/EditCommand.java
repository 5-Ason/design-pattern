package command;

import menu.BoardScreen;

/**
 * 编辑命令：具体命令类
 * Created by Ason on 2017/10/9.
 */
public class EditCommand extends Command {
    private BoardScreen boardScreen = new BoardScreen(); //维持对请求接收者的引用
    public void exexecute() {
        boardScreen.edit();
    }
}
