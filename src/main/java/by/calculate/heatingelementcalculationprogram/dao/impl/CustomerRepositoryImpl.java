package by.calculate.heatingelementcalculationprogram.dao.impl;

import by.calculate.heatingelementcalculationprogram.dao.ConnectDao;
import by.calculate.heatingelementcalculationprogram.dao.CustomerRepository;
import by.calculate.heatingelementcalculationprogram.dto.CustomerDto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static by.calculate.heatingelementcalculationprogram.dao.HelperDao.populateCustomer;

public class CustomerRepositoryImpl implements CustomerRepository {

    @Override
    public List<CustomerDto> getAll() {
            return null;
    }

    @Override
    public CustomerDto getOneById(Integer id) {
        return null;
    }

    @Override
    public void updateById(Integer id, CustomerDto customerDto) {
/*        Connection connection = new ConnectDao().getConnection();
        String sqlCommand = "update custom set length_ten = ?, stud_length_ten = ?, diameter_ten = ?, power_ten = ?, workspace_ten = ?, " +
                "voltage_ten = ? where id = ?;";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sqlCommand)) {
            preparedStatement.setDouble(1, designationDto.getLengthTen());
            preparedStatement.setDouble(2, designationDto.getStudLengthTen());
            preparedStatement.setDouble(3, designationDto.getDiameterTen());
            preparedStatement.setDouble(4, designationDto.getPowerTen());
            preparedStatement.setString(5, designationDto.getWorkspaceTen());
            preparedStatement.setDouble(6, designationDto.getVoltageTen());
            preparedStatement.setInt(7, designationDto.getId());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }*/
    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public void insertOne(CustomerDto customerDto) {
        Connection connection = new ConnectDao().getConnection();
        String sqlCommand = "insert into customer (number_order, customer_colum, number_of_products, pilot_batch) values (?, ?, ?, ?);";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sqlCommand);) {
            preparedStatement.setString(1, customerDto.getNumberOrder());
            preparedStatement.setString(2, customerDto.getCustomColumn());
            preparedStatement.setString(3, customerDto.getNumberOfProducts());
            preparedStatement.setString(4, customerDto.getPilotBatch());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
