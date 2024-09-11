/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.model;
import edu.ijse.mvc.db.DBConnection;
import edu.ijse.mvc.dto.ItemDto;
import edu.ijse.mvc.dto.customerDto;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author USER
 */
public class CustomerModel {
    public ArrayList<customerDto> getAll() throws SQLException, ClassNotFoundException{
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM Customer";
        PreparedStatement statement = connection.prepareStatement(sql);

        ResultSet rst = statement.executeQuery();
        ArrayList<customerDto> customerDtos = new ArrayList<>();

        while(rst.next()){
            customerDto customerDto = new customerDto();
            customerDto.setCustID(rst.getString("CustID"));
            customerDto.setCustTitle(rst.getString("CustTitle"));
            customerDto.setCustName(rst.getString("CustName"));
            customerDto.setDOB(rst.getString("DOB"));
            customerDto.setSalary(rst.getInt("Salary"));
            customerDto.setCustAddress(rst.getString("CustAddress"));
            customerDto.setCity(rst.getString("City"));
            customerDto.setProvince(rst.getString("Province"));
            customerDto.setPostalCode(rst.getString("PostalCode"));

 
            customerDtos.add(customerDto);
        }
        return customerDtos;
    }
}
