package projectCostService;

import project.IProjectCost;
import rawMaterialRequest.IRequest;
import requestCostService.IRequestCostService;

public class ProjectCostCalculator implements IProjectCostService {

    IRequestCostService iRequestCostService;

    public ProjectCostCalculator(IRequestCostService iRequestCostService){

        this.iRequestCostService=iRequestCostService;
    }

    @Override
    public double calculateProjectCost(IProjectCost iproject) {

        double cost=0;

        for(IRequest req:iproject.getListRequests()){

            cost+=iRequestCostService.calculateRequestCost(req);
        }

        return cost;
    }
}
