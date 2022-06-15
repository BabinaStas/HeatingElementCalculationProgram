package by.calculate.heatingelementcalculationprogram.service;

public class CalculateHeatingElementService {

    public static String fillingWindow (String[] array) {
        String result  = "Errors in the following fields ";
        for (int i = 0; i < array.length; i++){
            if (array[i] == "") {
                result += array[i] + " ";
            }
        } return result;
    }
}
