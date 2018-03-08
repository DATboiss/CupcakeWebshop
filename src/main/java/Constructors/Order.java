/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constructors;

/**
 *
 * @author adams
 */
public class Order
{
    private int orderID;
    private int totalPrice;
    private int customerID;

    public Order(int orderID, int totalPrice, int customerID)
    {
        this.orderID = orderID;
        this.totalPrice = totalPrice;
        this.customerID = customerID;
    }    

    public int getOrderID()
    {
        return orderID;
    }

    public int getTotalPrice()
    {
        return totalPrice;
    }

    public int getCustomerID()
    {
        return customerID;
    }
    
    
}
