/*
Read all the existing records from the table coffee which is from the database test and update an
existing coffee product in the table with its id. [Create a table coffee with fields
(id,coffee_name,price)] using HTML and JSP to get the fields and display the results respectively.
*/

------------------------------------------------------------------------------------------
update_coffee.jsp 
------------------------------------------------------------------------------------------

<%@ page import="java.sql.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Coffee Products</title>
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

        if (idStr != null && coffeeName != null && priceStr != null &&
            !idStr.trim().isEmpty() && !coffeeName.trim().isEmpty() && !priceStr.trim().isEmpty()) {

            int id = Integer.parseInt(idStr);
            float price = Float.parseFloat(priceStr);

            // Update coffee record
            String updateSQL = "UPDATE coffee SET coffee_name = ?, price = ? WHERE id = ?";
            pstmt = conn.prepareStatement(updateSQL);
            pstmt.setString(1, coffeeName);
            pstmt.setFloat(2, price);
            pstmt.setInt(3, id);

            int rows = pstmt.executeUpdate();
            if (rows > 0) {
                out.println("<p style='color:green;'>Coffee product updated successfully!</p>");
            } else {
                out.println("<p style='color:red;'>No record found with ID: " + id + "</p>");
            }
        }

        // Display all coffee records
        stmt = conn.createStatement();
        rs = stmt.executeQuery("SELECT * FROM coffee");

        out.println("<h2>All Coffee Products</h2>");
        out.println("<table border='1' cellpadding='10'>");
        out.println("<tr><th>ID</th><th>Coffee Name</th><th>Price</th></tr>");

        while (rs.next()) {
            out.println("<tr>");
            out.println("<td>" + rs.getInt("id") + "</td>");
            out.println("<td>" + rs.getString("coffee_name") + "</td>");
            out.println("<td>" + rs.getFloat("price") + "</td>");
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
