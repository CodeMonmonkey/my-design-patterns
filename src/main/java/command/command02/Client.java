package command.command02;

public class Client {

    public static void main(String[] args) {

        OpenCommand openCommand = new OpenCommand(new GigaMainBoard());
        Box box = new Box();
        box.setOpenCommand(openCommand);
        box.openButtonPressed();
    }
}
