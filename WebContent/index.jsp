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
	<hr>
	<form action="transfer.action">
		转出账号:<input type="text" name="outEmpno"><br><br>
		转入账号:<input type="text" name="inEmpno"><br><br>
		转出金额:<input type="text" name="money"><br><br>
		<input type="submit" value="转账">
	</form>
	<br><br>
	转账结果: ${result==true?"成功":"失败"}
</body>
</html>