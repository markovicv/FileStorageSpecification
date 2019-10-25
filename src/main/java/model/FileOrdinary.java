package model;

import exception.*;

import java.io.File;
import java.util.List;

/**
 * @author Vukasin Markovic
 * @author Nesko Simic
 *
 * Specification of all the methods used by File
 */
public interface FileOrdinary {
    /**
     *
     * @param path Path of the given file where we want to create it
     * @param name Name of the newly created file
     * @throws CreateFileException throws exception if path or name is null or if an error occurred during creation
     */

    public void create(String path,String name) throws CreateFileException;


    /**
     *
     * @param pathName Path of the given file where it is located
     * @throws DeleteFileException Throws exception if the pathName is null or empty or doesn't exist
     */


    public void delete(String pathName) throws DeleteFileException;

    /**
     *
     * This function will not copy the original! It will move the original to another location
     * @param srcPath Path of the file we want to move
     * @param dstPath Destination were our file will be moved
     * @throws MoveFileException Throws exception if the source path or destination path is null or empty or doesn't exist
     */

    public void move(String srcPath,String dstPath) throws MoveFileException;

    /**
     *
     * @param path Path of the file
     * @param newName name that will replace the old name
     * @throws RenameException Throws exception if path or newName are null or empty
     */


    public void rename(String path,String newName) throws RenameException;

    /**
     *
     * @param srcPath Path were the file is located
     * @param dstPath Destination were we want to download it
     * @throws DownloadFileException Throws exception if source path or destination path is empty
     */

    public void download(String srcPath,String dstPath) throws DownloadFileException;

    /**
     *
     * @param scrPath Path were the is located
     * @param dstPath Destination were we want to upload it
     * @throws UploadFileException Throws exception if source path or destination path is empty
     */

    public void upload(String scrPath,String dstPath) throws UploadFileException;

    /**
     *
     * @param srcPath Path were the file is located
     * @param dstPath Destination were we want our duplicate file to be
     * @throws CopyFileException Throws exception if source path or destination path is empty
     */

    public void copy(String srcPath,String dstPath) throws CopyFileException;

    /**
     *
     * @param file File we want to zip
     * @param dstPath Path were we want our zipped file to be
     * @throws UploadFileException Throws exception if File doesn't exist or if the path doesn't exist
     */

    public void uploadZip(File file ,String dstPath) throws UploadFileException;

    /**
     *
     * @param files List of files that we want to upload
     * @param desPath Destination were we want our files to be
     * @throws UploadMultipleFileException Throws exception if files are empty or if destination path doesn't exist
     */

    public void uploadMultipleFile(List<File> files, String desPath)  throws UploadMultipleFileException;

    /**
     *
     * @param files List of files that we want to zip
     * @param desPath Destination were we want our files to be after zipping
     * @throws UploadMultipleFileException Throws exception if files are empty or if the destination path is empty
     */

    public void uploadMultipleFilesToZipFiles(List<File> files,String desPath)  throws UploadMultipleFileException;







}
