/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista2java_kawandosreis_60002078;

import java.util.Scanner;

/**
 *
 * @author kawan
 */
public class lista2java_kawandosreis_60002078_exerciocio2 {
        
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
   
        System.out.print("Digite sua altura em metros (ex: 1.75): ");
        double altura = scanner.nextDouble();
       System.out.print("Digite seu peso em kg (ex: 70): ");
        double peso = scanner.nextDouble();

        System.out.print("Digite seu sexo (M para masculino / F para feminino): ");
        char sexo = scanner.next().toUpperCase().charAt(0);

        double pesoIdeal;
        switch (sexo) {
            case 'M':
                pesoIdeal = (72.7 * altura) - 58;
                break;
            case 'F':
                pesoIdeal = (62.1 * altura) - 44.7;
                break;
            default:
                System.out.println("Sexo inválido.");
                scanner.close();
                return;
        }

        System.out.printf("Seu peso ideal é: %.2f kg%n", pesoIdeal);

        if (peso < pesoIdeal) {
            System.out.println("Você está abaixo do peso ideal.");
        } else if (peso > pesoIdeal) {
            System.out.println("Você está acima do peso ideal.");
        } else {
            System.out.println("Você está no peso ideal.");
        }
        
    }
}
