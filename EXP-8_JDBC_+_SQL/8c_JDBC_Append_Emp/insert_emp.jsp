/*
Develop a JDBC project using JSP to append the fields empno, empname and basicsalary
into the table Emp of the database Employee by getting the fields through keyboard and
Generate the report as follows for the TABLE Emp (Emp_NO , Emp_Name, Basicsalary ) using
HTML and JSP to get the fields and display the results respectively.
*/

------------------------------------------------------------------------------------------
insert_emp.jsp 
------------------------------------------------------------------------------------------

<%@ page import="java.sql.*" %>
<%@ page import="java.util.*" %>

<html>
<head><title>Insert Employee</title></head>
<body>

<%
String empnoStr = request.getParameter("empno");
String empname = request.getParameter("empname");
String basicsalaryStr = request.getParameter("basicsalary");

if (empnoStr != null && empname != null && basicsalaryStr != null) {
    int empno = Integer.parseInt(empnoStr);
    int basicsalary = Integer.parseInt(basicsalaryStr);

    Connection conn = null;
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost/Employee", "root", "");
        String sql = "INSERT INTO Emp (Emp_NO, Emp_Name, Basicsalary) VALUES (?, ?, ?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, empno);
        ps.setString(2, empname);
        ps.setInt(3, basicsalary);
        ps.executeUpdate();
        out.println("<h3>Record inserted successfully!</h3>");
        ps.close();
    } catch (Exception e) {
        out.println("Error: " + e.getMessage());
    } finally {
        if (conn != null) conn.close();
    }
}
%>

<h2>Enter Employee Details</h2>
<form method="post">
    Emp No: <input type="text" name="empno" required><br>
    Name: <input type="text" name="empname" required><br>
    Basic Salary: <input type="text" name="basicsalary" required><br>
    <input type="submit" value="Insert">
</form>

</body>
</html>
