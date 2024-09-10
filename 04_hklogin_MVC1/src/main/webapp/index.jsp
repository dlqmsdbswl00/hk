<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%request.setCharacterEncoding("utf-8");%>
<%response.setContentType("text/html;charset=UTF-8");%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/loginpage.css">
</head>
<body>
	<form action="">
		<h1>Login</h1>
		<input type="text" name="id" placeholder="ID" required="required" />
		<input type="password" name="password" placeholder="password"
			required="required" /> <input type="checkbox" value="remember -me" />
		<lable>아이디저장<lable />
		<button type="submit">Sign in</button>
		<button type="button" onclick="registform()">Sign up</button>
	</form>

	<script type="text/javascript">
		function registform() {
			location.href = "userController.jsp?command=registform";
		}
	</script>

</body>

</html>