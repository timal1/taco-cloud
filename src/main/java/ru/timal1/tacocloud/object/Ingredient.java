package ru.timal1.tacocloud.object;

public record Ingredient(String id, String name, Type type) {

    public enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}
