//Ler o ano atual e o ano de nascimento de uma pessoa.
// Escrever uma mensagem que diga se ela poderá ou não votar este ano (não é necessário considerar o mês em que a pessoa nasceu).


import java.util.Scanner;
import java.util.Calendar;

class votoValido {
    public static void main(String[] args) {
        Scanner anoNascimento = new Scanner(System.in);

        System.out.println("Exemplo de entrada válida: 1998");
        System.out.print("Digite o ano em que você nasceu, seguindo o formato do exemplo: ");
        int ano = anoNascimento.nextInt();

        int anoAtual = Calendar.getInstance().get(Calendar.YEAR);
        //System.out.println(anoAtual);

        int valor = anoAtual - ano;

        if(valor >= 16){
            System.out.printf("Com %d anos, você já pode votar!", valor);
        }else if(valor < 15 && valor >= 0){
            System.out.printf("Com %d anos, você ainda não pode votar.", valor);
        }

    }
}