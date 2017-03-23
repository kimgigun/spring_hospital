<%-- <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="util.Bmi" %>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>BMI 측정</title>
</head>
<body>
<% 
double kg=0;
double cm=0;
Bmi bmi=new Bmi();
bmi.getBmi(kg, cm);
%>
<%= new Bmi().getBmi(Double.parseDouble(request.getParameter("kg")),
		 Double.parseDouble(request.getParameter("cm")) ) %>
</body>
</html> --%>