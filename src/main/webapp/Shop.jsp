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

<%DataAccessObject DAO = new DataAccessObject(); %>
<%ArrayList<Topping> toppings = DAO.getToppings(); %>
<%ArrayList<Bottom> bottoms = DAO.getBottoms(); %>
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
            <p> Choose your favourite bottom and toppings</p>
            <select name="Toppings">
                <% for (int i = 0; i < 9; i++) {
                %> <option value="<%toppings.get(i).getName(); %>
} %>
                <option value="Chocolate">Chocolate 5,-</option>
                <option value="Blueberry"></option>
                <option value="Raspberry">Frame type 3</option>
                <option value="Crispy">Frame type 3</option>
                <option value="Strawberry">Frame type 3</option>
                <option value="Rum/raisin">Frame type 3</option>
                <option value="Orange">Frame type 3</option>
                <option value="Lemon">Frame type 3</option>
                <option value="Blue cheese">Frame type 3</option>
            </select>
            <select name="Buttoms">
                <option value="Frame type 1">Frame type 1</option>
                <option value="Frame type 2">Frame type 2</option>
                <option value="Frame type ">Frame type 3</option>
            </select>
            <br><input type="submit" value="Continue">
        </form>
    </body>
</html>