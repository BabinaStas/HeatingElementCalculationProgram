package by.calculate.heatingelementcalculationprogram.dto;

public class DesignationDto {

    private Integer id;
    private Double lengthTen;
    private Double studLengthTen;
    private Double diameterTen;
    private Double powerTen;
    private String workspaceTen;
    private Double voltageTen;
    private Integer customerId;
    private Integer coefficientId;
    private Integer materialId;


    public DesignationDto() {
    }

    public DesignationDto(Double lengthTen, Double studLengthTen, Double diameterTen, Double powerTen,
                          String workspaceTen, Double voltageTen) {
        this.lengthTen = lengthTen;
        this.studLengthTen = studLengthTen;
        this.diameterTen = diameterTen;
        this.powerTen = powerTen;
        this.workspaceTen = workspaceTen;
        this.voltageTen = voltageTen;
    }

    public DesignationDto(Integer id, Double lengthTen, Double studLengthTen, Double diameterTen, Double powerTen,
                          String workspaceTen, Double voltageTen) {
        this.id = id;
        this.lengthTen = lengthTen;
        this.studLengthTen = studLengthTen;
        this.diameterTen = diameterTen;
        this.powerTen = powerTen;
        this.workspaceTen = workspaceTen;
        this.voltageTen = voltageTen;
    }

    public DesignationDto(Integer id, Double lengthTen, Double studLengthTen, Double diameterTen, Double powerTen,
                          String workspaceTen, Double voltageTen, Integer customerId, Integer coefficientId,
                          Integer materialId) {
        this.id = id;
        this.lengthTen = lengthTen;
        this.studLengthTen = studLengthTen;
        this.diameterTen = diameterTen;
        this.powerTen = powerTen;
        this.workspaceTen = workspaceTen;
        this.voltageTen = voltageTen;
        this.customerId = customerId;
        this.coefficientId = coefficientId;
        this.materialId = materialId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getLengthTen() {
        return lengthTen;
    }

    public void setLengthTen(Double lengthTen) {
        this.lengthTen = lengthTen;
    }

    public Double getStudLengthTen() {
        return studLengthTen;
    }

    public void setStudLengthTen(Double studLengthTen) {
        this.studLengthTen = studLengthTen;
    }

    public Double getDiameterTen() {
        return diameterTen;
    }

    public void setDiameterTen(Double diameterTen) {
        this.diameterTen = diameterTen;
    }

    public Double getPowerTen() {
        return powerTen;
    }

    public void setPowerTen(Double powerTen) {
        this.powerTen = powerTen;
    }

    public String getWorkspaceTen() {
        return workspaceTen;
    }

    public void setWorkspaceTen(String workspaceTen) {
        this.workspaceTen = workspaceTen;
    }

    public Double getVoltageTen() {
        return voltageTen;
    }

    public void setVoltageTen(Double voltageTen) {
        this.voltageTen = voltageTen;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getCoefficientId() {
        return coefficientId;
    }

    public void setCoefficientId(Integer coefficientId) {
        this.coefficientId = coefficientId;
    }

    public Integer getMaterialId() {
        return materialId;
    }

    public void setMaterialId(Integer materialId) {
        this.materialId = materialId;
    }

    @Override
    public String toString() {
        return "DesignationDto{" +
                "id=" + id +
                ", lengthTen=" + lengthTen +
                ", studLengthTen=" + studLengthTen +
                ", diameterTen=" + diameterTen +
                ", powerTen=" + powerTen +
                ", workspaceTen='" + workspaceTen + '\'' +
                ", voltageTen=" + voltageTen +
                ", customerId=" + customerId +
                ", coefficientId=" + coefficientId +
                ", materialId=" + materialId +
                '}';
    }
}