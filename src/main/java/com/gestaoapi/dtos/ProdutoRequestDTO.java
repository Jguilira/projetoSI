package com.gestaoapi.dtos;


import java.math.BigDecimal;

public record ProdutoRequestDTO(
        String descricao,
        String categoria,
        BigDecimal preco,
        Integer quantidade,
        Boolean status
) {}
