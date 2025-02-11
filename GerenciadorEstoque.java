package estoque;

import java.util.*;

public class GerenciadorEstoque {
    private List<Produto> estoque;

    public GerenciadorEstoque() {
        estoque = new ArrayList<>();
    }

    // Adiciona um novo produto ao estoque
    public void adicionarProduto(Produto produto) {
        estoque.add(produto);
    }

    // Busca um produto no estoque pelo código
    public Produto buscarProduto(String codigo) {
        for (Produto produto : estoque) {
            if (produto.getCodigo().equals(codigo)) {
                return produto;
            }
        }
        return null;
    }

    // Registra a entrada de produtos no estoque
    public void registrarEntrada(String codigo, int quantidade) {
        Produto produto = buscarProduto(codigo);
        if (produto != null) {
            produto.adicionarEstoque(quantidade);
            System.out.println("Entrada registrada com sucesso!");
        } else {
            System.out.println("Produto não encontrado!");
        }
    }

    // Registra a saída de produtos do estoque
    public void registrarSaida(String codigo, int quantidade) {
        Produto produto = buscarProduto(codigo);
        if (produto != null) {
            if (produto.removerEstoque(quantidade)) {
                System.out.println("Saída registrada com sucesso!");
            } else {
                System.out.println("Estoque insuficiente!");
            }
        } else {
            System.out.println("Produto não encontrado!");
        }
    }

    // Gera um relatório com todos os produtos no estoque
    public void gerarRelatorio() {
        System.out.println("Relatório de Estoque:");
        for (Produto produto : estoque) {
            System.out.println(produto);
        }
    }
}
