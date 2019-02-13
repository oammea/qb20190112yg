<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>管理员菜单</title>
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript">
	$(function(){
		$('.tb2').hide();
		$('#sub').attr("enabled", true)
	})

</script>
<script type="text/javascript">
	function add(){
		
		$('#tb1').show();
		$('.tb2').hide();
	}
	function manage(){
		$('#tb1').hide();
		$('.tb2').show();
	}
</script>
<script type="text/javascript">
$(function(){
	$('#e_name').blur(function(){
		$.ajax({
			type: "POST",
			url: "ajaxname.action",
			data: {
				e_name: $("#e_name").val()
			},
			datatype:"json",
			success: function(data){
				if(data.msg=="用户名可以使用"){
				$('#err').html('<font color="green">'+data.msg+'</font>');	
				$('#sub').attr("disabled", false)
				}else{
				$('#err').html('<font color="red">'+data.msg+'</font>');	
				$('#sub').attr("disabled", true)
				}
			}
		})
	})
})
</script>
</head>
<body>
	<input type="button" onclick="add()" value="添加员工">
	<input type="button" onclick="manage()" value="管理员工">
	<form action="reg.action" method="post" >
		<ol style="list-style-type: none">
			<li><table id="tb1">
				<!-- e_name e_sex e_idcard e_age e_dept e_job -->
				<tr><td>员工姓名<td><input id="e_name" name="e_name"><span id="err"></span></tr>
				<tr><td>员工性别<td><label for="r1">nan</label><input id="r1" type="radio" name="e_sex" value="男"><label for="r2">nv</label><input id="r2" type="radio" name="e_sex" value="女"></tr>
				<tr><td>身份证号<td><input name="e_idcard"></tr>
				<tr><td>年龄<td><select name="e_age">
				<c:forEach begin="1" end="200" step="1" var="i">
					<c:choose>
						<c:when test="${i==18 }">
							<option value=${i } selected="selected">${i }
						</c:when>
						<c:otherwise>
							<option value=${i } >${i }
						</c:otherwise>
					</c:choose>
				</c:forEach>
				</select></tr>
				<tr><td>部门<td><input name="e_dept"></tr>
				<tr><td>职位<td><input name="e_job"></tr>
				<tr><td></td><td><input type="submit" id="sub"></tr>
			</table></li>
			<li><table class="tb2">
					<form action="gobuy.action?pageSize=10&u_id=${u.u_id }" id="form">
						<input type="hidden" id="currentPage" name="currentPage" value="${p.currentPage }">
						<input type="hidden" name="pageSize" value="${p.pageSize }">
						<input type="hidden" name="u_id" value="${u.u_id }">
						<div class="tb2">员工姓名 <input type="text" name="g_name" value="${p.g_name }">
							年龄<select name="e_age">
							<c:forEach begin="1" end="200" step="1" var="i">
								<c:choose>
									<c:when test="${i==18 }">
										<option value=${i } selected="selected">${i }
									</c:when>
									<c:otherwise>
										<option value=${i } >${i }
									</c:otherwise>
								</c:choose>
							</c:forEach>
							</select>
							<input type="submit" value="查询">
							<input type="button" value="上一页" onclick="$('#currentPage').val('${p.currentPage-1}');$('#form').submit()">
							<input type="button" value="下一页" onclick="$('#currentPage').val('${p.currentPage+1}');$('#form').submit()">
						</div>
					</form>
				<tr><td>id<td>员工姓名<td>员工性别<td>身份证号<td>年龄<td></tr>
				
			</table></li>
		</ol>
	</form>
</body>
</html>