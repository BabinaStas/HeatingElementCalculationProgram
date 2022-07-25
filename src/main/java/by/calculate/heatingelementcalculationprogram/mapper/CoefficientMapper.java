package by.calculate.heatingelementcalculationprogram.mapper;

import by.calculate.heatingelementcalculationprogram.domain.initialdatachild.Coefficient;
import by.calculate.heatingelementcalculationprogram.dto.CoefficientDto;

import java.util.ArrayList;
import java.util.List;

public class CoefficientMapper {

    public static Coefficient toCoefficient(CoefficientDto coefficientDto){
        Coefficient result = new Coefficient();
        result.setId(coefficientDto.getId());
        result.setSpiralReductionFactorTen(coefficientDto.getSpiralReductionFactorTen());
        result.setPipeElongationFactorTen(coefficientDto.getPipeElongationFactorTen());
        result.setDiameterSpiral(coefficientDto.getDiameterSpiral());
        result.setTemperatureSpiral(coefficientDto.getTemperatureSpiral());
        return result;
    }

    public static List<Coefficient> toCoefficientList(List<CoefficientDto> coefficientDtos){
        List<Coefficient> result = new ArrayList<>();
        for (CoefficientDto elem: coefficientDtos){
            result.add(toCoefficient(elem));
        }
        return result;
    }
}
