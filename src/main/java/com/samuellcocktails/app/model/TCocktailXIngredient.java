package com.samuellcocktails.app.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="t_cocktails_x_ingredients", schema = "co")
public class TCocktailXIngredient implements Serializable {
    @EmbeddedId
    private CocktailIngredientId id;

    @ManyToMany
    @MapsId("cocktail_id")
    @JoinColumn(name="cocktail_id", nullable = false)
    private TCocktail cocktail;

    @ManyToMany
    @MapsId("ingredient_id")
    @JoinColumn(name="ingredient_id", nullable = false)
    private TIngredient ingredient;

    public TCocktailXIngredient() {
        super();
    }
}
