package Entidade;

import java.util.*;

public class RegistroLoja {


    private Set<Categoria> categoriaSet;
    private Set<Produto> produtoSet;

    public RegistroLoja() {
        this.produtoSet = new HashSet<>();
        this.categoriaSet = new HashSet<>();
    }

    public void adicionarProduto(String nome, double preco, Categoria categoria){
        produtoSet.add(new Produto(nome,preco, categoria));
    }



    public Set<Produto> exibirProdutos(){
        return produtoSet;
    }

    public List<Produto> ordenarProdutosPorPreco() {
        List<Produto> listaDeProdutosPorPreco = new ArrayList<>(produtoSet);
        if(!produtoSet.isEmpty()){
            Collections.sort(listaDeProdutosPorPreco);
            return listaDeProdutosPorPreco;
        } else {
            throw new RuntimeException("Lista de produtos vazia");
        }

    }

    public void adicionarCategoria(String nome){
        categoriaSet.add(new Categoria(nome));
    }


    public static void main(String[] args) {

        RegistroLoja registroLoja = new RegistroLoja();

        registroLoja.adicionarCategoria("Livros");

        Categoria c1 = new Categoria("Calçados");
        Categoria c2 = new Categoria( "Bolsas");
        Categoria c3 = new Categoria( "Brinquedos");
        Categoria c4 = new Categoria( "Camisas");
        Categoria c5 = new Categoria( "Bolsas");

        registroLoja.adicionarProduto ("Tenis nike AirForce 1",399.90,c1);
        registroLoja.adicionarProduto ("Camisa Portugal Nike",39.90,c4);
        registroLoja.adicionarProduto ("Carrinho de Brinquedo",39.90,c3);
        registroLoja.adicionarProduto("Mochila Verde",159.90,c2);
        registroLoja.adicionarProduto("Mala grande",450,c5);
        registroLoja.adicionarProduto ("Boneco",30.00,c3);
        registroLoja.adicionarProduto("Bota coturno preta",250,c1);

        System.out.println("\nLista de Produtos Ordenada por Preço: \n"+registroLoja.ordenarProdutosPorPreco());
        System.out.println("\nLista de Produtos Ordenada por Preço: \n"+registroLoja.ordenarProdutosPorPreco());


    }
}
