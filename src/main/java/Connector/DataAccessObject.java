package Connector;

import Constructors.Bottom;
import Constructors.LineItem;
import Constructors.Order;
import Constructors.Customer;
import Constructors.Topping;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This class is used to pull data from the Database, and update/insert values into the database.
 * @author emilv
 */
public class DataAccessObject
{

    private final DBConnector conn;

    /**
     * 
     * @throws Exception
     */
    public DataAccessObject() throws Exception
    {
        this.conn = new DBConnector();
    }

    /**
     * Searches the customer table for a row with the corresponding email, and returns it as an object. 
     * @param email - The users email
     * @return Customer
     * @throws SQLException
     */
    public Customer getCustomer(String email) throws SQLException
    {
        String sql = "select * from customer where cust_email = ?";
        PreparedStatement stmt = conn.getConnection().prepareStatement(sql);
        stmt.setString(1, email);
        Customer customer = null;
        ResultSet rs = stmt.executeQuery();
        if (rs.next())
        {
            int id = rs.getInt("cust_id");
            String mail = rs.getString("cust_email");
            String password = rs.getString("cust_password");
            int balance = rs.getInt("cust_balance");
            String name = rs.getString("cust_name");
            String address = rs.getString("cust_address");
            int zip = rs.getInt("cust_zip");
            customer = new Customer(id, mail, password, balance, name, address, zip);
        }
        return customer;
    }

    /**
     * Searches the customer table for a row with the corresponding email and password.
     * If the Customer is found, a Customer object will be returned, otherwise a null object will be found.
     * @param email - The users email
     * @param password - The users password
     * @return Customer
     * @throws SQLException
     */
    public Customer checkCustomer(String email, String password) throws SQLException
    {
        String sql = "select * from customer where cust_email = ? and cust_password = ?;";
        PreparedStatement stmt = conn.getConnection().prepareStatement(sql);
        stmt.setString(1, email);
        stmt.setString(2, password);
        Customer customer = null;
        try
        {
            ResultSet rs = stmt.executeQuery();
            if (rs.next())
            {
                int id = rs.getInt("cust_id");
                String mail = rs.getString("cust_email");
                String pw = rs.getString("cust_password");
                int balance = rs.getInt("cust_balance");
                String name = rs.getString("cust_name");
                String address = rs.getString("cust_address");
                int zip = rs.getInt("cust_zip");
                customer = new Customer(id, mail, pw, balance, name, address, zip);
            }
        } catch (SQLException ex)
        {
            Logger.getLogger(DataAccessObject.class.getName()).log(Level.SEVERE, null, ex);

        }
        return customer;
    }

    /**
     * Searches the database for a LineItem (Product in the Database)  with an integer, representing the prod_id.
     * If a LineItem with the corresponding prod_id is found, a LineItem will be returned.
     * Otherwise a null object will be returned.
     * @param prodID - Product id
     * @return LineItem
     * @throws SQLException
     */
    public LineItem getLineItem(int prodID) throws SQLException
    {
        String sql = "select * from product where prod_id = ?";
        PreparedStatement stmt = conn.getConnection().prepareStatement(sql);
        stmt.setInt(1, prodID);
        LineItem lineItem = null;
        ResultSet rs = stmt.executeQuery();
        if (rs.next())
        {
            int id = rs.getInt("prod_ID");
            String name = rs.getString("prod_name");
            int qty = rs.getInt("prod_qty");
            int price = rs.getInt("prod_qty");
            int bottomID = rs.getInt("bottom_bot_id");
            int toppingID = rs.getInt("topping_top_id");
            int orderID = rs.getInt("order_order_id");
            lineItem = new LineItem(id, name, qty, price, bottomID, toppingID, orderID);
        }
        return lineItem;
    }

    /**
     * Searches the bottom table for the row with the corresponding bot_name, and returns it as a Bottom object.
     * @param bottomName - Self explanatory
     * @return Bottom
     * @throws SQLException
     */
    public Bottom getBottom(String bottomName) throws SQLException
    {
        String sql = "select * from bottom where bot_name = ?";
        PreparedStatement stmt = conn.getConnection().prepareStatement(sql);
        stmt.setString(1, bottomName);
        Bottom bottom = null;
        ResultSet rs = stmt.executeQuery();
        if (rs.next())
        {
            int id = rs.getInt("bot_id");
            String name = rs.getString("bot_name");
            int price = rs.getInt("bot_price");
            bottom = new Bottom(id, name, price);
        }
        return bottom;
    }

    /**
     * Takes everything from the bottom table, and inserts it into an ArrayList of Bottom objects.
     * @return ArrayList - returns an arraylist of Bottom
     * @throws Exception
     */
    public ArrayList<Bottom> getBottoms() throws Exception
    {
        Statement stmt = conn.getConnection().createStatement();
        String sql = "select * from bottom;";
        ArrayList<Bottom> bottoms = new ArrayList();
        Bottom bottom = null;
        ResultSet rs = null;
        try
        {
            rs = stmt.executeQuery(sql);
            while (rs.next())
            {
                int id = rs.getInt("bot_id");
                String name = rs.getString("bot_name");
                int price = rs.getInt("bot_price");
                bottom = new Bottom(id, name, price);
                bottoms.add(bottom);

            }
        } catch (SQLException ex)
        {
            Logger.getLogger(DataAccessObject.class.getName()).log(Level.SEVERE, null, ex);
        }
        return bottoms;
    }

    /**
     * Searches the topping table of the database, for a row with the corresponding name, and returns it as an object.
     * @param toppingName - Self explanatory
     * @return Topping
     * @throws SQLException
     */
    public Topping getTopping(String toppingName) throws SQLException
    {
        String sql = "select * from topping where top_name = ?";
        PreparedStatement stmt = conn.getConnection().prepareStatement(sql);
        stmt.setString(1, toppingName);
        Topping topping = null;
        ResultSet rs = stmt.executeQuery();
        if (rs.next())
        {
            int id = rs.getInt("top_id");
            String name = rs.getString("top_name");
            int price = rs.getInt("top_price");
            topping = new Topping(id, name, price);
        }
        return topping;
    }

    /**
     * Returns everything from the topping table, as Topping objects in an ArrayList.
     * @return ArrayList - ArrayListt of Topping
     * @throws Exception
     */
    public ArrayList<Topping> getToppings() throws Exception
    {
        Statement stmt = conn.getConnection().createStatement();
        String sql = "select * from topping;";
        ArrayList<Topping> toppings = new ArrayList<Topping>();
        Topping topping = null;
        ResultSet rs = null;
        try
        {
            rs = stmt.executeQuery(sql);
            while (rs.next())
            {
                int id = rs.getInt("top_id");
                String name = rs.getString("top_name");
                int price = rs.getInt("top_price");
                topping = new Topping(id, name, price);
                toppings.add(topping);

            }
        } catch (SQLException ex)
        {
            Logger.getLogger(DataAccessObject.class.getName()).log(Level.SEVERE, null, ex);
        }
        return toppings;
    }


    /**
     * Updates the database, by inserting a new row into the customer table.
     * @param email - Self explanatory
     * @param pw - Self explanatory
     * @param balance - Self explanatory
     * @param name - Self explanatory
     * @param address - Self explanatory
     * @param zip - Self explanatory
     * @return boolean
     * @throws SQLException
     */
    public boolean newCustomer(String email, String pw, int balance, String name, String address, String zip) throws SQLException
    {
        String sql = "insert into `customer` (`cust_email`, `cust_password`, `cust_balance`, `cust_name`, `cust_address`, `cust_zip`) values (?, ?, ?, ?, ?, ?);";
        PreparedStatement stmt = conn.getConnection().prepareStatement(sql);
        stmt.setString(1, email);
        stmt.setString(2, pw);
        stmt.setInt(3, balance);
        stmt.setString(4, name);
        stmt.setString(5, address);
        stmt.setString(6, zip);
        try
        {
            stmt.executeUpdate();
            return true;

        } catch (SQLException ex)
        {
            Logger.getLogger(DataAccessObject.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    /**
     * Creates a new LineItem. An Order is needed in order to make this object. 
     * @param name - Self explanatory
     * @param qty - Self explanatory
     * @param price - Self explanatory
     * @param bottomID - Self explanatory
     * @param toppingID - Self explanatory
     * @param orderID - Self explanatory
     * @return boolean
     * @throws SQLException
     */
    public boolean newLineItem(String name, int qty, int price, int bottomID, int toppingID, int orderID) throws SQLException
    {
        String sql = "insert into product (prod_name, prod_qty, prod_price, bottom_bot_id, topping_top_id, order_order_id) "
                + "values (?, ?, ?, ?, ?, ?);";
        PreparedStatement stmt = conn.getConnection().prepareStatement(sql);
        stmt.setString(1, name);
        stmt.setInt(2, qty);
        stmt.setInt(3, price);
        stmt.setInt(4, bottomID);
        stmt.setInt(5, toppingID);
        stmt.setInt(6, orderID);
        try
        {
            stmt.executeUpdate();
            return true;

        } catch (SQLException ex)
        {
            Logger.getLogger(DataAccessObject.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    /**
     * Add an order to database. PreparedStatements are used to protect from SQL injections. Method will return true if succesfully added to database.
     * Otherwise it will return false if add was either by already used email or that the database is down
     * @param order_total_price - Total Price of the order
     * @param customer_id - Self explanatory
     * @return boolean
     * @throws SQLException
     */
    public boolean newOrder(int order_id, int order_total_price, int customer_id) throws SQLException
    {
        String sql = "insert into `order` (order_id, order_total_price, customer_cust_id) values (?, ?, ?)";
        PreparedStatement stmt = conn.getConnection().prepareStatement(sql);
        stmt.setInt(1, order_id);
        stmt.setInt(2, order_total_price);
        stmt.setInt(3, customer_id);
        try
        {
            stmt.executeUpdate();
            return true;

        } catch (SQLException ex)
        {
            Logger.getLogger(DataAccessObject.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    /**
     * Gives an ArrrayList of all orders. This is used to show a list of all orders. Methods used to administrators
     * 
     * @return ArrayList - ArrayList of Order
     * @throws SQLException
     */
    public ArrayList<Order> getOrders() throws SQLException
    {
        Statement stmt = conn.getConnection().createStatement();
        String sql = "select * from `order`;";
        ArrayList<Order> orders = new ArrayList<Order>();
        Order order = null;
        ResultSet rs = null;
        try
        {
            rs = stmt.executeQuery(sql);
            while (rs.next())
            {
                int id = rs.getInt("order_id");
                int totalPrice = rs.getInt("order_total_price");
                int custID = rs.getInt("customer_cust_id");
                order = new Order(id, totalPrice, custID);
                orders.add(order);

            }
        } catch (SQLException ex)
        {
            Logger.getLogger(DataAccessObject.class.getName()).log(Level.SEVERE, null, ex);
        }
        return orders;
    }

    /**
     * Gives an ArrrayList of user specific orders. This is used to show the list of orders for an customer
     * @param id - the id of the customer.
     * @return ArrayList - ArrayList of Order 
     * @throws SQLException
     */
    public ArrayList<Order> getOrders(int id) throws SQLException
    {
        String sql = "select * from `order` where customer_cust_id = ?;";
        PreparedStatement stmt = conn.getConnection().prepareStatement(sql);
        stmt.setInt(1, id);
        ArrayList<Order> orders = new ArrayList<Order>();
        Order order = null;
        ResultSet rs = null;
        try
        {
            rs = stmt.executeQuery();
            while (rs.next())
            {
                int orderID = rs.getInt("order_id");
                int totalPrice = rs.getInt("order_total_price");
                int custID = rs.getInt("customer_cust_id");
                order = new Order(orderID, totalPrice, custID);
                orders.add(order);

            }
        } catch (SQLException ex)
        {
            Logger.getLogger(DataAccessObject.class.getName()).log(Level.SEVERE, null, ex);
        }
        return orders;
    }
        public Order getOrder(int orderId) throws SQLException
    {
        String sql = "select * from `order` where order_id = ?";
        PreparedStatement stmt = conn.getConnection().prepareStatement(sql);
        stmt.setInt(1, orderId);
        Order order = null;
        ResultSet rs = stmt.executeQuery();
        if (rs.next())
        {
            int id = rs.getInt("order_id");
            int totalPrice = rs.getInt("order_total_price");
            int cust_id = rs.getInt("customer_cust_id");
            order = new Order(id, totalPrice, cust_id);
        }
        return order;
    }

}

