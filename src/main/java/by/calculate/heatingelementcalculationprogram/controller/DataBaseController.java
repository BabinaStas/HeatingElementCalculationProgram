package by.calculate.heatingelementcalculationprogram.controller;

import by.calculate.heatingelementcalculationprogram.InPutProgramWindowApplication;
import by.calculate.heatingelementcalculationprogram.model.InitialData;
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
    private TableView<InitialData> dataBaseTableDatabase;

    @FXML
    private TableColumn<InitialData, Double> lengthTen;

    @FXML
    private TableColumn<InitialData, Double> studLengthTen;

    @FXML
    private TableColumn<InitialData, Double> diameterTen;

    @FXML
    private TableColumn<InitialData, Double> powerTen;

    @FXML
    private TableColumn<InitialData, String> workspaceTen;

    @FXML
    private TableColumn<InitialData, Double> voltageTen;

    @FXML
    private Button generateCalculationDatabase;

    @FXML
    private void initialize() {

        lengthTen.setCellValueFactory(new PropertyValueFactory<InitialData, Double>("lengthTen"));
        studLengthTen.setCellValueFactory(new PropertyValueFactory<InitialData, Double>("studLengthTen"));
        diameterTen.setCellValueFactory(new PropertyValueFactory<InitialData, Double>("diameterTen"));
        powerTen.setCellValueFactory(new PropertyValueFactory<InitialData, Double>("powerTen"));
        workspaceTen.setCellValueFactory(new PropertyValueFactory<InitialData, String>("workspaceTen"));
        voltageTen.setCellValueFactory(new PropertyValueFactory<InitialData, Double>("voltageTen"));

        workspaceTen.setCellFactory(t -> {
            TableCell<InitialData, String> cell = new TableCell<>();
            Text text = new Text();
            cell.setGraphic(text);
            cell.setPrefHeight(Control.USE_COMPUTED_SIZE);
            text.wrappingWidthProperty().bind(workspaceTen.widthProperty());
            text.textProperty().bind(cell.itemProperty());
            return cell;
        });

        dataBaseTableDatabase.setItems(initialData);
    }

    @FXML
    protected void onWriteTable() {
        dataBaseTableDatabase.setItems(null);
        dataBaseTableDatabase.setItems(initialData);
    }

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

    @FXML
    protected void onTransferData(InitialData initialData) {
        dataBaseTableDatabase.getItems().add(initialData);
        ObservableList<InitialData> items = dataBaseTableDatabase.getItems();
        items.add(initialData);
    }
}
