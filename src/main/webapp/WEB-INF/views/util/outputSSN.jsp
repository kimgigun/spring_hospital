<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Document</title>
</head>
<body>
<div>
이름<%= request.getParameter("name") %>

</div>
<% 
		String ssn =request.getParameter("ssn");
		String gender = "";
		char ch = ssn.charAt(7);
		if (ch == '1' || ch == '3') {
			gender = "남";
		} else if (ch == '2' || ch == '4') {
			gender = "여";
		} else if (ch == '5' || ch == '6') {
			gender = "외국인";
		} else {
			gender = "올바른 숫자를 입력해 주세요";
		}
%>
성별: <%= gender %>
</body>
</html>