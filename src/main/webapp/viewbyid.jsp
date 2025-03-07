<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.techouts.hiber.entity.Mobile" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f9;
            margin: 0;
            padding: 0;
            text-align: center;
        }

        h2 {
            margin-top: 50px;
            color: #333;
        }

        table {
            width: 80%;
            margin: 20px auto;
            border-collapse: collapse;
            background-color: #fff;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        }

        th, td {
            padding: 12px;
            text-align: center;
            border: 1px solid #ddd;
        }

        th {
            background-color: #007BFF;
            color: white;
            font-size: 18px;
        }

        td {
            font-size: 16px;
            color: #555;
        }

        tr:nth-child(even) {
            background-color: #f9f9f9;
        }

        tr:hover {
            background-color: #f1f1f1;
        }

        .container {
            width: 90%;
            margin: 0 auto;
        }
    </style>
</head>
<body>
	<h2 style="color: green">Mobile Details</h2>
	<%
	Mobile cb = (Mobile) request.getAttribute("mobobj");
	%>
	<table border="1">
		<tr>
			<th>Mobile_Id</th>
			<th>Mobile_Name</th>
			<th>Mobile_Color</th>
			<th>Mobile_Price</th>
		</tr>

		<tr>
			<td>
				<%
				out.println(cb.getMobile_Id());
				%>
			</td>
			<td>
				<%
				out.println(cb.getMobile_Name());
				%>
			</td>
			<td>
				<%
				out.println(cb.getMobile_Color());
				%>
			</td>
			<td>
				<%
				out.println(cb.getMobile_Price());
				%>
			
	</table>
	<br>
	<%@include file="index.html"%>
</body>
</html>