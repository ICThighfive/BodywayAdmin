<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>main view</title>

<!-- 부트스트랩 코드 부분 -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>

<!-- css 스타일 적용 코드 -->
<style>
 .button{
 width : 200px;
 height : 200px;
 background-color : lightblue;
 color : white;
 font-weight : bold;
 display : inline-block;
 cursor : pointer;
 border : 1px solid skyblue;
 }
 .button:hover {
  box-shadow: 0 12px 16px 0 rgba(0,0,0,0.24),0 17px 50px 0 rgba(0,0,0,0.19);
}
</style>

</head>
<body>

<!-- 타이틀 부분 -->
<header align = "center"><h1>BodyWay 관리자 페이지</h1></header>
	<br>
	
	<!-- 각 메뉴 항목으로 넘어가는 버튼 (views파일) -->
	<table align = center>
		<tr>
		<td><input type = "button" class = "button" onclick = "location.href = './member/memberList.jsp'" value = "회원 관리"></td>
		<td><input type = "button" class = "button" onclick = "location.href = '/semiad/community.ad'" value = "커뮤니티 관리"></td> <!-- community.controller로 이동 -->
		</tr>
		<tr>
		<td><input type = "button" class = "button" onclick = "location.href = './healthfood/healthfoodAdminListView.jsp'" value = "바디웨이 총 게시물 관리"></td>
		<td><input type = "button" class = "button" onclick = "location.href = './notice/noticeListView.jsp'" value = "공지사항 및 QnA 관리"></td>
		</tr>
		<tr>
		<td><input type = "button" class = "button" onclick = "location.href = './advertisement/advertisementList.jsp'" value = "홍보 업체 관리"></td>
		<td><input type = "button" class = "button" onclick = "location.href = './community/communityList.jsp'" value = "사이트 통계 보기"></td>
		</tr>
	</table>


</body>
</html>