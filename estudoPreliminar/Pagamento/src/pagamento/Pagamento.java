/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pagamento;

import java.util.Scanner;

/**
 *
 * @author leandropereira
 */
public class Pagamento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in); 
        float valorCompra;
        
        System.out.print("Informe o valor total da compra: ");
        valorCompra = entrada.nextFloat();
        
        int opcaoSelecionada = 0;
        int opcaoPagamento = menu(opcaoSelecionada);
        
        switch(opcaoPagamento) {
            case 1:
                calcularAVista(valorCompra);
                break;
            case 2:
                 calcularEmDuasVezes(valorCompra);
                break;
            case 3:
                calcularParcelado(valorCompra);
        }
    }
    //metodos que imprime menu e opção selecionada
    public static int menu(int opcaoPagamento) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Opções de pagamento: \n"
                +          "1 - a vista com 10% de desconto. \n"
                +          "2 - em duas vezes (preço da etiqueta) \n"
                +          "3 - de 3 até 10 vezes com 3% de juros ao mês (somente compras acima de R$ 100,00).");
        System.out.print("Informe a opção de pagamento (de 1 até 3): ");
        opcaoPagamento = entrada.nextInt();
        return opcaoPagamento;
    }
    
    public static void calcularAVista(float valorCompra) {
        float valorDesconto = (float) (valorCompra * 0.9);
        
        System.out.println("Valor final da compra (10% de desconto) R$ " + valorDesconto);
        
    }
    
    public static void calcularEmDuasVezes(float valorCompra) {
        float valorParcela = (int) (valorCompra/2);
        System.out.println("Valor final da compra (preço da etiqueta) R$ " + valorCompra + "\n"
                        +  "Valor da parcela é de R$ " + valorParcela);
    }
    
    public static void calcularParcelado(float valorCompra) {
        if(valorCompra > 100) {
            
            Scanner entrada = new Scanner(System.in);
            System.out.print("Informe o número de parcelas (3 a 10): ");
            int parcela = entrada.nextInt();
            
            float valorParcela = (float) ((valorCompra * 1.03) / parcela);
            System.out.println("Valor final da compra: " + (valorParcela*parcela) + 
                               "\nParcelado em " + parcela + 
                               " vezes com 3% de juros ao mês: " + valorParcela);
        } else {
            System.out.println("opção indisponível para compras abaixo de R$ 100,00.");
        }
    }
}
