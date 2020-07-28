package _09_proxy.staticProxy;

/**
 * 代理对象要和真实对象实现一样的接口，这样对于客户端来说，他们是一样的
 * 代理角色通常在传递真实的之前或之后执行某个操作，而不是单纯的将调用传递给真实对象
 */
public class Proxy extends Subject {

    RealSubject realSubject;

    public void request() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }

        preRequest();
        realSubject.request();
        postRequest();

    }

    public void preRequest(){
        System.out.println("pre request");
    }

    public void postRequest(){
        System.out.println("post request");
    }
}
