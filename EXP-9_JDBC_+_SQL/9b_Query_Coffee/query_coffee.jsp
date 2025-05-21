/*
Read all the existing records from the table coffee which is from the database test and query
coffee name starting with ‘D’ in the table using HTML and JSP to get the field and display the
results respectively.
*/

------------------------------------------------------------------------------------------
query_coffee.jsp 
------------------------------------------------------------------------------------------

<%@ page import="java.sql.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Coffee Name Query</title>
</head>
<body>
<%
    String jdbcURL = "jdbc:mysql://localhost:3306/test";
    String dbUser = "root";
    String dbPassword = "";

    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);

        String querySQL = "SELECT * FROM coffee WHERE coffee_name LIKE 'D%'";
        pstmt = conn.prepareStatement(querySQL);
        rs = pstmt.executeQuery();

        out.println("<h2>Coffee Names Starting with 'D'</h2>");
        out.println("<table border='1' cellpadding='10'>");
        out.println("<tr><th>ID</th><th>Coffee Name</th><th>Price</th></tr>");

        boolean hasResults = false;
        while (rs.next()) {
            hasResults = true;
            out.println("<tr>");
            out.println("<td>" + rs.getInt("id") + "</td>");
            out.println("<td>" + rs.getString("coffee_name") + "</td>");
            out.println("<td>" + rs.getFloat("price") + "</td>");
            out.println("</tr>");
        }

        if (!hasResults) {
            out.println("<tr><td colspan='3' style='color:red;'>No coffee name starts with 'D'</td></tr>");
        }

        out.println("</table>");

    } catch (Exception e) {
        out.println("<p style='color:red;'>Error: " + e.getMessage() + "</p>");
    } finally {
        try { if (rs != null) rs.close(); } catch(Exception e) {}
        try { if (pstmt != null) pstmt.close(); } catch(Exception e) {}
        try { if (conn != null) conn.close(); } catch(Exception e) {}
    }
%>
</body>
</html>
