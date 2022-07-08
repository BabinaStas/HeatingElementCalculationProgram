package by.calculate.heatingelementcalculationprogram.controller;

import by.calculate.heatingelementcalculationprogram.InPutProgramWindowApplication;
import by.calculate.heatingelementcalculationprogram.domain.InitialData;
import by.calculate.heatingelementcalculationprogram.domain.initialdatachild.Designation;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.*;

import static javafx.stage.Modality.WINDOW_MODAL;

public class FormedCalculateHeatingElementController {


    @FXML
    private Button backToCalculationFormedCalculationTen;

    @FXML
    private Label bottomStudContactTypeFormedCalculateTen;

    @FXML
    private Label bottomStudProtrusionFormedCalculateTen;

    @FXML
    private Label lengthOfTheActivePartFormedCalculateTen;

    @FXML
    private Label customerFormedCalculateTen;

    @FXML
    private Label dateFormedCalculateTen;

    @FXML
    private Label diameterTenFormedCalculateTen;

    @FXML
    private Button goToBaseFormedCalculationTen;

    @FXML
    private Label gostFormedCalculateTen;

    @FXML
    private Label heatingElementResistanceFormedCalculateTen;

    @FXML
    private Label lengthContanctFormedCalculateTen;

    @FXML
    private Label lengthOfTheCompressedSpiralFormedCalculateTen;

    @FXML
    private Label lengthTenFormedCalculateTen;

    @FXML
    private Label mandrelDiameterFormedCalculateTen;

    @FXML
    private Label mandrelDiameterContactFormedCalculateTen;

    @FXML
    private Label numberOfProductsFormedCalculateTen;

    @FXML
    private Label numberOrderFormedCalculateTen;

    @FXML
    private Label pilotBatchFormedCalculateTen;

    @FXML
    private Label pipeBilletDiameterFormedCalculateTen;

    @FXML
    private Label pipeBlankLengthFormedCalculateTen;

    @FXML
    private Label pipeElongationFactorFormedCalculateTen;

    @FXML
    private Label pipeThicknessFormedCalculateTen;

    @FXML
    private Label powerTenFormedCalculateTen;

    @FXML
    private Button printFormedCalculationTen;

    @FXML
    private Label sandFormedCalculateTen;

    @FXML
    private Button saveFormedCalculationTen;

    @FXML
    private Label spiralFiringFormedCalculateTen;

    @FXML
    private Label spiralMaterialFormedCalculateTen;

    @FXML
    private Label spiralReductionFactorFormedCalculateTen;

    @FXML
    private Label studLengthFormedCalculateTen;

    @FXML
    private Label specificLoadOnTheWireFormedCalculateTen;

    @FXML
    private Label topStudContactTypeFormedCalculateTen;

    @FXML
    private Label topStudProtrusionFormedCalculateTen;

    @FXML
    private Label totalWireLengthFormedCalculateTen;

    @FXML
    private Label voltageFormedCalculateTen;

    @FXML
    private Label workspaceFormedCalculateTen;

    @FXML
    private Label permissibleResistanceRangeForTheHeatingElementFormedCalculateTen;

    Designation transferDesignation;

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

    @FXML
    protected void onTransferData(Designation designation) {
        lengthTenFormedCalculateTen.setText(designation.getLengthTen().toString());
        studLengthFormedCalculateTen.setText(designation.getStudLengthTen().toString());
        diameterTenFormedCalculateTen.setText(designation.getDiameterTen().toString());
        powerTenFormedCalculateTen.setText(designation.getPowerTen().toString());
        workspaceFormedCalculateTen.setText(designation.getWorkspaceTen());
        voltageFormedCalculateTen.setText(designation.getVoltageTen().toString());
        transferDesignation = designation;
    }

    @FXML
    private void onSaveFormedCalculationTen(ActionEvent event) throws IOException {
        saveDesignation(transferDesignation);
    }

    protected void saveDesignation(Designation designation) {

        File fileInitialData = new File("resource\\initialData.dat");

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(fileInitialData));
             ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileInitialData))) {
             objectOutputStream.writeObject(designation);
             Designation designation1 = (Designation) objectInputStream.readObject();
             System.out.println(designation1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

