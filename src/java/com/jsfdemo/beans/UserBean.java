/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jsfdemo.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Sujith
 */
@ManagedBean(name = "user")
@SessionScoped
public class UserBean {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getWelcomeMessage(){
        return "Hello Mr."+name;
    }
     @Override
     public String toString(){
        return name;
    }
}
