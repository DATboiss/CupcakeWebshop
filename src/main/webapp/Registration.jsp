<%-- 
    Document   : Registration
    Created on : 26-Feb-2018, 11:52:23
    Author     : emilv
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration</title>
    </head>
    <body>
        <form action="RegistrationServlet" method="post">
            <center>
                Email: <input type="text" name="email"><br></br>
                Password: <input type="password" name="pw"><br></br>
                Repeat password: <input type="password" name="pw2"><br></br>
                Decired starting balance: <input type="number" name="balance"><br></br>
                Full name: <input type="texr" name="fName"><br></br>
                Address: <input type="text" name="address"><br></br>
                Zip code: <input type="text" name="zip"><br></br>
                
                <input type="submit" name="submit" value="submit">
                                 
            </center>
        </form>
    </body>
</html>
