<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="beanEmployDao" class  = "com.java.dao.EmployDaoImpl"/>
<c:set var = "result" value = "${beanEmployDao.deleteEmployDao(param.empno}"/>
<jsp:forward page="EmployShow"></jsp:forward>

</body>
</html>