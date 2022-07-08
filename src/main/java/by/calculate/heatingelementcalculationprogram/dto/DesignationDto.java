package by.calculate.heatingelementcalculationprogram.dto;

public class DesignationDto {

    private Integer id;
    private Double lengthTen;
    private Double studLengthTen;
    private Double diameterTen;
    private Double powerTen;
    private String workspaceTen;
    private Double voltageTen;

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

    public DesignationDto(Double lengthTen, Double studLengthTen, Double diameterTen, Double powerTen,
                          String workspaceTen, Double voltageTen) {
        this.lengthTen = lengthTen;
        this.studLengthTen = studLengthTen;
        this.diameterTen = diameterTen;
        this.powerTen = powerTen;
        this.workspaceTen = workspaceTen;
        this.voltageTen = voltageTen;
    }

    public DesignationDto() {
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
                '}';
    }
}