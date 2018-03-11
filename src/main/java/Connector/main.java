/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connector;

import Constructors.Bottom;
import Constructors.Topping;
import java.util.ArrayList;

/**
 *
 * @author Adam
 */
public class main
{

    public static void main(String[] args) throws Exception
    {
        DataAccessObject dao = new DataAccessObject();
        System.out.println("==newCustomer==");
        System.out.println(dao.newCustomer("hejmeddig@gmail.com", "kasper123", 5, "Kasper Ø", "Lyngbyvej 30", "9000"));
        System.out.println("");

        System.out.println("==getBottom==");
        System.out.println(dao.getBottom("Chocolate"));
        System.out.println("");

        System.out.println("==getBottoms==");
        ArrayList<Bottom> bottoms = new ArrayList();
        bottoms = dao.getBottoms();
        for (Bottom bottom : bottoms)
        {
            System.out.println(bottom);
        }
        System.out.println("");

        System.out.println("==getTopping==");
        System.out.println(dao.getTopping("Chocolate"));
        System.out.println("");

        System.out.println("==getToppings==");
        ArrayList<Topping> toppings = new ArrayList();
        toppings = dao.getToppings();
        for (Topping topping : toppings)
        {
            System.out.println(topping);
        }
        System.out.println("");

//        System.out.println("==newOrder==");
//        System.out.println(dao.newOrder(10, 2));
//        
//        System.out.println("==newLineItem==");
//        System.out.println(dao.newLineItem("ChocolateNutmeg", 3, 5, 3, 1, 1));
    }

}
