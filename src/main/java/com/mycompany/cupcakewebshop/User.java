package com.mycompany.cupcakewebshop;

/**
 *
 * @author emilv
 */
public class User {
    private String email;
    private String password;
    private int balance;

    public User(String email, String password, int balance)
    {
        this.email = email;
        this.password = password;
        this.balance = balance;
    }
    

}