import laborRequest.LaborRequest;
import laborRequest.WorkerRole;
import project.Project;
import projectCostService.IProjectCostService;
import projectCostService.ProjectCostCalculator;
import rawMaterialRequest.IRequest;
import rawMaterialRequest.RawMaterial;
import rawMaterialRequest.RawMaterialRequest;
import requestCostService.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){



     // Create Project
       Project project=new Project();


       // Create resources

        RawMaterial steel= new RawMaterial();
        RawMaterial concrete= new RawMaterial();

        steel.setPricePerUnit(50);
        concrete.setPricePerUnit(20);

        WorkerRole construction=new WorkerRole();

        construction.setHourlyRate(10);


        // Create Requests
        RawMaterialRequest steelRequest= new RawMaterialRequest();
        steelRequest.setRawMaterial(steel);
        steelRequest.setQuantity(100);

        RawMaterialRequest concreteRequest=new RawMaterialRequest();
        concreteRequest.setRawMaterial(concrete);
        concreteRequest.setQuantity(50);

        LaborRequest constructionWorkerRequest= new LaborRequest();
        constructionWorkerRequest.setWorkerRole(construction);
        constructionWorkerRequest.setLaborHours(200);

        List<IRequest> projectRequestList= new ArrayList<>();

        project.setListRequests(projectRequestList);

        // Add requests to the project
        project.getListRequests().add(steelRequest);
        project.getListRequests().add(concreteRequest);
        project.getListRequests().add(constructionWorkerRequest);


        // Create and assemble cost services
        IDirectCostService directCostService=new DirectCostCalculator();

        IAssociatedCostService iAssociatedCostService=new AssociatedCostEstimator(directCostService);

        IRequestCostService requestCostService=new RequestCostCalculator(iAssociatedCostService,directCostService);

        IProjectCostService projectCostService=new ProjectCostCalculator(requestCostService);

        //Calculate project cost
        System.out.println("Current Project cost : \n");
        System.out.println(projectCostService.calculateProjectCost(project));






    }

}
