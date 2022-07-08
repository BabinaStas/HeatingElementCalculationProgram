package by.calculate.heatingelementcalculationprogram.dao;

import by.calculate.heatingelementcalculationprogram.dto.DesignationDto;

import java.sql.ResultSet;
import java.sql.SQLException;

public class HelperDao {

    public static DesignationDto populateDesignation(ResultSet resultSet) throws SQLException {
        DesignationDto designationDto = new DesignationDto();
        designationDto.setId(resultSet.getInt("id"));
        designationDto.setLengthTen(resultSet.getDouble("length_ten"));
        designationDto.setStudLengthTen(resultSet.getDouble("stud_length_ten"));
        designationDto.setDiameterTen(resultSet.getDouble("diameter_ten"));
        designationDto.setPowerTen(resultSet.getDouble("power_ten"));
        designationDto.setWorkspaceTen(resultSet.getString("workspace_ten"));
        designationDto.setVoltageTen(resultSet.getDouble("voltage_ten"));
        return designationDto;
    }
}
