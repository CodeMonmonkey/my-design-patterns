package _03_abstract_factory;

public class SpringButton implements Button {
    @Override
    public void display() {
        System.out.println("显示绿色按钮");
    }
}
