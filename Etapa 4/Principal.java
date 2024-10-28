import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// CRIA OBJETO SCANNER PARA LER OS DADOS PASSADO PELO TECLADO
        // CRIA NOVOS OBJETOS PARA LOJA,PRODUTO, ENDEREÇO, E DATA
        Loja loja = new Loja(null, 0, null, null, 0);
        Produto produto = new Produto(null, 0, null);
        Endereco endereco = new Endereco(null, null, null, null, null, null, null);
        

        while (true) {// INICIA UM LOOPING PARA MANTER O MENU SENDO EXECUTADO
            // IMPRIME AS OPÇÕES PARA CRIAÇÃO DE LOJA, PRODUTO E PARA SAIR
            System.out.println("(1)Criar uma loja");
            System.out.println("(2)Criar um produto");
            System.out.println("(3)Sair");

            int opcao = scanner.nextInt();// LE AS ESCOLHAS DO USUARIO

            // USA SWITCH PARA MANIPULAR AS INSTRUÇOES DO USUARIO
            switch (opcao) {
                case 1:// PEDE OS DADOS PARA A CRIAÇÃO DE LOJA
                    scanner.nextLine();
                    System.out.println("Digite o nome da loja: ");
                    loja.setNome(scanner.nextLine());
                    System.out.println("Digite a rua da loja: ");
                    endereco.setNomeDaRua(scanner.nextLine());
                    System.out.println("Digite a cidade da loja: ");
                    endereco.setCidade(scanner.nextLine());
                    System.out.println("Digite o estado da loja: ");
                    endereco.setEstado(scanner.nextLine());
                    System.out.println("Digite o pais da Loja: ");
                    endereco.setPais(scanner.nextLine());
                    System.out.println("Digite o número da loja: ");
                    endereco.setNumero(scanner.nextLine());
                    System.out.println("Digite o CEP da loja: ");
                    endereco.setCep(scanner.nextLine());
                    System.out.println("Digite o complemento da loja: ");
                    endereco.setComplemento(scanner.nextLine());
                    System.out.println("Loja criada! ");
                    break;
                case 2:// PEDE OS DADOS PARA A CRIAÇÃO DE PRODUTO
                    System.out.println("Digite o nome do produto: ");
                    produto.setNome(scanner.nextLine());
                    scanner.nextLine();
                    System.out.println("Digite o preço do produto: ");
                    produto.setPreco(scanner.nextDouble());
                    System.out.println(" --Digite a data de validade do produto-- ");
                    System.out.println("Dia: ");
                    int dia = scanner.nextInt();
                    System.out.println("Mês: ");
                    int mes = scanner.nextInt();
                    System.out.println("Ano: ");
                    int ano = scanner.nextInt();
                    Data data = new Data(dia, mes, ano);
                    produto.setDataValidade(data);
                    System.out.println(data);
                    if(produto.estaVencido(data)) {
                        System.out.println("Produto está vencido");
                    } else {
                        System.out.println("Produto não está vencido");
                    }
                    System.out.println("Produto criado! ");
                    break;
                case 3:// FECHA O SISTEMA
                    scanner.close();
                    System.exit(0);
                    break;
                default:// CASO O USUARIO DIGITE UMA OPÇÃO INVALIDA IMPRIME OPÇÃO INVALIDA NA TELA
                    System.out.println("Opção inválida!");
            }
        }
    }
}
