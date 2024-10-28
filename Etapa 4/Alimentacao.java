// criação da subclasse Bijuteria herdando da classe pai Loja seus atributos e métodos
public class Alimentacao extends Loja {

    private Data DataAlvara;

    // metodo construtor de Alimentacao herdando da classe pai seus metodos
    public Alimentacao(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco,
            Data dataFundacao, Data dataAlvara, int quantidadeMaximaProdutos) {
        super(nome, quantidadeFuncionarios, endereco, dataFundacao, quantidadeMaximaProdutos);
        this.DataAlvara = dataAlvara;
    }

    // getters e setters
    public Data getDataAlvara() {
        return DataAlvara;
    }

    public void setDataAlvara(Data dataAlvara) {
        this.DataAlvara = dataAlvara;
    }

    @Override // sobrescrita de metodos da subclasse Alimentacao e da classe pai Loja
    public String toString() {
        return super.toString() + "Data Alvara: " + DataAlvara;
    }

}
