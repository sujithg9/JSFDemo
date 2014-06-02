/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jsfdemo.beans;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.ChartSeries;


/**
 *
 * @author Sujith
 */
@ManagedBean(name="registration")
@SessionScoped
public class RegistrationBean{
    private List<String> users;
    private String userName;
    
    public RegistrationBean(){
        users=new ArrayList<String>();
    }

    public List<String> getUsers() {
        return users;
    }

    public void setUsers(List<String> users) {
        this.users = users;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    
     public String getWelcomeMessage(){
        return "Hello Mr."+userName;
    }
    
    public String addUsers(){
        users.add(userName);
       return "listOfUsers";
    }
    
}
