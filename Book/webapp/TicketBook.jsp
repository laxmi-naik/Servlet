<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>From</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css">
</head>
<body>
<h1 class="text-center">Book Ticket</h1>
<form action="Book" method="post">
<pre>
<label for="stadiumName" class="form-label">Stadium Name:</label>
<select id="stadiumName" name="stadiumName" class="form-select" value="${dto.stadiumName}">
<option>select</option>
<option>M.Chinnaswamy Stadium </option>
<option>Wankhede Stadium</option>
<option>M.A.Chidambaram Stadium</option>
<option>Eden Gardens</option>
</select>
<label for="tickets" class="form-label">Tickets:</label>
<input type="number" id="tickets" name="tickets" class="form-control" value="${dto.tickets}">
<label for="primaryContact" class="form-label">Primary Contact:</label> 
<input type="number" id="primaryContact" name="primaryContact" class="form-control" value="${dto.primaryContact}">
<label for="email" class="form-label">Email:</label> 
<input type="text" id="email" name="email" class="form-control" value="${dto.email}"> 
<label for="submit" class="form-label" ></label>
<input type="submit" id="submit"class="form-control"  value="Book" style="color:blue">
</pre>
</form>
<span style="color:green">   ${success }</span>
<span style="color:red" >${failure}</span>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>