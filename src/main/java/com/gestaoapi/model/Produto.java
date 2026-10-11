package com.gestaoapi.model;

import java.math.BigDecimal;

public class Produto {

    private Long id;
    private String descricao;
    private String categoria;
    private BigDecimal preco;
    private Integer quantidade;
    private Boolean status;

    public Produto(){
    }

    public Produto(Long id, String descricao, String categoria, BigDecimal preco, Integer quantidade, Boolean status){
        this.id = id;
        this.descricao = descricao;
        this.categoria = categoria;
        this.preco = preco;
        this.quantidade = quantidade;
        this.status = status;
    }

    public Long getId() {return id; }
    public void setId(Long id) {this.id = id;}

    public String getDescricao() {return descricao; }
    public void setDescricao(String descricao) {this.descricao = descricao;}

    public String getCategoria() {return categoria;}
    public void setCategoria(String categoria) {this.categoria = categoria;}

    public BigDecimal getPreco() {return preco;}
    public void setPreco(BigDecimal preco) {this.preco = preco;}

    public Integer getQuantidade() {return quantidade;}
    public void setQuantidade(Integer quantidade) {this.quantidade = quantidade;}

    public Boolean getStatus() {return status;}
    public void setStatus(Boolean status) {this.status = status;}


}
