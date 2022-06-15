<%--
  Created by IntelliJ IDEA.
  User: nguye
  Date: 6/15/2022
  Time: 2:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<div class="row">
    <div class="container">
        <hr>
        <div class="container text-center">
            <a href="<%=request.getContextPath()%>/index.jsp" class="btn btn-success">List Phone</a>
        </div>
        <br>
        <table class="table table-bordered">
            <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Brand</th>
                <th>Price</th>
                <th>Description</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="employee" items="${phone}">
                <tr>
                    <td>
                        <c:out value="${phone.id}"/>
                    </td>
                    <td>
                        <c:out value="${phone.name}"/>
                    </td>
                    <td>
                        <c:out value="${phone.brand}"/>
                    </td>
                    <td>
                        <c:out value="${phone.price}"/>
                    </td>
                    <td>
                        <c:out value="${phone.description}"/>
                    </td>
                    <td>
                        <a href="save?id=<c:out value='${phone.id}' />">Save</a>
                        <a href="edit?id=<c:out value='${phone.id}' />">Edit</a>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div></body>
</body>
</html>
