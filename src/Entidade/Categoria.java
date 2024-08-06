package Entidade;

import java.util.Objects;

public class Categoria {

    private static int contadorCategoriaID =1;
    private int id;
    private String nome;

    public Categoria(){
    }

    public Categoria(String nome) {
        this.id = contadorCategoriaID++;
        this.nome = nome;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Categoria categoria)) return false;
        return getId() == categoria.getId() && Objects.equals(getNome(), categoria.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNome());
    }

    @Override
    public String toString() {
        return "Id Categoria: "+ id +"\nCategoria: " + nome;
    }
}
