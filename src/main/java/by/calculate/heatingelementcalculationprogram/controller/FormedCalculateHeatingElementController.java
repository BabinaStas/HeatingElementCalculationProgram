package by.calculate.heatingelementcalculationprogram.controller;

import by.calculate.heatingelementcalculationprogram.InPutProgramWindowApplication;
import by.calculate.heatingelementcalculationprogram.domain.InitialData;
import by.calculate.heatingelementcalculationprogram.domain.initialdatachild.Designation;
import by.calculate.heatingelementcalculationprogram.service.DesignationService;
import by.calculate.heatingelementcalculationprogram.service.InitialDataServise;
import by.calculate.heatingelementcalculationprogram.service.MethodsElectroPhysicalCalculation;
import by.calculate.heatingelementcalculationprogram.utils.SaveThread;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;


import java.io.*;
import java.util.Date;

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
    private Label mandrelDiameterSpiralFormedCalculateTen;

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

    InitialData transferInitialData;
    Designation transferDesignation;
    DesignationService designationService = new DesignationService();

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
        SaveThread saveThread = new SaveThread("Save Thread", transferInitialData);
        saveThread.start();
        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader(InPutProgramWindowApplication.class.getResource("dataBaseDesignation.fxml"));
        stage.setScene(new Scene(loader.load()));
        stage.setTitle("Enter to data base ");
        stage.initModality(WINDOW_MODAL);
        stage.initOwner(((Node) event.getSource()).getScene().getWindow());
        stage.show();
    }

    @FXML
    protected void  onPopulateDesignation(Designation designation) {
        lengthTenFormedCalculateTen.setText(designation.getLengthTen().toString());
        studLengthFormedCalculateTen.setText(designation.getStudLengthTen().toString());
        diameterTenFormedCalculateTen.setText(designation.getDiameterTen().toString());
        powerTenFormedCalculateTen.setText(designation.getPowerTen().toString());
        workspaceFormedCalculateTen.setText(designation.getWorkspaceTen());
        voltageFormedCalculateTen.setText(designation.getVoltageTen().toString());
/*        transferDesignation = designation;*/

    }

    @FXML
    protected void onTransferData(InitialData initialData) {
        onPopulateDesignation(initialData.getDesignation());
/*        lengthTenFormedCalculateTen.setText(initialData.getDesignation().getLengthTen().toString());
        studLengthFormedCalculateTen.setText(initialData.getDesignation().getStudLengthTen().toString());
        diameterTenFormedCalculateTen.setText(initialData.getDesignation().getDiameterTen().toString());
        powerTenFormedCalculateTen.setText(initialData.getDesignation().getPowerTen().toString());
        workspaceFormedCalculateTen.setText(initialData.getDesignation().getWorkspaceTen());
        voltageFormedCalculateTen.setText(initialData.getDesignation().getVoltageTen().toString());*/
        numberOrderFormedCalculateTen.setText(initialData.getCustomer().getNumberOrder());
        dateFormedCalculateTen.setText(String.valueOf(new Date()));
        customerFormedCalculateTen.setText(initialData.getCustomer().getCustomer());
        pilotBatchFormedCalculateTen.setText(initialData.getCustomer().getPilotBatch());
        numberOfProductsFormedCalculateTen.setText(initialData.getCustomer().getNumberOfProducts());
        sandFormedCalculateTen.setText(initialData.getMaterial().getSand());
        spiralMaterialFormedCalculateTen.setText(initialData.getMaterial().getSpiralMaterialSpiral());
        mandrelDiameterContactFormedCalculateTen.setText(initialData.getMaterial().getMandrelDiameter().toString());
        mandrelDiameterSpiralFormedCalculateTen.setText(initialData.getCoefficient().getDiameterSpiral().toString());
        lengthContanctFormedCalculateTen.setText(MethodsElectroPhysicalCalculation.getLengthContact(initialData).toString());
        heatingElementResistanceFormedCalculateTen.setText(MethodsElectroPhysicalCalculation.
                getHeatingElementResistance(initialData).toString());
        permissibleResistanceRangeForTheHeatingElementFormedCalculateTen.setText(MethodsElectroPhysicalCalculation.
                getPermissibleResistanceRangeForTheHeatingElement(initialData));
        lengthOfTheCompressedSpiralFormedCalculateTen.setText(MethodsElectroPhysicalCalculation.
                getLengthOfTheCompressedSpiral(initialData).toString());
        totalWireLengthFormedCalculateTen.setText(MethodsElectroPhysicalCalculation.
                getTotalWireLengthFormedCalculateTen(initialData).toString());
        lengthOfTheActivePartFormedCalculateTen.setText(MethodsElectroPhysicalCalculation.getLongActivePart(initialData).toString());
        specificLoadOnTheWireFormedCalculateTen.setText(MethodsElectroPhysicalCalculation.
                getSpecificLoadOnTheWire(initialData).toString());
        pipeBilletDiameterFormedCalculateTen.setText(initialData.getMaterial().getPipeBilletDiameter().toString());
        pipeThicknessFormedCalculateTen.setText(initialData.getMaterial().getPipeThickness().toString());
        pipeBlankLengthFormedCalculateTen.setText(MethodsElectroPhysicalCalculation.
                getPipeBlankLengthFormedCalculateTen(initialData).toString());
        pipeElongationFactorFormedCalculateTen.setText(initialData.getCoefficient().getPipeElongationFactorTen().toString());
        spiralReductionFactorFormedCalculateTen.setText(initialData.getCoefficient().getSpiralReductionFactorTen().toString());
        specificLoadOnTheWireFormedCalculateTen.setText(initialData.getMaterial().getSpiralFiring());
        gostFormedCalculateTen.setText(initialData.getMaterial().getGost());
        topStudContactTypeFormedCalculateTen.setText(initialData.getMaterial().getTopStudContactType());
        bottomStudContactTypeFormedCalculateTen.setText(initialData.getMaterial().getBottomStudContactType());
        topStudProtrusionFormedCalculateTen.setText(initialData.getMaterial().getTopStudProtrusion().toString());
        bottomStudProtrusionFormedCalculateTen.setText(initialData.getMaterial().getBottomStudProtrusion().toString());
        transferInitialData = initialData;
    }

    @FXML
    private void onPrintFormedCalculationTen(ActionEvent event) throws IOException {
        InitialDataServise.writeText(transferInitialData);
    }

    @FXML
    private void onSaveFormedCalculationTen(ActionEvent event) throws IOException {
        designationService.insertOne(transferInitialData.getDesignation());
        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader(InPutProgramWindowApplication.class.getResource("dataBaseDesignation.fxml"));
        stage.setScene(new Scene(loader.load()));
        stage.setTitle("Enter to data base ");
        stage.initModality(WINDOW_MODAL);
        stage.initOwner(((Node) event.getSource()).getScene().getWindow());

        stage.show();
    }


}

