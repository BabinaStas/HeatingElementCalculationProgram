package by.calculate.heatingelementcalculationprogram.mapper;

import by.calculate.heatingelementcalculationprogram.domain.initialdatachild.Designation;
import by.calculate.heatingelementcalculationprogram.dto.DesignationDto;

import java.util.ArrayList;
import java.util.List;

public class DesignationMapper {

    public static Designation toDesignation(DesignationDto designationDto){
        Designation result = new Designation();
        result.setLengthTen(designationDto.getLengthTen());
        result.setStudLengthTen(designationDto.getStudLengthTen());
        result.setDiameterTen(designationDto.getDiameterTen());
        result.setPowerTen(designationDto.getPowerTen());
        result.setWorkspaceTen(designationDto.getWorkspaceTen());
        result.setVoltageTen(designationDto.getVoltageTen());
        return result;

    }

    public static List<Designation> toDesignationList(List<DesignationDto> designationDtos){
        List<Designation> result = new ArrayList<>();
        for (DesignationDto elem: designationDtos){
            result.add(toDesignation(elem));
        }
        return result;
    }
}