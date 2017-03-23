<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<div style="width:100px">
	<table id="articleDetail table_default margin_center">
		<tr>
			<td>안녕</td>
		</tr>
		<tr>
			<td>no:20 작성자:홍길동</td>
		</tr>
		<tr>
			<td>안녕 안녕</td>
		</tr>
		<tr>
				<td> 
					<input type="button" name="return" value="목록으로">
				</td>
		</tr>	
	</table>
</div>
<script>
$(function(){
	var articleDetail=$('#articleDetail');
	$('input[name=return]').click(function(){
		$articleDetail.attr('action');
		$articleDetail.submit();
	});
});
</script>