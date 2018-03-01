<%-- 
    Document   : Confirmation
    Created on : 01-03-2018, 10:24:30
    Author     : wtfak
--%>

<%@page import="Constructors.Cupcake"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% ArrayList<Cupcake> cart = (ArrayList<Cupcake>) session.getAttribute("item");
    if (cart == null)
    {
        cart = new ArrayList();
        session.setAttribute("item", cart);
    }
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Order Successful!</title>
    </head>
    <body>
        <h1>Order successful!</h1>
        <b>
            <% out.println("Your shopping cart:");%></b>
        <br>
        <%for (Cupcake cake : cart)
            {
                out.print(cake.getTop() + " " + cake.getBot());
        %> <br> 

        <% }
        %>

    </body>
</html>
