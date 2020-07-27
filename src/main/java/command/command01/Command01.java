package command.command01;

public class Command01 extends AbstractCommand {

    private AbstractReceiver receiver;

    public Command01(AbstractReceiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        System.out.println("命令01被发布");
        receiver.doJob();
    }
}
