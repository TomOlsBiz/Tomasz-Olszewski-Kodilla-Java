package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {

    private final BigmacRoll roll;
    private final BigmacBurgers burgers;
    private final BigmacSauce sauce;
    private final List<BigmacIngredients> ingredients;

    public static class BigmacBuilder {
        private BigmacRoll roll;
        private BigmacBurgers burgers;
        private BigmacSauce sauce;
        private List<BigmacIngredients> ingredients = new ArrayList<>();

        public BigmacBuilder roll(String roll) {
            this.roll = new BigmacRoll(roll);
            return this;
        }

        public BigmacBuilder burgers(int burgers) {
            this.burgers = new BigmacBurgers(burgers);
            return this;
        }

        public BigmacBuilder sauce(String sauce) {
            this.sauce = new BigmacSauce(sauce);
            return this;
        }

        public BigmacBuilder ingredient(String ingredient) {
            this.ingredients.add(new BigmacIngredients(ingredient));
            return this;
        }

        public Bigmac build() {
            return new Bigmac(roll, burgers, sauce, ingredients);
        }
    }

    private Bigmac(final BigmacRoll roll, final BigmacBurgers burgers, final BigmacSauce sauce, List<BigmacIngredients> ingredients) {
        this.roll = roll;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public BigmacRoll getRollBuilder() {
        return roll;
    }

    public BigmacBurgers getBurgersBuilder() {
        return burgers;
    }

    public BigmacSauce getSauceBuilder() {
        return sauce;
    }

    public List<BigmacIngredients> getIngredientsBuilder() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "BIGMAC = " +
                "roll:" + roll.getRoll() +
                ", burgers:" + burgers.getBurgers() +
                ", sauce:" + sauce.getSauce() +
                ", ingredients:" + ingredients;
    }





}
