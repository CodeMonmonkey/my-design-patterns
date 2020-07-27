package command.command02;

/**
 * 技嘉主板类，开机命令的真正实现者。充当receiver
 */
public class GigaMainBoard implements MainBoardApi {
    @Override
    public void open() {
        System.out.println("技嘉主板正在开机");
        System.out.println("接通电源......");
        System.out.println("设备检查......");
        System.out.println("装载系统......");
        System.out.println("机器正常运转......");
        System.out.println("机器已正常打开");
    }
}
