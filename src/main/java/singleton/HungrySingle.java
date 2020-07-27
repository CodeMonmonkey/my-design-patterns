package singleton;

public class HungrySingle {
    private static HungrySingle single = new HungrySingle();
    private HungrySingle(){}
    public static HungrySingle getInstance(){
        if (single == null){
            single = new HungrySingle();
        }
        return single;
    }
}
