package requestCostService;

import rawMaterialRequest.IRequest;


public class RequestCostCalculator implements IRequestCostService{

    IAssociatedCostService iAssociatedCostService;
    IDirectCostService iDirectCostService;

    public RequestCostCalculator(IAssociatedCostService iAssociatedCostService,IDirectCostService iDirectCostService){

        this.iAssociatedCostService=iAssociatedCostService;
        this.iDirectCostService=iDirectCostService;
    }


    @Override
    public double calculateRequestCost(IRequest iRequest) {
        return iDirectCostService.calculateDirectCost(iRequest)+iAssociatedCostService.estimateAssociatedCost(iRequest);
    }
}
