/*
Read all the existing records from the table coffee which is from the database test and insert a
new coffee product into it [Create a table coffee with fields ( id,coffee_name,price)] using HTML and
JSP to get the fields and display the results respectively.
*/

------------------------------------------------------------------------------------------
inser_coffee.jsp
------------------------------------------------------------------------------------------

<%@ page import="java.sql.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Coffee Product Management</title>
</head>
<body>
<%
    String jdbcURL = "jdbc:mysql://localhost:3306/test";
    String dbUser = "root";
    String dbPassword = "";

    Connection conn = null;
    PreparedStatement pstmt = null;
    Statement stmt = null;
    ResultSet rs = null;

    String idStr = request.getParameter("id");
    String coffeeName = request.getParameter("coffee_name");
    String priceStr = request.getParameter("price");

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);

        if (idStr != null && priceStr != null && coffeeName != null &&
            !idStr.trim().isEmpty() && !priceStr.trim().isEmpty() && !coffeeName.trim().isEmpty()) {

            int id = Integer.parseInt(idStr);
            float price = Float.parseFloat(priceStr);

            String insertSQL = "INSERT INTO coffee (id, coffee_name, price) VALUES (?, ?, ?)";
            pstmt = conn.prepareStatement(insertSQL);
            pstmt.setInt(1, id);
            pstmt.setString(2, coffeeName);
            pstmt.setFloat(3, price);

            int rows = pstmt.executeUpdate();
            if (rows > 0) {
                out.println("<p style='color:green;'>Coffee product inserted successfully!</p>");
            }
        }

        stmt = conn.createStatement();
        rs = stmt.executeQuery("SELECT * FROM coffee");

        out.println("<h2>All Coffee Products</h2>");
        out.println("<table border='1' cellpadding='10'>");
        out.println("<tr><th>ID</th><th>Coffee Name</th><th>Price</th></tr>");

        while (rs.next()) {
            int coffeeId = rs.getInt("id");
            String name = rs.getString("coffee_name");
            float coffeePrice = rs.getFloat("price");

            out.println("<tr>");
            out.println("<td>" + coffeeId + "</td>");
            out.println("<td>" + name + "</td>");
            out.println("<td>" + coffeePrice + "</td>");
            out.println("</tr>");
        }
        out.println("</table>");

    } catch (Exception e) {
        out.println("<p style='color:red;'>Error: " + e.getMessage() + "</p>");
    } finally {
        try { if (rs != null) rs.close(); } catch(Exception e) {}
        try { if (stmt != null) stmt.close(); } catch(Exception e) {}
        try { if (pstmt != null) pstmt.close(); } catch(Exception e) {}
        try { if (conn != null) conn.close(); } catch(Exception e) {}
    }
%>
</body>
</html>
