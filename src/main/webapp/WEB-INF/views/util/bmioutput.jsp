<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>BMI 측정</title>
</head>
<body>
<% 
String result="";
String tooyoung="";
double cm = Double.parseDouble(request.getParameter("cm"));  
double kg = Double.parseDouble(request.getParameter("kg"));
int age=Integer.parseInt(request.getParameter("age"));
double bmi = kg  / (cm/100 * cm/100);
if(age<2){
	tooyoung="2살미만은 사용할수 없습니다.";
	}else
if (bmi > 30.0) {
	result = "고도비만";
} else if (bmi > 25.0) {
	result = "비만";
} else if (bmi > 23.0) {
	result = "과체중";
} else if (bmi > 18.5) {
	result = "정상";
} else {
	result = "저체중";
}


%>
나이<%=request.getParameter("age")  %> 살 </br>
몸무게<%=request.getParameter("kg") %> kg </br>
bmi 지수는 <%= result %> 입니다.♥
	
</body>
</html>