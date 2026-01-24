package kido.arms.filter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kttim
 */

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;
import java.util.List;

import kido.arms.entities.UserEntity;
import kido.arms.model.MenuItemModel;
import kido.arms.services.MenuService;

@WebFilter("/")
public class MenuFilter implements Filter {

    @Override
    public void doFilter(
            ServletRequest request,
            ServletResponse response,
            FilterChain chain
    ) throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) request;

        UserEntity user = (UserEntity) req.getSession().getAttribute("user");
        System.out.println(user.getAccessLevel());
        if (user != null) {
            MenuService menuService = new MenuService();

            List<MenuItemModel> menu =  menuService.getMenuByRole(user.getAccessLevel());

            req.setAttribute("menu", menu);
        }

        chain.doFilter(request, response);
    }
}
