/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Connector.DataAccessObject;
import Constructors.Customer;
import Constructors.LineItem;
import Constructors.Order;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author adams
 */
@WebServlet(name = "OrderConfirmation", urlPatterns =
{
    "/OrderConfirmation"
})
public class OrderConfirmation extends HttpServlet
{

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, Exception
    {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter())
        {
            
            HttpSession session = request.getSession();
            ArrayList<LineItem> itemList = ((ArrayList<LineItem>) session.getAttribute("shoppingCart"));
            DataAccessObject dao = new DataAccessObject();
            Customer customer = ((Customer) session.getAttribute("customer"));
            Random random = new Random();
            int orderId = random.nextInt(10000000)+1;
            
            int totalPrice = 0;
            
            for (LineItem lineItem : itemList)
            {
                totalPrice += lineItem.getPrice();
            }
            dao.newOrder(orderId, totalPrice, customer.getId());
            Order order = dao.getOrder(orderId);
            for (LineItem lineItem : itemList)
            {
                dao.newLineItem(lineItem.getName(), lineItem.getQty(), lineItem.getPrice(), lineItem.getBot_id(), lineItem.getTop_id(), order.getOrderID());
            }
            session.setAttribute("orderId", order.getOrderID());
            String nextJSP = "/Confirmation.jsp";
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
            dispatcher.forward(request, response);

        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        try
        {
            processRequest(request, response);
        } catch (Exception ex)
        {
            Logger.getLogger(OrderConfirmation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        try
        {
            processRequest(request, response);
        } catch (Exception ex)
        {
            Logger.getLogger(OrderConfirmation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo()
    {
        return "Short description";
    }// </editor-fold>

}
