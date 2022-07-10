package by.calculate.heatingelementcalculationprogram.controller;

import by.calculate.heatingelementcalculationprogram.InPutProgramWindowApplication;
import by.calculate.heatingelementcalculationprogram.domain.InitialData;
import by.calculate.heatingelementcalculationprogram.domain.initialdatachild.Designation;
import by.calculate.heatingelementcalculationprogram.service.MethodsElectroPhysicalCalculation;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.util.converter.LocalDateStringConverter;

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
    protected void onTransferData(InitialData initialData) {
        lengthTenFormedCalculateTen.setText(initialData.getDesignation().getLengthTen().toString());
        studLengthFormedCalculateTen.setText(initialData.getDesignation().getStudLengthTen().toString());
        diameterTenFormedCalculateTen.setText(initialData.getDesignation().getDiameterTen().toString());
        powerTenFormedCalculateTen.setText(initialData.getDesignation().getPowerTen().toString());
        workspaceFormedCalculateTen.setText(initialData.getDesignation().getWorkspaceTen());
        voltageFormedCalculateTen.setText(initialData.getDesignation().getVoltageTen().toString());
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
    private void onSaveFormedCalculationTen(ActionEvent event) throws IOException {
        saveDesignation(transferInitialData);
    }

    protected void saveDesignation(InitialData initialData) {

        File fileInitialData = new File("resource\\initialData.dat");

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(fileInitialData));
             ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileInitialData))) {
             objectOutputStream.writeObject(initialData);
             InitialData initialData1 = (InitialData) objectInputStream.readObject();
             System.out.println(initialData1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

