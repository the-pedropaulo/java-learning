package Classes.tres;

public class Programa {
    public static void main(String[] args) {
        int[] numeros = {1,2,4,5,525,25,566,4,5,33};

        parOuImpar(numeros);

    }

    public static void parOuImpar(int[] numeros) {
        for(int n:numeros) {
            if(n%2==0) {
                System.out.println("É par " + n);
            } else {
                System.out.println("É impar " + n);
            }
        }
    }
}
