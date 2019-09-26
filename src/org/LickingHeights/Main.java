package org.LickingHeights;

public class Main {

    public static void main(String[] args) {

	    // todo declare variable a,b,c,discriminant, axisOfSymmetry,parabolFacing,x,y
        double a,b,c,discrimint,axisOfsmmetry,x,y;
        String parabolaFacing;
        //todo initialize manually
        a=5;
        b=3;
        c=1;
        //todo do calculation
        axisOfsmmetry = -b/(2*a);
        discrimint = (b*b)-4*(a*c);
        if(discrimint >0){
            System.out.println("There are two real solution");
        }
        else if(discrimint ==0){
            System.out.println("There is one real solution ");
        }
        else{
            System.out.println("There are No real solution ");
        }
        //todo print results
        System.out.println("Axis of smmetry: "+axisOfsmmetry);
        System.out.println("discrimint: "+discrimint);
        //todo not code check results

        //todo initiialize scanner and redo the initialize

        //todo double check results



















    }
}
