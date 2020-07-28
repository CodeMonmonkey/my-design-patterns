package _01_simple_factory;

public class Factory {

    public static Api creatApi(){
        return new Impl();
    }
}
