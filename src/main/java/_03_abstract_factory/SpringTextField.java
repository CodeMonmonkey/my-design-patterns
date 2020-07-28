package _03_abstract_factory;

public class SpringTextField implements TextField {
    @Override
    public void display() {
        System.out.println("显示绿色文本框");
    }
}
