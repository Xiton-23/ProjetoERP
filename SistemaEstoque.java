package estoque;

public class SistemaEstoque {
    public static void main(String[] args) {
        GerenciadorEstoque gerenciador = new GerenciadorEstoque();
        
        // Adicionando produtos de exemplo ao estoque
        gerenciador.adicionarProduto(new Produto("BARRA", "001", "METAL", "Esportes", "METAL", 50.0, 10, 4));
        gerenciador.adicionarProduto(new Produto("PARALELA_ALTA", "002", "METAL", "Esportes", "METAL", 200.0, 20, 5));
        
        // Registrando entrada e saída de produtos no estoque
        gerenciador.registrarEntrada("001", 5);
        gerenciador.registrarSaida("002", 4);
        
        // Gerando relatório final do estoque
        gerenciador.gerarRelatorio();
    }
}


