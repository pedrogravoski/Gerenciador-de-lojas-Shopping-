//criação da subclasse vestuário herdando da classe pai Loja seus atributos e métodos
public class Vestuario extends Loja {
    private boolean ProdutosImportados;

    // método construtor de vestuario importanto da classe pai LOJA seus atributos.
    public Vestuario(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco,
            Data dataFundacao, boolean produtosImportados, int quantidadeMaximaProdutos) {
        super(nome, quantidadeFuncionarios, endereco, dataFundacao, quantidadeMaximaProdutos);
        this.ProdutosImportados = produtosImportados;
    }

    // getters e setters
    public boolean getProdutosImportados() {
        return ProdutosImportados;
    }

    public void setProdutosImportados(boolean produtosImportados) {
        this.ProdutosImportados = produtosImportados;
    }

    @Override // sobrescrita para formatar dados de loja e vestuario.
    public String toString() {
        return super.toString() + "Produtos importados: " + ProdutosImportados;
    }
}
