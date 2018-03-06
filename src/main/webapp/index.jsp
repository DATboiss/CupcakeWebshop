<%-- 
    Document   : index
    Created on : 01-03-2018, 09:11:19
    Author     : wtfak
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
    <center>
        <title>Please enter your credentials</title>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        </head>

        <body>
            <form action="LoginServlet" method="post">


                <div class="container">
                    <h1>Welcome to the Cup Cake Shop. Login below pls</h1>
                    <label for="email"<b>Email</b></label>
                    <input type="text" placeholder="Enter Email" name="email">

                    <label for="password"<b>Password</b></label>
                    <input type="password" placeholder="Enter Password" name="pw">

                    <label for="submit"<b> </b></label>
                    <input type="submit" name="submit" value="submit">
                </div>


            </form>
            <form action="RegistrationServlet" method="post">
                <input type="submit" name="register" value="register here">
            </form>

    </center>
</body>
</html>



