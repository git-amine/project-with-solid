package requestCostService;

import rawMaterialRequest.IRequest;


public class DirectCostCalculator implements IDirectCostService{

    @Override
    public double calculateDirectCost(IRequest iRequest) {
        return iRequest.getAmount()*iRequest.getCostPerUnit();
    }

}
