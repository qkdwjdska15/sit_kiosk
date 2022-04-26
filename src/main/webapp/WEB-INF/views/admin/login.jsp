<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<form id="loginForm" action="/admin/login" method="post">
			<label for="admin_id">ID : </label><input name="admin_id" type="text" maxlength="20" /><br/>
			<label for="admin_pwd">PASSWORD : </label><input name="admin_pwd" type="password" maxlength="20"/>
			<button type="submit" onkeyup="enterkey();">LOGIN</button>&nbsp;&nbsp;<button type="reset">CANCEL</button>
		</form>
	</div>
</body>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script type="text/javascript">
$(document).ready(function() {
	var result = '<c:out value="${result}"/>';
	var executions = '<c:out value="${executions}"/>';
	checkMessage(result,executions);
});

function checkMessage(result , executions) {
	if(result === '' || history.state){
		return;			
	}else if (result == 'success'){
		alert(executions + "를(을) 성공 하였습니다.");		
	}else{
		alert(executions + "를(을) 실패 하였습니다.");
	}
}

//엔터키 함수
function enterkey() {
	if (window.event.keyCode == 13) {
		$("#loginForm").submit();
	}
}
</script>
</html>