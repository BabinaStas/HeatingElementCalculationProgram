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
            Connection connection = new ConnectDao().getConnection();
            String sqlCommand = "select * from customer;";
            List<CustomerDto> result = new ArrayList<>();
            try (PreparedStatement preparedStatement = connection.prepareStatement(sqlCommand)) {
                ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet != null && resultSet.next()) {
                    result.add(populateCustomer(resultSet));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return result;
        }

    @Override
    public CustomerDto getOneById(CustomerDto customerDto) {
        return null;
    }

    @Override
    public void updateById(Integer id, CustomerDto customerDto) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public void insertOne(CustomerDto customerDto) {

    }
}
