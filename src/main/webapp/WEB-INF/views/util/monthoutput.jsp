<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Document</title>
</head>
<body>
<%!
public String getMonth(int year,int month){
	String day="";
	switch(month){
	case 1: case 3: case 5: case 7: case 8: case 10: case 12: day="31"; break;
	case 4: case 6: case 9: case 11: day="30"; break;
	case 2: 
	if(year%4==0){
	if(year%100==0){
	if(year%400==0){
		day="28";
		}}}else{
			day="29";} break; 
	default:
		day="올바른 값이 아닙니다.";
	}
	return day;
}
%>
<%
int year=Integer.parseInt(request.getParameter("year"));
int month=Integer.parseInt(request.getParameter("month"));

%>
<%= year %> 년
<%= month %> 월은
<%= getMonth(year,month) %>일 까징이다.
</body>
</html>