/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connector;

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
        System.out.println(dao.newCustomer("dskfædsl@gmail.com", "kasper123", 5, "Kasper Ø", "Lyngbyvej 30", "9000"));
        System.out.println("==newLineItem==");
        System.out.println(dao.newLineItem("ChocolateNutmeg", 3, 5, 3, 1, 1));
        System.out.println("==newOrder==");
        System.out.println(dao.newOrder(10, 1));
        
    }
    
}
