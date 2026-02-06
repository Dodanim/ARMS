<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">

        <!-- MUY IMPORTANTE PARA NAVBAR -->
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <title>Navbar Test</title>

        <!-- BOOTSTRAP 5.1 CSS COMPLETO -->
        <link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.min.css?v=5.1.3">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
    </head>

    <body>
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <div class="container-fluid">
            <a class="navbar-brand" href="#">Company Name</a>
            <ul class="navbar-nav">
                <c:forEach items="${menu}" var="item">
                    <li class="nav-item">
                        <a class="nav-link active" href="${pageContext.request.contextPath}${item.url}">
                            ${item.label}
                        </a>
                    </li>
                </c:forEach>
            </ul>
                        </div>
        </nav>

        <!-- BOOTSTRAP 5.1 JS BUNDLE (OBLIGATORIO) -->
         <script src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.bundle.min.js?v=5.1.3"></script>
    </body>
</html>
