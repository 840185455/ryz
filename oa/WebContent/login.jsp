<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登录</title>
<style type="text/css">
.d1{
	width: 100%;
	
}
.d2{
	width: 30%;
	margin: 0 auto;
	text-align: center;
}
</style>
</head>
<body>
	<div class="d1">
		<div class="d2">
			<h1>登录</h1>
			<form action="login.action" method="post">
				<p>
					<input type="text" name="n" placeholder="请输入您的姓名">
				</p>
				<p>
					<input type="password" name="p" placeholder="请输入您的密码">
				</p>
				<p>
					<button type="submit">登录</button><button type="reset">取消</button>
				</p>
				<p>
					<b style="color: red;">${mess }</b>
				</p>
			</form>
		</div>
	</div>
</body>
</html>