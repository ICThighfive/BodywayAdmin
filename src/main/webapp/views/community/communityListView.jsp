<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
   <!-- vo와 ArrayList 클래스를 import 하는 부분 -->
<%@ page import = "community.model.vo.Community, java.util.ArrayList" %>
	<!-- list 부분을 request하려고 list를 할당하는 부분 -->
<%
	ArrayList<Community> list = (ArrayList<Community>)request.getAttribute("list");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>모임 신청서 관리</title>
<script type="text/javascript" src="/semiad/resources/js/jquery-3.6.0.min.js"></script>
<script type="text/javascript">

//승인된 모임을 띄워줄 javascript function
$(function(){
	$.ajax({
	url : "/semiad/cylist.ad", //servlet mapping URI (CommunityYlistServlet)
	type : "get",
	dataType : "json",
	success: function(data){
		console.log("success : " + data);
		
		//object --> string
		var str = JSON.stringify(data);
		//string --> json
		var json = JSON.parse(str);
		
		values = "";
		for(var i in json.list){
			values += "<tr><td>" + json.list[i].community_index
			+ "</td><td>" + json.list[i].user_id 
			+ "</td><td>" + json.list[i].community_name
			+ "</td><td>" + json.list[i].approval_yn
			+ "</td><td>" + json.list[i].application_date
			+"</td></tr>";
			
			$('#ylist').html($('#ylist').html()+values);
		}},
		error : function(jqXHR, textstatus, errorthrown){
			console.log("error:" + jqXHR + ", " + textstatus + ", " + errorthrown);
		}
		
	});
})
</script>
</head>
<body>
<!-- 메뉴바 include -->
<%@include file = "/views/common/menubar3.jsp" %>
<h1 align = "center">커뮤니티 관리</h1>
<br>
<h2 align = "center">커뮤니티 신청서 목록보기</h2>
<br>
<!-- 미승인 모임 목록 보기 -->
<!-- 모임 이름을 누르면 상세보기 팝업 창이 뜰 예정 -->
<!-- 여러개의 다른 표를 띄워줘야하므로 ajax를 사용하는 방식으로 수정하기 -->
<table align = "center" order = "1" cellspacing = "0" cellspadding = "0">
	<tr align = "center">
		<th width = "50px">번호</th>
		<th>모임 ID</th>
		<th width = "80px">신청자ID</th>
		<th width = "500px">모임 이름</th> <!-- 모임 이름을 눌렀을 경우 상세 모임 정보가 뜨게 하기 -->
		<th width = "100px">승인여부</th>
	</tr>
	<% for(Community n : list){ %>
	<tr>
		<td align = "center"><%=n.getCommunityIndex() %></td>
		<td align = "center"><%=n.getCommunityId() %></td>
		<td align = "center"><%=n.getUserId() %></td>
		<td align = "center"><a href = "/semiad/views/community/communityDetails.jsp"><%=n.getCommunityName() %></a></td>
		<td align = "center"><a href = "#">승인하기</a></td>
	</tr>
	<%} %>
</table>
<br>
<!-- 승인여부 Y인 모임들 보여줄 table -->
<h2 align = "center">현재 진행 중인 모임 보기</h2>
<br>
<section>
<table id = "ylist" align = "center" order = "1" cellspacing = "0" cellspadding = "0">
	<tr align = "center">
		<th width = "50px">번호</th>
		<th>모임 ID</th>
		<th width = "80px">신청자ID</th>
		<th width = "500px">모임 이름</th> <!-- 모임 이름을 눌렀을 경우 상세 모임 정보가 뜨게 하기 -->
		<th>승인여부</th>
	</tr>
</table>
</section>

</body>
</html>