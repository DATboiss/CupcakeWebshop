<%-- 
    Document   : Registration
    Created on : 26-Feb-2018, 11:52:23
    Author     : emilv
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html>
    <head>
        <link href="RegStylesheet.css" rel="stylesheet">

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration</title>
    </head>

    <body>
        <ul>
            <li><a href="index.jsp">Home</a></li>
            <li><a href="ShoppingCart">Shoppingcart</a></li>
            <!-- <li><a href="contact.asp">My User</a></li> -->

        </ul>
        <form action="RegistrationServlet" method="post">
            <div class="cupcakeimg">

            </div>

            <div class="brownReg">
                <center>
                    <p>Email:</p><input type="text" name="email"><br>
                    <p>Password:</p><input type="password" name="pw"><br>
                    <p>Repeat password:</p> <input type="password" name="pw2"><br>
                    <div class="errorMessage">
                        <%
                            if (null != request.getAttribute("errorMessage"))
                            {
                                out.println(request.getAttribute("errorMessage"));
                            }
                        %>
                    </div>
                    <p>Desired starting balance:</p> <input type="number" name="balance"><br>
                    <p>Full name:</p> <input type="texr" name="fName"><br>
                    <p>Address:</p> <input type="text" name="address"><br>
                    <p>Zip code:</p> <input type="text" name="zip"><br>

                    <input type="submit" name="submit" value="submit">
                </center>
            </div>


        </form>
    </body>
</html>
