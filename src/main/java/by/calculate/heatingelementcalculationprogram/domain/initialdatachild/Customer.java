package by.calculate.heatingelementcalculationprogram.domain.initialdatachild;

import java.io.Serial;
import java.io.Serializable;

public class Customer implements Serializable {

    private Integer Id;
    private String numberOrder;
    private String customer;
    private String numberOfProducts;
    private String pilotBatch;

    public Customer() {
    }

    public Customer(String numberOrder, String customer, String numberOfProducts, String pilotBatch) {
        this.numberOrder = numberOrder;
        this.customer = customer;
        this.numberOfProducts = numberOfProducts;
        this.pilotBatch = pilotBatch;
    }

    public Customer(Integer id, String numberOrder, String customer, String numberOfProducts, String pilotBatch) {
        Id = id;
        this.numberOrder = numberOrder;
        this.customer = customer;
        this.numberOfProducts = numberOfProducts;
        this.pilotBatch = pilotBatch;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getNumberOrder() {
        return numberOrder;
    }

    public void setNumberOrder(String numberOrder) {
        this.numberOrder = numberOrder;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getNumberOfProducts() {
        return numberOfProducts;
    }

    public void setNumberOfProducts(String numberOfProducts) {
        this.numberOfProducts = numberOfProducts;
    }

    public String getPilotBatch() {
        return pilotBatch;
    }

    public void setPilotBatch(String pilotBatch) {
        this.pilotBatch = pilotBatch;
    }

    @Override
    public String toString() {
        return "\nЗаказчик" +
                "\nНомер заказа: " + numberOrder + '\'' +
                ",\nЗаказчик: " + customer + '\'' +
                ",\nКоличество изделий в заказе: " + numberOfProducts + '\'' +
                ",\nПризнак партии: " + pilotBatch + '\'';
    }
}
