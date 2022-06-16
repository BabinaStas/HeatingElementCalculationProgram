package by.calculate.heatingelementcalculationprogram;

import by.calculate.heatingelementcalculationprogram.service.CalculateHeatingElementService;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class InPutProgramWindowApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(InPutProgramWindowApplication.class.getResource("inPutProgramWindow.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 825, 400);
        stage.setTitle("Heating element calculation program");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}