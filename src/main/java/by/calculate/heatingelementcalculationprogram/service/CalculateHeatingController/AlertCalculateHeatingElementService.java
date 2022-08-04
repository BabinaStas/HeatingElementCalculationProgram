package by.calculate.heatingelementcalculationprogram.service.CalculateHeatingController;

public class AlertCalculateHeatingElementService {

    public static String fillingWindow(String[][] array) {
        String result = " ";
        for (int i = 0; i < array.length; i++) {
            if (array[i][1] == "") {
                result += array[i][0] + " ";
            }
        } return result;
    }
}
