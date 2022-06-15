<%--
  Created by IntelliJ IDEA.
  User: nguye
  Date: 6/15/2022
  Time: 2:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
    <center> <h1> Add Phone </h1> </center>
    <form action="home" method="post">
        <div class="container">
            <label>Name : </label>
            <input type="text"  name="name" required>
            <label>price : </label>
            <input type="text"  name="price" required>
            <label>brand : </label>
            <select name="brand">
                <option value="Apple">Apple</option>
                <option value="Samsung">Samsung</option>
                <option value="xiaomi">Xiaomi</option>
            </select>
            <label>Description : </label>
            <input type="text"  name="description" required>
            <button type="submit">add</button>

        </div>
    </form>
</body>
</html>
