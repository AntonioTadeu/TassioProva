package com.tassioprova.controller.produto;

import com.tassioprova.model.entity.Produto;
import com.tassioprova.model.repository.produto.ProdutoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/produto")
public class ProdutoController {
    private ProdutoRepository produtoRepository;

    public ProdutoController(JdbcTemplate jdbcTemplate) {
        produtoRepository = new ProdutoRepository(jdbcTemplate);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    public ArrayList<Produto> searchId(@PathVariable Integer id) throws Exception {
        return produtoRepository.searchID(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Produto post(@RequestBody Produto produto) throws Exception {
        return produtoRepository.cadastrar(produto);
    }
}
