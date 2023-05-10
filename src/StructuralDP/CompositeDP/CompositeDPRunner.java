package StructuralDP.CompositeDP;

import java.util.Arrays;
import java.util.List;

public class CompositeDPRunner {


    public void compositeDemo(){
        Department financeDepartment=new Finance();
        Department salesDepartment=new Sales();
        Department argeDepartment=new Arge();
        Department regionalDepartment=new RegionalDepartment(Arrays.asList(financeDepartment,salesDepartment,argeDepartment));

        System.out.println(regionalDepartment.getName());
        System.out.println("****************************");
        System.out.println(regionalDepartment.getEmployees());
    }


    public static void main(String[] args) {

        CompositeDPRunner composite=new CompositeDPRunner();
        composite.compositeDemo();




    }



}
