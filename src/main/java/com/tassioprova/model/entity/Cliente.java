package com.tassioprova.model.entity;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class Cliente extends Usuario{
    private String fotoUrl;
    private LocalDate dataNascimento;
    private String cpf;
    private Endereco endereco;
    private List<Pedido> pedidoList;

    public Cliente(Integer id, String nomeCompleto, String email, String senha, LocalDate dataCadastro, LocalTime horaCadastro, LocalDate dataUltimaAtualizacao, String urlFoto, String fotoUrl, String cpf, LocalDate dataNascimento, Endereco endereco, List<Pedido> pedidoList) {
        super(id, nomeCompleto, email, senha, dataCadastro, horaCadastro, dataUltimaAtualizacao, urlFoto);
        this.fotoUrl = fotoUrl;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.pedidoList = pedidoList;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<Pedido> getPedidoList() {
        return pedidoList;
    }

    public void setPedidoList(List<Pedido> pedidoList) {
        this.pedidoList = pedidoList;
    }
}
