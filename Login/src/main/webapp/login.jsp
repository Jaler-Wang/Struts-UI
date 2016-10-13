<%--
  Created by IntelliJ IDEA.
  User: U0148394
  Date: 10/11/2016
  Time: 10:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<h4><s:text name="login"/></h4>
<s:form action="login">
    <s:textfield key="userName" />
    <s:password name="password" label="password" required="true"/>
    <s:submit />
</s:form>
</body>
</html>
