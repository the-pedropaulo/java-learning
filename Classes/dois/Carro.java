package Classes.dois;

public class Carro {
    private String nome;
    private Boolean ligado;
    private Boolean destruido;
    private int blindagem;
    private Boolean armamento;

    public Carro(String _nome){
        this.nome = _nome;
        this.ligado = false;
        this.destruido = false;
        this.blindagem = 0;
        this.armamento = false;
    }

    public String getNome() {
        return this.nome;
    }

    public Boolean getLigado() {
        return this.ligado;
    }

    public void setLigado(Boolean _ligado) {
        this.ligado = _ligado;
    }

    public Boolean getDestruido() {
        return this.destruido;
    }

    public Boolean getArmamento() {
        return this.armamento;
    }

    public void setArmamento(Boolean _armamento) {
        this.armamento = _armamento;
    }

    public int getBlidagem() {
        return this.blindagem;
    }

    public void setBlidagem(int _blindagem) {
        this.blindagem = _blindagem;
    }

    public void sofrerDano(int dano) {
        this.blindagem -= dano;
        if(this.blindagem<=0) {
            this.blindagem = 0;
            this.ligado = false;
            this.destruido = true;
        }
    }

    public void info() {
        System.out.println("------------");
        System.out.printf("Nome.......%s%n", this.nome);
        System.out.printf("Ligado.......%s%n", this.ligado ? "Sim" : "Não");
        System.out.printf("Destruido.......%s%n", this.destruido ? "Sim" : "Não");
        System.out.printf("Blindagem.......%s%n", this.blindagem);
        System.out.printf("Armamento.......%s%n", this.armamento ? "Sim" : "Não");
    
    }


}
