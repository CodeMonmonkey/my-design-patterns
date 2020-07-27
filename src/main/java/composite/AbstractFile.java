package composite;

/**
 * 抽象文件类，各种文件及目录的公共父类
 */
abstract class AbstractFile {

    public abstract void add(AbstractFile abstractFile);

    public abstract void remove(AbstractFile abstractFile);

    public abstract AbstractFile getChild(int i);

    public abstract void killVirus();
}
