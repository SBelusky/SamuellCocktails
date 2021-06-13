package com.samuellcocktails.app.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

//označuje pre zložené objekty alebo veci :D asi
//lebo id pre riadok v spojitej tabuľke bude zložený z dvoch FK
@Embeddable
public class CocktailIngredientId implements Serializable {
    @Column(name = "cocktail_id", nullable = false)
    private Long cocktailId;

    @Column(name = "ingredient_id", nullable = false)
    private Long ingredientId;

    public CocktailIngredientId() {
        super();
    }

    public CocktailIngredientId(Long cocktailId, Long ingredientId) {
        this.cocktailId = cocktailId;
        this.ingredientId = ingredientId;
    }
}
