package _09_proxy.dynamicProxy;

public class HelloImplements implements IHello {

    public void sayHello(String name) {
        System.out.println("hello" + name);
    }

    public void sayGoodBye(String name) {
        System.out.println(name + "goodbye!");
    }
}
