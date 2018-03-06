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
public class Cupcake
{
    Topping top;
    Bottom bot;

    public Cupcake(Topping top, Bottom bot)
    {
        this.top = top;
        this.bot = bot;
    }

    public Topping getTop()
    {
        return top;
    }

    public Bottom getBot()
    {
        return bot;
    }

    @Override
    public String toString()
    {
        return "Cupcake" + "top=" + top + ", bot=" + bot + '}';
    }
    
    
    
    
    
}
