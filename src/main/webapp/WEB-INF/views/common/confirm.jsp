<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<body>
<form id="confirm" style="width: 100%; height: px; margin: auto auto"
				class="margin_center">
<h1>아이디를 삭제 하시겠습니까????????</h1></br>
	<input type="button" name="back" value="이전" style="width: 300px;" /> 
							<input type="hidden" name="action" value="register" />
							<input type="hidden" name="page" value="main" />
							<input type="button" name="submitBtn" value="삭제" style="width: 300px;" />
	
 	</form>

			
</body>
<script>
	$(function(){
		var button=$('#confirm');
		button.click(function(){
				button.attr('action','${context}/delete');
				button.attr('method','post');
				button.submit();
		});
	});
</script>


