// criação da subclasse Bijuteria herdando da classe pai Loja seus atributos e métodos
public class Bijuteria extends Loja {

    private double MetaVendas;

    // metodo construtor da subclasse bijuteria e da classe pai Loja.
    public Bijuteria(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco,
            Data dataFundacao, double metaVendas, int quantidadeMaximaProdutos ) {
        super(nome, quantidadeFuncionarios, endereco, dataFundacao, quantidadeMaximaProdutos);
        this.MetaVendas = metaVendas;
    }

    // getters e setters
    public double getMetaVendas() {
        return MetaVendas;
    }

    public void setMetaVendas(double metaVendas) {
        this.MetaVendas = metaVendas;
    }

    @Override // sobrescrita de metodos de Bijuteria e da classe pai Loja
    public String toString() {
        return super.toString() + "Meta de vendas: " + MetaVendas;
    }

}
