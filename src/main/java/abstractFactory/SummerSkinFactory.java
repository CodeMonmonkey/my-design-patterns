package abstractFactory;

public class SummerSkinFactory implements SkinFactory {
    @Override
    public Button creatButton() {
        return new SummerButton();
    }

    @Override
    public TextField creatTextField() {
        return new SummerTextField();
    }
}
