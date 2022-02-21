package com.sinensia.invesment;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
        System.out.println("Seleccione su plan de pensiones");
        System.out.println("1.Plan de pensiones de persona física");
        System.out.println("2.Plan de pensiones empresarial");
        System.out.println("3.Ambos");
        int elec = leer.nextInt();
        leer.close();
        int gan;
        int dinpf;
        int dinpe;
        switch (elec) {
            case 1:
                System.out.println("Ingresee ha ganado éste año");
                gan = leer.nextInt();
                System.out.println("Ingrese  persona física");
                dinpf = leer.nextInt();
                PensionPlan pension = new PensionPlan(gan, dinpf, 0);
                break;
            case 2:
                System.out.println("Ingresque ha ganado éste año");
                gan = leer.nextInt();
                System.out.println("Ingrese el dinero aportado como persona empresarial");
                dinpe = leer.nextInt();
                PensionPlan pension2 = new PensionPlan(gan, 0, dinpe);
                break;
            case 3:
                System.out.println("Ingrese el dinero que ha ganado éste año");
                gan = leer.nextInt();
                System.out.println("Ingrese el dinero aportado como persona física");
                dinpf = leer.nextInt();
                System.out.println("Ingrese el dinero aportado como persona empresarial");
                dinpe = leer.nextInt();
                PensionPlan pension3 = new PensionPlan(gan, dinpf, dinpe);
                break;
        }

    }

}

