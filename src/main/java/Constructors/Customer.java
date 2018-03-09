package Constructors;

/**
 *
 * @author emilv
 */
public class Customer {
    
    private int id;
    private String email;
    private String password;
    private int balance;
    private String name;
    private String address;
    private int zip;

    public Customer(int id, String email, String password, int balance, String name, String address, int zip)
    {
        this.id = id;
        this.email = email;
        this.password = password;
        this.balance = balance;
        this.name = name;
        this.address = address;
        this.zip = zip;
    }

    public int getId()
    {
        return id;
    }

    public String getEmail()
    {
        return email;
    }

    public String getPassword()
    {
        return password;
    }

    public int getBalance()
    {
        return balance;
    }

    public String getName()
    {
        return name;
    }

    public String getAddress()
    {
        return address;
    }

    public int getZip()
    {
        return zip;
    }

    @Override
    public String toString()
    {
        return "Customer{" + "id=" + id + ", email=" + email + ", password=" + password + ", balance=" + balance + ", name=" + name + ", address=" + address + ", zip=" + zip + '}';
    }
    
    

   
    
}