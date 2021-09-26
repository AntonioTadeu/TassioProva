package com.tassioprova.model.repository.produto;

import com.tassioprova.model.entity.Produto;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;

public class ProdutoRepository {

    private JdbcTemplate jdbcTemplate;

    public ProdutoRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Produto cadastrar(Produto produto) throws Exception {
        String sql = "insert into produto(id, nome, descricao, fotoUrl, dataCadastro, dataUltimaAtualizacao, valorUnitario) values (?, ?, ?, ?, ?, ?, ?)";
        int insert = jdbcTemplate.update(sql, produto.getId(), produto.getNome(), produto.getDescricao(), produto.getFotoUrl(), produto.getDataCadastro(), produto.getDataUltimaAtualizacao(), produto.getValorUnitario());

        if(insert == 1) {
            return produto;
        }

        throw new Exception("Houve um erro ao inserir o produto.");
    }


    public ArrayList<Produto> searchID(Integer id) throws Exception {
        String sql = "SELECT * FROM produto WHERE id = ?";
        ArrayList<Produto> searchID = (ArrayList<Produto>) jdbcTemplate.query(sql, new ProdutoMapper(), id);

        if (searchID.size() > 0) {
            return (ArrayList<Produto>) jdbcTemplate.query(sql, new Object[]{id}, new ProdutoMapper());
        }
        throw new Exception("Não há produtos com o id inserido.");
    }

}
