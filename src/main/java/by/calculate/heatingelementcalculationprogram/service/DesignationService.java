package by.calculate.heatingelementcalculationprogram.service;

import by.calculate.heatingelementcalculationprogram.dao.DesignationRepository;
import by.calculate.heatingelementcalculationprogram.dao.impl.DesignationRepositoryImpl;
import by.calculate.heatingelementcalculationprogram.domain.initialdatachild.Designation;
import by.calculate.heatingelementcalculationprogram.dto.DesignationDto;
import by.calculate.heatingelementcalculationprogram.mapper.DesignationMapper;

import java.util.List;

public class DesignationService {

    DesignationRepository designationRepository = new DesignationRepositoryImpl();

    public List<Designation> getDesignations() {
        List<DesignationDto> designationDtos = designationRepository.getAll();
        return DesignationMapper.toDesignationList(designationDtos);
    }

}
