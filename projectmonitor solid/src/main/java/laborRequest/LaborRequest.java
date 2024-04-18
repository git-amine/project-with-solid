package laborRequest;

import laborRequest.WorkerRole;
import rawMaterialRequest.IRequest;

public class LaborRequest implements IRequest {

    private String requestCode;
    private String issueDate;
    private double laborHours;
    WorkerRole workerRole;

    public LaborRequest(){

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

    public double getLaborHours() {
        return laborHours;
    }

    public void setLaborHours(double laborHours) {
        this.laborHours = laborHours;
    }

    public WorkerRole getWorkerRole() {
        return workerRole;
    }

    public void setWorkerRole(WorkerRole workerRole) {
        this.workerRole = workerRole;
    }


    @Override
    public double getAmount() {
        return this.laborHours;
    }

    @Override
    public double getCostPerUnit() {
        return workerRole.getHourlyRate();
    }


}
