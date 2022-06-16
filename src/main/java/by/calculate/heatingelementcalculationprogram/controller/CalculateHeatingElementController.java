package by.calculate.heatingelementcalculationprogram.controller;

import by.calculate.heatingelementcalculationprogram.InPutProgramWindowApplication;
import by.calculate.heatingelementcalculationprogram.model.InitialData;
import by.calculate.heatingelementcalculationprogram.service.CalculateHeatingElementService;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static javafx.stage.Modality.WINDOW_MODAL;

public class CalculateHeatingElementController {


    @FXML
    private ChoiceBox<String> bottomStudContactTypeCalculateTen;

    @FXML
    private Label bottomStudContactTypeLabel;

    @FXML
    private ChoiceBox<Integer> bottomStudProtrusionCalculateTen;

    @FXML
    private Label bottomStudProtrusionLabel;

    @FXML
    private Button changeUserCalculateTen;

    @FXML
    private TextField customerCalculateTen;

    @FXML
    private Label customerLabel;

    @FXML
    private TextField diameterSpiralCalculateTen;

    @FXML
    private Label diameterSpiralLabel;

    @FXML
    private TextField diameterTenCalculateTen;

    @FXML
    private Button generateCalculationCalculateTen;

    @FXML
    private ChoiceBox<String> gostCalculateTen;

    @FXML
    private Label gostLabel;

    @FXML
    private TextField lengthTenCalculateTen;

    @FXML
    private ChoiceBox<Double> mandrelDiameterCalculateTen;

    @FXML
    private Label mandrelDiameterLabel;

    @FXML
    private TextField numberOfProductsCalculateTen;

    @FXML
    private Label numberOfProductsLabel;

    @FXML
    private ChoiceBox<String> numberOfWiresInASpiralCalculateTen;

    @FXML
    private Label numberOfWiresInASpiralLabel;

    @FXML
    private TextField numberOrderCalculateTen;

    @FXML
    private Label numberOrderLabel;

    @FXML
    private ChoiceBox<String> pilotBatchCalculateTen;

    @FXML
    private Label pilotBatchLabel;

    @FXML
    private ChoiceBox<Integer> pipeBilletDiameterCalculateTen;

    @FXML
    private Label pipeBilletDiameterLabel;

    @FXML
    private TextField pipeElongationFactorCalculateTen;

    @FXML
    private Label pipeElongationFactorLabel;

    @FXML
    private ChoiceBox<Double> pipeThicknessCalculateTen;

    @FXML
    private Label pipeThicknessLabel;

    @FXML
    private TextField powerTenCalculateTen;

    @FXML
    private ChoiceBox<String> sandCalculateTen;

    @FXML
    private Label sandLabel;

    @FXML
    private Button searchDateBaseCalculateTen;

    @FXML
    private ChoiceBox<String> spiralFiringCalculateTen;

    @FXML
    private Label spiralFiringLabel;

    @FXML
    private ChoiceBox<String> spiralMaterialCalculateTen;

    @FXML
    private Label spiralMaterialLabel;

    @FXML
    private TextField spiralReductionFactorCalculateTen;

    @FXML
    private Label spiralReductionFactorLabel;

    @FXML
    private TextField studLengthCalculateTen;

    @FXML
    private TextField temperatureSpiralCalculateTen;

    @FXML
    private Label temperatureSpiralLabel;

    @FXML
    private ChoiceBox<String> topStudContactTypeCalculateTen;

    @FXML
    private Label topStudContactTypeLabel;

    @FXML
    private ChoiceBox<Integer> topStudProtrusionCalculateTen;

    @FXML
    private Label topStudProtrusionLabel;

    @FXML
    private TextField voltageCalculateTen;

    @FXML
    private TextField workspaceCalculateTen;

    @FXML
    private void initialize() {
        List<String> choiceBoxListPilotBatchCalculateTen = new ArrayList<>();
        choiceBoxListPilotBatchCalculateTen.add("Опытная партия");
        choiceBoxListPilotBatchCalculateTen.add("Основное производство");
        choiceBoxListPilotBatchCalculateTen.add("Мелко-серийное производсто");
        ObservableList<String> listPilotBatchCalculateTen =
                FXCollections.observableArrayList(choiceBoxListPilotBatchCalculateTen);
        pilotBatchCalculateTen.setItems(listPilotBatchCalculateTen);
        List<String> choiceBoxListSpiralMaterialCalculateTen = new ArrayList<>();
        choiceBoxListSpiralMaterialCalculateTen.add("20Х80Н10Т");
        choiceBoxListSpiralMaterialCalculateTen.add("Х23Ю5Т");
        ObservableList<String> listSpiralMaterialCalculateTen =
                FXCollections.observableArrayList(choiceBoxListSpiralMaterialCalculateTen);
        spiralMaterialCalculateTen.setItems(listSpiralMaterialCalculateTen);
        List<String> choiceBoxListNumberOfWiresInASpiralCalculateTen = new ArrayList<>();
        choiceBoxListNumberOfWiresInASpiralCalculateTen.add("Одиночная");
        choiceBoxListNumberOfWiresInASpiralCalculateTen.add("Двойная");
        choiceBoxListNumberOfWiresInASpiralCalculateTen.add("Тройная");
        choiceBoxListNumberOfWiresInASpiralCalculateTen.add("Четверная");
        ObservableList<String> listNumberOfWiresInASpiralCalculateTen =
                FXCollections.observableArrayList(choiceBoxListNumberOfWiresInASpiralCalculateTen);
        numberOfWiresInASpiralCalculateTen.setItems(listNumberOfWiresInASpiralCalculateTen);
        List<Double> choiceBoxListMandrelDiameterCalculateTen = new ArrayList<>();
        choiceBoxListMandrelDiameterCalculateTen.add(2.5);
        choiceBoxListMandrelDiameterCalculateTen.add(3.2);
        ObservableList<Double> listMandrelDiameterCalculateTen =
                FXCollections.observableArrayList(choiceBoxListMandrelDiameterCalculateTen);
        mandrelDiameterCalculateTen.setItems(listMandrelDiameterCalculateTen);
        List<String> choiceBoxListSandCalculateTen = new ArrayList<>();
        choiceBoxListSandCalculateTen.add("Переклаз Богдановичский 2К");
        choiceBoxListSandCalculateTen.add("Переклаз Богдановичский 2М");
        ObservableList<String> listSandCalculateTen =
                FXCollections.observableArrayList(choiceBoxListSandCalculateTen);
        sandCalculateTen.setItems(listSandCalculateTen);
        List<Integer> choiceBoxListPipeBilletDiameterCalculateTen = new ArrayList<>();
        choiceBoxListPipeBilletDiameterCalculateTen.add(10);
        choiceBoxListPipeBilletDiameterCalculateTen.add(12);
        ObservableList<Integer> listPipeBilletDiameterCalculateTen =
                FXCollections.observableArrayList(choiceBoxListPipeBilletDiameterCalculateTen);
        pipeBilletDiameterCalculateTen.setItems(listPipeBilletDiameterCalculateTen);
        List<Double> choiceBoxListPipeThicknessCalculateTen = new ArrayList<>();
        choiceBoxListPipeThicknessCalculateTen.add(0.4);
        choiceBoxListPipeThicknessCalculateTen.add(0.5);
        choiceBoxListPipeThicknessCalculateTen.add(0.6);
        choiceBoxListPipeThicknessCalculateTen.add(0.8);
        choiceBoxListPipeThicknessCalculateTen.add(1.0);
        ObservableList<Double> listPipeThicknessCalculateTen =
                FXCollections.observableArrayList(choiceBoxListPipeThicknessCalculateTen);
        pipeThicknessCalculateTen.setItems(listPipeThicknessCalculateTen);
        List<Integer> choiceBoxListTopStudProtrusionCalculateTen = new ArrayList<>();
        choiceBoxListTopStudProtrusionCalculateTen.add(15);
        choiceBoxListTopStudProtrusionCalculateTen.add(25);
        choiceBoxListTopStudProtrusionCalculateTen.add(28);
        choiceBoxListTopStudProtrusionCalculateTen.add(35);
        choiceBoxListTopStudProtrusionCalculateTen.add(38);
        ObservableList<Integer> listTopStudProtrusionCalculateTen =
                FXCollections.observableArrayList(choiceBoxListTopStudProtrusionCalculateTen);
        topStudProtrusionCalculateTen.setItems(listTopStudProtrusionCalculateTen);
        List<Integer> choiceBoxListBottomStudProtrusionCalculateTen = new ArrayList<>();
        choiceBoxListBottomStudProtrusionCalculateTen.add(10);
        choiceBoxListBottomStudProtrusionCalculateTen.add(20);
        choiceBoxListBottomStudProtrusionCalculateTen.add(30);
        ObservableList<Integer> listBottomStudProtrusionCalculateTen =
                FXCollections.observableArrayList(choiceBoxListBottomStudProtrusionCalculateTen);
        bottomStudProtrusionCalculateTen.setItems(listBottomStudProtrusionCalculateTen);
        List<String> choiceBoxListTopStudContactTypeCalculateTen = new ArrayList<>();
        choiceBoxListTopStudContactTypeCalculateTen.add("Верх 2.0/2,65/    /М3");
        choiceBoxListTopStudContactTypeCalculateTen.add("Верх 2.0/М3/    /М3");
        choiceBoxListTopStudContactTypeCalculateTen.add("Верх 2.0/М4/    /М3");
        choiceBoxListTopStudContactTypeCalculateTen.add("Верх 2.0/М4/    /М4");
        ObservableList<String> listTopStudContactTypeCalculateTen =
                FXCollections.observableArrayList(choiceBoxListTopStudContactTypeCalculateTen);
        topStudContactTypeCalculateTen.setItems(listTopStudContactTypeCalculateTen);
        List<String> choiceBoxListBottomStudContactTypeCalculateTen = new ArrayList<>();
        choiceBoxListBottomStudContactTypeCalculateTen.add("Низ 2,65/    /10/М3");
        choiceBoxListBottomStudContactTypeCalculateTen.add("Низ 2,65/    /20/М3");
        choiceBoxListBottomStudContactTypeCalculateTen.add("Низ М3/    /М3");
        choiceBoxListBottomStudContactTypeCalculateTen.add("Низ М4/    /М3");
        choiceBoxListBottomStudContactTypeCalculateTen.add("Низ М4/    /М4");
        ObservableList<String> listBottomStudContactTypeCalculateTen =
                FXCollections.observableArrayList(choiceBoxListBottomStudContactTypeCalculateTen);
        bottomStudContactTypeCalculateTen.setItems(listBottomStudContactTypeCalculateTen);
        List<String> choiceBoxListSpiralFiringCalculateTen = new ArrayList<>();
        choiceBoxListSpiralFiringCalculateTen.add("Да");
        choiceBoxListSpiralFiringCalculateTen.add("Нет");
        ObservableList<String> listSpiralFiringCalculateTen =
                FXCollections.observableArrayList(choiceBoxListSpiralFiringCalculateTen);
        spiralFiringCalculateTen.setItems(listSpiralFiringCalculateTen);
        List<String> choiceBoxListGostCalculateTen = new ArrayList<>();
        choiceBoxListGostCalculateTen.add("ГОСТ-13286-83");
        choiceBoxListGostCalculateTen.add("ГОСТ-13286-81");
        ObservableList<String> listGostCalculateTen =
                FXCollections.observableArrayList(choiceBoxListGostCalculateTen);
        gostCalculateTen.setItems(listGostCalculateTen);
    }

/*    public InitialData getInitialData() {
        InitialData dateOfCalculate = new InitialData(Double.parseDouble(lengthTenCalculateTen.getText()),
                Double.parseDouble(studLengthCalculateTen.getText()), Double.parseDouble(diameterSpiralCalculateTen.getText()),
                Double.parseDouble(powerTenCalculateTen.getText()), workspaceCalculateTen.getText(), Double.parseDouble(voltageCalculateTen.getText()));
    return dateOfCalculate;
    }*/

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

    private String[][] arrayOfInitialData() {
        String[][] array = new String[20][2];
        array[0][0] = numberOrderLabel.getText();
        array[0][1] = numberOrderCalculateTen.getText();
        array[1][0] = customerLabel.getText();
        array[1][1] = customerCalculateTen.getText();
        array[2][0] = numberOfProductsLabel.getText();
        array[2][1] = numberOfProductsCalculateTen.getText();
        array[3][0] = pilotBatchLabel.getText();
        array[3][1] = pilotBatchCalculateTen.getValue() == null ? "" :
                pilotBatchCalculateTen.getValue();
        array[4][0] = spiralReductionFactorLabel.getText();
        array[4][1] = spiralReductionFactorCalculateTen.getText();
        array[5][0] = pipeElongationFactorLabel.getText();
        array[5][1] = pipeElongationFactorCalculateTen.getText();
        array[6][0] = diameterSpiralLabel.getText();
        array[6][1] = diameterSpiralCalculateTen.getText();
        array[7][0] = temperatureSpiralLabel.getText();
        array[7][1] = temperatureSpiralCalculateTen.getText();
        array[8][0] = spiralMaterialLabel.getText();
        array[8][1] = spiralMaterialCalculateTen.getValue() == null ? "" :
                spiralMaterialCalculateTen.getValue();
        array[9][0] = numberOfWiresInASpiralLabel.getText();
        array[9][1] = numberOfWiresInASpiralCalculateTen.getValue() == null ? "" :
                numberOfWiresInASpiralCalculateTen.getValue();
        array[10][0] = mandrelDiameterLabel.getText();
        array[10][1] = mandrelDiameterCalculateTen.getValue() == null ? "" :
                mandrelDiameterCalculateTen.getValue().toString();
        array[11][0] = sandLabel.getText();
        array[11][1] = sandCalculateTen.getValue() == null ? "" :
                sandCalculateTen.getValue();
        array[12][0] = pipeBilletDiameterLabel.getText();
        array[12][1] = pipeBilletDiameterCalculateTen.getValue() == null ? "" :
                pipeBilletDiameterCalculateTen.getValue().toString();
        array[13][0] = pipeThicknessLabel.getText();
        array[13][1] = pipeThicknessCalculateTen.getValue() == null ? "" :
                pipeThicknessCalculateTen.getValue().toString();
        array[14][0] = topStudProtrusionLabel.getText();
        array[14][1] = topStudProtrusionCalculateTen.getValue() == null ? "" :
                topStudProtrusionCalculateTen.getValue().toString();
        array[15][0] = bottomStudProtrusionLabel.getText();
        array[15][1] = bottomStudProtrusionCalculateTen.getValue() == null ? "" :
                bottomStudProtrusionCalculateTen.getValue().toString();
        array[16][0] = topStudContactTypeLabel.getText();
        array[16][1] = topStudContactTypeCalculateTen.getValue() == null ? "" :
                topStudContactTypeCalculateTen.getValue();
        array[17][0] = bottomStudContactTypeLabel.getText();
        array[17][1] = bottomStudContactTypeCalculateTen.getValue() == null ? "" :
                bottomStudContactTypeCalculateTen.getValue();
        array[18][0] = spiralFiringLabel.getText();
        array[18][1] = spiralFiringCalculateTen.getValue() == null ? "" :
                spiralFiringCalculateTen.getValue();
        array[19][0] = gostLabel.getText();
        array[19][1] = gostCalculateTen.getValue() == null ? "" :
                gostCalculateTen.getValue();
        return array;
    }

    @FXML
    private void onInPutProgramWindowShow(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader(InPutProgramWindowApplication.class.
                getResource("inPutProgramWindow.fxml"));
        stage.setScene(new Scene(loader.load()));
        stage.setTitle("Enter to program");
        stage.initModality(WINDOW_MODAL);
        stage.initOwner(((Node) event.getSource()).getScene().getWindow());
        stage.show();
    }

    @FXML
    protected void onDataBaseControllerShow(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader(InPutProgramWindowApplication.class.getResource("dataBase.fxml"));
        stage.setScene(new Scene(loader.load()));
        stage.setTitle("Data base table");
        stage.initModality(WINDOW_MODAL);
        stage.initOwner(((Node) event.getSource()).getScene().getWindow());
        if (!CalculateHeatingElementService.fillingWindow(arrayOfDesignationOfThermalElectricHeater()).
                equals("Errors in the following fields ")) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Error");
            alert.setHeaderText("One of the fields for the designation of a thermal electric heater is not filled");
            alert.showAndWait();
        } else {
            stage.show();
        }
    }

    @FXML
    protected void onFormedCalculateHeatingElementControllerShow(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader(InPutProgramWindowApplication.class.
                getResource("formedCalculateHeatingElement.fxml"));
        stage.setScene(new Scene(loader.load()));
        stage.setTitle("Formed Calculate Heating Element");
        stage.initModality(WINDOW_MODAL);
        stage.initOwner(((Node) event.getSource()).getScene().getWindow());
        if (CalculateHeatingElementService.fillingInitialDataWindow(arrayOfInitialData()).equals("Заполните следующие поля") &&
            CalculateHeatingElementService.fillingWindow(arrayOfDesignationOfThermalElectricHeater()).equals("Заполните следующие поля")) {
            FormedCalculateHeatingElementController formedCalculateHeatingElementController = loader.getController();
            InitialData dateOfCalculate = new InitialData(Double.parseDouble(lengthTenCalculateTen.getText()),
            Double.parseDouble(studLengthCalculateTen.getText()), Double.parseDouble(diameterSpiralCalculateTen.getText()),
            Double.parseDouble(powerTenCalculateTen.getText()), workspaceCalculateTen.getText(), Double.parseDouble(voltageCalculateTen.getText()));
        formedCalculateHeatingElementController.onTransferData(dateOfCalculate);
            stage.show();
        } else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Ошибка");
            alert.setHeaderText(CalculateHeatingElementService.fillingInitialDataWindow(arrayOfInitialData()) +
                    CalculateHeatingElementService.fillingWindow(arrayOfDesignationOfThermalElectricHeater()));
            alert.showAndWait();

        }
    }
}

