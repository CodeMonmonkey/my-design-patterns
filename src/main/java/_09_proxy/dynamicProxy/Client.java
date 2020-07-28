package _09_proxy.dynamicProxy;

public class Client {
    public static void main(String[] args) {
        DynamicProxyHello dynamicProxyHello = new DynamicProxyHello();
        HelloImplements helloImplements = new HelloImplements();
        IHello iHello = (IHello) dynamicProxyHello.bind(helloImplements);
        iHello.sayHello("Alex");
    }
}
