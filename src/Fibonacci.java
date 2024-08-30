import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um numero inteiro: ");
        int numero = sc.nextInt();

        int a = 0, b = 1;
        boolean pertence = false;

        System.out.println("Sequencia fibonacci: \n" + a);
        while (b <= numero){

            System.out.println(b);

            if (b == numero){
                pertence = true;
            }

            int aux = b;
            b = a + b;
            a = aux;
        }

        System.out.println();
        if (pertence){
            System.out.println("o numero " + numero + " pertence a sequencia");
        } else {
            System.out.println("o numero" + numero + " não pertence a sequencia");
        }

        sc.close();
    }
}