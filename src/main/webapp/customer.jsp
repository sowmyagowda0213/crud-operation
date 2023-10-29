<%@page import="java.util.List"%>
<%@page import="mock.dto.Customer"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% List<Customer> cus=(List<Customer>)request.getAttribute("objects"); %>

<table border="">
<pre><h3>                              Customer List</h3></pre>
<button><a href="addcustomer.html">Add Customer</a></button>
<tr>
<th>First Name</th>
<th>Last Name</th>
<th>Address</th>
<th>city</th>
<th>Street</th>
<th>Email</th>
<th>Phone</th>
<th>Delete</th>
<th>Edit</th>
</tr>
<%for(Customer e:cus){%>
<tr>
<td><%=e.getFirstname()%></td>
<td><%=e.getLastname()%></td>
<td><%=e.getAddress()%></td>
<td><%=e.getCity()%></td>
<td><%=e.getStreet()%></td>
<td><%=e.getEmail()%></td>
<td><%=e.getPhone()%></td>
<td><a href="def?primarykey=<%=e.getFirstname()%>">remove</a></td>
<td><a href="update.jsp?firstname=<%=e.getFirstname()%>&&lastname=<%=e.getLastname()%>&&address=<%=e.getAddress()%>&&city=<%=e.getCity()%>&&street=<%=e.getStreet()%>&&email=<%=e.getEmail()%>&&phone=<%=e.getPhone()%>">edit</a></td>
</tr>
<%} %>
</table>
</body>
</html>