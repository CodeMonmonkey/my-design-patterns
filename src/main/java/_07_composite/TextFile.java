package _07_composite;

/**
 * 文本文件
 */
public class TextFile extends AbstractFile{

    private String name;

    public TextFile(String name) {
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
        System.out.println("对文本文件" + name + "进行杀毒");
    }
}
