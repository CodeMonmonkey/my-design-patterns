package simpleFactory;

public class Client {

    public static void main(String[] args) {
        Api api = Factory.creatApi();
        api.test1("测试！");
    }
}
