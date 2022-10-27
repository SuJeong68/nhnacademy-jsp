<%--
  Created by IntelliJ IDEA.
  User: tidh1
  Date: 2022-10-25
  Time: 오후 3:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title><%= "title" %>></title>
</head>
<body>
<table>
  <% for (int i = 1; i <= 9; i++) { %>
  <h3><%= i + "단 시작"%></h3>
  <% for (int j = 1; j <= 9; j++)  { %>
  <p><%=i + "*"%><%=j + "="%><%= i * j %></p>
  <% } %>
  <% } %>
</table>
</body>
</html>