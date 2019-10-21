package model;

import exception.UnzipDirException;
import net.lingala.zip4j.ZipFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * @author Vukasin Markovic
 * @author Nesko Simic
 *
 * Class that contains all relevant compressing operations
 */

public class Zipper {

    public Zipper(){

    }

    /**
     *
     * @param file File we want to zip
     * @param path Path where we want to zip it
     * @param ime Name of the zip
     */
    public void zipFile(File file,String path,String ime) {
        if(file.isFile()){
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(path + File.separator + ime + ".zip");
                ZipOutputStream zipOutputStream = new ZipOutputStream(fileOutputStream);
                FileInputStream fileInputStream = new FileInputStream(file);
                ZipEntry zipEntry = new ZipEntry(file.getName());
                zipOutputStream.putNextEntry(zipEntry);

                byte[] byteSize = new byte[1024];
                int length;
                while((length= fileInputStream.read(byteSize))>=0)
                    zipOutputStream.write(byteSize,0,length);
                zipOutputStream.close();
                fileInputStream.close();
                fileOutputStream.close();
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }

    /**
     * Zips the whole directory and all of his subfiles and subdirectories
     * @param file Directroy we want to zip
     * @param path Path where it is located
     * @param ime Name of the zip
     */
    public void zipDir(File file,String path,String ime){
        try{
            FileOutputStream fileOutputStream = new FileOutputStream(path+File.separator+ime+".zip");
            ZipOutputStream zipOutputStream = new ZipOutputStream(fileOutputStream);

            zipUtil(file,ime,zipOutputStream);
            zipOutputStream.close();
            fileOutputStream.close();


        }
        catch(Exception e){

        }
    }
    public void unzipDir(String soruce,String destination) throws UnzipDirException {
        if(soruce == null || soruce.equals(""))
            throw new UnzipDirException("soruce destination is empty");
        if(destination == null || destination.equals(""))
            throw new UnzipDirException("destination is empty");
        try{
            ZipFile zipFile = new ZipFile(soruce);
            zipFile.extractAll(destination);
        }
        catch(Exception e){
            e.printStackTrace();
        }


    }


    private void zipUtil(File file,String name,ZipOutputStream zipOutputStream) throws Exception{
        if(file.isHidden())
            return;
        if(file.isDirectory()){
            if (name.endsWith(File.separator)) {
                zipOutputStream.putNextEntry(new ZipEntry(name));
                zipOutputStream.closeEntry();
            } else {
                zipOutputStream.putNextEntry(new ZipEntry(name + File.separator));
                zipOutputStream.closeEntry();
            }
            File[] fileChildren = file.listFiles();
            if(fileChildren!=null){
                for(File c: fileChildren)
                    zipUtil(c,name+File.separator+c.getName(),zipOutputStream);
            }
            return;

        }
        FileInputStream fileInputStream = new FileInputStream(file);
        ZipEntry zipEntry = new ZipEntry(name);
        zipOutputStream.putNextEntry(zipEntry);

        byte[] byteSize = new byte[1024];
        int length;

        while((length=fileInputStream.read(byteSize))>=0)
            zipOutputStream.write(byteSize,0,length);
        fileInputStream.close();
    }
}
