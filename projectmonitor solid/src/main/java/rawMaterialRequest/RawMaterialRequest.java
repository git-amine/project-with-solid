package rawMaterialRequest;


public class RawMaterialRequest implements IRequest {

    private String requestCode;
    private String issueDate;
    private double quantity;
    RawMaterial rawMaterial;

    public RawMaterialRequest(){

    }

    public String getRequestCode() {
        return requestCode;
    }

    public void setRequestCode(String requestCode) {
        this.requestCode = requestCode;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public RawMaterial getRawMaterial() {
        return rawMaterial;
    }

    public void setRawMaterial(RawMaterial rawMaterial) {
        this.rawMaterial = rawMaterial;
    }


    @Override
    public double getAmount() {
        return this.quantity;
    }

    @Override
    public double getCostPerUnit() {
        return rawMaterial.getPricePerUnit();
    }


}
