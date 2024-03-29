package by.calculate.heatingelementcalculationprogram.domain.initialdatachild;

import java.io.Serializable;

public class Coefficient implements Serializable {

    private Integer id;
    private Double spiralReductionFactorTen;
    private Double pipeElongationFactorTen;
    private Double diameterSpiral;
    private Double temperatureSpiral;

    public Coefficient() {
    }

    public Coefficient(Double spiralReductionFactorTen, Double pipeElongationFactorTen, Double diameterSpiral, Double temperatureSpiral) {
        this.spiralReductionFactorTen = spiralReductionFactorTen;
        this.pipeElongationFactorTen = pipeElongationFactorTen;
        this.diameterSpiral = diameterSpiral;
        this.temperatureSpiral = temperatureSpiral;
    }

    public Coefficient(Integer id, Double spiralReductionFactorTen, Double pipeElongationFactorTen, Double diameterSpiral,
                       Double temperatureSpiral) {
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

    @Override
    public String toString() {
        return "\nКоэффициенты:" +
                "\nКоэффициент приведения спирали: " + spiralReductionFactorTen +
                ",\nКоэффициент удлиннения трубы: " + pipeElongationFactorTen +
                ",\nДиаметр спирали: " + diameterSpiral +
                ",\nТемпература на сприли: " + temperatureSpiral;
    }
}
