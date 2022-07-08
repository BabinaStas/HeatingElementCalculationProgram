package by.calculate.heatingelementcalculationprogram.dao.impl;

import by.calculate.heatingelementcalculationprogram.dao.ConnectDao;
import by.calculate.heatingelementcalculationprogram.dao.DesignationRepository;
import by.calculate.heatingelementcalculationprogram.dto.DesignationDto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static by.calculate.heatingelementcalculationprogram.dao.HelperDao.populateDesignation;

public class DesignationRepositoryImpl implements DesignationRepository {

    @Override
    public List<DesignationDto> getAll() {
        Connection connection = new ConnectDao().getConnection();
        String sqlCommand = "select * from designation;";
        List<DesignationDto> result = new ArrayList<>();
        try (PreparedStatement preparedStatement = connection.prepareStatement(sqlCommand)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet != null && resultSet.next()) {
                result.add(populateDesignation(resultSet));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public DesignationDto getOneById(Integer id) {
        return null;
    }

    @Override
    public void updateById(Integer id, DesignationDto designationDto) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public void insertOne(DesignationDto designationDto) {

    }
}
