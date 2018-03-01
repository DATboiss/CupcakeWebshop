<%-- 
    Document   : Shop
    Created on : 28-Feb-2018, 10:52:05
    Author     : emilv
--%>

<%@page import="com.mycompany.cupcakewebshop.Bottom"%>
<%@page import="com.mycompany.cupcakewebshop.DataAccessObject"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.mycompany.cupcakewebshop.Topping"%>
<%@page import="com.mycompany.cupcakewebshop.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<% com.mycompany.cupcakewebshop.DataAccessObject DAO = new DataAccessObject(); %>
<% ArrayList<Topping> toppings = DAO.getToppings(); %>
<% ArrayList<Bottom> bottoms = DAO.getBottoms(); %>
<% %>
<% %>
<% %>
<% %>

<html>
    <head>
        <title>Cupcake shop</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <div>Cutetastic cupcakes</div>
        <form method="POST" action="Shopping cart">
            <p> Choose your favourite bottom and toppings</p
            <select name="Toppings">
                <% for (int i = 0; i < 9; i++) { %> 
                <option value="
                        <%toppings.get(i).getName(); %>
                        >
                        <% toppings.get(i).getName();}%>
            </select>
            <select name="Buttoms">
              <% for (int j = 0; j < 5; j++) { %> 
                <option value="
                        <%bottoms.get(j).getName(); %>
                        >
                        <% bottoms.get(j).getName();} %>
            </select>
            <br><input type="submit" value="Continue">
        </form>
    </body>
</html>