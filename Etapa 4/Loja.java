//definindo a classe loja
public class Loja {
    // variáveis para armazenar nome, quantidade de funcionários, salário dos
    // funcionários, endereço e data da fundaçao
    private String Nome;
    private int QuantidadeFuncionarios;
    private double SalarioBaseFuncionario;
    private Endereco endereco;
    private Data DataFundacao;
    private Produto[] estoqueProdutos;

    // construtor de loja
    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco,
            Data dataFundacao, int quantidadeMaximaProdutos) {
        this.Nome = nome;
        this.QuantidadeFuncionarios = quantidadeFuncionarios;
        this.SalarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.DataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[quantidadeMaximaProdutos];
    }

    // segundo construtor de loja passando salário base dos funcionários como -1
    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao,
            int quantidadeMaximaProdutos) {
        this.Nome = nome;
        this.QuantidadeFuncionarios = quantidadeFuncionarios;
        this.SalarioBaseFuncionario = -1;
        this.endereco = endereco;
        this.DataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[quantidadeMaximaProdutos];
    }

    // métodos getters e setters
    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        this.Nome = nome;
    }

    public int getQuantidadeFuncionarios() {
        return QuantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.QuantidadeFuncionarios = quantidadeFuncionarios;
    }

    public double getSalarioBaseFuncionario() {
        return SalarioBaseFuncionario;
    }

    public void setSalarioBaseFuncionario(double salarioBaseFuncionario) {
        this.SalarioBaseFuncionario = salarioBaseFuncionario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Data getDataFundacao() {
        return DataFundacao;
    }

    public void setDataFundacao(Data dataFundacao) {
        this.DataFundacao = dataFundacao;
    }

    public Produto[] getEstoqueProdutos() {
        return estoqueProdutos;
    }

    // sobrescrita toString para formatar dados de loja
    @Override
    public String toString() {
        return "Nome da loja" + Nome + "Quantidade de Funcionários" + QuantidadeFuncionarios + "Salário do Funcionário"
                + SalarioBaseFuncionario + "Endereço: " + endereco + "Fundação: " + DataFundacao + "Estoque de produtos"
                + estoqueProdutos;
    }

    // método para ver quanto a loja gasta com o salário dos funcionários
    public double gastosComSalario() {
        if (SalarioBaseFuncionario == -1) {
            return -1;
        } else
            return SalarioBaseFuncionario * QuantidadeFuncionarios;
    }

    // método para verificar o tamanho da loja
    public char tamanhoDaLoja() {
        if (QuantidadeFuncionarios < 10) {
            return 'P';
        } else if (QuantidadeFuncionarios >= 10 && QuantidadeFuncionarios <= 30) {
            return 'M';
        } else
            return 'G';
    }

    // percorre o array estoque de produtos e se não for nulo imprime as informações
    // do produto
    public void imprimeProdutos() {
        for (Produto produto : estoqueProdutos) {
            if (produto != null) {
                System.out.println(produto.toString());
            }
        }
    }

    // adiciona o produto no espaço vazio do array
    public boolean insereProduto(Produto produto) {
        for (int i = 0; i < estoqueProdutos.length; i++) {
            if (estoqueProdutos[i] == null) {
                estoqueProdutos[i] = produto;
                return true;
            }
        }
        return false;
    }

    // remove o produto caso ele não seja nulo e tenha o nome dentro do array
    public boolean removeProduto(String nomeProduto) {
        for (int i = 0; i < estoqueProdutos.length; i++) {
            Produto produto = estoqueProdutos[i];
            if (produto != null && produto.getNome().equals(nomeProduto)) {
                estoqueProdutos[i] = null;
                return true;
            }
        }
        return false;
    }
}