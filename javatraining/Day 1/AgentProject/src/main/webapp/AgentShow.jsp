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
<table border="3" align="center">
	<tr>
		<th> Agent Id</th>
		<th>Agent Name </th>
		<th>city</th>
		<th>Gender</th>
		<th>maritalStatus</th>
		<th>premium</th>
		<th>Update</th>
    <th>Delete</th>
	</tr>
	<jsp:useBean id="beanagentDao" class="com.java.agent.dao.AgentDaoImpl"/>
	<c:set var="agentList" value="${beanAgentDao.showAgentDao()}"/>
	<c:forEach var="agent" items="${agentList}">
		<tr>
			<td>${agent.agentId}</td>
			<td>${agent.name}</td>
			<td>${agent.city}</td>
			<td>${agent.gender}</td>
			<td>${agent.martialStatus}</td>
			<td>${agent.premium}</td>
			<td><a href="UpdateAgent.jsp?empno=${agent.agentId}">Update</a></td>
			<td><a href="DeleteAgent.jsp?empno=${agent.agentId}">Delete</a></td>
		</tr>
	</c:forEach>
	</table>
	<hr/>
	<a href="AddAgent.jsp">Add Employ</a>
 
</body>
</html>