package by.calculate.heatingelementcalculationprogram.domain.initialdatachild;

public class Material {

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

    public Material(String spiralMaterialSpiral, String numberOfWiresInASpiral, Double mandrelDiameter,
                    String sand, Double pipeBilletDiameter, Double pipeThickness, Double topStudProtrusion,
                    Double bottomStudProtrusion, Double topStudContactType, Double bottomStudContactType,
                    String spiralFiring, String gost) {
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
        return "Material{" +
                "spiralMaterialSpiral='" + spiralMaterialSpiral + '\'' +
                ", numberOfWiresInASpiral='" + numberOfWiresInASpiral + '\'' +
                ", mandrelDiameter=" + mandrelDiameter +
                ", sand='" + sand + '\'' +
                ", pipeBilletDiameter=" + pipeBilletDiameter +
                ", pipeThickness=" + pipeThickness +
                ", topStudProtrusion=" + topStudProtrusion +
                ", bottomStudProtrusion=" + bottomStudProtrusion +
                ", topStudContactType=" + topStudContactType +
                ", bottomStudContactType=" + bottomStudContactType +
                ", spiralFiring='" + spiralFiring + '\'' +
                ", Gost='" + Gost + '\'' +
                '}';
    }
}
