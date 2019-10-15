import model.Zipper;

import java.io.File;

public class App {


    public static void main(String[] args){
        File fileDir = new File("/home/vukasin/SK/FileStorageSpec/src/dirtest");
        File fileObican = new File("/home/vukasin/SK/FileStorageSpec/src/dirtest/123.txt");



        String path = "/home/vukasin/Desktop/";
        Zipper zipper = new Zipper();
       // zipper.zipFile(fileObican,path,fileObican.getName().substring(0,fileObican.getName().lastIndexOf('.')));
        zipper.zipDir(fileDir,path,fileDir.getName());

    }
}
