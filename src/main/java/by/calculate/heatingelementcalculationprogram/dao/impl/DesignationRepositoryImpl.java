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
        Connection connection = new ConnectDao().getConnection();
        String sqlCommand = "delete from designation where id = ?;";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sqlCommand)) {
            preparedStatement.setInt(1,id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void insertOne(DesignationDto designationDto) {
        Connection connection = new ConnectDao().getConnection();
        String sqlCommand = "insert into designation (length_ten, stud_length_ten, diameter_ten, power_ten, workspace_ten, voltage_ten) values (?, ?, ?, ?, ?, ?);";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sqlCommand);) {
            preparedStatement.setDouble(1, designationDto.getLengthTen());
            preparedStatement.setDouble(2, designationDto.getStudLengthTen());
            preparedStatement.setDouble(3, designationDto.getDiameterTen());
            preparedStatement.setDouble(4, designationDto.getPowerTen());
            preparedStatement.setString(5, designationDto.getWorkspaceTen());
            preparedStatement.setDouble(6, designationDto.getVoltageTen());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
