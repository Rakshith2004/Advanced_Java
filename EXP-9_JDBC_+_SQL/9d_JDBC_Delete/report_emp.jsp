------------------------------------------------------------------------------------------
report_emp.jsp 
------------------------------------------------------------------------------------------

<%@ page import="java.sql.*" %>
<html>
<head><title>Salary Report</title></head>
<body>

<h2>Salary Report</h2>
<%
Connection conn = null;
int totalSalary = 0;

try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    conn = DriverManager.getConnection("jdbc:mysql://localhost/Employee", "root", "");

    Statement st = conn.createStatement();
    ResultSet rs = st.executeQuery("SELECT * FROM Emp");

    while (rs.next()) {
        int id = rs.getInt("Emp_NO");
        String name = rs.getString("Emp_Name");
        int salary = rs.getInt("Basicsalary");
        totalSalary += salary;
%>
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~<br>
Emp_No: <%= id %><br>
Emp_Name: <%= name %><br>
Basic: <%= salary %><br>
<%
    }
%>
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~<br>
Grand Salary: <%= totalSalary %><br>
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~<br>
<%
    rs.close();
    st.close();
} catch (Exception e) {
    out.println("Error: " + e.getMessage());
} finally {
    if (conn != null) conn.close();
}
%>

</body>
</html>