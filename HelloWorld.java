import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {

        final int TAMANHO = 5;
        char[] gabarito = {'a', 'b', 'c', 'd', 'e'};
        char[] respostas = new char[TAMANHO];
        int nota = 0;
        Scanner scan = new Scanner(System.in);

        for(int i = 0; i<TAMANHO; i++) {
            System.out.printf("Informa a resposta %d:", i);
            respostas[i] = scan.nextLine().charAt(0);
        }

        for(int i = 0; i<TAMANHO; i++) {
            if(respostas[i] == gabarito[i]) {
                nota++;
            };
        }

        System.out.printf("%nNota do aluno: %d", nota);


    }
}