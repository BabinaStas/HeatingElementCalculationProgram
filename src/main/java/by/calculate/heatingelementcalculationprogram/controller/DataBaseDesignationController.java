package by.calculate.heatingelementcalculationprogram.controller;

import by.calculate.heatingelementcalculationprogram.InPutProgramWindowApplication;
import by.calculate.heatingelementcalculationprogram.domain.initialdatachild.Designation;
import by.calculate.heatingelementcalculationprogram.domain.InitialData;
import by.calculate.heatingelementcalculationprogram.service.DatabaseDesigantionController.AlertDataBaseService;
import by.calculate.heatingelementcalculationprogram.service.DatabaseDesigantionController.ChoiceBoxDataBaseDesignationController;
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
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static javafx.stage.Modality.WINDOW_MODAL;

public class DataBaseDesignationController {

    private ObservableList<InitialData> initialData = FXCollections.observableArrayList();

    @FXML
    public Button onChangeControllerDataBase;

    @FXML
    private Button backToCalculateDataBase;

    @FXML
    private TableView<Designation> dataBaseTableDataBase;

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

    @FXML
    private ChoiceBox<String> searchOfDesignation;

    @FXML
    private Button searchDataBase;

    @FXML
    private TextField searchTextFieldDataBase;

    @FXML
    private ActionEvent event;

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
        dataBaseTableDataBase.setItems(designations);
        searchOfDesignation.setItems(ChoiceBoxDataBaseDesignationController.getChoiceBoxListSearch());
    }

    @FXML
    protected void onRemoveRow() {
        int row = dataBaseTableDataBase.getSelectionModel().getFocusedIndex();
        boolean isGetField = dataBaseTableDataBase.getSelectionModel().isSelected(0);
        if(row == 0 && !isGetField) {
            AlertDataBaseService.getAlert();
        } else {
            Designation selectDesignation = dataBaseTableDataBase.getItems().get(row);
            dataBaseTableDataBase.getItems().remove(selectDesignation);
            designationService.deleteById(selectDesignation.getId());
        }
    }

    @FXML
    protected void onUpdate(ActionEvent event) throws IOException {
        this.event = event;
        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader(InPutProgramWindowApplication.class.getResource("calculateHeatingElement.fxml"));
        stage.setScene(new Scene(loader.load()));
        stage.setTitle("Enter to calculate heating element ");
        stage.initModality(WINDOW_MODAL);
        stage.initOwner(((Node) event.getSource()).getScene().getWindow());
        CalculateHeatingElementController calculateHeatingElementController = loader.getController();
        int row = dataBaseTableDataBase.getSelectionModel().getFocusedIndex();
        boolean isGetField = dataBaseTableDataBase.getSelectionModel().isSelected(0);
        if(row == 0 && !isGetField) {
            AlertDataBaseService.getAlert();
        } else {
            Designation upDateDesignation = dataBaseTableDataBase.getItems().get(row);
            calculateHeatingElementController.onTransferData(upDateDesignation);
            stage.show();
        }
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
        FormedCalculateHeatingElementController formedCalculateHeatingElementController = loader.getController();
        int row = dataBaseTableDataBase.getSelectionModel().getFocusedIndex();
        boolean isGetField = dataBaseTableDataBase.getSelectionModel().isSelected(0);
        if(row == 0 && !isGetField) {
            AlertDataBaseService.getAlert();
        }else {
            Designation designation = dataBaseTableDataBase.getItems().get(row);
            formedCalculateHeatingElementController.onPopulateDesignation(designation);
            stage.show();
        }
    }

    @FXML
    private void onGetDataFilter() {
        Predicate<Designation> filter = switch (searchOfDesignation.getValue()) {
            case "Длинна" -> x -> x.getLengthTen() == Double.parseDouble(searchTextFieldDataBase.getText());
            case "Длинна заделки" -> x -> x.getStudLengthTen() == Double.parseDouble(searchTextFieldDataBase.getText());
            case "Диаметр" -> x -> x.getDiameterTen() == Double.parseDouble(searchTextFieldDataBase.getText());
            case "Мощность" -> x -> x.getPowerTen() == Double.parseDouble(searchTextFieldDataBase.getText());
            case "Среда" -> x -> x.getWorkspaceTen().equals(searchTextFieldDataBase.getText());
            case "Напряжение" -> x -> x.getVoltageTen() == Double.parseDouble(searchTextFieldDataBase.getText());
            default -> x -> true;
        };
        List<Designation> collect = dataBaseTableDataBase.getItems().stream()
                .filter(filter)
                .collect(Collectors.toList());
        ObservableList<Designation> designations = FXCollections.observableArrayList();
        designations.addAll(collect);
        dataBaseTableDataBase.setItems(designations);
    }
}
