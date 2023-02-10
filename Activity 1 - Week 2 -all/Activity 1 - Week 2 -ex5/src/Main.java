//Faça um algoritmo para ler: número da conta do cliente, saldo, débito e crédito. Após, calcular e escrever o saldo atual (saldo atual = saldo - débito + crédito).
// Também testar se saldo atual for maior ou igual a zero escrever a mensagem 'Saldo Positivo', senão escrever a mensagem 'Saldo Negativo'.

import java.util.Scanner;

class cliente {
    public static void main(String[] args){
        Scanner dados = new Scanner(System.in);

        System.out.println("Digite os dados a seguir: ");

        System.out.print("Seu saldo R$");
        int saldo = dados.nextInt();
        System.out.print("Valor em debito R$");
        int debito = dados.nextInt();
        System.out.print("Credito disponivel R$");
        int credito = dados.nextInt();

        int saldoAtual = (saldo - debito) + credito;

        if(saldoAtual > 0){
            System.out.printf("Saldo R$%d é positivo", saldoAtual);
        }else{
            System.out.printf("Saldo R$%d é negativo", saldoAtual);
        }

    }
}
