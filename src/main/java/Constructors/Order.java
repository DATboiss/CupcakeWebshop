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
    private int order_id;
    private int order_total_price;
    private int customer_id;

    public Order(int order_id, int order_total_price, int customer_id)
    {
        this.order_id = order_id;
        this.order_total_price = order_total_price;
        this.customer_id = customer_id;
    }
    
    
    
}
