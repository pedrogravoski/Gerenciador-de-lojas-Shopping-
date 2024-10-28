//definindo classe Produto
public class Produto {
    // variáveis para armazenar nome e preço
    private String Nome;
    private double Preco;
    private Data DataValidade;
    private Data DataAtual = new Data(27, 10, 2023);

    // construtor de produto
    public Produto(String nome, double preco, Data dataValidade) {
        this.Nome = nome;
        this.Preco = preco;
        this.DataValidade = dataValidade;
    }

    // métodos getters e setters
    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        this.Nome = nome;
    }

    public double getPreco() {
        return Preco;
    }

    public void setPreco(double preco) {
        this.Preco = preco;
    }

    public Data getDataValidade() {
        return DataValidade;
    }

    public void setDataValidade(Data dataDeValidade) {
        this.DataValidade = dataDeValidade;
    }

    // método toString para formatar dados de produto
    @Override
    public String toString() {
        return "Nome do produto" + Nome + "Preço do Produto" + Preco + "Data de validade: " + DataValidade
                + "Data de Validade: " + DataValidade;
    }

    // METODO estaVencido recebe um objeto dataDeValidade do tipo data
    public boolean estaVencido(Data data) {
        System.out.println(DataAtual);
        if (DataAtual.getAno() > data.getAno() ||
                (DataAtual.getAno() == data.getAno() && DataAtual.getMes() > data.getMes())
                || (DataAtual.getAno() == data.getAno() && DataAtual.getMes() == data.getMes()
                        && DataAtual.getDia() > data.getDia())) {
            return true;
        } else {
            return false;
        }
    }
}