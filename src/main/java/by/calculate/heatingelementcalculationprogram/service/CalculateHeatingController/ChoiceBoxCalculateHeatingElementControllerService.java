package by.calculate.heatingelementcalculationprogram.service.CalculateHeatingController;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.List;

public class ChoiceBoxCalculateHeatingElementControllerService {

    public static ObservableList<String> getChoiceBoxListPilotBatchCalculateTen(){
        List<String> choiceBoxListPilotBatchCalculateTen = new ArrayList<>();
        choiceBoxListPilotBatchCalculateTen.add("Опытная партия");
        choiceBoxListPilotBatchCalculateTen.add("Основное производство");
        choiceBoxListPilotBatchCalculateTen.add("Мелко-серийное производсто");
        ObservableList<String> listPilotBatchCalculateTen =
                FXCollections.observableArrayList(choiceBoxListPilotBatchCalculateTen);
        return listPilotBatchCalculateTen;
    }

    public static ObservableList<String> getChoiceBoxListSpiralMaterialCalculateTen(){
        List<String> choiceBoxListSpiralMaterialCalculateTen = new ArrayList<>();
        choiceBoxListSpiralMaterialCalculateTen.add("20Х80Н10Т");
        choiceBoxListSpiralMaterialCalculateTen.add("Х23Ю5Т");
        ObservableList<String> listSpiralMaterialCalculateTen =
                FXCollections.observableArrayList(choiceBoxListSpiralMaterialCalculateTen);
        return listSpiralMaterialCalculateTen;
    }

    public static ObservableList<String> getChoiceBoxListNumberOfWiresInASpiralCalculateTen(){
        List<String> choiceBoxListNumberOfWiresInASpiralCalculateTen = new ArrayList<>();
        choiceBoxListNumberOfWiresInASpiralCalculateTen.add("Одиночная");
        choiceBoxListNumberOfWiresInASpiralCalculateTen.add("Двойная");
        choiceBoxListNumberOfWiresInASpiralCalculateTen.add("Тройная");
        choiceBoxListNumberOfWiresInASpiralCalculateTen.add("Четверная");
        ObservableList<String> listNumberOfWiresInASpiralCalculateTen =
                FXCollections.observableArrayList(choiceBoxListNumberOfWiresInASpiralCalculateTen);
        return listNumberOfWiresInASpiralCalculateTen;
    }

    public static ObservableList<Double> getChoiceBoxListMandrelDiameterCalculateTen(){
        List<Double> choiceBoxListMandrelDiameterCalculateTen = new ArrayList<>();
        choiceBoxListMandrelDiameterCalculateTen.add(2.5);
        choiceBoxListMandrelDiameterCalculateTen.add(3.2);
        ObservableList<Double> listMandrelDiameterCalculateTen =
                FXCollections.observableArrayList(choiceBoxListMandrelDiameterCalculateTen);
        return listMandrelDiameterCalculateTen;
    }

    public static ObservableList<String> getChoiceBoxListSandCalculateTen(){
        List<String> choiceBoxListSandCalculateTen = new ArrayList<>();
        choiceBoxListSandCalculateTen.add("Переклаз Богдановичский 2К");
        choiceBoxListSandCalculateTen.add("Переклаз Богдановичский 2М");
        ObservableList<String> listSandCalculateTen =
                FXCollections.observableArrayList(choiceBoxListSandCalculateTen);
        return listSandCalculateTen;
    }

    public static ObservableList<Double> getChoiceBoxListPipeBilletDiameterCalculateTen(){
        List<Double> choiceBoxListPipeBilletDiameterCalculateTen = new ArrayList<>();
        choiceBoxListPipeBilletDiameterCalculateTen.add(10.0);
        choiceBoxListPipeBilletDiameterCalculateTen.add(12.0);
        ObservableList<Double> listPipeBilletDiameterCalculateTen =
                FXCollections.observableArrayList(choiceBoxListPipeBilletDiameterCalculateTen);
        return listPipeBilletDiameterCalculateTen;
    }

    public static ObservableList<Double> getChoiceBoxListPipeThicknessCalculateTen(){
        List<Double> choiceBoxListPipeThicknessCalculateTen = new ArrayList<>();
        choiceBoxListPipeThicknessCalculateTen.add(0.4);
        choiceBoxListPipeThicknessCalculateTen.add(0.5);
        choiceBoxListPipeThicknessCalculateTen.add(0.6);
        choiceBoxListPipeThicknessCalculateTen.add(0.8);
        choiceBoxListPipeThicknessCalculateTen.add(1.0);
        ObservableList<Double> listPipeThicknessCalculateTen =
                FXCollections.observableArrayList(choiceBoxListPipeThicknessCalculateTen);
        return listPipeThicknessCalculateTen;
    }

    public static ObservableList<Integer> getChoiceBoxListTopStudProtrusionCalculateTen(){
        List<Integer> choiceBoxListTopStudProtrusionCalculateTen = new ArrayList<>();
        choiceBoxListTopStudProtrusionCalculateTen.add(15);
        choiceBoxListTopStudProtrusionCalculateTen.add(25);
        choiceBoxListTopStudProtrusionCalculateTen.add(28);
        choiceBoxListTopStudProtrusionCalculateTen.add(35);
        choiceBoxListTopStudProtrusionCalculateTen.add(38);
        ObservableList<Integer> listTopStudProtrusionCalculateTen =
                FXCollections.observableArrayList(choiceBoxListTopStudProtrusionCalculateTen);
        return listTopStudProtrusionCalculateTen;
    }

    public static ObservableList<Double> getChoiceBoxListBottomStudProtrusionCalculateTen(){
        List<Double> choiceBoxListBottomStudProtrusionCalculateTen = new ArrayList<>();
        choiceBoxListBottomStudProtrusionCalculateTen.add(10.0);
        choiceBoxListBottomStudProtrusionCalculateTen.add(20.0);
        choiceBoxListBottomStudProtrusionCalculateTen.add(30.0);
        ObservableList<Double> listBottomStudProtrusionCalculateTen =
                FXCollections.observableArrayList(choiceBoxListBottomStudProtrusionCalculateTen);
        return listBottomStudProtrusionCalculateTen;
    }

    public static ObservableList<String> getChoiceBoxListTopStudContactTypeCalculateTen(){
        List<String> choiceBoxListTopStudContactTypeCalculateTen = new ArrayList<>();
        choiceBoxListTopStudContactTypeCalculateTen.add("Верх 2.0/2,65/    /М3");
        choiceBoxListTopStudContactTypeCalculateTen.add("Верх 2.0/М3/    /М3");
        choiceBoxListTopStudContactTypeCalculateTen.add("Верх 2.0/М4/    /М3");
        choiceBoxListTopStudContactTypeCalculateTen.add("Верх 2.0/М4/    /М4");
        ObservableList<String> listTopStudContactTypeCalculateTen =
                FXCollections.observableArrayList(choiceBoxListTopStudContactTypeCalculateTen);
        return listTopStudContactTypeCalculateTen;
    }

    public static ObservableList<String> getChoiceBoxListBottomStudContactTypeCalculateTen(){
        List<String> choiceBoxListBottomStudContactTypeCalculateTen = new ArrayList<>();
        choiceBoxListBottomStudContactTypeCalculateTen.add("Низ 2,65/    /10/М3");
        choiceBoxListBottomStudContactTypeCalculateTen.add("Низ 2,65/    /20/М3");
        choiceBoxListBottomStudContactTypeCalculateTen.add("Низ М3/    /М3");
        choiceBoxListBottomStudContactTypeCalculateTen.add("Низ М4/    /М3");
        choiceBoxListBottomStudContactTypeCalculateTen.add("Низ М4/    /М4");
        ObservableList<String> listBottomStudContactTypeCalculateTen =
                FXCollections.observableArrayList(choiceBoxListBottomStudContactTypeCalculateTen);
        return listBottomStudContactTypeCalculateTen;
    }

    public static ObservableList<String> getChoiceBoxListSpiralFiringCalculateTen(){
        List<String> choiceBoxListSpiralFiringCalculateTen = new ArrayList<>();
        choiceBoxListSpiralFiringCalculateTen.add("Да");
        choiceBoxListSpiralFiringCalculateTen.add("Нет");
        ObservableList<String> listSpiralFiringCalculateTen =
                FXCollections.observableArrayList(choiceBoxListSpiralFiringCalculateTen);
        return listSpiralFiringCalculateTen;
    }

    public static ObservableList<String> getChoiceBoxListGostCalculateTen(){
        List<String> choiceBoxListGostCalculateTen = new ArrayList<>();
        choiceBoxListGostCalculateTen.add("ГОСТ-13286-83");
        choiceBoxListGostCalculateTen.add("ГОСТ-13286-81");
        ObservableList<String> listGostCalculateTen =
                FXCollections.observableArrayList(choiceBoxListGostCalculateTen);
        return listGostCalculateTen;
    }
}
