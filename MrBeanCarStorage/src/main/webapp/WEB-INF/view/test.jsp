<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="header.jsp" %>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Test Page</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <style>
        table,th,td{
            border: 1px solid black;
        }
    </style>
</head>
<body style="background-color: #F5DEB3;">
 <div class="container-fluid">
    <h4 style="color:green">Search successfull</h4>
        <table>
        <tr>
        	 <th>Company name</th>
            <th>Model Number</th>
            <th>Color</th>
            <th>Date of purchase</th>
            <th>Price</th>
            <th>Engine capacity</th>
            <th>Licence plate number</th>
            <th>Seating capacity</th>
        </tr>
       
        
            <c:forEach items="${beancars}" var="user">
        <tr>
             <td>${ user.company}</td>
            <td>${ user.model}</td>
            <td>${ user.color}</td>
            <td>${ user.date_of_purchase}</td>
            <td>${ user.price}</td>
            <td>${ user.engine_capacity}</td>
            <td>${ user.licence_plate_number}</td>
            <td>${ user.seating_capacity}</td> 
        </tr>
    </c:forEach>
        
        </table>
           
    </div>
</body>
</html>