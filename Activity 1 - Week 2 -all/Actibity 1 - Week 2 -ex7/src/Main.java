//Ler dois valores e imprimir uma das três mensagens a seguir: ‘Números iguais’, caso os números sejam iguais ‘Primeiro é maior’,
// caso o primeiro seja maior que o segundo; ‘Segundo maior’, caso o segundo seja maior que o primeiro.

import java.util.Scanner;

class numeros{
    public static void main(String[] arg){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int num1 = entrada.nextInt();

        System.out.print("Digite mais um numero inteiro: ");
        int num2 = entrada.nextInt();

        if(num1 == num2){
            System.out.println("Numeros iguais.");
        }else if(num1 > num2){
            System.out.println("Primeiro numero é maior.");
        }else{
            System.out.println("Segundo numero é maior.");
        }

    }
}