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
<jsp:useBean id="beanEmployDao" class= "com.java.agent.dao.AgentDaoImpl"/>
<c:set var = "agent" value = "${beanAgentDao.searchAgentDao(param.agentId)}"/>
<form method = "get" action = "UpdateAgent.jsp">
<center>
Agent Id:
<input type = "number" name = "agentId" value = "${agent.agentid}"/><br/><br/>
Agent Name:
<input type = "text" name = "name" value = "${agent.name}"/><br/><br/>
Gender :
<input type = "text" name = "gender" value = "${agent.gender}"/><br/><br/>
City 
<input type = "text" name = "city" value = "${agent.city}"/><br/><br/>
MaritalStatus:
<input type = "number" name = "maritalStatus" value = "${agent.maritalStatus}"/><br/><br/>
premium:
<input type= "number" name = "premium" value = "${agent.premium}"/><br/><br/>
<input type = "submit" value = "Update Agent">
</center>
</from>
<c:if test = "${param.agentId != null && param.premium !=null}">
	<jsp:useBean id="beanAgent" class = "com.java.agent.model.Agent"/>
	<jsp:setProperty property ="*" name = "beanAgent"/>
	<c:out value "${beanAgentDao.updateAgentDao(beanEmploy)}"></c:out>
<jsp:forward page="AgentShow"></jsp:forward>
</c:if> 
</body>
</html>