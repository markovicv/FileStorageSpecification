package model;

import exception.*;

import java.io.File;
import java.util.List;

public interface Directory {

    /**
     *
     * @param path Path where we want to create our directory
     * @param name Name of our directory
     * @throws CreateDirException Throws exception if path doens't exist or if name is empty
     */

    public void create(String path,String name) throws CreateDirException;

    /**
     *
     * @param pathName Path where the directory is located
     * @throws DeleteDirException Throws exception if the path doesn't exist
     */

    public void delete(String pathName) throws DeleteDirException;

    /**
     *
     * @param srcPath Source path where the directory is created
     * @param dstPath Destination path where the directory will be moved
     * @throws MoveDirException Throws exception if one of the paths doesn't exist
     */

    public void move(String srcPath,String dstPath) throws MoveDirException;

    /**
     *
     * @param path Path of the directory location
     * @param newName New name that will be given to that directory
     * @throws RenameException Throws exception if the path doesn't exist or if the new name is null
     */

    public void rename(String path,String newName) throws RenameException;

    /**
     *
     * @param srcPath Source path where our directory is located
     * @param dstPath Destination path where out directory will be downloaded
     * @throws DownloadDirException Throws exception if one of these paths don't exist
     */

    public void download(String srcPath,String dstPath) throws DownloadDirException;

    /**
     *
     * @param srcPath Source path where out directory is located
     * @param dstPath Destination path where our directory will be uploaded
     * @throws UploadDirException Throws exception if one of these paths don't exist
     */

    public void upload(String srcPath,String dstPath)throws UploadDirException;

    /**
     *
     * @param dirs List of directories we want to upload
     * @param dest Destination where we want to upload them
     * @throws UploadMultipleFileException Throws exception if list of directories are empty or the path is invalid
     */

    public void uploadDirs(List<File>dirs,String dest) throws UploadMultipleFileException;

    /**
     *
     * @param dris List of directories we want to upload
     * @param dest Destnation where we want to upload them
     * @param zipName Name of the zip file
     * @throws ZipException Throws exception if list is empty or if destination is invalid
     */

    public void uploadZipDirs(List<File>dris,String dest,String zipName) throws ZipException;

    /**
     *
     * @param dir directory we want to zip
     * @param path path where we want ot zip it
     * @param zipName Name of the zip file
     * @throws ZipException Throws exception if directory is null or path is invalid
     */
    public void zipDir(File dir,String path,String zipName) throws ZipException;

    /**
     *
     * @param srcPath Path were the files are located
     * @param extension extensions we want to get
     * @param sort true if we want them sorted
     * @return List of files and directories by extensions
     * @throws FileListException Throws exception if the path is invalid or the list of extension are empty
     */
    public List<java.io.File> getByExtension(String srcPath, String[] extension,boolean sort) throws FileListException;

    /**
     *
     * @param srcPath Path were the directory is located
     * @param sort True if we want them in sorted order
     * @return List of files in a given directory
     * @throws FileListException Throws exception if path doesnt exist
     */

    // vrati sve nazive fajlova unutar direktorijuma
    public List<java.io.File> getFileNamesInDir(String srcPath,boolean sort) throws FileListException;

    /**
     *
     * @param srcPath Path where the directory is created
     * @param sort True if we want them in sorted order
     * @return List od directories
     * @throws DirecrotyListException Throws exception path is invalid
     */

    // vrati sve nazive direktorijuma u nekom direktorijumu
    public List<java.io.File> getAllDirs(String srcPath,boolean sort) throws DirecrotyListException;
    public void setPath(String path);
    public String getPath();




}
