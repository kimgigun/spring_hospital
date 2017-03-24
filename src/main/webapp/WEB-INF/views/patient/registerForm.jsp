<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<body>
	<div style="height: 100px"></div>
	<div id="container" class="width_full_size" style="height: 700px;">
		<div style="margin-top: 35px;"
			class="width_full_size height_full_size">
			<form id="registerForm" style="width: 100%; height: px; margin: auto auto"
				class="margin_center">
				<table class="table_default margin_center"
					style="height: 500px; padding: 5px auto;">
					<tr>
						<td class="color_blue" style="text-align: left;">한글 또는 영문으로
							입력해 주세요.</td>
					</tr>
					<tr>
						<td>
							아이디를 입력해 주세요.<br/>
							<input type="text" name="id" placeholder="ID" />
							<input type="submit" name="check" value="중복확인" /><br />
							E-MAIL을 입력 해 주세요.<br/><input type="text" name="email" placeholder="E-MAIL" />
							 자주 사용하시는 이메일 주소로 입력해 주세요.<br/>
					
						 </td>
					</tr>
					<tr>
						<td>
						 비밀번호를 입력해 주세요<br/>
						 <input type="text" name="password" placeholder="password" />
						 8~15자의 영문자,숫자,특수문자를 함께 입력해주세요.</td>
					</tr>
				    <tr>
				    
						<td>
						이름을 입력해 주세요.<br/>
						<input type="text" name="name" placeholder="이름" /></td>
					</tr>
					<tr>
						<td>
						주소를 입력해 주세요.<br/>
						<input type="text" name="addr" placeholder="주소" /></td>
					</tr>
					<tr>
						<td> 담당의사
						<select name="doctor">
								<option value="" selected>의사선택</option>
								<option value="dhong">피부과:홍길동</option>
								<option value="dahn">내과:안성기</option>
								<option value="dkim">외과:김민종</option>
								<option value="dkim2">소아과:김연아</option>
						</select>
						<select name="nurse">
								<option value="" selected>간호사선택</option>
								<option value="nkim">김은영</option>
								<option value="nyoon">윤송애</option>
								<option value="nshin">신지원</option>
								<option value="nyou">유정화</option>
						</select>
					
					<tr>
						<td><select name="birth">
								<option value="" selected>생년선택</option>
								<option value="1985">1985</option>
								<option value="1986">1986</option>
								<option value="1987">1987</option>
								<option value="1988">1988</option>
						</select> <select name="month">
								<option value="" selected>월 선택</option>
								<option value="1">1월</option>
								<option value="2">2월</option>
								<option value="3">3월</option>
								<option value="4">4월</option>
								<option value="5">5월</option>
								<option value="6">6월</option>
								<option value="7">7월</option>
								<option value="8">8월</option>
								<option value="9">9월</option>
								<option value="10">10월</option>
								<option value="11">11월</option>
								<option value="12">12월</option>
						</select> <select name="date">
								<option value="" selected>일 선택</option>
								<option value="1">1일</option>
								<option value="2">2일</option>
								<option value="3">3일</option>
								<option value="4">4일</option>
								<option value="5">5일</option>
								<option value="6">6일</option>
								<option value="7">7일</option>
								<option value="8">8일</option>
								<option value="9">9일</option>
								<option value="10">10일</option>
						</select></td>
					</tr>
					<tr>
						<td>
						<select name="telecom">
								<option value="SKT">SKT</option>
								<option value="KTF">KTF</option>
								<option value="LG">LG</option>
						</select> 
						<select name="phoneNo1">
								<option value="010">010</option>
								<option value="019">019</option>
								<option value="017">017</option>
						</select>
						- <input type="text" name="phoneNo2"/>  
						- <input type="text" name="phoneNo3"/></td>
					</tr>
					<tr>
						<td>정보수신동의&nbsp;전체선택<input type="checkbox" name="select"
							value="all select" />
						</td>
					</tr>
					<tr>
<!--
job:회사원 employee 개발자 developer 스탭 staff 요리사 cook 선생 teacher 학생 student
 -->					
						<td>
						직업을 선택 해 주세요.<br/>
						<input type="checkbox" name="job" value="employee" />회사원&nbsp;
						<input type="checkbox" name="job" value="developer"/>개발자&nbsp;
						<input type="checkbox" name="job" value="staff"/>스탭&nbsp;
						<input type="checkbox" name="job" value="doctor"/>의사&nbsp;
						<input type="checkbox" name="job" value="nurse"/>간호사&nbsp;
						<input type="checkbox" name="job" value="admin"/>관리자
						</td>
					</tr>
					<tr>
						<td> 
						성별<br/> 
						남<input type="radio" name="gender" value="m" />&nbsp;여<input type="radio" name="gender" value="f" /><br/>
						</td>
					</tr>
					<tr>
						<td>
							<p class="color_red">*선택항목에 동의하지 않으셔도 정상적인 서비스를 이용하실 수 있습니다.</p>

						</td>
					</tr>
					<tr>
						<td>	
							<input type="button" name="back" value="이전" style="width: 300px;" /> 
							<input type="hidden" name="action" value="register" />
							<input type="hidden" name="page" value="main" />
							<input type="button" name="submitBtn" value="전송" style="width: 300px;" />
						</td>
					</tr>
				</table>
			</form>


		</div>
		<p class="border_solid"></p>
	</div>
	
</body>
<script>
	$(function(){
		var $registerForm = $('#registerForm');
		var tab = $registerForm.find('table');
		$('input[name=submitBtn]').click(function(){
			$registerForm.attr('action','${context}/patient.do');
			$registerForm.attr('method','post');
			$registerForm.submit();
		});
	});
</script>


