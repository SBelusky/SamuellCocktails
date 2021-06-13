package com.samuellcocktails.app.model.form_model;

public class IngredientsFormModel {
    private Long[] ingredientIds;

    public IngredientsFormModel() {
    }

    public Long[] getIngredientIds() {
        return ingredientIds;
    }

    public void setIngredientIds(Long[] ingredientId) {
        this.ingredientIds = ingredientId;
    }
}
