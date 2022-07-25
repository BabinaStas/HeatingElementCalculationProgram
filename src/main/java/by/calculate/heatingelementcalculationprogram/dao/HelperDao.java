package by.calculate.heatingelementcalculationprogram.dao;

import by.calculate.heatingelementcalculationprogram.dto.CoefficientDto;
import by.calculate.heatingelementcalculationprogram.dto.CustomerDto;
import by.calculate.heatingelementcalculationprogram.dto.DesignationDto;
import by.calculate.heatingelementcalculationprogram.dto.MaterialDto;

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
        designationDto.setCustomerId(resultSet.getInt("customer_id"));
        designationDto.setCoefficientId(resultSet.getInt("coefficient_id"));
        designationDto.setMaterialId(resultSet.getInt("material_id"));
        return designationDto;
    }

    public static CustomerDto populateCustomer(ResultSet resultSet) throws SQLException {
        CustomerDto customerDto = new CustomerDto();
        customerDto.setId(resultSet.getInt("id"));
        customerDto.setNumberOrder(resultSet.getString("number_order"));
        customerDto.setCustomColumn(resultSet.getString("customer_colum"));
        customerDto.setNumberOfProducts(resultSet.getString("number_of_products"));
        customerDto.setPilotBatch(resultSet.getString("pilot_batch"));
        return customerDto;
    }

    public static CoefficientDto populateCoefficient(ResultSet resultSet) throws SQLException {
        CoefficientDto coefficientDto = new CoefficientDto();
        coefficientDto.setId(resultSet.getInt("id"));
        coefficientDto.setSpiralReductionFactorTen(resultSet.getDouble("spiral_reduction_factor_ten"));
        coefficientDto.setPipeElongationFactorTen(resultSet.getDouble("pipe_elongation_factor_ten"));
        coefficientDto.setDiameterSpiral(resultSet.getDouble("diameter_spiral"));
        coefficientDto.setTemperatureSpiral(resultSet.getDouble("temperature_spiral"));
        return coefficientDto;
    }

    public static MaterialDto populateMaterial(ResultSet resultSet) throws SQLException {
        MaterialDto materialDto = new MaterialDto();
        materialDto.setId(resultSet.getInt("id"));
        materialDto.setSpiralMaterialSpiral(resultSet.getString("spiral_material_spiral"));
        materialDto.setNumberOfWiresInASpiral(resultSet.getString("number_of_wires_in_a_spiral"));
        materialDto.setMandrelDiameter(resultSet.getDouble("mandrel_diameter"));
        materialDto.setSand(resultSet.getString("sand"));
        materialDto.setPipeBilletDiameter(resultSet.getDouble("pipe_billet_diameter"));
        materialDto.setPipeThickness(resultSet.getDouble("pipe_thickness"));
        materialDto.setTopStudProtrusion(resultSet.getDouble("top_stud_protrusion"));
        materialDto.setBottomStudProtrusion(resultSet.getDouble("bottom_stud_protrusion"));
        materialDto.setTopStudContactType(resultSet.getString("top_stud_contact_type"));
        materialDto.setBottomStudContactType(resultSet.getString("bottom_stud_contact_type"));
        materialDto.setSpiralFiring(resultSet.getString("spiral_firing"));
        materialDto.setGost(resultSet.getString("gost"));
        return materialDto;
    }
}
