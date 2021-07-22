<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>업체 등록하기</title>
</head>
<body>
	<header align="center">업체 등록</header>
	<form action = "post">
		<table>
			<tr>
				<th>업체명</th>
				<td><input type = "text" name = "businessId"></td>
				<td></td>
			</tr>
			<tr>
				<th>담당자명</th>
				<td><input type = "text" name = "businessId"></td>
			</tr>
			<tr>
				<th>업체 전화번호</th>
				<td><input type = "tel" name = "businessPhone"> - 
				<input type = "tel" name = "businessPhone"> - 
				<input type = "tel" name = "businessPhone">
				</td>
			</tr>
			<tr>
				<th>사업자 등록 번호</th>
				<td><input type = "text" name = "businessNo"></td>
				<td><input type = "button" value = "진위확인"></td>
			</tr>
			<tr>
				<th>계약 체결일</th>
				<td><input type = "date" name = "adStart"></td>
				<td></td>
			</tr>
			<tr>
				<th>계약 만료일</th>
				<td><input type = "date" name = "End"></td>
			</tr>
			<tr>
				<th>광고 품목</th>
				<td><input type = "text" name = "adItem"></td>
			</tr>
			<tr>
				<th>광고비</th>
				<td><input type = "text" name = "adFee"></td>
			</tr>
			<tr>
				<th colspan="2">
				<input type = "submit" name = "advertisement" value = "등록하기">
				</th>
			</tr>
		</table>
	</form>
</body>
</html>