package _11_command.command02;

/**
 * 机箱对象，有按钮，持有按钮对应的命令对象
 */
public class Box {

    private OpenCommand openCommand;

    public void setOpenCommand(OpenCommand openCommand) {
        this.openCommand = openCommand;
    }

    /**
     * 提供给客户的方法：按下开机按钮
     */
    public void openButtonPressed(){
        openCommand.execute();;
    }
}
