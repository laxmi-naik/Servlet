<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
</head>
<body>
<h1><center>Registration Form</center></h1>
<h2>
<span style="color:green" >${success}</span>
</h2>
<h3>
<span style="color:red" >${failure}</span>

</h3>
<form action="registration" method="post">
<pre>
Name<input type="text" name="name">
Email<input type="text" name="email">
Age<input type="number" name="age">
City<select nmae="city">
<option> select</option>
<option> Bengaluru</option>
<option> Belgavi</option>
<option> Mysuru</option>
<option> Mangaluru</option>
<option> Hubballi</option>
<option> Dharwad</option>
<option> Shivamogga</option>
<option> Tumakuru</option>
</select>
State<input type="text" name="state">
Country<input type="text" name="country">
<input type="submit" value="register">
</pre>

</form>
</body>
</html>