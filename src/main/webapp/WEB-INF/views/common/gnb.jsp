<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
     <ul id="commonGnb">
			<li><a>고객:회원가입</a></li>
			<li><a>고객:로그인</a></li>
			<li><a>스탭:로그인</a></li>
			<li><a>관리자:로그인</a></li>
			<li><a>게시판</a></li>
			<li class="dropdown">
					<a href="<%=application.getContextPath()%>/admin.do?action=move&page=articleList">관리자</a>
					<div class="dropdown_content">
						<a href="html/staff/doctor.html">
						<div style="padding:10px">의사</div></a>
						<a href="html/staff/nurses.html">
						<div style="padding:10px">간호사</div></a>
						<a href="html/cutomer/patients.html">	
						<div id="div3" style="padding:10px">환자</div></a>
						<a href="html/staff/chart.html"><div style="padding:10px">차트</div></a>
						<a href="html/customer/chart.html"><div style="padding:10px">진료</div></a>
				</div>
			</li>
			<li class="tooltip"><a href="#">병원소개</a>
			<span class="tooltiptext">구굴링하세요.</span>
			</li>
	</ul>
	
	<script>

		$(function (){
			var commonGnb=$('#commonGnb');
			commonGnb.addClass('gnb').css('height,40px');
			commonGnb.find('li:nth-child(1)').click(function(){
				alert('제이쿼리 테스트');
				goPage('${context.path}/patient/join');
			});
			
			commonGnb.find('li:nth-child(2)').click(function(){
				alert('차일드2번');
				location.href="${context.path}/patient/login";
			});
			commonGnb.find('li:nth-child(3)').click(function(){
				alert('차일드3번');
				location.href="${context.path}/patient/login";
			});
			$('#commonGnb li:nth-child(4)').click(function(){
				alert('차일드4번');
				location.href="${context.path}/patient/login";
			});
			$('#commonGnb li:nth-child(5)').click(function(){
				alert('차일드5번');
				location.href="${context.path}/patient/login";
			});
		});
			</script>
		
		
		

