package com.samuellcocktails.app.model.form_model;

public class CocktailMatchModel {
    private String cocktailName;
    private String percentageMatch;
    private String url;

    public CocktailMatchModel(String cocktailName, String percentageMatch, String url) {
        this.cocktailName = cocktailName;
        this.percentageMatch = percentageMatch;
        this.url = url;
    }

    public String getCocktailName() {
        return cocktailName;
    }

    public void setCocktailName(String cocktailName) {
        this.cocktailName = cocktailName;
    }

    public String getPercentageMatch() {
        return percentageMatch;
    }

    public void setPercentageMatch(String percentageMatch) {
        this.percentageMatch = percentageMatch;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
