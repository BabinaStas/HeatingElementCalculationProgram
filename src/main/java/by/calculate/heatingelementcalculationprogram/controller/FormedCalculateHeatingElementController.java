package by.calculate.heatingelementcalculationprogram.controller;

import by.calculate.heatingelementcalculationprogram.InPutProgramWindowApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.io.IOException;

import static javafx.stage.Modality.WINDOW_MODAL;

public class FormedCalculateHeatingElementController {


    @FXML
    private Button backToCalculationFormedCalculationTen;

    @FXML
    private Button goToBaseFormedCalculationTen;

    @FXML
    private Button printFormedCalculationTen;

    @FXML
    private Button saveFormedCalculationTen;

    @FXML
    private TableView<?> calculationResultTableFormedCalculationTen;

    @FXML
    private void onCalculateHeatingElementControllerShow(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader(InPutProgramWindowApplication.class.getResource("calculateHeatingElement.fxml"));
        stage.setScene(new Scene(loader.load()));
        stage.setTitle("Enter to calculate heating element ");
        stage.initModality(WINDOW_MODAL);
        stage.initOwner(((Node) event.getSource()).getScene().getWindow());
        stage.show();
    }

    @FXML
    private void onDataBaseControllerShow(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader(InPutProgramWindowApplication.class.getResource("dataBase.fxml"));
        stage.setScene(new Scene(loader.load()));
        stage.setTitle("Enter to data base ");
        stage.initModality(WINDOW_MODAL);
        stage.initOwner(((Node) event.getSource()).getScene().getWindow());
        stage.show();
    }
    }

