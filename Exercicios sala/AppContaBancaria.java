
import java.util.Scanner;


public class AppContaBancaria {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        ContaBancaria conta1 = new ContaBancaria("12345", "João da Silva", 1000.0);
        ContaBancaria conta2 = new ContaBancaria("67890", "Maria Oliveira", 2000.0);
        
        
        
        int op = 0;
        do {
        
        System.out.println("Menu");
        System.out.println("1 - Depósito");
        System.out.println("2 - Saque");
        System.out.println("3 - Tranferencia");
        System.out.println("4 - Sair");
        op = entrada.nextInt();
        
            switch (op) {
            case 1:
            System.out.println("Número da conta para depósito: ");
            String numeroContaDep = entrada.next();  
            System.out.println("Valor do depósito: ");
            double valorDep = entrada.nextDouble();
            if (numeroContaDep.equals(conta1.getNumero())){
            conta1.depositar(valorDep);
            } else if (numeroContaDep.equals(conta2.getNumero())){
            conta2.depositar(valorDep);
            } else {
                System.out.println("Conta nao encontrada. ");
            }
            break;
            case 2:
            System.out.println("Numero da conta para saque: ");
            String numeroContaSaq = entrada.next();
            System.out.println("Valor do saque: ");
            double valorSaq = entrada.nextDouble();
            
            if (numeroContaSaq.equals(conta1.getNumero())){
            conta1.sacar(valorSaq);
            } else if (numeroContaSaq.equals(conta2.getNumero())){
            conta2.sacar(valorSaq);
            } else {
                System.out.println("Conta não encontrada. ");
            }
            break;
            case 3:
            System.out.println("Numero da conta origem: ");
            String numeroContaOrigem = entrada.next();
            System.out.println("Numero da conta destino: ");
            String numeroContaDestino = entrada.next();
            System.out.println("Valor da tranferência: ");
            double valorTranf = entrada.nextDouble();
                
            ContaBancaria origem = null, destino = null;
            
            if (numeroContaOrigem.equals(conta1.getNumero())){
            origem = conta1;
            } else if (numeroContaOrigem.equals(conta2.getNumero())){
            origem = conta2;
            }
            
            if (numeroContaDestino.equals(conta1.getNumero())){
            destino = conta1;
            } else if (numeroContaDestino.equals(conta2.getNumero())){
            destino = conta2;
            } 
            
            if (origem != null && destino != null){
            origem.transferir(destino, valorTranf);
            } else {
            System.out.println("Conta de origem ou destino não encontrada.");
            } 
            break;
            case 4:
            System.out.println("Saindo...");
            break;
            default:
        }
        } while (op != 4);
       
        entrada.close();
        
    } // static
} // end app
