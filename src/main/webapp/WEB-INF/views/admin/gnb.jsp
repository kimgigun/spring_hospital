<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
     <ul id="adminGnb">
			<li><a>고객:회원가입</a></li>
			<li><a>고객:로그인</a></li>
			<li><a>스탭:로그인</a></li>
			<li><a>관리자:로그인</a></li>
			<li><a>게시판</a></li>
			<li class="dropdown">
					<a href="<%=application.getContextPath()%>/admin.do?action=move&page=main">관리자</a>
					<div class="dropdown_content">
						<a href="html/staff/doctor.html">
						<div style="padding:10px">의사</div></a>
						<a href="html/staff/nurses.html">
						<div style="padding:10px">간호사</div></a>
						<a href="html/cutomer/patients.html">
						<div style="padding:10px">환자</div></a>
						<a href="html/staff/chart.html"><div style="padding:10px">차트</div></a>
						<a href="html/customer/chart.html"><div style="padding:10px">진료</div></a>
				</div>
			</li>
			<li class="tooltip"><a href="#">병원소개</a>
			<span class="tooltiptext">구굴링하세요.</span>
			</li>
	</ul>
	
<script>
$(function goPage(){
	$('#adminGnb').addClass('gnb').css('height','40px');
	$('#adminGnb li:nth-child(1)').click(function(){
		alert('차일드1');
		location.href="${context}/patient.do?action=move&page=registerForm";
	});
	$('#adminGnb li:nth-child(2)').click(function(){
		alert('차일드2');
		location.href="${context}/patient.do?action=move&page=loginForm";
	});
	$('#adminGnb li:nth-child(3)').click(function(){
		alert('차일드3');
		location.href="${context}/patient.do?action=move&page=loginForm";
	});
	$('#adminGnb li:nth-child(4)').click(function(){
		alert('차일드4');
		location.href="${context}/patient.do?action=move&page=loginForm";
	});
	$('$adminGnb li:nth-child(5)').click(function(){
		alert('차일드5');
		location.href="${context}/board.do?action=move&page=main";
	});
});

</script>