<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align="center">
		<h2>Registration Succeeded!</h2>
		<span>Full name:</span><span>${user.name}</span><br/>
		<span>E-mail:</span><span>${user.email}</span><br/>
		<span>Password:</span><span>${user.password}</span><br/>
		<span>Birthday:</span><span>${user.birthday}</span><br/>
		<span>Gender:</span><span>${user.gender}</span><br/>
		<span>Profession:</span><span>${user.profession}</span><br/>
		<span>Married?:</span><span>${user.married}</span><br/>
		<span>Annual income:</span><span th:text="${user.income}"></span><br/>
		<span>Note:</span><span>${user.note}</span><br/>
	</div>

</body>
</html>