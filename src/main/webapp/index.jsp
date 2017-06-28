<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>Hello World!</h2>
<form action="${pageContext.request.contextPath}/login">
    <p>
        <input type="text" name="username" id="username"/>
    </p>
    <p>
        <input type="password" name="password" id="password">
    </p>
    <p>
        <input type="submit" value="提交">
    </p>
</form>
</body>
</html>
