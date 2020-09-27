<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Header Page</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body style="background-color: #d4d4d4;">
   <div style="text-align: center;">
        <h1 >Welcome to MrBeans Car Storage</h1>
        <h3>what you want to do</h3>
        <button type="button" class="btn btn-primary" onclick="window.location.href='list';return false;">Show Cars</button>
        <button type="button" class="btn btn-success" onclick="window.location.href='showForm';return false;">Add a Car</button>
        <button type="button" class="btn btn-dark" onclick="window.location.href='searchCar';return false;">Search Car</button>
    </div>
	<hr>

</body>
</html>