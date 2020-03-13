<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/3/13
  Time: 8:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<s:debug></s:debug>
<%--root value ognl表达式--%>
<s:property value="name"></s:property>
<%--context --%>
<s:property value="clown"></s:property>br
<s:property value="#session.session_clown"></s:property>
<s:property value="#application.app_clown"></s:property>
<s:property value="'HELLO'.length"></s:property>
<%----%>
<s:property value="@java.lang.Math@random()"></s:property>
fe
<h1>success</h1>

</body>
</html>
