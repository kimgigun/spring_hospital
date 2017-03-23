<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="${context.js}/hospital.js"></script>
<img src="${context.img}/common/loading.gif" alt="" />
<script>
$(function (){
	goPage('${context.path}/home')
	});
//location.href은   (object).location객체를 호출하여 href 속성에 값을 할당하고 잇음 

</script>