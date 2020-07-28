package _07_composite;

public class Client {
    public static void main(String[] args) {

        AbstractFile file1, file2, file3, file4, file5, folder0, folder1, folder2, folder3;

        folder0 = new Folder("我的文件");
        folder1 = new Folder("图像文件");
        folder2 = new Folder("文本文件");
        folder3 = new Folder("视频文件");
        folder0.add(folder1);
        folder0.add(folder2);
        folder0.add(folder3);

        file1 = new ImageFile("image1");
        file2 = new ImageFile("image2");
        folder1.add(file1);
        folder1.add(file2);

        file3 = new TextFile("text1");
        file4 = new TextFile("text2");
        folder2.add(file3);
        folder2.add(file4);

        file5 = new VideoFile("video1");
        folder3.add(file5);

        folder0.killVirus();


    }
}
