package by.calculate.heatingelementcalculationprogram.dao.impl;

import by.calculate.heatingelementcalculationprogram.dao.ConnectDao;
import by.calculate.heatingelementcalculationprogram.dao.MaterialRepository;
import by.calculate.heatingelementcalculationprogram.dto.DesignationDto;
import by.calculate.heatingelementcalculationprogram.dto.MaterialDto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static by.calculate.heatingelementcalculationprogram.dao.HelperDao.populateMaterial;

public class MaterialRepositoryImpl implements MaterialRepository {

    @Override
    public List<MaterialDto> getAll() {
        Connection connection = new ConnectDao().getConnection();
        String sqlCommand = "select * from material;";
        List<MaterialDto> result = new ArrayList<>();
        try (PreparedStatement preparedStatement = connection.prepareStatement(sqlCommand)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet != null && resultSet.next()) {
                result.add(populateMaterial(resultSet));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public MaterialDto getOneById(Integer id) {
        return null;
    }

    @Override
    public void updateById(Integer id, MaterialDto entity) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public void insertOne(MaterialDto entity) {

    }
}
