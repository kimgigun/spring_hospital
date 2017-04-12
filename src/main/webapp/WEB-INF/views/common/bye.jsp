<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<body>

<h1>회원정보가 삭제 되었습니다 안녕히 가십시오.</h1></br>
<form id="confirm" style="width: 100%; height: px; margin: auto auto"
				class="margin_center">
	<input type="button" name="back" value="이전" style="width: 300px;" /> 
							<input type="hidden" name="action" value="register" />
							<input type="hidden" name="page" value="main" />
							<input id="button" type="button" name="submitBtn" value="메인으로 돌아가기" style="width: 300px;" />
	
 	
</form>
			
</body>
<script>
	$(function(){
		var button=$('#confirm');
		bye.click(function(){
				button.attr('action','${context}/home');
				button.attr('method','post');
				button.submit();
		});
	});
</script>


