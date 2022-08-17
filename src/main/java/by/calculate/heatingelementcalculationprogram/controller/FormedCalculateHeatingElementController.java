package by.calculate.heatingelementcalculationprogram.controller;

import java.awt.Desktop;
import by.calculate.heatingelementcalculationprogram.InPutProgramWindowApplication;
import by.calculate.heatingelementcalculationprogram.domain.InitialData;
import by.calculate.heatingelementcalculationprogram.domain.initialdatachild.Coefficient;
import by.calculate.heatingelementcalculationprogram.domain.initialdatachild.Customer;
import by.calculate.heatingelementcalculationprogram.domain.initialdatachild.Designation;
import by.calculate.heatingelementcalculationprogram.domain.initialdatachild.Material;
import by.calculate.heatingelementcalculationprogram.service.CustomerService;
import by.calculate.heatingelementcalculationprogram.service.DesignationService;
import by.calculate.heatingelementcalculationprogram.service.FormedCalculateHeatingElementService.WordService;
import by.calculate.heatingelementcalculationprogram.service.InitialDataServise;
import by.calculate.heatingelementcalculationprogram.service.MethodsElectroPhysicalCalculation;
import by.calculate.heatingelementcalculationprogram.utils.SaveThread;
import by.calculate.heatingelementcalculationprogram.utils.SaveTxtFileThread;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;


import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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
    DesignationService designationService = new DesignationService();
    CustomerService customerService = new CustomerService();

    @FXML
    protected void onPopulateDesignation(Designation designation) {
        lengthTenFormedCalculateTen.setText(designation.getLengthTen().toString());
        studLengthFormedCalculateTen.setText(designation.getStudLengthTen().toString());
        diameterTenFormedCalculateTen.setText(designation.getDiameterTen().toString());
        powerTenFormedCalculateTen.setText(designation.getPowerTen().toString());
        workspaceFormedCalculateTen.setText(designation.getWorkspaceTen());
        voltageFormedCalculateTen.setText(designation.getVoltageTen().toString());
    }

    @FXML
    protected void onPopulateCustomer(Customer customer) {
        numberOrderFormedCalculateTen.setText(customer.getNumberOrder());
        customerFormedCalculateTen.setText(customer.getCustomer());
        pilotBatchFormedCalculateTen.setText(customer.getPilotBatch());
        numberOfProductsFormedCalculateTen.setText(customer.getNumberOfProducts().toString());
    }

    @FXML
    protected  void onPopulateCoefficient(Coefficient coefficient) {
        mandrelDiameterSpiralFormedCalculateTen.setText(coefficient.getDiameterSpiral().toString());
        pipeElongationFactorFormedCalculateTen.setText(coefficient.getPipeElongationFactorTen().toString());
        spiralReductionFactorFormedCalculateTen.setText(coefficient.getSpiralReductionFactorTen().toString());
    }

    @FXML
    protected void onPopulateMaterial(Material material) {
        sandFormedCalculateTen.setText(material.getSand());
        spiralMaterialFormedCalculateTen.setText(material.getSpiralMaterialSpiral());
        mandrelDiameterContactFormedCalculateTen.setText(material.getMandrelDiameter().toString());
        specificLoadOnTheWireFormedCalculateTen.setText(material.getSpiralFiring());
        gostFormedCalculateTen.setText(material.getGost());
        topStudContactTypeFormedCalculateTen.setText(material.getTopStudContactType());
        bottomStudContactTypeFormedCalculateTen.setText(material.getBottomStudContactType());
        topStudProtrusionFormedCalculateTen.setText(material.getTopStudProtrusion().toString());
        bottomStudProtrusionFormedCalculateTen.setText(material.getBottomStudProtrusion().toString());
        pipeBilletDiameterFormedCalculateTen.setText(material.getPipeBilletDiameter().toString());
        pipeThicknessFormedCalculateTen.setText(material.getPipeThickness().toString());
    }

    @FXML
    protected void onTransferData(InitialData initialData) {
        dateFormedCalculateTen.setText(String.valueOf(LocalDate.now()));
        onPopulateDesignation(initialData.getDesignation());
        onPopulateCustomer(initialData.getCustomer());
        onPopulateCoefficient(initialData.getCoefficient());
        onPopulateMaterial(initialData.getMaterial());
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
        pipeBlankLengthFormedCalculateTen.setText(MethodsElectroPhysicalCalculation.
                getPipeBlankLengthFormedCalculateTen(initialData).toString());
        transferInitialData = initialData;
    }

    public List<String>  getListOfFormedCalculationForm() {
        List<String> listOfInitialData = new ArrayList<String>();
        listOfInitialData.add(lengthTenFormedCalculateTen.getText());
        listOfInitialData.add(studLengthFormedCalculateTen.getText());
        listOfInitialData.add(diameterTenFormedCalculateTen.getText());
        listOfInitialData.add(powerTenFormedCalculateTen.getText());
        listOfInitialData.add(workspaceFormedCalculateTen.getText());
        listOfInitialData.add(voltageFormedCalculateTen.getText());
        listOfInitialData.add(numberOrderFormedCalculateTen.getText());
        listOfInitialData.add(customerFormedCalculateTen.getText());
        listOfInitialData.add(pilotBatchFormedCalculateTen.getText());
        listOfInitialData.add(numberOfProductsFormedCalculateTen.getText());
        listOfInitialData.add(mandrelDiameterSpiralFormedCalculateTen.getText());
        listOfInitialData.add(pipeElongationFactorFormedCalculateTen.getText());
        listOfInitialData.add(spiralReductionFactorFormedCalculateTen.getText());
        listOfInitialData.add(dateFormedCalculateTen.getText());
        listOfInitialData.add(sandFormedCalculateTen.getText());
        listOfInitialData.add(spiralMaterialFormedCalculateTen.getText());
        listOfInitialData.add(mandrelDiameterContactFormedCalculateTen.getText());
        listOfInitialData.add(specificLoadOnTheWireFormedCalculateTen.getText());
        listOfInitialData.add(gostFormedCalculateTen.getText());
        listOfInitialData.add(topStudContactTypeFormedCalculateTen.getText());
        listOfInitialData.add(bottomStudContactTypeFormedCalculateTen.getText());
        listOfInitialData.add(topStudProtrusionFormedCalculateTen.getText());
        listOfInitialData.add(bottomStudProtrusionFormedCalculateTen.getText());
        listOfInitialData.add(pipeBilletDiameterFormedCalculateTen.getText());
        listOfInitialData.add(pipeThicknessFormedCalculateTen.getText());
        listOfInitialData.add(lengthContanctFormedCalculateTen.getText());
        listOfInitialData.add(heatingElementResistanceFormedCalculateTen.getText());
        listOfInitialData.add(permissibleResistanceRangeForTheHeatingElementFormedCalculateTen.getText());
        listOfInitialData.add(lengthOfTheCompressedSpiralFormedCalculateTen.getText());
        listOfInitialData.add(totalWireLengthFormedCalculateTen.getText());
        listOfInitialData.add(lengthOfTheActivePartFormedCalculateTen.getText());
        listOfInitialData.add(pipeBlankLengthFormedCalculateTen.getText());
        return listOfInitialData;
    }

    @FXML
    private void onPrintFormedCalculationTen(ActionEvent event) throws IOException {
        WordService.getWord(getListOfFormedCalculationForm());
        try {
            if (Desktop.isDesktopSupported()) {
                Desktop.getDesktop().open(new File("resource\\printCalculation.docx"));
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        SaveTxtFileThread saveTxtFileThread =  new SaveTxtFileThread("Save Txt File ", transferInitialData);
        saveTxtFileThread.start();
        InitialDataServise.writeText(transferInitialData);

    }

    @FXML
    private void onSaveFormedCalculationTen(ActionEvent event) throws IOException {
        designationService.insertOne(transferInitialData.getDesignation());
        customerService.insertOne(transferInitialData.getCustomer());
        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader(InPutProgramWindowApplication.class.getResource("dataBaseDesignation.fxml"));
        stage.setScene(new Scene(loader.load()));
        stage.setTitle("Enter to data base ");
        stage.initModality(WINDOW_MODAL);
        stage.initOwner(((Node) event.getSource()).getScene().getWindow());
        stage.show();
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
    private void onDataBaseControllerShow(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        SaveThread saveThread = new SaveThread("Save Thread", transferInitialData);
        saveThread.start();
        FXMLLoader loader = new FXMLLoader(InPutProgramWindowApplication.class.getResource("dataBaseDesignation.fxml"));
        stage.setScene(new Scene(loader.load()));
        stage.setTitle("Enter to data base ");
        stage.initModality(WINDOW_MODAL);
        stage.initOwner(((Node) event.getSource()).getScene().getWindow());
        stage.show();
    }
}

