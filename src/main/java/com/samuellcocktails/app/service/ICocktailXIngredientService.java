package com.samuellcocktails.app.service;

import com.samuellcocktails.app.model.TCocktailXIngredient;

import java.util.List;

public interface ICocktailXIngredientService {
    List<TCocktailXIngredient> findAllCocktailsByIngredientsId(List<Long> ingredientIds);
    List<TCocktailXIngredient> findAllCocktails();
}
