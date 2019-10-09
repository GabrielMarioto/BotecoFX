package botecofx.db.entidades;

public class TipoPgto {
    
    private int cod;
    private String nome;

    public TipoPgto() {
        this(0,"");
    }

    public TipoPgto(int cod, String nome) {
        this.cod = cod;
        this.nome = nome;
    }

    public TipoPgto(String nome) {
        this.nome = nome;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }
    
    
}
