/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package consumodeenergia;

import java.util.Scanner;

/**
 *
 * @author leandropereira
 */
public class ConsumoDeEnergia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char opcao = 's';
        double menorConsumo = Double.POSITIVE_INFINITY;
        double maiorConsumo = Double.NEGATIVE_INFINITY;
        float residencial = 0 , comercial = 0, industrial = 0, contConsumo = 0, mediaConsumo = 0;
        int contConsumidor = 0;
        
        do{
            Scanner entrada = new Scanner(System.in);
        
            System.out.print("Preço KWh consumido: ");
            float preco = entrada.nextFloat();
            
            System.out.print("Número do consumidor: ");
            int numero = entrada.nextInt();
        
            System.out.print("Quantidade de KWh consumidos no mês: ");
            float consumo = entrada.nextFloat();
            
            System.out.print("Código do consumidor: ");
            String codigo = entrada.next();
           
            //===============================================================================
            //total a pagar
            float precoFinal = preco*consumo;
            
            //===============================================================================
            //maior e menor consumo
            if(consumo > maiorConsumo) {    
            maiorConsumo = consumo;
            }
            if(consumo < menorConsumo) {
                menorConsumo = consumo;
            }
            
            //===============================================================================            
            //total do consumo por codigo
            if("residencial".equals(codigo)) {
                residencial += precoFinal;
            } else if("comercial".equals(codigo)) {
                comercial += precoFinal;
            } else if("industrial".equals(codigo)) {
                industrial += precoFinal;
            }
            
            //===============================================================================
            contConsumidor++;
            contConsumo = contConsumo + consumo;
            
            System.out.print("Usuário de númeero: " + numero +" => Preço a pagar: " + precoFinal);
            
            System.out.print("\n Deseja realizar a operação novament (s/n)? ");
            opcao = entrada.next().charAt(0);
        }while(opcao == 's');
        
        //media consumo
        mediaConsumo = contConsumo/contConsumidor;
        
        
        System.out.println("Maior consumo: " + maiorConsumo +
                           "\n Menor consumo: " + menorConsumo);
        
        System.out.println("\n Consumo residencial: " + residencial +
                           "\n Consumo comercial: " + comercial +
                           "\n Consumo industrial: " + industrial);
        
        System.out.println("\n Média de consumo: " + mediaConsumo);
    }
    
}
