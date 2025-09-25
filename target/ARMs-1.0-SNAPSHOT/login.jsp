<%-- 
    Document   : login
    Created on : Sep 23, 2025, 4:25:19 PM
    Author     : kttim
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Breaffy Welcome Center</title>
    </head>
    <body>
        <h1>Breaffy Welcome Center!</h1>
        <!-- login.jsp -->
 <div class="container mt-5">
        <h2 class="text-center">Login</h2>
        <form action="login" method="post" class="mt-4">
            <div class="mb-3">
                <label for="username" class="form-label">User:</label>
                <input type="text" class="form-control" id="username" name="username" required>
            </div>
            <div class="mb-3">
                <label for="password" class="form-label">Password:</label>
                <input type="password" class="form-control" id="password" name="password" required>
            </div>
            <button type="submit" class="btn btn-primary w-100">Log in</button>
        </form>
    </div>

    <!-- Bootstrap JS -->
    <script src="bootstrap/js/bootstrap.bundle.min.js"></script>
    </body>
</html>
