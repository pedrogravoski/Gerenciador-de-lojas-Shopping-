// criação da subclasse Informatica herdando da classe pai Loja seus atributos e métodos
public class Informatica extends Loja {
    private double SeguroEletronicos;

    // método construtor de Informatica importanto da classe pai LOJA seus
    // atributos.
    public Informatica(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco,
            Data dataFundacao, double seguroEletronicos, int quantidadeMaximaProdutos) {
        super(nome, quantidadeFuncionarios, endereco, dataFundacao, quantidadeMaximaProdutos);
        this.SeguroEletronicos = seguroEletronicos;
    }

    // getters e setters
    public double getSeguroEletronicos() {
        return SeguroEletronicos;
    }

    public void setSeguroEletronicos(double seguroEletronicos) {
        this.SeguroEletronicos = seguroEletronicos;
    }

    public double getValorSeguroEletronicos() {
        return 0;
    }

    @Override // sobrescrita para formatar os dados de loja e Informatica.
    public String toString() {
        return super.toString() + "Seguro Eletronico: " + SeguroEletronicos;
    }
}
