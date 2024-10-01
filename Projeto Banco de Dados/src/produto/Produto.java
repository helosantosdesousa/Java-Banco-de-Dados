package produto;

public class Produto implements Comparable<Produto> {
    private int id;
    private String nome;
    private int qtdEstoque;
    private double preco;

    public Produto(int id, String nome, int qtdEstoque, double preco) {
        this.id = id;
        this.nome = nome;
        this.qtdEstoque = qtdEstoque;
        this.preco = preco;
    }


    @Override
    public String toString() {
        return id + " -- " + nome + " -- " + qtdEstoque + " -- " + preco;
    }
    @Override
    public int compareTo(Produto produto){
        return nome.compareTo(produto.nome);
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

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
