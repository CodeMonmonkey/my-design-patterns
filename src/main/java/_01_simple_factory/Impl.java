package _01_simple_factory;

public class Impl implements Api {
    @Override
    public void test1(String s) {
        System.out.println("The input s = " + s);
    }
}
