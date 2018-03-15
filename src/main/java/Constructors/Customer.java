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

    /**
     *
     * @param id
     * @param email
     * @param password
     * @param balance
     * @param name
     * @param address
     * @param zip
     */
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

    /**
     *
     * @return
     */
    public int getId()
    {
        return id;
    }

    /**
     *
     * @return
     */
    public String getEmail()
    {
        return email;
    }

    /**
     *
     * @return
     */
    public String getPassword()
    {
        return password;
    }

    /**
     *
     * @return
     */
    public int getBalance()
    {
        return balance;
    }

    /**
     *
     * @return
     */
    public String getName()
    {
        return name;
    }

    /**
     *
     * @return
     */
    public String getAddress()
    {
        return address;
    }

    /**
     *
     * @return
     */
    public int getZip()
    {
        return zip;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString()
    {
        return "Customer{" + "id=" + id + ", email=" + email + ", password=" + password + ", balance=" + balance + ", name=" + name + ", address=" + address + ", zip=" + zip + '}';
    }
    
    

   
    
}