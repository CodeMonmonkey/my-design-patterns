package _03_abstract_factory;

public class Client {
    public static void main(String[] args) {

        System.out.println("皮肤1：");
        SpringSkinFactory springSkinFactory = new SpringSkinFactory();
        Button button = springSkinFactory.creatButton();
        TextField textField = springSkinFactory.creatTextField();
        button.display();
        textField.display();
        System.out.println();

        System.out.println("皮肤2：");
        SummerSkinFactory summerSkinFactory = new SummerSkinFactory();
        Button button1 = summerSkinFactory.creatButton();
        TextField textField1 = summerSkinFactory.creatTextField();
        button1.display();
        textField1.display();
    }
}
