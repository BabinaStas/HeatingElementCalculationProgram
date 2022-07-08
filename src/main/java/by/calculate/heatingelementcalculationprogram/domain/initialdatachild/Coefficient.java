package by.calculate.heatingelementcalculationprogram.domain.initialdatachild;

public class Coefficient {

    private Double spiralReductionFactorTen;
    private Double pipeElongationFactorTen;
    private Double diameterSpiral;
    private Double temperatureSpiral;

    public Coefficient(Double spiralReductionFactorTen, Double pipeElongationFactorTen, Double diameterSpiral, Double temperatureSpiral) {
        this.spiralReductionFactorTen = spiralReductionFactorTen;
        this.pipeElongationFactorTen = pipeElongationFactorTen;
        this.diameterSpiral = diameterSpiral;
        this.temperatureSpiral = temperatureSpiral;
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

    @Override
    public String toString() {
        return "Coefficient{" +
                "spiralReductionFactorTen=" + spiralReductionFactorTen +
                ", pipeElongationFactorTen=" + pipeElongationFactorTen +
                ", diameterSpiral=" + diameterSpiral +
                ", temperatureSpiral=" + temperatureSpiral +
                '}';
    }
}
