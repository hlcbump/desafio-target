import java.util.Scanner;

public class Ocorrencia {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite qualquer coisa: ");
        String stringOcorrencia = sc.nextLine();

        int encontrado = 0;

        for (int i = 0; i < stringOcorrencia.length(); i++){
            char letraAtual = stringOcorrencia.charAt(i);

            if (letraAtual == 'a' || letraAtual == 'A'){
                encontrado++;
            }
        }

        System.out.println("A letra 'a' ou 'A' foi encontrada : " + encontrado + " vezes.");
    }
}
