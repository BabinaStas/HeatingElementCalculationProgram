module by.calculate.heatingelementcalculationprogram {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires java.sql;

    opens by.calculate.heatingelementcalculationprogram to javafx.fxml;
    exports by.calculate.heatingelementcalculationprogram;
    exports by.calculate.heatingelementcalculationprogram.domain;
    exports by.calculate.heatingelementcalculationprogram.controller;
    opens by.calculate.heatingelementcalculationprogram.controller to javafx.fxml;
    exports by.calculate.heatingelementcalculationprogram.domain.initialdatachild;
}