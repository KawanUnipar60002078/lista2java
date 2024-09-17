/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista2java_kawandosreis_60002078;

import java.util.Scanner;


public class Lista2java {

    public static void main(String[] args) {
        System.out.println("exercicio 1");

        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Digite um mes (1 a 12): ");
        int mesInput = scanner.nextInt();

        
        String nomeMes;
        switch (mesInput) {
            case 1: nomeMes = "Janeiro"; break;
            case 2: nomeMes = "Fevereiro"; break;
            case 3: nomeMes = "Março"; break;
            case 4: nomeMes = "Abril"; break;
            case 5: nomeMes = "Maio"; break;
            case 6: nomeMes = "Junho"; break;
            case 7: nomeMes = "Julho"; break;
            case 8: nomeMes = "Agosto"; break;
            case 9: nomeMes = "Setembro"; break;
            case 10: nomeMes = "Outubro"; break;
            case 11: nomeMes = "Novembro"; break;
            case 12: nomeMes = "Dezembro"; break;
            default: 
                System.out.println("Valor Inválido");
                scanner.close();
                return;
        }

        System.out.println("Mes: " + nomeMes);

      

        scanner.close();
    }
}
    
    
