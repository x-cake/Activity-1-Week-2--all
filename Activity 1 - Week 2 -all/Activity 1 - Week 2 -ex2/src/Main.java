//As maçãs custam R$ 1,30 cada, se forem compradas menos de uma dúzia e R$ 1,00,
// se forem compradas pelo menos 12. Escreva um programa que leia o número de maçãs compradas,
// calcule e escreva o custo total da compra.

import java.util.Scanner;

class itensComprados{
    public static void main(String[] args) {
        Scanner quantidade = new Scanner(System.in);

        System.out.print("Quantas maçãs você comprou? ");
        int compra = quantidade.nextInt();

        if(compra >= 12){
            System.out.println("Nesse caso, cada maçã sai por R$1,00.\nValor a ser pago R$"+compra);
        }else if(compra >= 1){
            double pagamento = compra * 1.30;
            System.out.println("Nesse caso, cada maçã sai por R$1,30.\nValor a ser pago R$"+pagamento);
        }else{
            System.out.println("Entrada inválida.");
        }

    }
}