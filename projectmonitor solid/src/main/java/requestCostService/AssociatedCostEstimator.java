package requestCostService;

import rawMaterialRequest.IRequest;


public class AssociatedCostEstimator implements IAssociatedCostService{

   IDirectCostService iDirectCostService;

   public AssociatedCostEstimator(IDirectCostService iDirectCostService){
       this.iDirectCostService=iDirectCostService;

   }

    @Override
    public double estimateAssociatedCost(IRequest iRequest) {
        return iDirectCostService.calculateDirectCost(iRequest)*0.15;
    }
}
