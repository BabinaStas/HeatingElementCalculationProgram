package by.calculate.heatingelementcalculationprogram.service;

import by.calculate.heatingelementcalculationprogram.model.InitialData;

public class CalculateHeatingElementService {

    public static String fillingWindow(String[] array) {
        String result  = "Заполните следующие поля";
        for (int i = 0; i < array.length; i++) {
            if (array[i] == "") {
                result += array[i] + ", ";
            }
        } return result;
    }

    public static String fillingInitialDataWindow(String[][] array) {
        String result  = "Заполните следующие поля";
        for (int i = 0; i < array.length; i++){
            if (array[i][1] == "") {
                result += array[i][0] + ", ";
            }
        } return result;
    }

    /*Длинна активной части*/
    public static Double getLongActivePart(InitialData LengthActivePart){
        return LengthActivePart.getLengthTen() - (LengthActivePart.getStudLengthTen() * 2);
    }

    /*Удельная нагрузка на проволку*/
    public static Double getSpecificLoadOnTheWire(InitialData LoadWire){
        return LoadWire.getPowerTen() / getLongActivePart(LoadWire);
    }

    /*Длинна шпильки*/
    public static Integer getLengthContanct(InitialData lengthContanct){
       return Integer.parseInt(lengthContanct.getStudLengthTen().toString()) + 25;

    }

    /*Сопротивление нагревательного элемента*/
    public static Double getHeatingElementResistance(InitialData heatingElementResistance) {
        return (Math.pow(heatingElementResistance.getVoltageTen(), 2)) / (heatingElementResistance.getPowerTen() * 1000);
    }

    /*Диапазон нагрвательного элемента*/
    public static String  getPermissibleResistanceRangeForTheHeatingElement(InitialData permissibleResistanceRangeForTheHeatingElement) {
        return Double.toString(getHeatingElementResistance(permissibleResistanceRangeForTheHeatingElement) * 1.1)
                + Double.toString(getHeatingElementResistance(permissibleResistanceRangeForTheHeatingElement) * 0.95);
    }

    /*Длинна сжатой спирали*/
    public static Double  getLengthOfTheCompressedSpiral(InitialData LengthOfTheCompressedSpiral) {
        return LengthOfTheCompressedSpiral.getPowerTen() * 0.268;
    }

    /*Общая длинна проволоки*/
    public static Double  getTotalWireLengthFormedCalculateTen(InitialData totalWireLength) {
        return getLengthOfTheCompressedSpiral(totalWireLength) * totalWireLength.getDiameterSpiral();
    }

    /*Длинна заготовки трубы*/
    public static Double  getPipeBlankLengthFormedCalculateTen(InitialData pipeBlankLength) {
        return pipeBlankLength.getLengthTen() / pipeBlankLength.getPipeElongationFactorTen();
    }
}
