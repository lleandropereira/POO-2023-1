import java.util.Scanner;

public class CompanhiaAerea {
    private static int[] assentos = new int[10]; // array de assentos inicialmente vazio
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        
        do {
            exibirMenu();
            opcao = sc.nextInt();
            
            if (opcao == 1) {
                reservarAssentoPrimeiraClasse();
            } else if (opcao == 2) {
                reservarAssentoClasseExecutiva();
            } else {
                System.out.println("Opção inválida! Digite novamente.");
            }
            
        } while (opcao != 0);
        
        sc.close();
    }
    
    public static void exibirMenu() {
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Primeira Classe");
        System.out.println("2 - Classe Executiva");
        System.out.println("0 - Sair");
    }
    
    public static void reservarAssentoPrimeiraClasse() {
        boolean assentoDisponivel = false;
        
        // verifica se há assentos disponíveis na primeira classe
        for (int i = 0; i < 5; i++) {
            if (assentos[i] == 0) {
                assentoDisponivel = true;
                assentos[i] = 1; // reserva o assento
                System.out.println("Assento na primeira classe reservado com sucesso. Número do assento: " + (i+1));
                break;
            }
        }
        
        // se não há assentos disponíveis na primeira classe, verifica se há na classe executiva
        if (!assentoDisponivel) {
            System.out.println("Não há assentos disponíveis na primeira classe. Deseja reservar na classe executiva? (1 - sim / 2 - não)");
            Scanner sc = new Scanner(System.in);
            int opcao = sc.nextInt();
            
            if (opcao == 1) {
                reservarAssentoClasseExecutiva();
            } else {
                System.out.println("Aguarde o próximo vôo!");
            }
        }
    }
    
    public static void reservarAssentoClasseExecutiva() {
        boolean assentoDisponivel = false;
        
        // verifica se há assentos disponíveis na classe executiva
        for (int i = 5; i < 10; i++) {
            if (assentos[i] == 0) {
                assentoDisponivel = true;
                assentos[i] = 1; // reserva o assento
                System.out.println("Assento na classe executiva reservado com sucesso. Número do assento: " + (i+1));
                break;
            }
        }
        
        // se não há assentos disponíveis na classe executiva, verifica se há na primeira classe
        if (!assentoDisponivel) {
            System.out.println("Não há assentos disponíveis na classe executiva. Deseja reservar na primeira classe? (1 - sim / 2 - não)");
            Scanner sc = new Scanner(System.in);
            int opcao = sc.nextInt();
            
            if (opcao == 1) {
                reservarAssentoPrimeiraClasse();
            } else {
                System.out.println("Aguarde o próximo vôo!");
            }
        }
    }
}
