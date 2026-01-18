package com.example.langchain4j.tools.shop;

import dev.langchain4j.agent.tool.Tool;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class ShopTool {

    @Tool("Returns data on the current price of everyday groceries")
    public List<Product> getPrices() {

        System.out.print(">>> using shop tool");

        return List.of(new Product("Eggs", 2.34),
                new Product("Cheese", 2.32),
                new Product("Bread", 1.79));

    }
}




