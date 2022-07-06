package Classes.dois;

public class Programa {
    public static void main(String[] args) {
        final int numCarros = 3;
        Carro[] carros = new Carro[numCarros];
        String[] nomes_carros = {"HRV", "FOX", "CORSA"};
        
        for (int i = 0; i < numCarros; i++) {
            carros[i] = new Carro(nomes_carros[i]);
        }

        for (int i = 0; i < numCarros; i++) {
            carros[i].info();
        }
        // OU
        for(Carro c:carros) {
            c.info();
        }

    }
}
