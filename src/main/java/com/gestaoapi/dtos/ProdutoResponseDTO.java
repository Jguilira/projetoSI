package com.gestaoapi.dtos;

import java.math.BigDecimal;

public record ProdutoResponseDTO (
        Long id,
        String descricao,
        String categoria,
        BigDecimal preco,
        Integer quantidade,
        Boolean status
) {}
