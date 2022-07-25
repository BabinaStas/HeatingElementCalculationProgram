package by.calculate.heatingelementcalculationprogram.service;

import by.calculate.heatingelementcalculationprogram.domain.InitialData;

import java.io.*;

public class InitialDataServise {

    public static void saveDesignation(InitialData initialData) {

        File fileInitialData = new File("resource\\InitialData.dat");

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(fileInitialData));
             ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileInitialData))) {
            objectOutputStream.writeObject(initialData);
            InitialData initialData1 = (InitialData) objectInputStream.readObject();
            System.out.println(initialData1);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void writeText(InitialData initialData) {
        String dest = "resource\\InitialData.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(dest), 4)) {
            writer.write(initialData.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
