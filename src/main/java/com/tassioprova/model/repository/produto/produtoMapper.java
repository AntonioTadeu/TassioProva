package com.tassioprova.model.repository.produto;

import com.tassioprova.model.entity.Produto;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class produtoMapper implements RowMapper<Produto> {
    @Override
    public Produto mapRow(ResultSet resultSet, int a) throws SQLException {
        Produto produto = new Produto();
        produto.setId(resultSet.getInt("id"));
        produto.setNome(resultSet.getString("nome"));
        produto.setDescricao(resultSet.getString("descricao"));
        produto.setFotoUrl(resultSet.getString("fotoUrl"));
        produto.setDataCadastro(resultSet.getDate("dataCadastro").toLocalDate());
        produto.setDataUltimaAtualizacao(resultSet.getTimestamp("dataUltimaAtualizacao"));
        produto.setValorUnitario(resultSet.getFloat("valorUnitario"));

        return produto;
    }
}
