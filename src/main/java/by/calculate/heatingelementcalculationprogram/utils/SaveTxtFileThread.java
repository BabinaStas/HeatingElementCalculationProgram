package by.calculate.heatingelementcalculationprogram.utils;

import by.calculate.heatingelementcalculationprogram.domain.InitialData;
import by.calculate.heatingelementcalculationprogram.service.InitialDataServise;

public class SaveTxtFileThread extends Thread{

    private InitialData initialData;

    public SaveTxtFileThread(String name, InitialData initialData) {
        super(name);
        this.initialData = initialData;
    }

    @Override
    public void run() {
        InitialDataServise.writeText(initialData);
        System.out.printf("Поток %s сохранился", this.getName());
    }
}

