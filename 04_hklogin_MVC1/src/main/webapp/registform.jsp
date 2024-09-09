<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%request.setCharacterEncoding("utf-8"); %>
<%response.setContentType("text/html;charset=UTF-8"); %>     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입폼</title>
</head>
<body>
<div>
	<h1>회원가입</h1>
	<form action="userController.jsp" method="post" onsubmit="return val()">
		<input type="hidden" name="command" value="adduser" />
		<input type="text" name="id" placeholder="ID" required="required" />
		<input type="text" name="name" placeholder="이름" required="required" />
		<input type="password" id="pass1" name="password" placeholder="PASSWORD" required="required" />
		<input type="password" id="pass2" name="password2" placeholder="PASSWORD확인" required="required" />
		<input type="text" name="address" placeholder="ADDRESS" required="required" />
		<input type="email" name="email" placeholder="EMAIL" required="required" />
		<button type="submit">가입완료</button>
		<button type="button" onclick="location.href='index.jsp'">메인</button>
	
	</form>
</div>
</body>
<script type="text/javascript">
	function val(){
		var pass1 = document.getElementById("pass1").value;
		var pass2 = document.getElementById("pass2").value;
		
		if (pass1!=pass2) {
			alert("틀린 비밀번호 입니다?");
			return false;
		}
		else{
			return true;
		}
	}
	
</script>
</html>