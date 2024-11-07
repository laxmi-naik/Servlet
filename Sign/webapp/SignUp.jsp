<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="signup" method ="post">
<pre>
 UserId<input type="text" name="userId" value=${dto.userId}>
 Email<input type="text" name="email" value=${dto.email}>
 Password<input type="password" name="passWord">
 Confirm Password<input type="password" name="confirmPassword">
 <input type="submit" value="SignUp">
 </pre>
 </form>
 <h1> ${Hi} ${userid } ${success }</h1>
<span style="color:red" >${failure}</span>
</body>
</html>