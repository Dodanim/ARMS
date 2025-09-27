/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kido.arms.controller;

import kido.arms.entities.UserEntity;
import kido.arms.services.UserService;
import kido.arms.model.LoginModel;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *
 * @author kttim
 */
@WebServlet("/login")
public class LoginController extends HttpServlet {

    private UserService userService;

    @Override
    public void init() throws ServletException {
        super.init();
        userService = new UserService(); // normalmente inyectado
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //catch the user credential by post method
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        //verify the credential and if they exist, fill the model
        LoginModel loginModel = new LoginModel(username, password);
        UserEntity user = userService.authenticate(loginModel);
        if (user != null) {
            request.getSession().setAttribute("logedInUser", user);
            response.sendRedirect("dashboard.jsp");
        } else {
            // Error en login → devolver con mensaje
        request.setAttribute("Error", "Error, Invalid credentials, please try again");
        request.getRequestDispatcher("login.jsp").forward(request, response);
        }

    }
}
