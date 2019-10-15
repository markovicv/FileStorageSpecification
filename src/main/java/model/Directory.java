package model;

import exception.*;

import java.io.File;
import java.util.List;

public interface Directory {

    public void create(String path,String name) throws CreateDirException;

    public void delete(String pathName) throws DeleteDirException;

    public void move(String srcPath,String dstPath) throws MoveDirException;

    public void rename(String path,String newName) throws RenameException;

    public void download(String srcPath,String dstPath) throws DownloadDirException;

    public void upload(String srcPath,String dstPath)throws UploadDirException;

    public void uploadDirs(List<File>dirs,String dest) throws UploadMultipleFileException;

    public void uploadZipDirs(List<File>dris,String dest,String zipName) throws ZipException;

    public void zipDir(File dir,String path,String zipName) throws ZipException;

    // vrati fajlove sa odredjenom ekstenzijom
    public List<java.io.File> getByExtension(String srcPath, String[] extension,boolean sort) throws FileListException;

    // vrati sve nazive fajlova unutar direktorijuma
    public List<java.io.File> getFileNamesInDir(String srcPath,boolean sort) throws FileListException;

    // vrati sve nazive direktorijuma u nekom direktorijumu
    public List<java.io.File> getAllDirs(String srcPath,boolean sort) throws DirecrotyListException;




}
