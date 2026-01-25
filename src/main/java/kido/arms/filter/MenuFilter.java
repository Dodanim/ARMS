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

@WebFilter("/*")
public class MenuFilter implements Filter {

    @Override
    public void doFilter(
            ServletRequest request,
            ServletResponse response,
            FilterChain chain
    ) throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) request;

        UserEntity user
                = (UserEntity) req.getSession().getAttribute("logedInUser");

        System.out.println("SESSION ID: " + req.getSession().getId());
        System.out.println("USER EN SESION: " + req.getSession().getAttribute("logedInUser"));

        if (user != null) {

            System.out.println("ACCESS LEVEL: " + user.getAccessLevel());

            MenuService menuService = new MenuService();
            List<MenuItemModel> menu
                    = menuService.getMenuByRole(user.getAccessLevel());

            System.out.println("TAMAÑO DEL MENU: " + menu.size());

            req.setAttribute("menu", menu);
        }

        System.out.println("MenuFilter ejecutado: " + req.getRequestURI());

        chain.doFilter(request, response);
    }

}
