<%-- 
    Document   : reg
    Created on : 01-03-2018, 10:35:01
    Author     : wtfak


<%@ page import ="java.sql.*" %>
<%
    String fname = request.getParameter("fname");
    String address = request.getParameter("address");
    String address = request.getParameter("postalcode");
    String email = request.getParameter("email");
    String password = request.getParameter("password");
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://46.101.158.228:3306/CupcakeWebshop", "testuser", "password123");
    Statement st = con.createStatement();
    //ResultSet rs;

    int i = st.executeUpdate("insert into customerinfo(email, name, address, postalcode, ) values ('" + email + "','" + name + "','" + address + "','" + postalcode+ "'");
    int i = st.executeUpdate("insert into login(email,password ) values ('" + email + "','" + password + "'");


    if (i > 0) {
        //session.setAttribute("userid", user);
        response.sendRedirect("regSuccess.jsp");
s    } else {
        response.sendRedirect("index.jsp");
    }
%>
--%>
