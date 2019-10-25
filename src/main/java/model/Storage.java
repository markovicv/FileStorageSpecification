package model;

import exception.DataBaseException;

/**
 * @author Vukasin Markovic
 * @author Nesko Simic
 */

public interface Storage {

    /**
     * initializes a new storage
     */

    public void iniStorage() throws DataBaseException;
    public boolean auth(String username,String password);
    public String  getStoragePath();
    public String getStorageName();
    public User getUser();
}
