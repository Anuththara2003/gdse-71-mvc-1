/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.controller;

import edu.ijse.mvc.dto.ItemDto;
import edu.ijse.mvc.dto.customerDto;
import edu.ijse.mvc.model.ItemModel;
import edu.ijse.mvc.model.CustomerModel;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author USER
 */
public class CustomerController {
    private final CustomerModel CUSTOMER_CONTROLLER;

    public CustomerController() {
        this.CUSTOMER_CONTROLLER = new CustomerModel();
    }

    public ArrayList<customerDto> getAllCustomer() throws SQLException, ClassNotFoundException{
        ArrayList<customerDto> customerDto = CUSTOMER_CONTROLLER.getAll();
        return customerDto;
    }

}
