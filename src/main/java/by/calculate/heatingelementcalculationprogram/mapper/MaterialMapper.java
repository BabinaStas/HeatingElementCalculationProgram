package by.calculate.heatingelementcalculationprogram.mapper;

import by.calculate.heatingelementcalculationprogram.domain.initialdatachild.Material;
import by.calculate.heatingelementcalculationprogram.dto.MaterialDto;

import java.util.ArrayList;
import java.util.List;

public class MaterialMapper {

    public static Material toMaterial(MaterialDto materialDto){
        Material result = new Material();
        result.setId(materialDto.getId());
        result.setSpiralMaterialSpiral(materialDto.getSpiralMaterialSpiral());
        result.setNumberOfWiresInASpiral(materialDto.getNumberOfWiresInASpiral());
        result.setMandrelDiameter(materialDto.getMandrelDiameter());
        result.setSand(materialDto.getSand());
        result.setPipeBilletDiameter(materialDto.getPipeBilletDiameter());
        result.setPipeThickness(materialDto.getPipeThickness());
        result.setTopStudProtrusion(materialDto.getTopStudProtrusion());
        result.setBottomStudProtrusion(materialDto.getTopStudProtrusion());
        result.setTopStudContactType(materialDto.getTopStudContactType());
        result.setBottomStudProtrusion(materialDto.getBottomStudProtrusion());
        result.setSpiralFiring(materialDto.getSpiralFiring());
        result.setGost(materialDto.getGost());
        return result;
    }

    public static List<Material> toMaterialList(List<MaterialDto> materialDtos){
        List<Material> result = new ArrayList<>();
        for (MaterialDto elem: materialDtos){
            result.add(toMaterial(elem));
        }
        return result;
    }
}
