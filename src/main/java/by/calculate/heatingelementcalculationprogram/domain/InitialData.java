package by.calculate.heatingelementcalculationprogram.domain;

import by.calculate.heatingelementcalculationprogram.domain.initialdatachild.Coefficient;
import by.calculate.heatingelementcalculationprogram.domain.initialdatachild.Customer;
import by.calculate.heatingelementcalculationprogram.domain.initialdatachild.Designation;
import by.calculate.heatingelementcalculationprogram.domain.initialdatachild.Material;

import java.io.Serializable;

public class InitialData implements Serializable {

    //Блок обозанчения ТЭНа
    private Designation designation;

    //Блок заказчика
    private Customer customer;

    //Блок расчета ТЭНа
    private Coefficient coefficient;

    //Блок выбора материалов ТЭНа
    private Material material;

    public InitialData(Designation designation, Customer customer, Coefficient coefficient, Material material) {
        this.designation = designation;
        this.customer = customer;
        this.coefficient = coefficient;
        this.material = material;
    }

    public InitialData(Designation designation) {
        this.designation = designation;
    }

    public InitialData(Customer customer, Coefficient coefficient, Material material) {
        this.customer = customer;
        this.coefficient = coefficient;
        this.material = material;
    }

    public InitialData() {
    }

    public Designation getDesignation() {
        return designation;
    }

    public void setDesignation(Designation designation) {
        this.designation = designation;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Coefficient getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(Coefficient coefficient) {
        this.coefficient = coefficient;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Расчет ТЭНа : " +
                "\nОбозначение: " + designation +
                ",\nБлок Заказчика: " + customer +
                ",\nБлок коэффициентов: " + coefficient +
                ",\nМатериалы и данные: " + material;
    }
}
