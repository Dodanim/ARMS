/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kido.arms.services;

import java.util.ArrayList;
import java.util.List;
import kido.arms.entities.UserEntity;
import kido.arms.model.MenuItemModel;

/**
 *
 * @author kttim
 */
public class MenuService {

   

    public List<MenuItemModel> getMenuByRole(int accessLevel) {
        List<MenuItemModel> menu = new ArrayList<>();

        if (accessLevel == 1) {
            menu.add(new MenuItemModel("Users", "/users", List.of(Integer.toString(1))));
            menu.add(new MenuItemModel("Reports", "/reports", List.of(Integer.toString(1))));
            menu.add(new MenuItemModel("Dashboard", "/dashboard", List.of(Integer.toString(1))));
            menu.add(new MenuItemModel("Inventory", "/inventory", List.of(Integer.toString(1))));
            menu.add(new MenuItemModel("Profile", "/profile", List.of(Integer.toString(1))));
        }

        if (accessLevel == 2) {
            menu.add(new MenuItemModel("Profile", "/profile", List.of(Integer.toString(2))));
            menu.add(new MenuItemModel("DashBoard", "/dashboard", List.of(Integer.toString(2))));
        }

        return menu;
    }
}
