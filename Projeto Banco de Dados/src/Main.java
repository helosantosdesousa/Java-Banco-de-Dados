import connection.ConnectionFactory;
import produto.Produto;
import produto.ProdutoDAO;

import javax.swing.*;
import java.sql.Connection;
import java.text.DecimalFormat;
import java.util.*;

public class Main {
    Connection connection = ConnectionFactory.getInstance().getConnection();
    private List <Produto> list = new ArrayList<Produto>();

    public static void main(String[] args) {
        ProdutoDAO produtoDAO = new ProdutoDAO();
        Produto produto;
        DecimalFormat format = new DecimalFormat("#, ## 0.00");

        //---------------------- Inserir produto ----------------------
        /*produto = new Produto(2, "Monopoly", 50, 49.90);
        produtoDAO.insere(produto);*/

        /*produto = new Produto(3, "Bola", 2, 5.00);
        produtoDAO.insere(produto);*/

        /*produto = new Produto(4, "Boneca Barbie", 500, 120.00);
        produtoDAO.insere(produto);*/

        //---------------------- Listar produtos ----------------------
        List<Produto> list = produtoDAO.listar();
        for (Produto p : list) {
            System.out.println(p);
        }

        //---------------------- Calcular valor estoque ----------------------

        System.out.println("Valor em estoque: ");
        double valorItens=0, valorTotal = 0;

        for (Produto p : list) {
            valorItens = (p.getQtdEstoque()*p.getPreco())+valorItens;
        }
        System.out.println("R$ " + format.format(valorItens));

        //---------------------- Printar o produto com a menor quantidade no estoque ----------------------
        list.sort(Comparator.comparing(Produto::getQtdEstoque));
        System.out.println("Produto com menor quantidade no estoque: " + list.get(0).getNome());

    }
}