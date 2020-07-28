package _06_adapter;

/**
 * 适配器。继承被适配者，实现目标接口。Adapter可以重定义Adaptee的部分行为，因为前者是后者的子类
 * 或者可以不继承，在类中new一个Adaptee即可
 */
public class Adapter extends Adaptee implements Target {

    public void request() {
        this.specificRequest();
    }
}
