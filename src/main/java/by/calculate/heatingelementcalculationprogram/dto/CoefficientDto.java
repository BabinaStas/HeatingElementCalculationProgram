package by.calculate.heatingelementcalculationprogram.dto;

public class CoefficientDto {

    private  Integer id;
    private Double spiralReductionFactorTen;
    private Double pipeElongationFactorTen;
    private Double diameterSpiral;
    private Double temperatureSpiral;

    public CoefficientDto() {
    }

    public CoefficientDto(Integer id, Double spiralReductionFactorTen, Double pipeElongationFactorTen,
                          Double diameterSpiral, Double temperatureSpiral) {
        this.id = id;
        this.spiralReductionFactorTen = spiralReductionFactorTen;
        this.pipeElongationFactorTen = pipeElongationFactorTen;
        this.diameterSpiral = diameterSpiral;
        this.temperatureSpiral = temperatureSpiral;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getSpiralReductionFactorTen() {
        return spiralReductionFactorTen;
    }

    public void setSpiralReductionFactorTen(Double spiralReductionFactorTen) {
        this.spiralReductionFactorTen = spiralReductionFactorTen;
    }

    public Double getPipeElongationFactorTen() {
        return pipeElongationFactorTen;
    }

    public void setPipeElongationFactorTen(Double pipeElongationFactorTen) {
        this.pipeElongationFactorTen = pipeElongationFactorTen;
    }

    public Double getDiameterSpiral() {
        return diameterSpiral;
    }

    public void setDiameterSpiral(Double diameterSpiral) {
        this.diameterSpiral = diameterSpiral;
    }

    public Double getTemperatureSpiral() {
        return temperatureSpiral;
    }

    public void setTemperatureSpiral(Double temperatureSpiral) {
        this.temperatureSpiral = temperatureSpiral;
    }
}
