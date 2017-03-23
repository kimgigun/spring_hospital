<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>


   <table id="articleList">
    <tr>
   	 <th>총게시글수:${requestScope.count}</th></tr>
	     <tr>
	         <th>No</th>
	         <th>ID</th>
	         <th>Title</th>
	         <th>RegDate</th>
	         <th>ReadCount</th>
	     </tr>
<c:forEach var="article" items="${requestScope.list}">  <!-- c:foreach 확장포문  list는 리퀘스트로 받아서 돌리겠다는것. -->

	 <tr>
         <td>${article.art_seq}</td> <%-- <%=article.getArt_seq() %> 와 같은것 --%>
         <td>${article.id}</td>	
         <td><a href="${context}/board.do?action=detail&page=articleDetail&seq=${article.art_seq}">${article.title}</a></td>
         <td>${article.regdate}</td>
         <td>${article.read_Count}</td>
     </tr>
</c:forEach>
 </table>
<nav id="pagination">
 	<ul class="gnb">
<c:if test="${requestScope.prevBlock gt 0}">
	<li>
	<a href="${context}/board.do?action=list&page=articleList&pageNo=${requestScope.prevBlock}">◀PREV </a>
	</li>
</c:if>	   

<c:forEach varStatus="i" begin="${requestScope.blockStart}" end="${requestScope.blockEnd}" step="1"   >
	<li>	
	<c:choose>
		<c:when test="${i.index eq pageNo}">
		<a href="#"><font style="color:red">${i.index}</font></a>
		</c:when>
		<c:otherwise>
			<a href="${context}/board.do?action=list&page=articleList&pageNo=${i.index}">${i.index}</a>
		</c:otherwise>
	</c:choose>
    </li>
</c:forEach> 
<c:if test="${requestScope.nextBlock le pageCount}">
	<li>
	<a href="${context}/board.do?action=list&page=articleList&pageNo=${requestScope.nextBlock}">NEXT▶</a>
	</li>
</c:if>
   </ul>
</nav>
</body>
<div>
총 페이지수${pageCount}<br/>
이전블록 시작페이지${prevBlock}<br/>
현재블록 시작페이지${blockStart}<br/> 
현재블록 끝페이지${blocEnd}<br/>
다음블록 시작페이지${nextBlock}<br/>
</div>
<jsp:include page="../common/footer.jsp"/>
</html>
<script>
$(function(){
	alert
	var articleList=$('#articleList');
	articleList.addClass("table_default").addClass("margin_center").css("width","500px").css("margin-top","200px");
	articleList.find('tr:nth=child(1)').add('text-align','right').attr('colspan','5');
	var pagination=$('#pagination');
	pagination.css('width','500px').css('margin','0 auto');
	pagination.find('ul:nth=child(1)').add('width','100%');
});

</script>
