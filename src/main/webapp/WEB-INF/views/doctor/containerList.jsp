<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Join</title>
<link rel="stylesheet" href="../../css/hanbitee.css" />
<style>
[title~=cheif] {
    border: 2px solid tomato;
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
<!--contents begin -->
<div class="gallery">
  <a target="_blank" href="../../images/staff/doctor1.jpg" >
    <img src="../../images/staff/doctor1.jpg" title="cheif"  alt="Fjords" width="300" height="200">
  </a>
  <div class="gallery_desc">Add a description of the image here</div>
</div>

<div class="gallery">
  <a target="_blank" href="../../images/staff/doctor2.jpg">
    <img src="../../images/staff/doctor2.jpg" alt="Forest" width="300" height="200">
  </a>
  <div class="gallery_desc">Add a description of the image here</div>
</div>

<div class="gallery">
  <a target="_blank" href="../../images/staff/doctor3.jpg">
    <img src="../../images/staff/doctor3.jpg" alt="Northern Lights" width="300" height="200">
  </a>
  <div class="gallery_desc">Add a description of the image here</div>
</div>

<div class="gallery">
  <a target="_blank" href="../../images/staff/doctor4.jpg">
    <img src="../../images/staff/doctor4.jpg" alt="Mountains" width="300" height="200">
  </a>
  <div class="gallery_desc">Add a description of the image here</div>
</div>

<div class="gallery">
  <a target="_blank" href="../../images/staff/doctor5.jpg">
    <img src="../../images/staff/doctor5.jpg" alt="Mountains" width="300" height="200">
  </a>
  <div class="gallery_desc">Add a description of the image here</div>
</div>

<!--contents begin -->
</div>

</div>	
</body>
</html>