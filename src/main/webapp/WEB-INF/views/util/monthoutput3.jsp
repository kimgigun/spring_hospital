<%-- <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="util.ShowMonth_right" %>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Document</title>
</head>
<body>
<% %>
<%= new ShowMonth_right().getMonth(Integer.parseInt(request.getParameter("year")), Integer.parseInt(request.getParameter("month"))) %>
</body>
</html> --%>