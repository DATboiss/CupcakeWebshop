<%-- 
    Document   : Confirmation
    Created on : 01-03-2018, 10:24:30
    Author     : wtfak
--%>

<%@page import="Constructors.LineItem"%>
<%@page import="Constructors.LineItem"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% ArrayList<LineItem> itemList = ((ArrayList<LineItem>) session.getAttribute("shoppingCart"));
    int count = 1;
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <title>Order Successful!</title>
    </head>
    <body>
        <div class="container">
            <div class="row">
                <div class="col-sm-12">
                    <h1>Order successful!</h1>
                </div>
            </div>
        </div>
        <b><div class="container">
                <div class="row">
                    <div class="col-sm-12">
                        <% out.println("Your shopping cart:");%></b>
                    </div>
                </div>
            </div>
            <table class="table table-striped table-bordered">
                <thead class="thead-dark">
                    <tr>
                        <th scope="cole">#</th>
                        <th scope="col">Quantity</th>
                        <th scope="col">Name</th>
                        <th scope="col">Price</th>
                    </tr>
                </thead>
                <tbody>
                    <%
                        for (LineItem item : itemList)
                        { %> 
                    <tr>
                        <th scope='row'><% out.print(count++); %></th>
                        <td><% out.print(item.getQty());%></td>
                        <td><% out.print(item.getName()); %></td>
                        <td><% out.print(item.getPrice() * item.getQty());%></td>
                        <%
                            }
                        %>
                    </tr>
                </tbody>
            </table>

            <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
            <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
            <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

    </body>
</html>
