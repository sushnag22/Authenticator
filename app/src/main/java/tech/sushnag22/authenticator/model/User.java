package tech.sushnag22.authenticator.model;

public class User {
    private String name;
    private String password;

    public User(String username, String password) {
        this.name = username;
        this.password = password;
    }
}