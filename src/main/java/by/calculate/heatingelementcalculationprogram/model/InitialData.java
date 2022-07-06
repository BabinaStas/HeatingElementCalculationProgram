package by.calculate.heatingelementcalculationprogram.model;

import java.io.Serializable;

public class InitialData implements Serializable {

    //Блок обозанчения ТЭНа
    private Double lengthTen;
    private Double studLengthTen;
    private Double diameterTen;
    private Double powerTen;
    private String workspaceTen;
    private Double voltageTen;

    //Блок заказчика
    private String numberOrder;
    private String customer;
    private String numberOfProducts;
    private String pilotBatch;

    //Блок расчета ТЭНа
    private Double spiralReductionFactorTen;
    private Double pipeElongationFactorTen;
    private Double diameterSpiral;
    private Double temperatureSpiral;

    //Блок выбора материалов ТЭНа
    private String spiralMaterialSpiral;
    private String numberOfWiresInASpiral;
    private Double mandrelDiameter;
    private String sand;
    private Double pipeBilletDiameter;
    private Double pipeThickness;
    private Double topStudProtrusion;
    private Double bottomStudProtrusion;
    private Double topStudContactType;
    private Double bottomStudContactType;
    private String spiralFiring;
    private String Gost;

    public InitialData(Double lengthTen, Double studLengthTen, Double diameterTen, Double powerTen, String workspaceTen,
                       Double voltageTen, String numberOrder, String customer, String numberOfProducts, String pilotBatch,
                       Double spiralReductionFactorTen, Double pipeElongationFactorTen, Double diameterSpiral,
                       Double temperatureSpiral, String spiralMaterialSpiral, String numberOfWiresInASpiral,
                       Double mandrelDiameter, String sand, Double pipeBilletDiameter, Double pipeThickness,
                       Double topStudProtrusion, Double bottomStudProtrusion, Double topStudContactType,
                       Double bottomStudContactType, String spiralFiring, String gost) {
        this.lengthTen = lengthTen;
        this.studLengthTen = studLengthTen;
        this.diameterTen = diameterTen;
        this.powerTen = powerTen;
        this.workspaceTen = workspaceTen;
        this.voltageTen = voltageTen;
        this.numberOrder = numberOrder;
        this.customer = customer;
        this.numberOfProducts = numberOfProducts;
        this.pilotBatch = pilotBatch;
        this.spiralReductionFactorTen = spiralReductionFactorTen;
        this.pipeElongationFactorTen = pipeElongationFactorTen;
        this.diameterSpiral = diameterSpiral;
        this.temperatureSpiral = temperatureSpiral;
        this.spiralMaterialSpiral = spiralMaterialSpiral;
        this.numberOfWiresInASpiral = numberOfWiresInASpiral;
        this.mandrelDiameter = mandrelDiameter;
        this.sand = sand;
        this.pipeBilletDiameter = pipeBilletDiameter;
        this.pipeThickness = pipeThickness;
        this.topStudProtrusion = topStudProtrusion;
        this.bottomStudProtrusion = bottomStudProtrusion;
        this.topStudContactType = topStudContactType;
        this.bottomStudContactType = bottomStudContactType;
        this.spiralFiring = spiralFiring;
        Gost = gost;
    }

    public InitialData(Double lengthTen, Double studLengthTen, Double diameterTen, Double powerTen,
                       String workspaceTen, Double voltageTen) {
        this.lengthTen = lengthTen;
        this.studLengthTen = studLengthTen;
        this.diameterTen = diameterTen;
        this.powerTen = powerTen;
        this.workspaceTen = workspaceTen;
        this.voltageTen = voltageTen;
    }

    public InitialData(String numberOrder, String customer, String numberOfProducts, String pilotBatch,
                       Double spiralReductionFactorTen, Double pipeElongationFactorTen, Double diameterSpiral,
                       Double temperatureSpiral, String spiralMaterialSpiral, String numberOfWiresInASpiral,
                       Double mandrelDiameter, String sand, Double pipeBilletDiameter, Double pipeThickness,
                       Double topStudProtrusion, Double bottomStudProtrusion, Double topStudContactType,
                       Double bottomStudContactType, String spiralFiring, String gost) {
        this.numberOrder = numberOrder;
        this.customer = customer;
        this.numberOfProducts = numberOfProducts;
        this.pilotBatch = pilotBatch;
        this.spiralReductionFactorTen = spiralReductionFactorTen;
        this.pipeElongationFactorTen = pipeElongationFactorTen;
        this.diameterSpiral = diameterSpiral;
        this.temperatureSpiral = temperatureSpiral;
        this.spiralMaterialSpiral = spiralMaterialSpiral;
        this.numberOfWiresInASpiral = numberOfWiresInASpiral;
        this.mandrelDiameter = mandrelDiameter;
        this.sand = sand;
        this.pipeBilletDiameter = pipeBilletDiameter;
        this.pipeThickness = pipeThickness;
        this.topStudProtrusion = topStudProtrusion;
        this.bottomStudProtrusion = bottomStudProtrusion;
        this.topStudContactType = topStudContactType;
        this.bottomStudContactType = bottomStudContactType;
        this.spiralFiring = spiralFiring;
        Gost = gost;
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

    public String getSpiralMaterialSpiral() {
        return spiralMaterialSpiral;
    }

    public void setSpiralMaterialSpiral(String spiralMaterialSpiral) {
        this.spiralMaterialSpiral = spiralMaterialSpiral;
    }

    public String getNumberOfWiresInASpiral() {
        return numberOfWiresInASpiral;
    }

    public void setNumberOfWiresInASpiral(String numberOfWiresInASpiral) {
        this.numberOfWiresInASpiral = numberOfWiresInASpiral;
    }

    public Double getMandrelDiameter() {
        return mandrelDiameter;
    }

    public void setMandrelDiameter(Double mandrelDiameter) {
        this.mandrelDiameter = mandrelDiameter;
    }

    public String getSand() {
        return sand;
    }

    public void setSand(String sand) {
        this.sand = sand;
    }

    public Double getPipeBilletDiameter() {
        return pipeBilletDiameter;
    }

    public void setPipeBilletDiameter(Double pipeBilletDiameter) {
        this.pipeBilletDiameter = pipeBilletDiameter;
    }

    public Double getPipeThickness() {
        return pipeThickness;
    }

    public void setPipeThickness(Double pipeThickness) {
        this.pipeThickness = pipeThickness;
    }

    public Double getTopStudProtrusion() {
        return topStudProtrusion;
    }

    public void setTopStudProtrusion(Double topStudProtrusion) {
        this.topStudProtrusion = topStudProtrusion;
    }

    public Double getBottomStudProtrusion() {
        return bottomStudProtrusion;
    }

    public void setBottomStudProtrusion(Double bottomStudProtrusion) {
        this.bottomStudProtrusion = bottomStudProtrusion;
    }

    public Double getTopStudContactType() {
        return topStudContactType;
    }

    public void setTopStudContactType(Double topStudContactType) {
        this.topStudContactType = topStudContactType;
    }

    public Double getBottomStudContactType() {
        return bottomStudContactType;
    }

    public void setBottomStudContactType(Double bottomStudContactType) {
        this.bottomStudContactType = bottomStudContactType;
    }

    public String getSpiralFiring() {
        return spiralFiring;
    }

    public void setSpiralFiring(String spiralFiring) {
        this.spiralFiring = spiralFiring;
    }

    public String getGost() {
        return Gost;
    }

    public void setGost(String gost) {
        Gost = gost;
    }

    @Override
    public String toString() {
        return "InitialData{" +
                "lengthTen=" + lengthTen +
                ", studLengthTen=" + studLengthTen +
                ", diameterTen=" + diameterTen +
                ", powerTen=" + powerTen +
                ", workspaceTen='" + workspaceTen + '\'' +
                ", voltageTen=" + voltageTen +
                '}';
    }
}
