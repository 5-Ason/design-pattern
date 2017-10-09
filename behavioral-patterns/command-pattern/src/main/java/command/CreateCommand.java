package command;

import menu.BoardScreen;

/**
 * 新建命令：具体命令类
 * Created by Ason on 2017/10/9.
 */
public class CreateCommand extends Command {
    private BoardScreen boardScreen = new BoardScreen(); //维持对请求接收者的引用
    public void exexecute() {
        boardScreen.create();
    }
}
