<%-- 
    Document   : Shop
    Created on : 28-Feb-2018, 10:52:05
    Author     : emilv
--%>

<%@page import="Constructors.Cupcake"%>
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
<% ArrayList<Cupcake> cart = (ArrayList<Cupcake>) session.getAttribute("item");
    if (cart == null)
    {
        cart = new ArrayList();
        session.setAttribute("item", cart);
    }
%>

<html>
    <head>
        <title>Cupcake shop</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>  
        <% session.getAttribute("email"); %>
        <div>Cutetastic cupcakes</div>
        <form method="POST" action="Shop.jsp">
            <p> Choose your favourite bottom and toppings</p>
            <select id= "selectedTopping" name="Toppings">
                <%for (Topping topping : toppings)
                    { %> 
                <option value="<%out.print(topping.getName()); %>">
                    <% out.println(topping.getName() + " " + topping.getPrice() + " kr.");
                        } %>
                </option>
            </select>
            <select id="selectedBottom" name="Bottoms">
                <% for (Bottom bottom : bottoms)
                    { %> 
                <option value="
                        <%out.print(bottom.getName()); %>">
                    <% out.println(bottom.getName() + " " + bottom.getPrice() + " kr.");
                        } %>
                </option>
            </select>
            <br><input type="submit" value="Add to cart">
        </form>
        <form method="POST" action="Confirmation.jsp">
            <input type="submit" value="Continue">
        </form>
        <form method="POST" action="Shop.jsp">
            <input type="submit" value="Cancel" name="cancel">
            <% if (request.getParameter("cancel") != null)
                {
                    cart.clear();
                }%>
        </form>
        <% cart.add(new Cupcake(request.getParameter("Toppings"), request.getParameter("Bottoms")));%>
        <br><b>
            <% out.println("Your shopping cart:");%></b>
        <br>
        <%for (Cupcake cake : cart)
            {
                if (cake != null)
                out.print(cake.getTop() + " " + cake.getBot());
        %> <br> 

        <% }
        %>
    </body>
</html>