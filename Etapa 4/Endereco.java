//Definindo a classe endereço
public class Endereco {
    // variáveis privadas para armazenar nome da rua, cidade, estado, país, cep,
    // número, complemento
    private String NomeDaRua;
    private String Cidade;
    private String Estado;
    private String Pais;
    private String Cep;
    private String Numero;
    private String Complemento;

    // contrutor de endereço
    public Endereco(String nomeDaRua, String cidade, String estado, String pais, String numero, String cep,
            String complemento) {
        this.NomeDaRua = nomeDaRua;
        this.Cidade = cidade;
        this.Estado = estado;
        this.Pais = pais;
        this.Cep = cep;
        this.Numero = numero;
        this.Complemento = complemento;
    }

    // métodos getters e seters
    public String getNomeDaRua() {
        return NomeDaRua;
    }

    public void setNomeDaRua(String nomeDaRua) {
        this.NomeDaRua = nomeDaRua;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String cidade) {
        this.Cidade = cidade;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        this.Estado = estado;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String pais) {
        this.Pais = pais;
    }

    public String getCep() {
        return Cep;
    }

    public void setCep(String cep) {
        this.Cep = cep;
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String numero) {
        this.Numero = numero;
    }

    public String getComplemento() {
        return Complemento;
    }

    public void setComplemento(String complemento) {
        this.Complemento = complemento;
    }

    // sobrescrevendo método toString para formatar dados de endereço
    @Override
    public String toString() {
        return "Nome da Rua: " + NomeDaRua + "Cidade: " + Cidade + "Estado: " + Estado + "País: " + Pais + "Cep: " + Cep
                + "Numero: " + Numero + "Complemento: " + Complemento;
    }
}
