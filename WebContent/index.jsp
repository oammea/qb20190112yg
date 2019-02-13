<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript">
$(function(){
	var err=${fail};
	if(err==true){
		$("#err").html('<font color="red">用户名或密码错误</font>');
	}
})
</script>
</head>
<body>
	<form action="login.action">
		<table>
			<tr><td>用户名</td><td><input name="adm_name"></td></tr>
			<tr><td>密码</td><td><input name="adm_password"></td></tr>
			<tr><td></td><td><span id="err"></span></tr>
			<tr><td><input type="submit">
		</table>
	</form>
</body>
</html>