import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // instanciando o Scanner
        Scanner scanner = new Scanner(System.in);

        // receber nome do vendedor
        System.out.print("Digite o nome completo do vendedor: ");
        String nomeVendedor = scanner.nextLine();

        // receber codigo da peça
        System.out.print("Digite o código da peça(EX: b26): ");
        String codigoPeca = scanner.nextLine();

        //receber valor da peça
        System.out.print("Digite o valor da peça: ");
        double precoPeca = scanner.nextDouble();                   // tramento de erro para digitar apenas numeros


        // rebecer a quantidade de peças vendidas
        System.out.print("Digite a quantidade de peças vendidas: ");              // tramento de erro para digitar apenas numeros
        int quantidadeVendida = scanner.nextInt();

        // fechando o scanner
        scanner.close();

        double valorTotalDaVenda = precoPeca * quantidadeVendida;
        double comissao = 0.05 * valorTotalDaVenda;

        System.out.println("Vendedor: " + nomeVendedor);
        System.out.println("Código da peça: " + codigoPeca);
        System.out.println("Valor da peça: " + precoPeca);
        System.out.println("Quantidade vendida: " + quantidadeVendida);
        System.out.println("Total da venda: R$" + valorTotalDaVenda);
        System.out.println("Comissão: " + comissao);
    }
}
