package by.calculate.heatingelementcalculationprogram.controller;

import by.calculate.heatingelementcalculationprogram.InPutProgramWindowApplication;
import by.calculate.heatingelementcalculationprogram.service.CalculateHeatingElementService;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

import static javafx.stage.Modality.WINDOW_MODAL;

public class CalculateHeatingElementController {

    @FXML
    private ChoiceBox<?> GostCalculateTen;

    @FXML
    private ChoiceBox<?> bottomStudContactTypeCalculateTen;

    @FXML
    private ChoiceBox<?> bottomStudProtrusionCalculateTen;

    @FXML
    private Button changeUserCalculateTen;

    @FXML
    private TextField customerCalculateTen;

    @FXML
    private TextField diameterSpiralCalculateTen;

    @FXML
    private TextField diameterTenCalculateTen;

    @FXML
    private Button generateCalculationCalculateTen;

    @FXML
    private TextField lengthTenCalculateTen;

    @FXML
    private ChoiceBox<?> mandrelDiameterCalculateTen;

    @FXML
    private TextField numberOfProductsCalculateTen;

    @FXML
    private ChoiceBox<?> numberOfWiresInASpiralCalculateTen;

    @FXML
    private TextField numberOrderCalculateTen;

    @FXML
    private ChoiceBox<?> pilotBatchCalculateTen;

    @FXML
    private ChoiceBox<?> pipeBilletDiameterCalculateTen;

    @FXML
    private TextField pipeElongationFactorCalculateTen;

    @FXML
    private ChoiceBox<?> pipeThicknessCalculateTen;

    @FXML
    private TextField powerTenCalculateTen;

    @FXML
    private ChoiceBox<?> sandCalculateTen;

    @FXML
    private Button searchDateBaseCalculateTen;

    @FXML
    private ChoiceBox<?> spiralFiringCalculateTen;

    @FXML
    private ChoiceBox<?> spiralMaterialCalculateTen;

    @FXML
    private TextField spiralReductionFactorCalculateTen;

    @FXML
    private TextField studLengthCalculateTen;

    @FXML
    private TextField temperatureSpiralCalculateTen;

    @FXML
    private ChoiceBox<?> topStudContactTypeCalculateTen;

    @FXML
    private ChoiceBox<?> topStudProtrusionCalculateTen;

    @FXML
    private TextField voltageCalculateTen;

    @FXML
    private TextField workspaceCalculateTen;

    @FXML
    private void onInPutProgramWindowShow(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader(InPutProgramWindowApplication.class.getResource("inPutProgramWindow.fxml"));
        stage.setScene(new Scene(loader.load()));
        stage.setTitle("Enter to program");
        stage.initModality(WINDOW_MODAL);
        stage.initOwner(((Node) event.getSource()).getScene().getWindow());
        stage.show();
    }

    private String[] arrayOfDesignationOfThermalElectricHeater() {
        String[] array = new String[6];
        array[0] = lengthTenCalculateTen.getText();
        array[1] = studLengthCalculateTen.getText();
        array[2] = diameterTenCalculateTen.getText();
        array[3] = powerTenCalculateTen.getText();
        array[4] = workspaceCalculateTen.getText();
        array[5] = voltageCalculateTen.getText();
        return array;
    }

    @FXML
    protected void onDataBaseController(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader(InPutProgramWindowApplication.class.getResource("dataBase.fxml"));
        stage.setScene(new Scene(loader.load()));
        stage.setTitle("Data base table");
        stage.initModality(WINDOW_MODAL);
        stage.initOwner(((Node) event.getSource()).getScene().getWindow());
        if (!CalculateHeatingElementService.fillingWindow(arrayOfDesignationOfThermalElectricHeater()).equals("Errors in the following fields ")) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Error");
            alert.setHeaderText("One of the fields for the designation of a thermal electric heater is not filled");
            alert.showAndWait();
        } else {
            stage.show();
        }
    }
}

