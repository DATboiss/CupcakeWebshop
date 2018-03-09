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
        System.out.println(dao.checkCustomer("adamsaidweqwane@hotmail.com", "adam123"));
    }
    
}
