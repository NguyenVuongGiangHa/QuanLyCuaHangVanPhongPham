/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POJO;

import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Ha
 */
public class F_Menu {
    String name;
    String icon;
    MenuType type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public MenuType getType() {
        return type;
    }

    public void setType(MenuType type) {
        this.type = type;
    }

    public F_Menu() {
    }

    public F_Menu(String name, String icon, MenuType type) {
        this.name = name;
        this.icon = icon;
        this.type = type;
    }
   public Icon toIcon() {
        return new ImageIcon(getClass().getResource("/IMAGE/" + icon + ".png"));
    }      
    public static  enum MenuType{
        TITLE,MENU,EMPTY
    }
}
