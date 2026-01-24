/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kido.arms.model;

import java.util.List;

/**
 *
 * @author kttim
 */
public class MenuItemModel {

    private String label;
    private String url;
    private List<String> accessLevel;

    // constructor + getters

    public MenuItemModel(String label, String url, List<String> accessLevel) {
        this.label = label;
        this.url = url;
        this.accessLevel = accessLevel;
    }

   

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<String> getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(List<String> accessLevel) {
        this.accessLevel = accessLevel;
    }

  

}
