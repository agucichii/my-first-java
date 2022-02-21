package com.sinensia.invesment;

public class PensionPlan {

	    public PensionPlan(int dinero, int aportepf, int aportepe) {
	    	if (dinero < 12450) {
	            System.out.println("Usted ha ganado " + (dinero - dinero * 0.19));
	            System.out.println("Usted ha aportado de IRPF " + (dinero * 0.19 - aportepf * .1-aportepe*.1));
	            System.out.println("Usted ha desgravado " + (aportepf * 0.1+aportepe*0.1));
	            
	        } else if (dinero > 12451 && dinero < 20200) {
	            System.out.println("Usted ha ganado " + (dinero - dinero * 0.24));
	            System.out.println("Usted ha aportado de IRPF " + (dinero * 0.24 - aportepf * .2-aportepe*.2));
	            System.out.println("Usted ha desgravado " + (aportepf * 0.2+aportepe*0.2));
	            
	        } else if (dinero > 20201 && dinero < 35200) {
	            System.out.println("Usted ha ganado " + (dinero - dinero * 0.3));
	            System.out.println("Usted ha aportado de IRPF " + (dinero * 0.3 - aportepf * .3-aportepe*.3));
	            System.out.println("Usted ha desgravado " + (aportepf * 0.3+aportepe*0.3));
	            
	        } else if (dinero > 35201 && dinero <= 60000) {
	            System.out.println("Usted ha ganado " + (dinero - dinero * 0.37));
	            System.out.println("Usted ha aportado de IRPF " + (dinero * 0.37 - aportepf * .4-aportepe*.4));
	            System.out.println("Usted ha desgravado " + (aportepf * 0.4+aportepe*0.4));
	            
	        } else if (dinero > 60000 && dinero <= 300000) {
	            System.out.println("Usted ha ganado " + (dinero - dinero * 0.45));
	            System.out.println("Usted ha aportado de IRPF " + (dinero * 0.45 - aportepf * .45-aportepe*.45));
	            System.out.println("Usted ha desgravado " + (aportepf * 0.45+aportepe*0.45));
	            
	        } else if (dinero > 300000) {
	            System.out.println("Usted ha ganado " + (dinero - dinero * 0.47));
	            System.out.println("Usted ha aportado de IRPF " + (dinero * 0.47 - aportepf * .47-aportepe*.47));
	            System.out.println("Usted ha desgravado " + (aportepf * 0.47+aportepe*0.47));
	        } 

	    }

	}
