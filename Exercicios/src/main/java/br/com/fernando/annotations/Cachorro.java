package br.com.fernando.annotations;

public class Cachorro {
    @StringLayoutada(tamanho = 15)
    private String nome;
    @StringLayoutada(tamanho = 15)
    private String raca;
    @StringLayoutada(tamanho = 3, tipo = TipoLayout.NUMERAL)
    private String idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }
}
