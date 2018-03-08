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

    public Bottom(int id, String name, int price)
    {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public int getPrice()
    {
        return price;
    }
    
    
    
    @Override
    public String toString()
    {
        return  name +  price + " kr.";
    }
    
     
    
}
