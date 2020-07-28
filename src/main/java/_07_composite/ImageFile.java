package _07_composite;

/**
 * 图像文件
 */
public class ImageFile extends AbstractFile {

    private String name;

    public ImageFile(String name) {
        this.name = name;
    }

    public void add(AbstractFile abstractFile) {
        System.out.println("不支持该方法");

    }

    public void remove(AbstractFile abstractFile) {
        System.out.println("不支持该方法");
    }

    public AbstractFile getChild(int i) {
        System.out.println("不支持该方法");
        return null;
    }

    public void killVirus() {
        System.out.println("对图像文件" + name + "进行杀毒");
    }
}
