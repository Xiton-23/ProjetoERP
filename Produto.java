
  package estoque;  
  
  import java.util.*;
  //Classe Produto:
  public class Produto{
	  private String nomeProduto;
	  private String codigo;
	  private String fornecedor;
	  private String categoria;
	  private String marca;
	  private double precoCusto;
	  private int  quantidade;
	  private int  estoqueMinimo;
	  
	  //Construtor para inicializar um produto
	  
	  public Produto(String nomeProduto, String codigo, String fornecedor, String categoria, String  marca, double precoCusto, int  quantidade,  int estoqueMinimo){
		  this.nomeProduto = nomeProduto;
		  this.codigo = codigo;
		  this.fornecedor = fornecedor;
		  this.categoria = categoria;
		  this.marca = marca;
		  this.precoCusto = precoCusto;
		  this.quantidade = quantidade;
		  this.estoqueMinimo = estoqueMinimo;
	  }
	//Metodos get
    public String getCodigo() {
        return codigo;
    }
	
    public int getQuantidade() {
        return quantidade;
    }
	//Método que adiciona  produto ao estoque e verifica se o estoque tá baixo
    public void adicionarEstoque(int quantidade){
		this.quantidade += quantidade;
		verificarEstoqueBaixo();
	}	
	//Método que remove um produto do estoque e verifica se a quantidade disponivel é suficiente
	public boolean removerEstoque(int quantidade){
		if(this.quantidade >=quantidade){
			this.quantidade -=quantidade;
		 verificarEstoqueBaixo();
		 return true;
		}
		 return false;
	}
	//Método para verificar se o estoque está baixo 
	public void verificarEstoqueBaixo(){
		if(this.quantidade <= estoqueMinimo){
			System.out.println("ALERTA: Estoque baixo para o produto:\n" + nomeProduto	+ "(Código:" + codigo +")");
		}
	}
	  public String toString() {
        return nomeProduto	+ ", " + codigo + ", " + fornecedor + ", " + categoria + ", " + marca + ", " + precoCusto + ", " + quantidade;
    }
}