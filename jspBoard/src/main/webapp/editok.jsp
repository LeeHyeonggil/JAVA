<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<% if(result == 1){ %>
<script>
  alert("글을 등록했습니다.");
  location.href="./contents.jsp?id=<%=id %>";
</script>
</head>
<body>
</body>
</html>