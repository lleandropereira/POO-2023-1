/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classificacaoproduto;

import java.util.Scanner;

/**
 *
 * @author leandropereira
 */
public class ClassificacaoProduto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Informe o número da categoria: ");
        int categoria = entrada.nextInt();
        
        switch(categoria) {
            case 1:
                System.out.println("Alimento não-perecível");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("Alimento perecível");
                break;
            case 5:
            case 6:
                System.out.println("Vestuário");
                break;
            case 7:
                System.out.println("Higiene Pessoal");
                break;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                System.out.println("Limpeza e Utensílios domésticos");
                break;
            
            default:
                System.out.println("Inválido");
        }
    }
    
}
