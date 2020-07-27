package composite;

import java.util.ArrayList;

/**
 * 文件夹类
 */
public class Folder extends AbstractFile{

    private ArrayList<AbstractFile> files = new ArrayList<AbstractFile>();

    private String name;

    public Folder(String name){
        this.name = name;
    }

    public void add(AbstractFile abstractFile) {
        files.add(abstractFile);
    }

    public void remove(AbstractFile abstractFile) {
        files.remove(abstractFile);
    }

    public AbstractFile getChild(int i) {
        return files.get(i);
    }

    public void killVirus() {
        System.out.println("对文件夹" + name + "进行杀毒");
        for (AbstractFile file : files) {
            file.killVirus();
        }
    }
}
