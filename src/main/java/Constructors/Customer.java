package Constructors;

/**
 *
 * @author emilv
 */
public class Customer {
    private String email;
    private String name;
    private String password;
    private int balance;
    private String address;
    private int zip; 

  
    public Customer(String email, String password, int balance)
    {
        this.email = email;
        this.password = password;
        this.balance = balance;
    }
    

}