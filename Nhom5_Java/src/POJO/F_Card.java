/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POJO;

import javax.swing.Icon;

/**
 *
 * @author Ha
 */
public class F_Card {
    private Icon icon;
    private String title;
    private String values;
    private String description;
    private String description2;

    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getValues() {
        return values;
    }

    public void setValues(String values) {
        this.values = values;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription2() {
        return description2;
    }

    public void setDescription2(String description2) {
        this.description2 = description2;
    }

    public F_Card(Icon icon, String title, String values, String description, String description2) {
        this.icon = icon;
        this.title = title;
        this.values = values;
        this.description = description;
        this.description2 = description2;
    }

    public F_Card() {
    }
    
    
    
    
}
