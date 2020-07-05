package com.samuellcocktails.app.repository;

import com.samuellcocktails.app.model.TCocktailXIngredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICocktailXIngredientRepository extends JpaRepository<TCocktailXIngredient, Long> {
}
