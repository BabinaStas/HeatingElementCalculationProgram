package by.calculate.heatingelementcalculationprogram.controller;


import by.calculate.heatingelementcalculationprogram.InPutProgramWindowApplication;
import by.calculate.heatingelementcalculationprogram.model.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

import static javafx.stage.Modality.WINDOW_MODAL;


public class InPutProgramWindowController {

    @FXML
    private Button inputButtonProgramWindow;

    @FXML
    private TextField loginTextFieldProgramWindow;

    @FXML
    private PasswordField passwordTextFieldProgramWindow;

    private User[] users;


    @FXML
    private void initialize() {
        users = new User[3];
        users[0] = new User("OGT1","123");
        users[1] = new User("OGT2","456");
        users[2] = new User("OGT3","789");
    }

    @FXML
    private void inPutButton(ActionEvent event) throws IOException {
        boolean isFind = false;
        User person = new User(loginTextFieldProgramWindow.getText(), passwordTextFieldProgramWindow.getText());
        for (User user : users)
            if (user.equals(person)) {
                isFind = true;
                onTableWindowShow(event);
                break;
            }
    }

    private void onTableWindowShow(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader(InPutProgramWindowApplication.class.getResource("calculateHeatingElement.fxml"));
        stage.setScene(new Scene(loader.load()));
        stage.setTitle("Table");
        stage.initModality(WINDOW_MODAL);
        stage.initOwner(((Node)event.getSource()).getScene().getWindow());
        if (!RegistrationControllerService.fillingWindow(arrayOfRegistrationElements()).equals("Errors in the following fields ")) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Error");
            alert.setHeaderText(RegistrationControllerService.fillingWindow(arrayOfRegistrationElements()));
            alert.showAndWait();
        }else {
            TableController tableController = loader.getController();
            Person newPerson = new Person(nameTextField.getText(),surNameTextField.getText(),onClickRadioButton(event),
                    addressTextField.getText(),positionComboBox.getValue(), birthdayDate.getValue(),
                    Integer.parseInt(wageTextField.getText().trim()));
            tableController.onTransferData(newPerson);
            stage.show();
/*        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader(inPutProgramWindowApplication.class.getResource("calculateHeatingElement.fxml"));
        stage.setScene(new Scene(loader.load()));
        stage.setTitle("Calculate Heating Element");
        stage.initModality(WINDOW_MODAL);
        stage.initOwner(((Node)event.getSource()).getScene().getWindow());
        stage.show();*/
    }
}
