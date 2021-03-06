package com.samuellcocktails.app.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="t_cocktails_x_ingredients", schema = "co")
public class TCocktailXIngredient implements Serializable {
    private static final long serialVersionUID = 1636471273022502864L;

    //káždá trieda musí mať neaký atribút označený ako @Id
    @EmbeddedId
    private CocktailIngredientId id;

    @ManyToOne
    /*@MapsId - aký atribút z triedy cocktail representuje stĺpec cocktail_id v tabuľke t_cocktails_x_ingredients v DB*/
    @MapsId("cocktailId")
    @JoinColumn(name="cocktail_id", nullable = false)
    private TCocktail cocktail;

    @ManyToOne
    @MapsId("ingredientId")
    @JoinColumn(name="ingredient_id", nullable = false)
    private TIngredient ingredient;


    //@Column(name = "measure")
    private String measure;

    public TCocktail getCocktail() {
        return cocktail;
    }

    public void setCocktail(TCocktail cocktail) {
        this.cocktail = cocktail;
    }

    public TIngredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(TIngredient ingredient) {
        this.ingredient = ingredient;
    }

    public String getMeasure() {
        return measure;
    }

    public void setMeasure(String measure) {
        this.measure = measure;
    }
}
