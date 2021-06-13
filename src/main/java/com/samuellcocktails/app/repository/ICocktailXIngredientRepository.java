package com.samuellcocktails.app.repository;

import com.samuellcocktails.app.model.TCocktailXIngredient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
//t_cocktails_x_ingredients
public interface ICocktailXIngredientRepository extends JpaRepository<TCocktailXIngredient, Long> {

    @Query("SELECT ci FROM TCocktailXIngredient ci WHERE ci.id.cocktailId = :cocktailId")
    List<TCocktailXIngredient> findIngredientsByCocktailId(@Param("cocktailId") Long cocktailId);
}
