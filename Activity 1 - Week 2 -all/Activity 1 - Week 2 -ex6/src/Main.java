//Ler 3 valores (considere que não serão informados valores iguais) e escrever a soma dos 2 maiores.

import java.util.Scanner;

class somaMaiores {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);

        System.out.println("Entre com 3 valores INTEIROS diferentes:");
        int n1 = numero.nextInt();
        int n2 = numero.nextInt();
        int n3 = numero.nextInt();

        if(n1 > n2 && n2 > n3){
            int soma = n1 + n2;
            System.out.println(soma);
        }else if(n1 > n2 && n3 > n2){
            int soma = n1 + n3;
            System.out.println(soma);
        }else if(n2 > n1 && n1 > n3){
            int soma = n2 + n1;
            System.out.println(soma);
        }else if(n2 > n3 && n3 > n1);{
            int soma = n2 + n3;
            System.out.println(soma);
        }else if(n3 > n1 && n1 > n2){
            int soma = n3 + n1;
            System.out.println(soma);
        }else{
            int soma = n3 + n2;
            System.out.println(soma);
        }
    }
}