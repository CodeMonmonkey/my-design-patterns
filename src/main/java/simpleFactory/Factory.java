package simpleFactory;

public class Factory {

    public static Api creatApi(){
        return new Impl();
    }
}
