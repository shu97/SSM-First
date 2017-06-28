<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>首页</title>
</head>
<body>
<c:if test="${userList!=null}">
    <c:forEach  items="${userList}" var="user">
        ${user.id}<br>
        ${user.name}<br>
        ${user.password}<br>
    </c:forEach>
</c:if>
    Hello W orld
</body>
</html>
