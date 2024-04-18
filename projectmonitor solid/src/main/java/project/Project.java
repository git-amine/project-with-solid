package project;

import rawMaterialRequest.IRequest;

import java.util.List;

public class Project implements IProjectCost {

    private String code;
    private String description;

    List<IRequest> listRequests;

    public Project(){

    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setListRequests(List<IRequest> listRequests) {
        this.listRequests = listRequests;
    }

    @Override
    public List<IRequest> getListRequests() {
        return listRequests;
    }


}
