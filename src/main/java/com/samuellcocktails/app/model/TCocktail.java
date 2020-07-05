package com.samuellcocktails.app.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="t_cocktails", schema = "co")
public class TCocktail implements Serializable {
    /*@SequenceGenerator nám hovorí o použití sequencera z DB pre nastavovanie hodnoty "cocktail_id"
    nevyužil som ho nakoľok som nenapĺňal DB cez entityManagera ale vygenerovaním scriptov
    @GeneratedValue neni treba lebo stránka nebude pridávať ďalšie záznamy do DB*/
    @Id
    /*@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "t_cocktails_seq")
    @SequenceGenerator(name = "t_cocktails_seq", sequenceName = "co.t_cocktails_cocktail_id_seq", allocationSize = 1, initialValue = 0)*/
    @Column(name = "cocktail_id", nullable = false)
    private Long cocktailId;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "url", nullable = false)
    private String url;

    @Column(name = "instructions")
    private String instructions;

    public TCocktail() {
        super();
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public Long getCocktailId() {
        return cocktailId;
    }

    public void setCocktailId(Long cocktailId) {
        this.cocktailId = cocktailId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
