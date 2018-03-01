<%-- 
    Document   : Login
    Created on : 28-02-2018, 10:45:59
    Author     : wtfak
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
            
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <form action="action_page.php">

            <div class="container">
                <label for="email"><b>Email</b></label>
                <input type="text" placeholder="Enter Email" name="email" required>

                <label for="password"><b>Password</b></label>
                <input type="password" placeholder="Enter Password" name="password" required>

                <button type="submit">Login</button>
                
                <button onclick="ocument.getElementById('signup').style.display = 'block'" style="width:auto;">Sign Up</button>
    </body>
</html>
