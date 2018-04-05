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
public class LineItem
{

    private int id;
    private String name;
    private int qty;
    private int price;
    private int bot_id;
    private int top_id;
    private int order_id;

    /**
     * Constructor for the LineItem class
     *
     * @param id
     * @param name
     * @param qty
     * @param price
     * @param bot_id
     * @param top_id
     * @param order_id
     */
    public LineItem(int id, String name, int qty, int price, int bot_id, int top_id, int order_id)
    {
        this.id = id;
        this.name = name;
        this.qty = qty;
        this.price = price;
        this.bot_id = bot_id;
        this.top_id = top_id;
        this.order_id = order_id;
    }

    /**
     * Update the quantity attribute.
     *
     * @param qty
     */
    public void setQty(int qty)
    {
        this.qty = qty;
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
    public String getName()
    {
        return name;
    }

    /**
     *
     * @return
     */
    public int getQty()
    {
        return qty;
    }

    /**
     *
     * @return
     */
    public int getPrice()
    {
        return price;
    }

    /**
     *
     * @return
     */
    public int getBot_id()
    {
        return bot_id;
    }

    /**
     *
     * @return
     */
    public int getTop_id()
    {
        return top_id;
    }

    /**
     *
     * @return
     */
    public int getOrder_id()
    {
        return order_id;
    }
}
