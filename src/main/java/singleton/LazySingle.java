package singleton;

public class LazySingle {
    private static LazySingle single = null;
    private LazySingle(){}
    public static LazySingle getInstance(){
        if (single == null){
            single = new LazySingle();
        }
        return single;
    }
}
