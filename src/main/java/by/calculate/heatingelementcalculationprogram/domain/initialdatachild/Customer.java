package by.calculate.heatingelementcalculationprogram.domain.initialdatachild;

import java.io.Serial;
import java.io.Serializable;

public class Customer implements Serializable {

    private String numberOrder;
    private String customer;
    private String numberOfProducts;
    private String pilotBatch;

    public Customer(String numberOrder, String customer, String numberOfProducts, String pilotBatch) {
        this.numberOrder = numberOrder;
        this.customer = customer;
        this.numberOfProducts = numberOfProducts;
        this.pilotBatch = pilotBatch;
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
        return "Customer{" +
                "numberOrder='" + numberOrder + '\'' +
                ", customer='" + customer + '\'' +
                ", numberOfProducts='" + numberOfProducts + '\'' +
                ", pilotBatch='" + pilotBatch + '\'' +
                '}';
    }
}
