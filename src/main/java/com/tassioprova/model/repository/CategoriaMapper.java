package com.tassioprova.model.repository;


import com.tassioprova.model.entity.Categoria;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CategoriaMapper implements RowMapper<Categoria> {

    @Override
    public Categoria mapRow(ResultSet resultSet, int i) throws SQLException {
        Categoria categoria = new Categoria();
        categoria.setId(resultSet.getInt("id"));
        categoria.setNome(resultSet.getString("nome"));
        categoria.setDescricao(resultSet.getString("descricao"));
        categoria.setImagemSimboloUrl(resultSet.getString("imagemSimboloUrl"));

        return categoria;
    }
}