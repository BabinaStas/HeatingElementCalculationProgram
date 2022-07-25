package by.calculate.heatingelementcalculationprogram.dto;

public class CustomerDto {

    private Integer id;
    private String numberOrder;
    private String customColumn;
    private String numberOfProducts;
    private String pilotBatch;

    public CustomerDto() {
    }

    public CustomerDto(Integer id, String numberOrder, String customColumn, String numberOfProducts, String pilotBatch) {
        this.id = id;
        this.numberOrder = numberOrder;
        this.customColumn = customColumn;
        this.numberOfProducts = numberOfProducts;
        this.pilotBatch = pilotBatch;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumberOrder() {
        return numberOrder;
    }

    public void setNumberOrder(String numberOrder) {
        this.numberOrder = numberOrder;
    }

    public String getCustomColumn() {
        return customColumn;
    }

    public void setCustomColumn(String customColumn) {
        this.customColumn = customColumn;
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
}
