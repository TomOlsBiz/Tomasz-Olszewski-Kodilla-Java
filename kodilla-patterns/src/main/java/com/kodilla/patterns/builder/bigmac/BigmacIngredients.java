package com.kodilla.patterns.builder.bigmac;

import java.util.Arrays;
import java.util.List;

public class BigmacIngredients {

    private final static List<String> BIGMAC_INGREDIENTS = Arrays.asList("LETTUCE", "ONION", "BACON", "CUCUMBER", "CHILI PEPPERS", "MUSHROOMS", "SHRIMPS", "CHEESE");
    private final String ingredient;

    public BigmacIngredients(String ingredient) {
        if(BIGMAC_INGREDIENTS.contains(ingredient)) {
            this.ingredient = ingredient;
        } else {
            throw new IllegalStateException("Please select among LETTUCE, ONION, BACON, CUCUMBER, CHILI PEPPERS, MUSHROOMS, SHRIMPS, CHEESE");
        }
    }

    public String getIngredient() {
        return ingredient;
    }

    @Override
    public String toString() {
        return ingredient;
    }
}
