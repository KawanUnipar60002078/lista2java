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
public class lista2java_kawandosreis_60002078_exerciocio3 {
     public static void main(String[] args) {
        
    
      
       
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor total da compra (em reais): ");
        double valorTotal = scanner.nextDouble();

 
        System.out.println("Código da condição de pagamento:");
        System.out.println("1 - À vista com 10% de desconto");
        System.out.println("2 - À prazo, 1 parcela com 8% de desconto");
        System.out.println("3 - À prazo, 5 parcelas sem desconto ou acréscimos");
        System.out.println("4 - À prazo, 10 parcelas com acréscimo de 5% no valor total");
        System.out.print("Digite o código da condição de pagamento: ");
        int codigoPagamento = scanner.nextInt();

        double valorFinal;
        int quantidadeParcelas;
        double valorParcela;

        
        switch (codigoPagamento) {
            case 1: 
                valorFinal = valorTotal * 0.90;
                quantidadeParcelas = 1;
                valorParcela = valorFinal;
                break;
            case 2: 
                valorFinal = valorTotal * 0.92;
                quantidadeParcelas = 1;
                valorParcela = valorFinal;
                break;
            case 3: 
                valorFinal = valorTotal;
                quantidadeParcelas = 5;
                valorParcela = valorFinal / quantidadeParcelas;
                break;
            case 4:
                valorFinal = valorTotal * 1.05;
                quantidadeParcelas = 10;
                valorParcela = valorFinal / quantidadeParcelas;
                break;
            default:
                System.out.println("Código de pagamento inválido.");
                scanner.close();
                return;
        }

        
        System.out.printf("Valor total a ser pago: R$ %.2f%n", valorFinal);
        System.out.printf("Quantidade de parcelas: %d%n", quantidadeParcelas);
        System.out.printf("Valor por parcela: R$ %.2f%n", valorParcela);

        
        scanner.close();
    }
     }
