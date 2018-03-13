<%-- 
    Document   : Shop
    Created on : 28-Feb-2018, 10:52:05
    Author     : emilv
--%>

<%@page import="Constructors.Customer"%>
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
<% ArrayList<LineItem> cart = (ArrayList<LineItem>) request.getSession().getAttribute("itemList");
   Customer user = ((Customer) request.getSession().getAttribute("Customer"));
%>

<html>
    <head>
        <link href="RegStylesheet.css" rel="stylesheet">
        <title>Cupcake shop</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body> 
        <ul>
            <li><a href="index.jsp">Home</a></li>
            <li><a href="Shoppingcart">Shoppingcart</a></li>
            <ul class="">
            <li><a><% out.println(user.getName()); %></a></li>
            </ul>
            <!--<li><a href="contact.asp">My User</a></li> -->

        </ul>
        <div class="shopcart">
            <h1>Welcome to Cutetastic cupcakes </h1>
            <form method="POST" action="Shoppingcart">
                <p> Choose your favourite bottom and toppings</p>
                <p>Toppings</p>
                <select  name="Toppings">
                    <%for (Topping topping : toppings)
                        { %> 
                    <option value="<%out.print(topping.getName()); %>">
                        <% out.println(topping.getName() + " " + topping.getPrice() + " kr.");
                            } %>
                    </option>
                </select>
                <p>Bottoms</p>
                <select name="Bottoms"> 
                    <% for (Bottom bottom : bottoms)
                        { %> 
                    <option value="<%out.print(bottom.getName()); %>">
                        <% out.println(bottom.getName() + " " + bottom.getPrice() + " kr.");
                            } %>
                    </option>

                </select>
                    <input type="number" name="amount" placeholder="Amount"><br>

                <br><p><input type="submit" value="Add to cart" name="add"></p>
            </form>
            <form method="POST" action="Confirmation.jsp">
                <input type="submit" value="Continue">

            </form>
            <form method="POST" action="Shoppingcart">
                <p><input type="submit" value="Cancel" name="cancel"></p>
                    <% session.setAttribute("top", request.getParameter("Toppings"));
                        session.setAttribute("bot", request.getParameter("Bottoms"));
                        if (request.getParameter("cancel") != null)
                        {
                            cart.clear();
                        }%>

            </form>
            <br><b>
                <% out.println("Your shopping cart:");%></b>
            <br>
            <%  //Test to see if it's working
                out.println("is cart empty??");
                out.println(cart.isEmpty() + " " + cart.size());
                for (LineItem item : cart)
                {
            %> <p> <%  out.println(item.getQty() + " " + item.getName() + " " + item.getPrice() + " kr."); %> </p><%
                }

            %>
        </div>
    </body>
</html>