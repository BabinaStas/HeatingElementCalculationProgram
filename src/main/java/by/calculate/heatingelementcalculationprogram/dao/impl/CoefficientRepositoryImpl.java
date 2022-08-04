package by.calculate.heatingelementcalculationprogram.dao.impl;

import by.calculate.heatingelementcalculationprogram.dao.CoefficientRepository;
import by.calculate.heatingelementcalculationprogram.dao.ConnectDao;
import by.calculate.heatingelementcalculationprogram.domain.initialdatachild.Coefficient;
import by.calculate.heatingelementcalculationprogram.dto.CoefficientDto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static by.calculate.heatingelementcalculationprogram.dao.HelperDao.populateCoefficient;

public class CoefficientRepositoryImpl implements CoefficientRepository {
    @Override
    public List<CoefficientDto> getAll() {
        Connection connection = new ConnectDao().getConnection();
        String sqlCommand = "select * from coefficient;";
        List<CoefficientDto> result = new ArrayList<>();
        try (PreparedStatement preparedStatement = connection.prepareStatement(sqlCommand)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet != null && resultSet.next()) {
                result.add(populateCoefficient(resultSet));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public CoefficientDto getOneById(CoefficientDto coefficientDto) {
        return null;
    }

    @Override
    public void updateById(Integer id, CoefficientDto entity) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public void insertOne(CoefficientDto entity) {

    }
}
