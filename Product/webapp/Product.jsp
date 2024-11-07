<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="submit" method="post">
<pre>
companyName<input type="text" name="companyName" value=${dto.companyName}>
productName<input type="text" name="productName" value=${dto.productName}>
productType<select name="productType" value=${dto.productType}>
<option>select</option>
<option>Consumer products</option>
<option>Business products</option>
<option>Industry products</option>
</select>
productQuantity<input type="text" name="productQuantity" >
productCost<input type="text" name="productCost">
<input type="submit" value="submit">
  
</pre>
</form>
<span style="color:green" > ${productName } ${ref} ${total} ${success }</span>
<span style="color:red" > ${failure}</span>
</body>
</html>