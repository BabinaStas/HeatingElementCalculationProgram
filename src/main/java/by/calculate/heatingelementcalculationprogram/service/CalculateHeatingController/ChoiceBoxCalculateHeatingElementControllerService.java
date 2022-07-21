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
        return FXCollections.observableArrayList(choiceBoxListPilotBatchCalculateTen);
    }

    public static ObservableList<String> getChoiceBoxListSpiralMaterialCalculateTen(){
        List<String> choiceBoxListSpiralMaterialCalculateTen = new ArrayList<>();
        choiceBoxListSpiralMaterialCalculateTen.add("20Х80Н10Т");
        choiceBoxListSpiralMaterialCalculateTen.add("Х23Ю5Т");
        return FXCollections.observableArrayList(choiceBoxListSpiralMaterialCalculateTen);
    }

    public static ObservableList<String> getChoiceBoxListNumberOfWiresInASpiralCalculateTen(){
        List<String> choiceBoxListNumberOfWiresInASpiralCalculateTen = new ArrayList<>();
        choiceBoxListNumberOfWiresInASpiralCalculateTen.add("Одиночная");
        choiceBoxListNumberOfWiresInASpiralCalculateTen.add("Двойная");
        choiceBoxListNumberOfWiresInASpiralCalculateTen.add("Тройная");
        choiceBoxListNumberOfWiresInASpiralCalculateTen.add("Четверная");
        return FXCollections.observableArrayList(choiceBoxListNumberOfWiresInASpiralCalculateTen);
    }

    public static ObservableList<Double> getChoiceBoxListMandrelDiameterCalculateTen(){
        List<Double> choiceBoxListMandrelDiameterCalculateTen = new ArrayList<>();
        choiceBoxListMandrelDiameterCalculateTen.add(2.5);
        choiceBoxListMandrelDiameterCalculateTen.add(3.2);
        return FXCollections.observableArrayList(choiceBoxListMandrelDiameterCalculateTen);
    }

    public static ObservableList<String> getChoiceBoxListSandCalculateTen(){
        List<String> choiceBoxListSandCalculateTen = new ArrayList<>();
        choiceBoxListSandCalculateTen.add("Переклаз Богдановичский 2К");
        choiceBoxListSandCalculateTen.add("Переклаз Богдановичский 2М");
        return FXCollections.observableArrayList(choiceBoxListSandCalculateTen);
    }

    public static ObservableList<Double> getChoiceBoxListPipeBilletDiameterCalculateTen(){
        List<Double> choiceBoxListPipeBilletDiameterCalculateTen = new ArrayList<>();
        choiceBoxListPipeBilletDiameterCalculateTen.add(10.0);
        choiceBoxListPipeBilletDiameterCalculateTen.add(12.0);
        return FXCollections.observableArrayList(choiceBoxListPipeBilletDiameterCalculateTen);
    }

    public static ObservableList<Double> getChoiceBoxListPipeThicknessCalculateTen(){
        List<Double> choiceBoxListPipeThicknessCalculateTen = new ArrayList<>();
        choiceBoxListPipeThicknessCalculateTen.add(0.4);
        choiceBoxListPipeThicknessCalculateTen.add(0.5);
        choiceBoxListPipeThicknessCalculateTen.add(0.6);
        choiceBoxListPipeThicknessCalculateTen.add(0.8);
        choiceBoxListPipeThicknessCalculateTen.add(1.0);
        return FXCollections.observableArrayList(choiceBoxListPipeThicknessCalculateTen);
    }

    public static ObservableList<Double> getChoiceBoxListTopStudProtrusionCalculateTen(){
        List<Double> choiceBoxListTopStudProtrusionCalculateTen = new ArrayList<>();
        choiceBoxListTopStudProtrusionCalculateTen.add(15.0);
        choiceBoxListTopStudProtrusionCalculateTen.add(25.0);
        choiceBoxListTopStudProtrusionCalculateTen.add(28.0);
        choiceBoxListTopStudProtrusionCalculateTen.add(35.0);
        choiceBoxListTopStudProtrusionCalculateTen.add(38.0);
        return FXCollections.observableArrayList(choiceBoxListTopStudProtrusionCalculateTen);
    }

    public static ObservableList<Double> getChoiceBoxListBottomStudProtrusionCalculateTen(){
        List<Double> choiceBoxListBottomStudProtrusionCalculateTen = new ArrayList<>();
        choiceBoxListBottomStudProtrusionCalculateTen.add(10.0);
        choiceBoxListBottomStudProtrusionCalculateTen.add(20.0);
        choiceBoxListBottomStudProtrusionCalculateTen.add(30.0);
        return FXCollections.observableArrayList(choiceBoxListBottomStudProtrusionCalculateTen);
    }

    public static ObservableList<String> getChoiceBoxListTopStudContactTypeCalculateTen(){
        List<String> choiceBoxListTopStudContactTypeCalculateTen = new ArrayList<>();
        choiceBoxListTopStudContactTypeCalculateTen.add("Верх 2.0/2,65/    /М3");
        choiceBoxListTopStudContactTypeCalculateTen.add("Верх 2.0/М3/    /М3");
        choiceBoxListTopStudContactTypeCalculateTen.add("Верх 2.0/М4/    /М3");
        choiceBoxListTopStudContactTypeCalculateTen.add("Верх 2.0/М4/    /М4");
        return FXCollections.observableArrayList(choiceBoxListTopStudContactTypeCalculateTen);
    }

    public static ObservableList<String> getChoiceBoxListBottomStudContactTypeCalculateTen(){
        List<String> choiceBoxListBottomStudContactTypeCalculateTen = new ArrayList<>();
        choiceBoxListBottomStudContactTypeCalculateTen.add("Низ 2,65/    /10/М3");
        choiceBoxListBottomStudContactTypeCalculateTen.add("Низ 2,65/    /20/М3");
        choiceBoxListBottomStudContactTypeCalculateTen.add("Низ М3/    /М3");
        choiceBoxListBottomStudContactTypeCalculateTen.add("Низ М4/    /М3");
        choiceBoxListBottomStudContactTypeCalculateTen.add("Низ М4/    /М4");
        return FXCollections.observableArrayList(choiceBoxListBottomStudContactTypeCalculateTen);
    }

    public static ObservableList<String> getChoiceBoxListSpiralFiringCalculateTen(){
        List<String> choiceBoxListSpiralFiringCalculateTen = new ArrayList<>();
        choiceBoxListSpiralFiringCalculateTen.add("Да");
        choiceBoxListSpiralFiringCalculateTen.add("Нет");
        return FXCollections.observableArrayList(choiceBoxListSpiralFiringCalculateTen);
    }

    public static ObservableList<String> getChoiceBoxListGostCalculateTen(){
        List<String> choiceBoxListGostCalculateTen = new ArrayList<>();
        choiceBoxListGostCalculateTen.add("ГОСТ-13286-83");
        choiceBoxListGostCalculateTen.add("ГОСТ-13286-81");
        return FXCollections.observableArrayList(choiceBoxListGostCalculateTen);
    }
}
