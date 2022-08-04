package by.calculate.heatingelementcalculationprogram.service;

import by.calculate.heatingelementcalculationprogram.domain.InitialData;
import by.calculate.heatingelementcalculationprogram.domain.initialdatachild.Designation;

import java.util.Optional;

public class MethodsElectroPhysicalCalculation {

    /*Длинна активной части*/
    public static Double getLongActivePart(InitialData LengthActivePart){
        return LengthActivePart.getDesignation().getLengthTen() - (LengthActivePart.getDesignation().getStudLengthTen() * 2);
    }

    /*Удельная нагрузка на проволку*/
    public static Double getSpecificLoadOnTheWire(InitialData LoadWire){
        return Optional.ofNullable(LoadWire)
                    .map(InitialData::getDesignation)
                    .map(Designation::getPowerTen)
                    .map(powerTen -> powerTen / getLongActivePart(LoadWire))
                    .orElse(0.0);
    }

    /*Длинна шпильки*/
    public static Integer getLengthContact(InitialData lengthContact){
        return (lengthContact.getDesignation().getStudLengthTen().intValue()) + 25;

    }

    /*Сопротивление нагревательного элемента*/
    public static Double getHeatingElementResistance(InitialData heatingElementResistance) {
        return (Math.pow(heatingElementResistance.getDesignation().getVoltageTen(), 2)) /
                (heatingElementResistance.getDesignation().getPowerTen() * 1000);
    }

    /*Диапазон нагрвательного элемента*/
    public static String  getPermissibleResistanceRangeForTheHeatingElement(InitialData permissibleResistanceRangeForTheHeatingElement) {
        return Double.toString(getHeatingElementResistance(permissibleResistanceRangeForTheHeatingElement) * 1.1)
                + Double.toString(getHeatingElementResistance(permissibleResistanceRangeForTheHeatingElement) * 0.95);
    }

    /*Длинна сжатой спирали*/
    public static Double  getLengthOfTheCompressedSpiral(InitialData LengthOfTheCompressedSpiral) {
        return LengthOfTheCompressedSpiral.getDesignation().getPowerTen() * 0.268;
    }

    /*Общая длинна проволоки*/
    public static Double  getTotalWireLengthFormedCalculateTen(InitialData totalWireLength) {
        return getLengthOfTheCompressedSpiral(totalWireLength) * totalWireLength.getCoefficient().getDiameterSpiral();
    }

    /*Длинна заготовки трубы*/
    public static Double  getPipeBlankLengthFormedCalculateTen(InitialData pipeBlankLength) {
        return pipeBlankLength.getDesignation().getLengthTen() / pipeBlankLength.getCoefficient().getPipeElongationFactorTen();
    }
}
