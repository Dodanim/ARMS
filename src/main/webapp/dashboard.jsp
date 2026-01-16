<%-- 
    Document   : dashboard
    Created on : Sep 27, 2025, 12:01:01 PM
    Author     : kttim
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <title>Supply</title>
    </head>
    <body>

        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <div class="container-fluid">
                <a class="navbar-brand" href="#">Navbar</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                        <li class="nav-item">
                            <a class="nav-link active" aria-current="page" href="#">Home</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">Link</a>
                        </li>
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                                Dropdown
                            </a>
                            <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                                <li><a class="dropdown-item" href="#">Action</a></li>
                                <li><a class="dropdown-item" href="#">Another action</a></li>
                                <li><hr class="dropdown-divider"></li>
                                <li><a class="dropdown-item" href="#">Something else here</a></li>
                            </ul>
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
                                    <option value="1">One</option>
                                    <option value="2">Two</option>
                                    <option value="3">Three</option>
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
                    <h3>Total items brought: <span class="badge badge-secondary">12</span></h3>
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
                                <th scope="row">1</th>
                                <td>Mark</td>
                                <td>Otto</td>
                                <td>@mdo</td>
                                <td>@mdo</td>
                            </tr>
                            <tr>
                                <th scope="row">2</th>
                                <td>Jacob</td>
                                <td>Thornton</td>
                                <td>@fat</td>
                                <td>@mdo</td>
                            </tr>
                            <tr>
                                <th scope="row">3</th>
                                <td>Larry</td>
                                <td>the Bird</td>
                                <td>@twitter</td>
                                <td>@mdo</td>
                            </tr>

                        </tbody>
                    </table>
                </div>  </div>  </div>
       <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>
    </body>
</html>
