<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function check(){
		var name = document.getElementById("name").value;
		var pass1 = document.getElementById("pass1").value;
		var pass2 = document.getElementById("pass2").value;
		console.log(name);
		console.log(pass1);
		console.log(pass2);
		if(name!=""&&pass1!=""&&pass2!=""){
			if(pass1==pass2){
				console.log(1);
				document.getElementById("form1").submit();
			}else{
				console.log(2);
				document.getElementById("mess").innerHTML = "密码不一致!";
			}
		}else{
			console.log(3);
			document.getElementById("mess").innerHTML = "用户名或密码不能为空!";
		}
	}
</script>
</head>
<body class="templatemo-bg-gray">
    <div align="center">
    	<h1>Regist Form</h1>
     	<form id="form1" action="registeasy.action" method="post">
     	<input type="hidden" value="1" name="type" />
     	<table class="templatemo-container">
     		<tr>
     			<td>username:<input id="name" placeholder="用户名" type="text" class="form-control" name="username" required="required"/>
     			<span id="mess" style="font-size: 12px;color: red;"></span>
     			</td>
     		</tr>
     		<tr>
     			<td>password:<input id="pass1" type="password" class="form-control" name="password"/></td>
     		</tr>
     		<tr>
     			<td>passsure:<input id="pass2" type="password" class="form-control" name="password"/></td>
     		</tr>
     		<tr>
     			<td align="center"><input type="button" onclick="check()" value="submit" class="btn"/></td>
     		</tr>
     	</table>
     	</form>
     	<div style="color: #4AA4B4; font-size: 18px; width: 500px; font-weight: 300;">
     		<span style="float: left; padding-left: 30px; cursor:pointer;">
     			<a onclick="javascript:history.go(-1);">The history back</a>
     		</span>
     		<span style="float: right; padding-right: 30px; cursor:pointer;">
     			<a onclick="javascript:location.href='registdoor.action?type=2';">Regist in detail</a>
     		</span>
     	</div>
     </div>
  </body>
</html>