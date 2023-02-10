//Ler dois valores (considere que não serão lidos valores iguais) e escrever o maior deles.


import java.util.Scanner;

class numeros {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int num1 = num.nextInt();

        System.out.print("Digite outro numero: ");
        int num2 = num.nextInt();

        if(num1 > num2){
            System.out.print("O numero maior é "+num1);
        }else{
            System.out.print("O numero maior é "+num2);
        }

    }
}

