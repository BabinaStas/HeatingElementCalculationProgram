package by.calculate.heatingelementcalculationprogram.service.DatabaseDesigantionController;

import javafx.scene.control.Alert;

public class AlertDataBaseService {

    public static void getAlert() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Ошибка заполнения.");
        alert.setHeaderText("Выберите обозначение ТЭНа" );
        alert.showAndWait();
    }
}
