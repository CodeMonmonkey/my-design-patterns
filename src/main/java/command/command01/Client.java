package command.command01;

public class Client {
    public static void main(String[] args) {

        Command01 command01 = new Command01(new Receiver01());
        Invoker invoker = new Invoker(command01);
        invoker.action();

        Command02 command02 = new Command02(new Receiver01());
        invoker = new Invoker(command02);
        invoker.action();

        Command02 command021 = new Command02(new Receiver02());
        invoker = new Invoker(command021);
        invoker.action();

    }
}
