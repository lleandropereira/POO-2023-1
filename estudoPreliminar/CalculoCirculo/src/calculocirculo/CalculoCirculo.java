/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculocirculo;

import java.util.Scanner;

/**
 *
 * @author leandropereira
 */
public class CalculoCirculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Informe o valor do raio: ");
        double raio = entrada.nextDouble();
        
        double PI = Math.PI;
        
        double diametro = 2 * raio;
        double circunferencia = (2 * PI) * raio;
        double area = PI * (raio * raio);
        
        System.out.println(" Diâmetro: " + diametro +
                           "\n Circunferência: " + circunferencia +
                            "\n Área: " + area);
    }
    
}
