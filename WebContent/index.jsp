<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>首页</title>
</head>
<body>
	<form action="getEmpByEmpno.action">
		雇员编号:<input type="text" name="empno">
				<input type="submit" value="查询">
	</form>
	<br><br>
	查询到的员工是: ${emp}
</body>
</html>