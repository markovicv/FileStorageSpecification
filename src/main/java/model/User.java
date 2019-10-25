package model;

import java.util.List;

public class User {
    private String userName;
    private String password;
    private List<String> lsitaAkcija;

    public User(String userName,String password,List<String> list){
        this.userName = userName;
        this.password = password;
        this.lsitaAkcija = list;


    }
    public User(){

    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<String> getLsitaAkcija() {
        return lsitaAkcija;
    }

    public void setLsitaAkcija(List<String> lsitaAkcija) {
        this.lsitaAkcija = lsitaAkcija;
    }
}
