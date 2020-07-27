package abstractFactory;

public class SpringSkinFactory implements SkinFactory {
    @Override
    public Button creatButton() {
        return new SpringButton();
    }

    @Override
    public TextField creatTextField() {
        return new SpringTextField();
    }
}
