<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Bodyway Admin main</title>
</head>
<body>
<header align = "center"><h1>BodyWay 관리자 페이지</h1></header>

	<div id = "loginForm" align = "center">
	<form action = "/semiad/login.ad" method = "post">
	<table>
	<tr><td width = "100" align = "center">아이디</td><td><input type = "text" name = adminId required></td></tr>
	<tr><td width = "100" align = "center">비밀번호</td><td><input type = "password" name = adminPwd required></td></tr>
	<tr><td></td></tr>
	<tr><td></td></tr>
	<tr><td></td></tr>
	<tr><td colspan= "2" align = "center"><input type = "submit" value = "로그인하기" align = "center"></tr>
	<tr><td colspan= "2" align = "center"><a href = "./views/member/enrollform.jsp">관리자 회원가입하기</a></tr>
	</table>
	</form>
	</div>
	<br>


</body>
</html>