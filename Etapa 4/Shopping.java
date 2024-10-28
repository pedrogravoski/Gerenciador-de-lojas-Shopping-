import java.text.Normalizer;

public class Shopping {
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;

    public Shopping(String nome, Endereco endereco, int quantidadeMaximaLojas) {
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[quantidadeMaximaLojas];
    }

    // getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Loja[] getLojas() {
        return lojas;
    }

    // sobrescrita para formatar os dados
    @Override
    public String toString() {
        return "Nome do Shopping: " + nome + "Endereço: " + endereco + "Lojas: " + lojas;
    }

    // verifica posição vazia no array e insere nova loja
    public boolean insereLoja(Loja novaLoja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] == null) {
                lojas[i] = novaLoja;
                return true;
            }
        }
        return false;
    }

    // metodo percorre o array vendo as posiçoes preenchidas e removendo os nomes
    // que forem iguais ao recebido
    public boolean removeLoja(String nomeLoja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] != null && lojas[i].getNome().equals(nomeLoja)) {
                lojas[i] = null;
                return true;
            }
        }
        return false;
    }

    public int quantidadeLojasPorTipo(String tipoLoja) {
        int quantidade = 0;
        String tipoNormalizado = Normalizer.normalize(tipoLoja, Normalizer.Form.NFD)
                .replaceAll("\\p{M}", "");

        for (Loja loja : lojas) {
            if (loja != null) {
                String tipoLojaAtual = loja.getClass().getSimpleName();

                String tipoLojaAtualNormalizado = Normalizer.normalize(tipoLojaAtual, Normalizer.Form.NFD)
                        .replaceAll("\\p{M}", "");
                if (tipoLojaAtualNormalizado.equalsIgnoreCase(tipoNormalizado)) {
                    quantidade++;
                }
            }
        }
        return quantidade;
    }

    public Informatica lojaSeguroMaisCaro() {
        Informatica lojaMaisCara = null;
        double maiorValorSeguro = 0.0;

        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] instanceof Informatica) {
                Informatica lojaInformatica = (Informatica) lojas[i];
                double valorSeguro = lojaInformatica.getSeguroEletronicos();

                if (valorSeguro > maiorValorSeguro) {
                    maiorValorSeguro = valorSeguro;
                    lojaMaisCara = lojaInformatica;
                }
            }
        }

        return lojaMaisCara;
    }

}
