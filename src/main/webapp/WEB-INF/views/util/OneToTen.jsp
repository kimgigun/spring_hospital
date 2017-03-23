<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>1부터 10까지의 합</title>
</head>
<body>
<%
int sum=0;
int[] arr=new int[10];
for(int i=0;i<arr.length+1;i++){
	sum=sum+i;
}
%>
1부터 10까지의 결과는 <%= sum %> 입니다.<br />
</body>
</html>