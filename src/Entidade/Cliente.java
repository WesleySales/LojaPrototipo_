package Entidade;

public class Cliente {
    private static long ID_ClienteGerador=10001;
    private long ID_Cliente;
    private String nome;
    private int idade;

    public Cliente(String nome, int idade) {
        this.ID_Cliente= ID_ClienteGerador++;
        this.nome = nome;
        this.idade = idade;
    }

    public static long getID_ClienteGerador() {
        return ID_ClienteGerador;
    }

    public static void setID_ClienteGerador(long ID_ClienteGerador) {
        Cliente.ID_ClienteGerador = ID_ClienteGerador;
    }

    public long getID_Cliente() {
        return ID_Cliente;
    }

    public void setID_Cliente(long ID_Cliente) {
        this.ID_Cliente = ID_Cliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
