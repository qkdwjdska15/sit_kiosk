<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
table,tr,th,td{
	border: 1px solid black;
}
</style>
</head>
<body>
	<table>
		<tr>
			<th>아이디</th>
			<th>이메일</th>
			<th>연락처</th>
			<th>가입일</th>
			<th>마지막 접속일</th>
			<th>상태</th>
		</tr>
		<c:forEach items="${branchList}" var="list">
		<tr>
			<td><c:out value="${list.branchManager_id}"/></td>
			<td><c:out value="${list.branchManager_email}"/></td>
			<td><c:out value="${list.branchManager_phone}"/></td>
			<td>
				<fmt:parseDate var="sinceDateString" value="${list.branchManager_since}" pattern="yyyy-MM-dd HH:mm:ss.S"/>
				<fmt:formatDate value="${sinceDateString}" type="date"/>
			</td>
			<td>
				<fmt:parseDate var="accessDateString" value="${list.branchManager_access_date}" pattern="yyyy-MM-dd HH:mm:ss.S"/>
				<fmt:formatDate value="${accessDateString}" type="both"/>
			</td>
			<td>
				<c:choose>
					<c:when test="${list.branchManager_status == 0}">정상</c:when>
					<c:when test="${list.branchManager_status == 1}">탈퇴</c:when>
					<c:otherwise>잘못된 회원 상태</c:otherwise>
				</c:choose>
			</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>