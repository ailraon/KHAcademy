<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="../common/menubar.jsp" />
	
	<div class="outer">
		<br>
		<h2 align="center">내 정보</h2>
		<form action="${pageContext.request.contextPath}/update.me" method="post" id="update-form">
			<table align="center">
				<tr>
					<td>* ID</td>
					<td><input type="text" name="userId" readonly value="${loginUser.userId}"></td>
				</tr>
				<tr>
					<td>* NAME</td>
					<td><input type="text" name="userName" readonly value="${loginUser.userName}"></td>
				</tr>
				<tr>
					<td>&nbsp;&nbsp;EMAIL</td>
					<td><input type="email" name="email" value="${loginUser.email}"></td>
				</tr>
				<tr>
					<td>&nbsp;&nbsp;BIRTHDAY</td>
					<td><input type="text" name="birthday" placeholder="생년월일(6자리)" value="${loginUser.birthday}"></td>
				</tr>
				<tr>
					<td>&nbsp;&nbsp;GENDER</td>
					<td>
						<input type="radio" name="gender" value="M"> 남
						<input type="radio" name="gender" value="F"> 여
					</td>
				</tr>
				<tr>
					<td>&nbsp;&nbsp;PHONE</td>
					<td><input type="text" name="phone" placeholder="-포함" value="${loginUser.phone }"></td>
				</tr>
				<tr>
					<td>&nbsp;&nbsp;ADDRESS</td>
					<td><input type="text" name="address" value="${loginUser.address }"></td>
				</tr>
			</table>
			<script>
				const gender = "${loginUser.gender }";
				const inputArr = document.querySelectorAll("input[name=gender]");
				
				for(let input of inputArr){ 
					if(gender.includes(input.value)){ // interest에 input.value의 값이 포함되어 있다면
						input.checked = true;
					}
				}
			</script>

			<br><br>

			<div align="center">
				<button type="submit" class="btn btn-sm btn-success">정보수정</button>
				<button type="button" class="btn btn-sm btn-warning" data-bs-toggle="modal" data-bs-target="#update-pwd-modal">비밀번호 변경</button>
				<button type="button" class="btn btn-sm btn-danger" data-bs-toggle="modal" data-bs-target="#delete-member-modal">회원탈퇴</button>
			</div>
		</form>
	</div>
</body>
</html>