<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Document</title>
</head>
<body>
<%-- <%
	PatientService service= PatientServiceImpl.getInstance();
	PatientBean pat=new PatientBean();
	pat.setPatID(request.getParameter("id"));
	pat.setPatPass((request.getParameter("password")));
	boolean check = service.login(pat);
	if(check){
%>
	<%= request.getParameter("id")%>님.	
	<input type="button" value="로그아웃"/>	
<%
	}else{
%>

	<h3>회원정보가 일치 하지 않습니다.</h3>
	<a href="patLogin.jsp">뒤로가기</a>
<%
	}
%> --%>

</body>
</html>