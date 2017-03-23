<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin</title>
<link rel="stylesheet" href="../../css/hanbitee.css" />
<style>
.wrap1{
	width:100%;
}
.wrap2{
	width:800px;
	margin:0 auto;
}
.pagination {
    display: block;
    padding:0;
    
    
}

.pagination li {display: inline;}

.pagination li a {
    color: black;
    padding: 8px 16px;
    text-decoration: none;
}
.table_default tr th{
    text-align:center;
    padding-top: 15px;
        
    }
.table_default tr td{
    text-align:center;
    padding-top: 15px;
        
    }



</style>
</head>

<body>
<div id="wrapper" class="width_full_size">
<div id="header" class="width_full_size" style="height:80px;">
	<div class="logo width_full_size text_center" style="height:40px;">
		<a href="../../index.html"><img src="../../images/common/index_logo.png"/></a>
	</div>
    <ul class="gnb" style="height:40px; text-align:center;" >
			<li><a href="../common/join.html">회원가입</a></li>
			<li><a href="../common/login.html">로그인</a></li>
			<li><a href="../bbs/bbs_list.html">게시판</a></li>
			<li class="dropdown">
					<a href="../admin/admin.html">관리자</a>
					<div class="dropdown_content">
						<p><a href="../staff/doctor.html">의사</a></p>
						<p><a href="../staff/nurses.html">간호사</a></p>
						<p><a href="../cutomer/patients.html">환자</a></p>
						<p><a href="../customer/chart.html">차트</a></p>
				</div>
			</li>
			<li class="tooltip"><a href="#">병원소개</a>
			<span class="tooltiptext">구굴링하세요.</span>
			</li>
	</ul>	
</div>
<div style="height:100px"></div>
<div id="container" class="width_full_size" style="height:700px;" >
	<ul class="lnb" style="float: left;  width: 20%">
	  <li><a class="active" href="#home">의사</a></li>
	  <li><a href="#news">간호사</a></li>
	  <li><a href="#contact">환자</a></li>
	  <li><a href="#about">진료</a></li>
	  <li><a href="#about">차트</a></li>
	</ul>
<!-- <div class="wrapper" style="width:100%; height:800; margin-top:100px;"> -->
<table  class="table_default  "style="width:60%; height:150px; margin:0 auto;" >
	<tr style="height:40px;">
		<th style="background-color:gray"  class="event_hover">의사</th>
		<th class="event_hover">간호사</th>
		<th class="event_hover">환자 </th>
		<th class="event_hover">진료 </th>
		<th class="event_hover">차트 </th>
	</tr>
	<tr style=height:80%;>
		<td colspan="5">
		<table style="width:100%;" class="table_default table_even">
			<tr>
				<th>순서</th>
				<th>고유번호</th>
				<th>담당명</th>
				<th>의사명</th>
				<th>성별</th>
			    <th>번호</th>
				<th>메일</th>
				<th>직위</th>
			</tr>
			<tr>
				<td>1</td>
				<td>980312</td>
				<td>소아과</td>
				<td>이태정</td>
				<td>M</td>
				<td>010-333-1340</td>
				<td>ltj@hanbh.com</td>
				<td>과장</td>
			</tr>
			<tr>
			    <td>2</td>
				<td>000601</td>
				<td>내과</td>	
				<td><a href="../staff/detail.html">안성기</a></td>
				<td>M</td>
				<td>011-222-0987</td>
				<td>ask@hanbh.com</td>
				<td>과장</td>
			</tr>
			<tr>
			    <td>3</td>
				<td>001208</td>
				<td>외과</td>
				<td>김민종</td>
				<td>M</td>
				<td>010-333-8743</td>
				<td>kmj@hanbh.com</td>
				<td>과장</td>
			</tr>
		</table>
		</td>
	</tr>
</table>
<!-- <div class="wrap1">
	<div class="wrap2"> -->
	<!-- <div style="width:100%; margin:0 auto;"> -->
	<div style="width:100%">
	<ul class="pagination" style="text-align:center ">
	  <li><a href="#">«</a></li>
	  <li><a href="#">1</a></li>
	  <li><a class="active" href="#">2</a></li>
	  <li><a href="#">3</a></li>
	  <li><a href="#">4</a></li>
	  <li><a href="#">5</a></li>
	  <li><a href="#">6</a></li>
	  <li><a href="#">7</a></li>
	  <li><a href="#">»</a></li>
	</ul>
	</div>
	<!-- </div> -->
	<!-- </div>
		</div> -->
		</div>
		<p class="border_solid"></p>
		<div id="footer" class="width_full_size" style="height:20px; margin:auto auto;">
			<dl class="notice">
			<!-- 	<dt><a href="/NOTICE" class="h_notice">공지사항</a></dt> -->
			</dl>
		<p class="svc_all">
		</p>
		<dl class="policy">
			<dd class="f"><a href="http://www.navercorp.com/" target="_blank" id="plc.intronhn">회사소개</a></dd>
			<dd><a href="http://mktg.naver.com/" id="plc.adinfo">광고</a></dd>
			<dd><a href="https://submit.naver.com/" id="plc.search">마이비즈니스</a></dd>
			<dd><a href="https://www.navercorp.com/ko/company/proposalGuide.nhn" target="_blank" id="plc.contact">제휴제안</a></dd>
			<dd><a href="rules/service.html" id="plc.service">이용약관</a></dd>
			<dd><a href="rules/privacy.html" id="plc.privacy"><strong>개인정보처리방침</strong></a></dd>
			<dd><a href="rules/youthpolicy.html" id="plc.youth">청소년보호정책</a></dd>
			<dd><a href="rules/spamcheck.html" id="plc.policy">네이버 정책</a></dd>
			<dd><a href="https://help.naver.com/" id="plc.helpcenter">네이버 고객센터</a></dd>
		</dl>
		<address>&copy; <strong><a href="http://www.navercorp.com/" target="_blank">NAVER Corp.</a></strong></address>
		</div>

</div>
</body>
</html>