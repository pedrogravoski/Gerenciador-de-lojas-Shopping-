//criação da subclasse Cosmetico herdando da classe pai Loja seus atributos e métodos
public class Cosmetico extends Loja {
    private double TaxaComercializacao;

    // metodo construtor de cosmetico herdando os metodos da classe pai Loja
    public Cosmetico(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco,
            Data dataFundacao, double taxaComercializacao, int quantidadeMaximaProdutos) {
        super(nome, quantidadeFuncionarios, endereco, dataFundacao, quantidadeMaximaProdutos);
        this.TaxaComercializacao = taxaComercializacao;
    }

    // getters e setters
    public double getTaxaComercializacao() {
        return TaxaComercializacao;
    }

    public void setTaxaComercializacao(double taxaComercializacao) {
        this.TaxaComercializacao = taxaComercializacao;
    }

    @Override // sobrescrita para formatar dados da subclasse Cosmeticos e a classe pai Loja
    public String toString() {
        return super.toString() + "Taxa de comercialização: " + TaxaComercializacao;
    }

}
