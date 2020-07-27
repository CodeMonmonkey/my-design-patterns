package command.command01;

public class Invoker {

    private AbstractCommand command;

    public Invoker(AbstractCommand command){
        this.command = command;
    }

    public void action() {
        command.execute();
    }
}
