package produto;

import connection.ConnectionFactory;
import oracle.jdbc.proxy.annotation.Pre;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO {
    private String sql;
    private PreparedStatement ps;
    private ResultSet rs;
    private Connection connection;

    //Inserir
    public void insere(Produto produto){
        connection = ConnectionFactory.getInstance().getConnection();
        sql = "INSERT INTO JAVA_PRODUTO VALUES (?,?,?,?)";
        try{
            ps = connection.prepareStatement(sql);
            ps.setInt(1, produto.getId());
            ps.setString(2, produto.getNome());
            ps.setInt(3, produto.getQtdEstoque());
            ps.setDouble(4, produto.getPreco());
            ps.execute();
        } catch (SQLException e){
            System.out.println("Erro ao inserir produto\n" + e);
        }
    }

    //Listar
    public List<Produto> listar(){
        List<Produto> list = new ArrayList<Produto>();

        connection = ConnectionFactory.getInstance().getConnection();
        sql = "SELECT*FROM JAVA_PRODUTO";

        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()){
                list.add(new Produto(rs.getInt("id"),
                        rs.getString("nome"),
                        rs.getInt("qtd_estoque"),
                        rs.getDouble("preco")));
            }
        } catch (SQLException e){
            System.out.println("Erro ao listar os produtos\n " + e);
        }
        return list;
    }

}
