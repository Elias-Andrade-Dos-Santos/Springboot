package com.example.springboot.dtos;

import java.math.BigDecimal;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

/**
 * ProductRecordDtos
 */
public record ProductRecordDto(@NotBlank String name, @NotNull BigDecimal price) {

}