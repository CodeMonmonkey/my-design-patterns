package command.command02;

/**
 * 开机命令的实现，真正的执行者是mainBoard
 */
public class OpenCommand implements Command {

    private MainBoardApi mainBoard;

    public OpenCommand(MainBoardApi mainBoard){
        this.mainBoard = mainBoard;
    }

    @Override
    public void execute() {
        this.mainBoard.open();
    }
}
