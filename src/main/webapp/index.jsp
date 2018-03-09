<%-- 
    Document   : index
    Created on : 01-03-2018, 09:11:19
    Author     : wtfak
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
    <link href="RegStylesheet.css" rel="stylesheet">

    <title>Please enter your credentials</title>

    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>


<body>
    <ul>
        <li><a href="index.jsp">Home</a></li>
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



</body>
</html>



