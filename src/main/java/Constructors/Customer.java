package Constructors;

/**
 *
 * @author emilv
 */
public class Customer {
    private String email;
    private String password;
    private int balance;
    private String name;
    private String address;
    private int zip;

    public Customer(String email, String password, int balance, String name, String address, int zip)
    {
        this.email = email;
        this.password = password;
        this.balance = balance;
        this.name = name;
        this.address = address;
        this.zip = zip;
    }
    
}