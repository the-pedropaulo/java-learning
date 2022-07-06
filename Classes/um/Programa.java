package Classes.um;

public class Programa {
    public static void main(String[] args) {
        
        int num = 0;

        Jogador j1 = new Jogador(++num);
        Jogador j2 = new Jogador(++num);

        j1.addLifes();
        System.out.printf("%nVidas do jogador 1: %d", j1.getLifes());
        System.out.printf("%nVidas do jogador 2: %d", j2.getLifes());

    }
}
