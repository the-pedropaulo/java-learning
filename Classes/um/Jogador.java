package Classes.um;

public class Jogador {
    private final int maxVidas = 3;
    private int number = 0;
    private int lifes = 0;

    public Jogador(int _number) {
        this.number = _number;
        this.lifes = 1;
        System.out.printf("%nJogador numero %d foi criado%n", number);
    }

    public int getLifes() {
        return this.lifes;
    }

    public void addLifes() {
        if(this.lifes < maxVidas) {
            this.lifes++;
        }
    }
}


