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
 *
 * @author emilv
 */
public class DataAccessObject
{

    private final DBConnector conn;

    public DataAccessObject() throws Exception
    {
        this.conn = new DBConnector();
    }

    public Customer getCustomer(String email) throws SQLException
    {
        String sql = "select * from customer where cust_email = '?';";
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

    public LineItem getLineItem(int prodID) throws SQLException
    {
        String sql = "select * from product where prod_id = '?';";
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

    public Bottom getBottom(String bottomName) throws SQLException
    {
        String sql = "select * from bottom where bot_name = ?;";
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

    public Topping getTopping(String toppingName) throws SQLException
    {
        String sql = "select * from topping where top_name = ?;";
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

    //husk booleans til at tilføje new users
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

    public boolean newOrder(int order_total_price, int customer_id) throws SQLException
    {
        String sql = "insert into order (order_total_price, customer_cust_id) values (?, ?);";
        PreparedStatement stmt = conn.getConnection().prepareStatement(sql);
        stmt.setInt(1, order_total_price);
        stmt.setInt(2, customer_id);
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

    public ArrayList<Order> getOrders() throws SQLException
    {
        Statement stmt = conn.getConnection().createStatement();
        String sql = "select * from order;";
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

    public ArrayList<Order> getOrders(int id) throws SQLException
    {
        String sql = "select * from order where customer_cust_id = ?;";
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

}
