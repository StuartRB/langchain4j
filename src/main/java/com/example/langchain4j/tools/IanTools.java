package com.example.langchain4j.tools;

import dev.langchain4j.agent.tool.P;
import dev.langchain4j.agent.tool.Tool;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class IanTools {

    @Tool("Returns the name of Ian's favourite team for a given sport")
    public String getFavouriteTeam(@P("the type of sports team") String sportType) {
        return switch (sportType.toUpperCase(Locale.ROOT)) {
            case "FOOTBALL" -> "LFC. He has risen";
            case "RUGBY" -> "Caramel latte RFC";
            default -> "The Toffees";
        };
    }

    @Tool("Returns the name of Ian's favourite meal for a given day")
    public String getFavouriteMeal(@P("the day of the week") String dayOfWeek) {
        return switch (dayOfWeek.toUpperCase(Locale.ROOT)) {
            case "MONDAY" -> "Mango";
            case "TUESDAY" -> "Tangy chicken and rice";
            case "SATURDAY", "SUNDAY" -> "Takeaway";
            default -> "Pot Noodle";
        };
    }
}
