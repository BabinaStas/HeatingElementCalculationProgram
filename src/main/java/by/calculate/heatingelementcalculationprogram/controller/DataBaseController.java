package by.calculate.heatingelementcalculationprogram.controller;

import by.calculate.heatingelementcalculationprogram.InPutProgramWindowApplication;
import by.calculate.heatingelementcalculationprogram.domain.initialdatachild.Designation;
import by.calculate.heatingelementcalculationprogram.domain.InitialData;
import by.calculate.heatingelementcalculationprogram.service.DesignationService;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

import static javafx.stage.Modality.WINDOW_MODAL;

public class DataBaseController {

    private ObservableList<InitialData> initialData = FXCollections.observableArrayList();

    @FXML
    private Button backToCalculateDataBase;

    @FXML
    private TableView<Designation> dataBaseTableDatabase;

    @FXML
    private TableColumn<Designation, Double> lengthTen;

    @FXML
    private TableColumn<Designation, Double> studLengthTen;

    @FXML
    private TableColumn<Designation, Double> diameterTen;

    @FXML
    private TableColumn<Designation, Double> powerTen;

    @FXML
    private TableColumn<Designation, String> workspaceTen;

    @FXML
    private TableColumn<Designation, Double> voltageTen;

    @FXML
    private Button generateCalculationDatabase;

    DesignationService designationService = new DesignationService();

    @FXML
    private void initialize() {

        lengthTen.setCellValueFactory(new PropertyValueFactory<Designation, Double>("lengthTen"));
        studLengthTen.setCellValueFactory(new PropertyValueFactory<Designation, Double>("studLengthTen"));
        diameterTen.setCellValueFactory(new PropertyValueFactory<Designation, Double>("diameterTen"));
        powerTen.setCellValueFactory(new PropertyValueFactory<Designation, Double>("powerTen"));
        workspaceTen.setCellValueFactory(new PropertyValueFactory<Designation, String>("workspaceTen"));
        voltageTen.setCellValueFactory(new PropertyValueFactory<Designation, Double>("voltageTen"));

        workspaceTen.setCellFactory(t -> {
            TableCell<Designation, String> cell = new TableCell<>();
            Text text = new Text();
            cell.setGraphic(text);
            cell.setPrefHeight(Control.USE_COMPUTED_SIZE);
            text.wrappingWidthProperty().bind(workspaceTen.widthProperty());
            text.textProperty().bind(cell.itemProperty());
            return cell;
        });

        ObservableList<Designation> designations = FXCollections.observableArrayList();

        designations.addAll(designationService.getDesignations());
        dataBaseTableDatabase.setItems(designations);

    }

/*    @FXML
    protected void onWriteTable() {
        dataBaseTableDatabase.setItems(null);
        dataBaseTableDatabase.setItems(initialData);
    }*/

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
    private void onFormedCalculateHeatingElementControllerShow(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader(InPutProgramWindowApplication.class.getResource("formedCalculateHeatingElement.fxml"));
        stage.setScene(new Scene(loader.load()));
        stage.setTitle("Enter to formed calculate heating element ");
        stage.initModality(WINDOW_MODAL);
        stage.initOwner(((Node) event.getSource()).getScene().getWindow());
        stage.show();
    }

/*    @FXML
    protected void onTransferData(InitialData initialData) {
        dataBaseTableDatabase.getItems().add(initialData);
        ObservableList<InitialData> items = dataBaseTableDatabase.getItems();
        items.add(initialData);
    }*/
}
