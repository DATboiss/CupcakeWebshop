<%-- 
    Document   : Login
    Created on : 28-02-2018, 10:45:59
    Author     : wtfak
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <!--<link href="RegStylesheet.css" rel="stylesheet"> -->

        <title>Please enter your credentials</title>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    </head>


    <body>
        <ul>
            <li><a href="LoginServlet">Home</a></li>
            <!-- <li><a href="contact.asp">My User</a></li> -->

        </ul>

    <center>

        <div class="backgroundLogin">
            <div class="login">
                <form action="LoginServlet" method="post">
                    <h1>Welcome to the Cup Cake Shop! Please login below :)</h1>
                    <p>Email:</p>
                    <p><input type="text" placeholder="Enter Email" name="email"></p>

                    <p>Password:</p>
                    <p><input type="password" placeholder="Enter Password" name="pw"></p>


                    <p><input type="submit" name="submit" value="Submit"></p>
                </form>

                <form action="UselessForwarsServlet" method="post">

                    <p> <input type="submit" name="register" value="Register"></p>
                </form>

            </div>
        </div>


    </center>


    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>
