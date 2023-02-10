import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        System.out.println("Escreva um valor:"); //cria o que será lido
        int userValor = valor.nextInt(); //ler

        if(userValor>0){
            System.out.println("número positivo");
        }

        else if(userValor==0){
            System.out.println("número zero");
        }

        else{
            System.out.println("número negativo");
        }

    }
}
