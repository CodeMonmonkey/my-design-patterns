package _09_proxy.staticProxy;

public class RealSubject extends Subject {
    public void request() {
        System.out.println("call real subject request");
    }
}
