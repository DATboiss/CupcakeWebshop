package com.mycompany.cupcakewebshop;

/**
 *
 * @author emilv
 */
public class User {
    private String username;
    private String password;
    private int balance;

    public User(String username, String password)
    {
        this.username = username;
        this.password = password;
        balance = 50;
    }
    

}