package model;

import exception.*;

import java.io.File;
import java.util.List;

public interface FileOrdinary {

    public void create(String path,String name) throws CreateFileException;

    public void delete(String pathName) throws DeleteFileException;

    public void move(String srcPath,String dstPath) throws MoveFileException;

    public void rename(String path,String newName) throws RenameException;

    public void download(String srcPath,String dstPath) throws DownloadFileException;

    public void upload(String scrPath,String dstPath) throws UploadFileException;

    public void copy(String srcPath,String dstPath) throws CopyFileException;

    public void uploadZip(String srcPath,String dstPath,String name) throws CopyFileException;

    public void uploadMultipleFile(List<File> files, String desPath)  throws UploadMultipleFileException;

    public void uploadListToZip(List<File> files,String desPath,String name)  throws UploadMultipleFileException;







}
