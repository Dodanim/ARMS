<%-- 
    Document   : dashboard
    Created on : Sep 27, 2025, 12:01:01 PM
    Author     : kttim
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.min.css?v=5.1.3">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <title>Supply</title>
    </head>
    <body>
      
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <div class="container-fluid">
                <a class="navbar-brand" href="#">Company Name</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                        <li class="nav-item">
                            <a class="nav-link active" aria-current="page" href="#">Home</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">Supplies</a>
                        </li>
                        <li class="nav-item dropdown">
                            <div class="dropdown me-1">
                                <button type="button" class="btn btn-secondary dropdown-toggle" id="dropdownMenuOffset" data-bs-toggle="dropdown" aria-expanded="false" data-bs-offset="10,20">
                                    Administration
                                </button>
                                <ul class="dropdown-menu" aria-labelledby="dropdownMenuOffset">
                                    <li><a class="dropdown-item" href="#">Action</a></li>
                                    <li><a class="dropdown-item" href="#">Another action</a></li>
                                    <li><a class="dropdown-item" href="#">Something else here</a></li>
                                </ul>
                            </div>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link disabled">Disabled</a>
                        </li>
                    </ul>
                    <form class="d-flex">
                        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                        <button class="btn btn-outline-success" type="submit">Search</button>
                    </form>
                </div>
            </div>
        </nav>
        <br>
        <div class="container-fluid">
            <div class="card">
                <div class="card-body">

                    <h3>New item requested</h3>
                    <form>


                        <div class="row">
                            <div class="col">
                                <label for="exampleInputEmail1" class="form-label">Item:</label>
                                <select class="form-control" aria-label="Default select example">
                                    <option selected>Open this select menu</option>
                                    <option value="1">Nappies number 8</option>
                                    <option value="2">Baby Wipes</option>
                                    <option value="3">Tooth Paste</option>
                                </select></div>
                            <div class="col">
                                <label for="exampleInputPassword1" class="form-label">Room number:</label>
                                <select class="form-control" aria-label="Default select example">
                                    <option selected>Open this select menu</option>
                                    <option value="1">1004</option>
                                    <option value="2">1005</option>
                                    <option value="3">1006</option>
                                </select></div>
                            <div class="col">
                                <label for="exampleInputPassword1" class="form-label">Guest:</label>
                                <select class="form-control" aria-label="Default select example">
                                    <option selected>Open this select menu</option>
                                    <option value="1">Susan Duffy</option>
                                    <option value="2">Mariam O'Conner</option>
                                    <option value="3">Gift Galicia</option>
                                </select></div>

                        </div>
                        <div class="row">
                            <div class="col">
                                <label for="exampleFormControlInput1" class="form-label">Quantity:</label>
                                <input type="number" class="form-control" id="exampleFormControlInput1" placeholder="0-3"> </div>
                            <div class="col">
                                <label for="exampleFormControlInput1" class="form-label">Date and Time:</label>
                                <input type="number" class="form-control" id="exampleFormControlInput1" placeholder="0-3" disabled readonly> </div>


                            <div class="col">
                                <br>
                                <button type="submit" class="btn btn-primary">Add</button>
                            </div>
                        </div>


                    </form>
                    <br></div>
            </div>
            <br>
        </div> 

        <div class="container-fluid">
            <div class="card">
                <div class="card-body">
                    <br>
                    <h3>Total items brought: <span class="badge bg-secondary">12</span></h3>
                    <table class="table table-hover">
                        <thead>
                            <tr>
                                <th scope="col">Item</th>
                                <th scope="col">Quantity</th>
                                <th scope="col">Guest</th>
                                <th scope="col">User</th>
                                <th scope="col">Time</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <th scope="row">Nappies N 8</th>
                                <td>1</td>
                                <td>1004</td>
                                <td>Tom</td>
                                <td> 14-01-2026</td>
                            </tr>
                            <tr>
                                <th scope="row">Wipes</th>
                                <td>2</td>
                                <td>2020</td>
                                <td>Khali</td>
                                <td>12-12-2025</td>
                            </tr>
                            <tr>
                                <th scope="row">Tooth Brush</th>
                                <td>1</td>
                                <td>2030</td>
                                <td>Admin</td>
                                <td>31-12-2025</td>
                            </tr>

                        </tbody>
                    </table>
                </div>  </div>  </div>
        
        <script src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.bundle.min.js?v=5.1.3"></script>

    </body>
</html>
