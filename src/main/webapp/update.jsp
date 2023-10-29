<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="update" method="post">	
Enter the firstname:<input type="text" name="firstname" value="<%=request.getParameter("firstname")%>"><br>
Enter the lastname:<input type="text" name="lastname" value="<%=request.getParameter("lastname")%>"><br>
Enter the street:<input type="text" name="street" value="<%=request.getParameter("street")%>"><br>
Enter the address:<input type="text" name="address" value="<%=request.getParameter("address")%>"><br>
Enter the city:<input type="text" name="city" value="<%=request.getParameter("city")%>"><br>
Enter the state:<input type="text" name="state" value="<%=request.getParameter("state")%>"><br>
Enter the email:<input type="email" name="email" value="<%=request.getParameter("email")%>"><br>
Enter the phone:<input type="number" name="phone" value="<%=request.getParameter("phone")%>"><br>
 <button type="submit">submit</button>
</body>
</html>