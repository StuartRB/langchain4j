package com.example.langchain4j.tools.shop;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Product {
    private String description;
    private Double price;
}
