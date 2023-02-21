<%--
  Created by IntelliJ IDEA.
  User: denis
  Date: 25.11.2020
  Time: 19:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Word search</title>
  </head>
  <body>

  <h3>&nbsp&nbsp&nbsp&nbsp&nbspПоиск слова</h3>

  <form action = "index" method = "post">
    Введите слово
    <input name="word" type="text" />
    &nbsp&nbsp&nbsp<input type = "submit" value = "Найти">
  </form>

  <%
    if(request.getAttribute("count")!= null)
      if((request.getAttribute("count")).equals("0"))
        out.println("<p>" + "Слово не найдено!" + "</p>");
      else {
        out.println("<p>" + "Слово найдено!" + "<p>");
        out.println("<p>" + "Количество вхождений: " + request.getAttribute("count") + "</p>");
      }
  %>

  </body>
</html>
