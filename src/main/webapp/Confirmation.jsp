<%-- 
    Document   : Confirmation
    Created on : 01-03-2018, 10:24:30
    Author     : wtfak
--%>

<%@page import="Constructors.LineItem"%>
<%@page import="Constructors.LineItem"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% ArrayList<LineItem> itemList = ((ArrayList<LineItem>) session.getAttribute("itemList")); %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Order Successful!</title>
    </head>
    <body>
        <h1>Order successful!</h1>
        <b>
            <% out.println("Your shopping cart:");%></b>
            <% for (LineItem item : itemList)
                {
                    out.println(item.getQty() + item.getName());
                }
            %>
        <br>


    </body>
</html>
