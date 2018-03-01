<%-- 
    Document   : Shop
    Created on : 28-Feb-2018, 10:52:05
    Author     : emilv
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@page import="Constructors.Bottom" %>
<%@page import="Connector.DataAccessObject" %>
<%@page import="java.util.ArrayList" %>
<%@page import="Constructors.Topping" %>
<%@page import="Constructors.User" %>
<!DOCTYPE html>

 <% DataAccessObject DAO = new DataAccessObject(); %>
<% ArrayList<Topping> toppings = DAO.getToppings(); %>
<% ArrayList<Bottom> bottoms = DAO.getBottoms(); %> 

<html>
    <head>
        <title>Cupcake shop</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>  
        <% session.getAttribute("email"); %>
        <div>Cutetastic cupcakes</div>
        <form method="POST" action="Shopping cart">
            <p> Choose your favourite bottom and toppings</p>
            <select name="Toppings">
                <% for (Topping topping : toppings) { %> 
                <option value="
                        <%topping.getName(); %>
                        ">
                    <% topping.getName();} %>
                </option>
            </select>
            <select name="Bottoms">
                <% for (Bottom bottom : bottoms) { %> 
                <option value="
                        <%bottom.getName(); %>
                        ">
                    <% bottom.getName();} %>
                </option>
            </select>
            <br><input type="submit" value="Continue">
        </form>
    </body>
</html>