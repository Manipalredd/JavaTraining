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
<jsp:useBean id="beanEmployDao" class= "com.java.dao.EmployDaoImpl"/>
<c:set var = "employ" value = "${beanEmployDao.searchEmployDao(param.empno)}"/>
<from method = "get" action = "UpdateEmploy.jsp">
<center>
Employ No:
<input type = "number" name = "empno" value = "${employ.empno}"/><br/><br/>
Employ Name:
<input type = "text" name = "name" value = "${employ.name}"/><br/><br/>
Gender :
<input type = "text" name = "gender" value = "${employ.gender}"/><br/><br/>
Department:
<input type = "text" name = "dept" value = "${employ.dept}"/><br/><br/>
Designation:
<input type = "text" name = "desig" value = "${employ.desig}"/><br/><br/>
Basic:
<input type= "number" name = "basic" value = "${employ.basic}"/><br/><br/>
<input type = "submit" value = "Update Employ">
</center>
</from>
<c:if test = "${param.empno != null && param.basic !=null}">
	<jsp:useBean id="beanEmploy" class = "com.java.Hib.model.Employ"/>
	<jsp:setProperty property ="*" name = "beanEmploy"/>
	<c:out value "${beanEmployDao.updateEmployDao(beanEmploy)}"></c:out>
<jsp:forward page="EmployShow"></jsp:forward>
</c:if> 
</body>
</html>