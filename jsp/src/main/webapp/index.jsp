<%--
  Created by IntelliJ IDEA.
  User: tidh1
  Date: 2022-10-25
  Time: 오후 2:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
  <head>
    <title><%= "title" %>></title>
  </head>
  <body>
    <%= "Hello, Servlet!" %>
    <c:out value="Hello, Servlet!"/>
    ${"Hello, Servlet!"}

    <c:set var="name">sujeong</c:set>

    <fmt:setLocale value="ko" />
    <fmt:setBundle basename="message" var="message" />
    <fmt:message key="hello" bundle="${message}" />
  </body>
</html>
