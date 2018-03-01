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
    String top;
    String bot;

    public Cupcake(String top, String bot)
    {
        this.top = top;
        this.bot = bot;
    }

    public String getTop()
    {
        return top;
    }

    public String getBot()
    {
        return bot;
    }

    @Override
    public String toString()
    {
        return "Cupcake" + "top=" + top + ", bot=" + bot + '}';
    }
    
    
    
    
    
}
