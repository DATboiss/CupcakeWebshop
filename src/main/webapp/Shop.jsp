<%-- 
    Document   : Shop
    Created on : 28-Feb-2018, 10:52:05
    Author     : emilv
--%>

<%@page import="Constructors.LineItem"%>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@page import="java.util.List"%>
<%@page import="Constructors.Bottom" %>
<%@page import="Connector.DataAccessObject" %>
<%@page import="java.util.ArrayList" %>
<%@page import="Constructors.Topping" %>
<!DOCTYPE html>

<% List<Topping> toppings = (ArrayList<Topping>) request.getSession().getAttribute("toppingList");%>
 <% List<Bottom> bottoms = (ArrayList<Bottom>) request.getSession().getAttribute("bottomList"); %>
 <% ArrayList<LineItem> cart = (ArrayList<LineItem>) session.getAttribute("item");
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
        <ul>
        <li><a href="LoginServlet">Home</a></li>
        <li><a href="Shoppingcart">Shoppingcart</a></li>
        <li><a href="contact.asp">My User</a></li>
        
    </ul>
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
        <br><b>
            <% out.println("Your shopping cart:");%></b>
        <br>
        <%
        %> <br> 

        <% 
// add arraylist here
        %>
    </body>
</html>