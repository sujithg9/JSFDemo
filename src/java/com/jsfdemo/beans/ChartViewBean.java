/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jsfdemo.beans;

/**
 *
 * @author Sujith
*/
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.ChartSeries;
@ManagedBean
@SessionScoped
public class ChartViewBean {
private CartesianChartModel categoryModel;
/**
 * Creates a new instance of DashBoardBean
 */
public ChartViewBean() {
     createCategoryModel();

}

 public CartesianChartModel getCategoryModel() {  
    return categoryModel;  
}  

private void createCategoryModel() {  
    categoryModel = new CartesianChartModel();  
    ChartSeries from = new ChartSeries();  
    from.setLabel("Formularios");  

    from.set("2010", 20);  
    from.set("2011", 204);  
    from.set("2012", 700);  
    from.set("2013", 399);  
    from.set("2014", 140);  

    ChartSeries users = new ChartSeries();  
    users.setLabel("Usuarios");  

    users.set("2010", 288);  
    users.set("2011", 326);  
    users.set("2012", 318);  
    users.set("2013", 345);  
    users.set("2014", 290);  

    categoryModel.addSeries(users);  
    categoryModel.addSeries(from);  
  }  
    
}