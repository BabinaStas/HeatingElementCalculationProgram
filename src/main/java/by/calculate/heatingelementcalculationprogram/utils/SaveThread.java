package by.calculate.heatingelementcalculationprogram.utils;


import by.calculate.heatingelementcalculationprogram.controller.FormedCalculateHeatingElementController;
import by.calculate.heatingelementcalculationprogram.domain.InitialData;
import by.calculate.heatingelementcalculationprogram.service.DesignationService;
import by.calculate.heatingelementcalculationprogram.service.InitialDataServise;
import javafx.collections.ObservableList;

public class SaveThread extends Thread{

    private InitialData initialData;

    public SaveThread(String name, InitialData initialData) {
        super(name);
        this.initialData = initialData;
    }

    @Override
    public void run() {
        InitialDataServise.saveDesignation(initialData);
        System.out.printf("Поток %s сохранился", this.getName());
    }
}
