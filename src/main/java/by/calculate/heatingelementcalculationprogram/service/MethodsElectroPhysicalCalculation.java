package by.calculate.heatingelementcalculationprogram.service;

import by.calculate.heatingelementcalculationprogram.domain.InitialData;
import by.calculate.heatingelementcalculationprogram.domain.initialdatachild.Coefficient;
import by.calculate.heatingelementcalculationprogram.domain.initialdatachild.Designation;

import java.util.Optional;

public class MethodsElectroPhysicalCalculation {

/*    Полнная длинна заделки в оболочке*/
        public static Double getStubLengthOfAllTen(InitialData stubLengthOfAllTen) {
        return Optional.ofNullable(stubLengthOfAllTen)
                .map(InitialData::getDesignation)
                .map(Designation::getStudLengthTen)
                .map(stubLength -> (stubLength * 0.1) *2)
                .orElse(0.0);
    }

    /*Длинна активной части*/
    public static Double getLongActivePart(InitialData lengthActivePart){
        return Optional.ofNullable(lengthActivePart)
                .map(InitialData::getDesignation)
                .map(Designation::getLengthTen)
                .map(lengthTen -> (lengthTen - getStubLengthOfAllTen(lengthActivePart)))
                .orElse(0.0);
     }

    /*Удельная нагрузка на проволку*/
    public static Double getSpecificLoadOnTheWire(InitialData loadWire){
        return Optional.ofNullable(loadWire)
                    .map(InitialData::getDesignation)
                    .map(Designation::getPowerTen)
                    .map(powerTen -> Math.round((powerTen / getLongActivePart(loadWire)) * 1000.0) / 1000.0)
                    .orElse(0.0);
    }

    /*Длинна шпильки*/
    public static Integer getLengthContact(InitialData lengthContact){
        return Optional.ofNullable(lengthContact)
                .map(InitialData::getDesignation)
                .map(Designation::getStudLengthTen)
                .map(stubLength -> stubLength.intValue() + 25)
                .orElse(75);
    }

/*    Получение из кВт мощности, Вт*/
    public static Double getPowerTenInVat(InitialData powerTenInVat){
        return Optional.ofNullable(powerTenInVat)
                .map(InitialData::getDesignation)
                .map(Designation::getPowerTen)
                .map(powerTen -> powerTen * 1000)
                .orElse(0.0);
    }

    /*Сопротивление нагревательного элемента*/
    public static Double getHeatingElementResistance(InitialData heatingElementResistance) {
        return Optional.ofNullable(heatingElementResistance)
                .map(InitialData::getDesignation)
                .map(Designation::getVoltageTen)
                .map(voltage -> Math.pow(voltage,2) / getPowerTenInVat(heatingElementResistance))
                .orElse(0.0);
    }

    /*Диапазон нагрвательного элемента*/
    public static String  getPermissibleResistanceRangeForTheHeatingElement(InitialData permissibleResistanceRangeForTheHeatingElement) {
        return (Math.round(getHeatingElementResistance(permissibleResistanceRangeForTheHeatingElement) * 1.1) * 100.0 / 100.0) + " - "
                + (Math.round(getHeatingElementResistance(permissibleResistanceRangeForTheHeatingElement) * 0.95) * 100.0 / 100.0);
    }

    /*Длинна сжатой спирали*/
    public static Double  getLengthOfTheCompressedSpiral(InitialData LengthOfTheCompressedSpiral) {
        return Optional.ofNullable(LengthOfTheCompressedSpiral)
                .map(InitialData::getDesignation)
                .map(Designation::getPowerTen)
                .map(powerTen -> Math.round((powerTen * 0.268) * 1000.0) / 1000.0)
                .orElse(0.0);
    }

    /*Общая длинна проволоки*/
    public static Double  getTotalWireLengthFormedCalculateTen(InitialData totalWireLength) {
        return Optional.ofNullable(totalWireLength)
                .map(InitialData::getCoefficient)
                .map(Coefficient::getDiameterSpiral)
                .map(diameterSpiral -> Math.round((diameterSpiral
                        * getLengthOfTheCompressedSpiral(totalWireLength)) * 1000.0) / 1000.0)
                .orElse(0.0);
    }

    public static Double getCoefficientRound(InitialData coefficientRound) {
        return Optional.ofNullable(coefficientRound)
                .map(InitialData::getCoefficient)
                .map(Coefficient::getPipeElongationFactorTen)
                .map(pipeCoefficientRound -> Math.round(pipeCoefficientRound * 1000.0) / 1000.0)
                .orElse(0.0);
    }

    /*Длинна заготовки трубы*/
    public static Double  getPipeBlankLengthFormedCalculateTen(InitialData pipeBlankLength) {
        return Optional.ofNullable(pipeBlankLength)
                .map(InitialData:: getDesignation)
                .map(Designation::getLengthTen)
                .map(lengthTen -> Math.round(lengthTen / getCoefficientRound(pipeBlankLength) * 1000.0) / 1000.0)
                .orElse(0.0);
    }
}
