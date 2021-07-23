<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage = "true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%if(exception != null){ %>
<h3>JSP 페이지 오류 : <%= exception.getMessage() %></h3>
<%} else{ %>
<h3>Servlet 오류 메세지 : <%= request.getAttribute("message") %></h3>
<%} %>
<a href = "/semiad/index.jsp">시작 페이지로 가기</a>
</body>
</html>