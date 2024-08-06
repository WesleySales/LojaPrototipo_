package Entidade;

import java.util.Objects;

public class Produto implements Comparable<Produto>{

    private static int contadorProdutoID=1;
    private int id;
    private String nome;
    private int estoque;
    private double preco;
    private Categoria categoria;

    public Produto(){
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produto produto)) return false;
        return getId() == produto.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    public int compareTo(Produto p) {
        return Double.compare(preco, p.getPreco());
    }

    public Produto(String nome, double preco, Categoria categoria) {
        this.id = contadorProdutoID++;
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "\n\nProduto: " +id + "\nNome: " + nome + "\nPreço: " +preco +"\n" +categoria;
    }
}
