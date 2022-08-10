package by.calculate.heatingelementcalculationprogram.service.DatabaseDesigantionController;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.List;

public class ChoiceBoxDataBaseDesignationController {

    public static ObservableList<String> getChoiceBoxListSearch(){
        List<String> choiceBoxListSearch = new ArrayList<>();
        choiceBoxListSearch.add("Длинна");
        choiceBoxListSearch.add("Длинна заделки");
        choiceBoxListSearch.add("Диаметр");
        choiceBoxListSearch.add("Мощность");
        choiceBoxListSearch.add("Среда");
        choiceBoxListSearch.add("Напряжение");
        return FXCollections.observableArrayList(choiceBoxListSearch);
    }
}
