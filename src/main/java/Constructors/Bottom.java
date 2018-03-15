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
public class Bottom
{
    private int id;
    private String name;
    private int price;

    /**
     * Constructor for the Bottom class
     * @param id
     * @param name
     * @param price
     */
    public Bottom(int id, String name, int price)
    {
        this.id = id;
        this.name = name;
        this.price = price;
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
    public int getPrice()
    {
        return price;
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString()
    {
        return  name +  price + " kr.";
    }
    
     
    
}
