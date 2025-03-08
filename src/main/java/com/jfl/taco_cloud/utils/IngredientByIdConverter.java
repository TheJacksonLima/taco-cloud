package com.jfl.taco_cloud.utils;

import com.jfl.taco_cloud.models.Ingredient;
import org.springframework.stereotype.Component;
import org.springframework.core.convert.converter.Converter;
import java.util.Map;
import java.util.HashMap;

@Component
public class IngredientByIdConverter implements Converter<String, Ingredient>{
    private Map<String, Ingredient> ingredientMap = new HashMap<>();

    public IngredientByIdConverter() {
        ingredientMap.put("FLTO",Ingredient.builder().id("FLTO").name("Flour Tortilla").type(Ingredient.Type.WRAP).build());
        ingredientMap.put("COTO", Ingredient.builder().id("COTO").name("Corn Tortilla").type(Ingredient.Type.WRAP).build());
        ingredientMap.put("GRBF", Ingredient.builder().id("GRBF").name("Ground Beef").type(Ingredient.Type.PROTEIN).build());
        ingredientMap.put("CARN", Ingredient.builder().id("CARN").name("Carnitas").type(Ingredient.Type.PROTEIN).build());
        ingredientMap.put("TMTO", Ingredient.builder().id("TMTO").name("Diced Tomatoes").type(Ingredient.Type.VEGGIES).build());
        ingredientMap.put("LETC", Ingredient.builder().id("LETC").name("Lettuce").type(Ingredient.Type.VEGGIES).build());
        ingredientMap.put("CHED", Ingredient.builder().id("CHED").name("Cheddar").type(Ingredient.Type.CHEESE).build());
        ingredientMap.put("JACK", Ingredient.builder().id("JACK").name("Monterrey Jack").type(Ingredient.Type.CHEESE).build());
        ingredientMap.put("SLSA", Ingredient.builder().id("SLSA").name("Salsa").type(Ingredient.Type.SAUCE).build());
        ingredientMap.put("SRCR", Ingredient.builder().id("SRCR").name("Sour Cream").type(Ingredient.Type.SAUCE).build());
    }

    @Override
    public Ingredient convert(String id) {
        return ingredientMap.get(id);
    }
}
