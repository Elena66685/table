package com.example.table;

public class User {
    private String id;
    private String fio;
    private String login;
    private String password;

    public User(String id, String fio, String login, String password) {
        this.id = id;
        this.fio = fio;
        this.login = login;
        this.password = password;
    }

    /*public User(String id = "5"; String fio = String valuo; String login = String login, String password) {
        this.id = id;
        this.fio = fio;
        this.login = login;
        this.password = password;
    }*/

    public String getId() {
        return id;
    }

    public String getFio() {
        return fio;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
