package _11_command.command01;

public class Command02 extends AbstractCommand {

    private AbstractReceiver receiver;

    public Command02(AbstractReceiver receiver){
        this.receiver =  receiver;
    }

    @Override
    public void execute() {
        System.out.println("命令02被发布");
        receiver.doJob();
    }
}
