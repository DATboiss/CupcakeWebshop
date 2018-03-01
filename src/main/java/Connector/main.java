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
        dao.newUser("adam@adam.com", "adams123", 50, "Adam_Saidane", "egedal", "2980");
    }
    
}
