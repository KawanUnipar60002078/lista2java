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
public class lista2java_kawandosreis_60002078_exerciocio4 {
     public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite a quantidade de pessoas: ");
        int quantidadePessoas = scanner.nextInt();

        
        System.out.println("Escolha o tamanho da pizza:");
        System.out.println("1 - Broto");
        System.out.println("2 - Pequena");
        System.out.println("3 - Média");
        System.out.println("4 - Grande");
        System.out.print("Digite o código do tamanho da pizza: ");
        int codigoTamanho = scanner.nextInt();

        
        int pessoasPorPizza;
        switch (codigoTamanho) {
            case 1: 
                pessoasPorPizza = 1;
                break;
            case 2: 
                pessoasPorPizza = 2;
                break;
            case 3:               pessoasPorPizza = 3;
                break;
            case 4: 
                pessoasPorPizza = 4;
                break;
            default:
                System.out.println("Código de tamanho inválido.");
                scanner.close();
                return;
        }

       
        int pizzasNecessarias = (int) Math.ceil((double) quantidadePessoas / pessoasPorPizza);

       
        System.out.printf("Quantidade de pizzas necessárias: %d%n", pizzasNecessarias);

               scanner.close();
    }
}
