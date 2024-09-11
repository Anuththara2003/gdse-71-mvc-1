/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edu.ijse.mvc;


import edu.ijse.mvc.view.CustomerView;
import edu.ijse.mvc.view.ItemView;

/**
 *
 * @author anjan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ItemView itemView = new ItemView();
        itemView.setLocationRelativeTo(null);
        itemView.setVisible(true);
        
        CustomerView CustomerView = new CustomerView();
        CustomerView.setLocationRelativeTo(null);
        CustomerView.setVisible(true);
        
        
    }
    
}