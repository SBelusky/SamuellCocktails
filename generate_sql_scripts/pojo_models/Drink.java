package pojo_models;

import java.util.*;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "idDrink",
    "strDrink",
    "strDrinkAlternate",
    "strDrinkES",
    "strDrinkDE",
    "strDrinkFR",
    "strDrinkZH-HANS",
    "strDrinkZH-HANT",
    "strTags",
    "strVideo",
    "strCategory",
    "strIBA",
    "strAlcoholic",
    "strGlass",
    "strInstructions",
    "strInstructionsES",
    "strInstructionsDE",
    "strInstructionsFR",
    "strInstructionsZH-HANS",
    "strInstructionsZH-HANT",
    "strDrinkThumb",
    "strIngredient1",
    "strIngredient2",
    "strIngredient3",
    "strIngredient4",
    "strIngredient5",
    "strIngredient6",
    "strIngredient7",
    "strIngredient8",
    "strIngredient9",
    "strIngredient10",
    "strIngredient11",
    "strIngredient12",
    "strIngredient13",
    "strIngredient14",
    "strIngredient15",
    "strMeasure1",
    "strMeasure2",
    "strMeasure3",
    "strMeasure4",
    "strMeasure5",
    "strMeasure6",
    "strMeasure7",
    "strMeasure8",
    "strMeasure9",
    "strMeasure10",
    "strMeasure11",
    "strMeasure12",
    "strMeasure13",
    "strMeasure14",
    "strMeasure15",
    "strCreativeCommonsConfirmed",
    "dateModified"
})
public class Drink {

    @JsonProperty("idDrink")
    private String idDrink;
    @JsonProperty("strDrink")
    private String strDrink;
    @JsonProperty("strDrinkAlternate")
    private Object strDrinkAlternate;
    @JsonProperty("strDrinkES")
    private Object strDrinkES;
    @JsonProperty("strDrinkDE")
    private Object strDrinkDE;
    @JsonProperty("strDrinkFR")
    private Object strDrinkFR;
    @JsonProperty("strDrinkZH-HANS")
    private Object strDrinkZHHANS;
    @JsonProperty("strDrinkZH-HANT")
    private Object strDrinkZHHANT;
    @JsonProperty("strTags")
    private String strTags;
    @JsonProperty("strVideo")
    private Object strVideo;
    @JsonProperty("strCategory")
    private String strCategory;
    @JsonProperty("strIBA")
    private String strIBA;
    @JsonProperty("strAlcoholic")
    private String strAlcoholic;
    @JsonProperty("strGlass")
    private String strGlass;
    @JsonProperty("strInstructions")
    private String strInstructions;
    @JsonProperty("strInstructionsES")
    private Object strInstructionsES;
    @JsonProperty("strInstructionsDE")
    private String strInstructionsDE;
    @JsonProperty("strInstructionsFR")
    private Object strInstructionsFR;
    @JsonProperty("strInstructionsZH-HANS")
    private Object strInstructionsZHHANS;
    @JsonProperty("strInstructionsZH-HANT")
    private Object strInstructionsZHHANT;
    @JsonProperty("strDrinkThumb")
    private String strDrinkThumb;
    @JsonProperty("strIngredient1")
    private String strIngredient1;
    @JsonProperty("strIngredient2")
    private String strIngredient2;
    @JsonProperty("strIngredient3")
    private String strIngredient3;
    @JsonProperty("strIngredient4")
    private String strIngredient4;
    @JsonProperty("strIngredient5")
    private Object strIngredient5;
    @JsonProperty("strIngredient6")
    private Object strIngredient6;
    @JsonProperty("strIngredient7")
    private Object strIngredient7;
    @JsonProperty("strIngredient8")
    private Object strIngredient8;
    @JsonProperty("strIngredient9")
    private Object strIngredient9;
    @JsonProperty("strIngredient10")
    private Object strIngredient10;
    @JsonProperty("strIngredient11")
    private Object strIngredient11;
    @JsonProperty("strIngredient12")
    private Object strIngredient12;
    @JsonProperty("strIngredient13")
    private Object strIngredient13;
    @JsonProperty("strIngredient14")
    private Object strIngredient14;
    @JsonProperty("strIngredient15")
    private Object strIngredient15;
    @JsonProperty("strMeasure1")
    private String strMeasure1;
    @JsonProperty("strMeasure2")
    private String strMeasure2;
    @JsonProperty("strMeasure3")
    private String strMeasure3;
    @JsonProperty("strMeasure4")
    private Object strMeasure4;
    @JsonProperty("strMeasure5")
    private Object strMeasure5;
    @JsonProperty("strMeasure6")
    private Object strMeasure6;
    @JsonProperty("strMeasure7")
    private Object strMeasure7;
    @JsonProperty("strMeasure8")
    private Object strMeasure8;
    @JsonProperty("strMeasure9")
    private Object strMeasure9;
    @JsonProperty("strMeasure10")
    private Object strMeasure10;
    @JsonProperty("strMeasure11")
    private Object strMeasure11;
    @JsonProperty("strMeasure12")
    private Object strMeasure12;
    @JsonProperty("strMeasure13")
    private Object strMeasure13;
    @JsonProperty("strMeasure14")
    private Object strMeasure14;
    @JsonProperty("strMeasure15")
    private Object strMeasure15;
    @JsonProperty("strCreativeCommonsConfirmed")
    private String strCreativeCommonsConfirmed;
    @JsonProperty("dateModified")
    private String dateModified;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<>();

    @JsonProperty("idDrink")
    private String getIdDrink() {
        return idDrink;
    }

    @JsonProperty("idDrink")
    private void setIdDrink(String idDrink) {
        this.idDrink = idDrink;
    }

    @JsonProperty("strDrink")
    public String getStrDrink() {
        return strDrink;
    }

    @JsonProperty("strDrink")
    private void setStrDrink(String strDrink) {
        this.strDrink = strDrink;
    }

    @JsonProperty("strDrinkAlternate")
    private Object getStrDrinkAlternate() {
        return strDrinkAlternate;
    }

    @JsonProperty("strDrinkAlternate")
    private void setStrDrinkAlternate(Object strDrinkAlternate) {
        this.strDrinkAlternate = strDrinkAlternate;
    }

    @JsonProperty("strDrinkES")
    private Object getStrDrinkES() {
        return strDrinkES;
    }

    @JsonProperty("strDrinkES")
    private void setStrDrinkES(Object strDrinkES) {
        this.strDrinkES = strDrinkES;
    }

    @JsonProperty("strDrinkDE")
    private Object getStrDrinkDE() {
        return strDrinkDE;
    }

    @JsonProperty("strDrinkDE")
    private void setStrDrinkDE(Object strDrinkDE) {
        this.strDrinkDE = strDrinkDE;
    }

    @JsonProperty("strDrinkFR")
    private Object getStrDrinkFR() {
        return strDrinkFR;
    }

    @JsonProperty("strDrinkFR")
    private void setStrDrinkFR(Object strDrinkFR) {
        this.strDrinkFR = strDrinkFR;
    }

    @JsonProperty("strDrinkZH-HANS")
    private Object getStrDrinkZHHANS() {
        return strDrinkZHHANS;
    }

    @JsonProperty("strDrinkZH-HANS")
    private void setStrDrinkZHHANS(Object strDrinkZHHANS) {
        this.strDrinkZHHANS = strDrinkZHHANS;
    }

    @JsonProperty("strDrinkZH-HANT")
    private Object getStrDrinkZHHANT() {
        return strDrinkZHHANT;
    }

    @JsonProperty("strDrinkZH-HANT")
    private void setStrDrinkZHHANT(Object strDrinkZHHANT) {
        this.strDrinkZHHANT = strDrinkZHHANT;
    }

    @JsonProperty("strTags")
    private String getStrTags() {
        return strTags;
    }

    @JsonProperty("strTags")
    private void setStrTags(String strTags) {
        this.strTags = strTags;
    }

    @JsonProperty("strVideo")
    private Object getStrVideo() {
        return strVideo;
    }

    @JsonProperty("strVideo")
    private void setStrVideo(Object strVideo) {
        this.strVideo = strVideo;
    }

    @JsonProperty("strCategory")
    private String getStrCategory() {
        return strCategory;
    }

    @JsonProperty("strCategory")
    private void setStrCategory(String strCategory) {
        this.strCategory = strCategory;
    }

    @JsonProperty("strIBA")
    private String getStrIBA() {
        return strIBA;
    }

    @JsonProperty("strIBA")
    private void setStrIBA(String strIBA) {
        this.strIBA = strIBA;
    }

    @JsonProperty("strAlcoholic")
    private String getStrAlcoholic() {
        return strAlcoholic;
    }

    @JsonProperty("strAlcoholic")
    private void setStrAlcoholic(String strAlcoholic) {
        this.strAlcoholic = strAlcoholic;
    }

    @JsonProperty("strGlass")
    private String getStrGlass() {
        return strGlass;
    }

    @JsonProperty("strGlass")
    private void setStrGlass(String strGlass) {
        this.strGlass = strGlass;
    }

    @JsonProperty("strInstructions")
    public String getStrInstructions() {
        return strInstructions;
    }

    @JsonProperty("strInstructions")
    private void setStrInstructions(String strInstructions) {
        this.strInstructions = strInstructions;
    }

    @JsonProperty("strInstructionsES")
    private Object getStrInstructionsES() {
        return strInstructionsES;
    }

    @JsonProperty("strInstructionsES")
    private void setStrInstructionsES(Object strInstructionsES) {
        this.strInstructionsES = strInstructionsES;
    }

    @JsonProperty("strInstructionsDE")
    private String getStrInstructionsDE() {
        return strInstructionsDE;
    }

    @JsonProperty("strInstructionsDE")
    private void setStrInstructionsDE(String strInstructionsDE) {
        this.strInstructionsDE = strInstructionsDE;
    }

    @JsonProperty("strInstructionsFR")
    private Object getStrInstructionsFR() {
        return strInstructionsFR;
    }

    @JsonProperty("strInstructionsFR")
    private void setStrInstructionsFR(Object strInstructionsFR) {
        this.strInstructionsFR = strInstructionsFR;
    }

    @JsonProperty("strInstructionsZH-HANS")
    private Object getStrInstructionsZHHANS() {
        return strInstructionsZHHANS;
    }

    @JsonProperty("strInstructionsZH-HANS")
    private void setStrInstructionsZHHANS(Object strInstructionsZHHANS) {
        this.strInstructionsZHHANS = strInstructionsZHHANS;
    }

    @JsonProperty("strInstructionsZH-HANT")
    private Object getStrInstructionsZHHANT() {
        return strInstructionsZHHANT;
    }

    @JsonProperty("strInstructionsZH-HANT")
    private void setStrInstructionsZHHANT(Object strInstructionsZHHANT) {
        this.strInstructionsZHHANT = strInstructionsZHHANT;
    }

    @JsonProperty("strDrinkThumb")
    public String getStrDrinkThumb() {
        return strDrinkThumb;
    }

    @JsonProperty("strDrinkThumb")
    private void setStrDrinkThumb(String strDrinkThumb) {
        this.strDrinkThumb = strDrinkThumb;
    }

    @JsonProperty("strIngredient1")
    private String getStrIngredient1() {
        return strIngredient1;
    }

    @JsonProperty("strIngredient1")
    private void setStrIngredient1(String strIngredient1) {
        this.strIngredient1 = strIngredient1;
    }

    @JsonProperty("strIngredient2")
    private String getStrIngredient2() {
        return strIngredient2;
    }

    @JsonProperty("strIngredient2")
    private void setStrIngredient2(String strIngredient2) {
        this.strIngredient2 = strIngredient2;
    }

    @JsonProperty("strIngredient3")
    private String getStrIngredient3() {
        return strIngredient3;
    }

    @JsonProperty("strIngredient3")
    private void setStrIngredient3(String strIngredient3) {
        this.strIngredient3 = strIngredient3;
    }

    @JsonProperty("strIngredient4")
    private String getStrIngredient4() {
        return strIngredient4;
    }

    @JsonProperty("strIngredient4")
    private void setStrIngredient4(String strIngredient4) {
        this.strIngredient4 = strIngredient4;
    }

    @JsonProperty("strIngredient5")
    private Object getStrIngredient5() {
        return strIngredient5;
    }

    @JsonProperty("strIngredient5")
    private void setStrIngredient5(Object strIngredient5) {
        this.strIngredient5 = strIngredient5;
    }

    @JsonProperty("strIngredient6")
    private Object getStrIngredient6() {
        return strIngredient6;
    }

    @JsonProperty("strIngredient6")
    private void setStrIngredient6(Object strIngredient6) {
        this.strIngredient6 = strIngredient6;
    }

    @JsonProperty("strIngredient7")
    private Object getStrIngredient7() {
        return strIngredient7;
    }

    @JsonProperty("strIngredient7")
    private void setStrIngredient7(Object strIngredient7) {
        this.strIngredient7 = strIngredient7;
    }

    @JsonProperty("strIngredient8")
    private Object getStrIngredient8() {
        return strIngredient8;
    }

    @JsonProperty("strIngredient8")
    private void setStrIngredient8(Object strIngredient8) {
        this.strIngredient8 = strIngredient8;
    }

    @JsonProperty("strIngredient9")
    private Object getStrIngredient9() {
        return strIngredient9;
    }

    @JsonProperty("strIngredient9")
    private void setStrIngredient9(Object strIngredient9) {
        this.strIngredient9 = strIngredient9;
    }

    @JsonProperty("strIngredient10")
    private Object getStrIngredient10() {
        return strIngredient10;
    }

    @JsonProperty("strIngredient10")
    private void setStrIngredient10(Object strIngredient10) {
        this.strIngredient10 = strIngredient10;
    }

    @JsonProperty("strIngredient11")
    private Object getStrIngredient11() {
        return strIngredient11;
    }

    @JsonProperty("strIngredient11")
    private void setStrIngredient11(Object strIngredient11) {
        this.strIngredient11 = strIngredient11;
    }

    @JsonProperty("strIngredient12")
    private Object getStrIngredient12() {
        return strIngredient12;
    }

    @JsonProperty("strIngredient12")
    private void setStrIngredient12(Object strIngredient12) {
        this.strIngredient12 = strIngredient12;
    }

    @JsonProperty("strIngredient13")
    private Object getStrIngredient13() {
        return strIngredient13;
    }

    @JsonProperty("strIngredient13")
    private void setStrIngredient13(Object strIngredient13) {
        this.strIngredient13 = strIngredient13;
    }

    @JsonProperty("strIngredient14")
    private Object getStrIngredient14() {
        return strIngredient14;
    }

    @JsonProperty("strIngredient14")
    private void setStrIngredient14(Object strIngredient14) {
        this.strIngredient14 = strIngredient14;
    }

    @JsonProperty("strIngredient15")
    private Object getStrIngredient15() {
        return strIngredient15;
    }

    @JsonProperty("strIngredient15")
    private void setStrIngredient15(Object strIngredient15) {
        this.strIngredient15 = strIngredient15;
    }

    @JsonProperty("strMeasure1")
    private String getStrMeasure1() {
        return strMeasure1;
    }

    @JsonProperty("strMeasure1")
    private void setStrMeasure1(String strMeasure1) {
        this.strMeasure1 = strMeasure1;
    }

    @JsonProperty("strMeasure2")
    private String getStrMeasure2() {
        return strMeasure2;
    }

    @JsonProperty("strMeasure2")
    private void setStrMeasure2(String strMeasure2) {
        this.strMeasure2 = strMeasure2;
    }

    @JsonProperty("strMeasure3")
    private String getStrMeasure3() {
        return strMeasure3;
    }

    @JsonProperty("strMeasure3")
    private void setStrMeasure3(String strMeasure3) {
        this.strMeasure3 = strMeasure3;
    }

    @JsonProperty("strMeasure4")
    private Object getStrMeasure4() {
        return strMeasure4;
    }

    @JsonProperty("strMeasure4")
    private void setStrMeasure4(Object strMeasure4) {
        this.strMeasure4 = strMeasure4;
    }

    @JsonProperty("strMeasure5")
    private Object getStrMeasure5() {
        return strMeasure5;
    }

    @JsonProperty("strMeasure5")
    private void setStrMeasure5(Object strMeasure5) {
        this.strMeasure5 = strMeasure5;
    }

    @JsonProperty("strMeasure6")
    private Object getStrMeasure6() {
        return strMeasure6;
    }

    @JsonProperty("strMeasure6")
    private void setStrMeasure6(Object strMeasure6) {
        this.strMeasure6 = strMeasure6;
    }

    @JsonProperty("strMeasure7")
    private Object getStrMeasure7() {
        return strMeasure7;
    }

    @JsonProperty("strMeasure7")
    private void setStrMeasure7(Object strMeasure7) {
        this.strMeasure7 = strMeasure7;
    }

    @JsonProperty("strMeasure8")
    private Object getStrMeasure8() {
        return strMeasure8;
    }

    @JsonProperty("strMeasure8")
    private void setStrMeasure8(Object strMeasure8) {
        this.strMeasure8 = strMeasure8;
    }

    @JsonProperty("strMeasure9")
    private Object getStrMeasure9() {
        return strMeasure9;
    }

    @JsonProperty("strMeasure9")
    private void setStrMeasure9(Object strMeasure9) {
        this.strMeasure9 = strMeasure9;
    }

    @JsonProperty("strMeasure10")
    private Object getStrMeasure10() {
        return strMeasure10;
    }

    @JsonProperty("strMeasure10")
    private void setStrMeasure10(Object strMeasure10) {
        this.strMeasure10 = strMeasure10;
    }

    @JsonProperty("strMeasure11")
    private Object getStrMeasure11() {
        return strMeasure11;
    }

    @JsonProperty("strMeasure11")
    private void setStrMeasure11(Object strMeasure11) {
        this.strMeasure11 = strMeasure11;
    }

    @JsonProperty("strMeasure12")
    private Object getStrMeasure12() {
        return strMeasure12;
    }

    @JsonProperty("strMeasure12")
    private void setStrMeasure12(Object strMeasure12) {
        this.strMeasure12 = strMeasure12;
    }

    @JsonProperty("strMeasure13")
    private Object getStrMeasure13() {
        return strMeasure13;
    }

    @JsonProperty("strMeasure13")
    private void setStrMeasure13(Object strMeasure13) {
        this.strMeasure13 = strMeasure13;
    }

    @JsonProperty("strMeasure14")
    private Object getStrMeasure14() {
        return strMeasure14;
    }

    @JsonProperty("strMeasure14")
    private void setStrMeasure14(Object strMeasure14) {
        this.strMeasure14 = strMeasure14;
    }

    @JsonProperty("strMeasure15")
    private Object getStrMeasure15() {
        return strMeasure15;
    }

    @JsonProperty("strMeasure15")
    private void setStrMeasure15(Object strMeasure15) {
        this.strMeasure15 = strMeasure15;
    }

    @JsonProperty("strCreativeCommonsConfirmed")
    private String getStrCreativeCommonsConfirmed() {
        return strCreativeCommonsConfirmed;
    }

    @JsonProperty("strCreativeCommonsConfirmed")
    private void setStrCreativeCommonsConfirmed(String strCreativeCommonsConfirmed) {
        this.strCreativeCommonsConfirmed = strCreativeCommonsConfirmed;
    }

    @JsonProperty("dateModified")
    private String getDateModified() {
        return dateModified;
    }

    @JsonProperty("dateModified")
    private void setDateModified(String dateModified) {
        this.dateModified = dateModified;
    }

    @JsonAnyGetter
    private Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    private void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Map<String,String> getListOfIngr(){
        Map<String,String> list = new LinkedHashMap<>();
        if(!(this.strIngredient1 == null))
            list.put(this.getStrIngredient1(),this.getStrMeasure1()==null?"not specified":this.getStrMeasure1());
        if(!(this.strIngredient2 == null))
            list.put(this.getStrIngredient2(),this.getStrMeasure2()==null?"not specified":this.getStrMeasure2());
        if(!(this.strIngredient3 == null))
            list.put(this.getStrIngredient3(),this.getStrMeasure3()==null?"not specified":this.getStrMeasure3());
        if(!(this.strIngredient4 == null))
            list.put(this.getStrIngredient4(),this.getStrMeasure4()==null?"not specified":this.getStrMeasure4().toString());
        if(!(this.strIngredient5 == null))
            list.put(this.getStrIngredient5().toString(),this.getStrMeasure5()==null?"not specified":this.getStrMeasure5().toString());
        if(!(this.strIngredient6 == null))
            list.put(this.getStrIngredient6().toString(),this.getStrMeasure6()==null?"not specified":this.getStrMeasure6().toString());
        if(!(this.strIngredient7 == null))
            list.put(this.getStrIngredient7().toString(),this.getStrMeasure7()==null?"not specified":this.getStrMeasure7().toString());
        if(!(this.strIngredient8 == null))
            list.put(this.getStrIngredient8().toString(),this.getStrMeasure8()==null?"not specified":this.getStrMeasure8().toString());
        if(!(this.strIngredient9 == null))
            list.put(this.getStrIngredient9().toString(),this.getStrMeasure9()==null?"not specified":this.getStrMeasure9().toString());
        if(!(this.strIngredient10 == null))
            list.put(this.getStrIngredient10().toString(),this.getStrMeasure10()==null?"not specified":this.getStrMeasure10().toString());
        if(!(this.strIngredient11 == null))
            list.put(this.getStrIngredient11().toString(),this.getStrMeasure11()==null?"not specified":this.getStrMeasure11().toString());
        if(!(this.strIngredient12 == null))
            list.put(this.getStrIngredient12().toString(),this.getStrMeasure12()==null?"not specified":this.getStrMeasure12().toString());
        if(!(this.strIngredient13 == null))
            list.put(this.getStrIngredient13().toString(),this.getStrMeasure13()==null?"not specified":this.getStrMeasure13().toString());
        if(!(this.strIngredient14 == null))
            list.put(this.getStrIngredient14().toString(),this.getStrMeasure14()==null?"not specified":this.getStrMeasure14().toString());
        if(!(this.strIngredient15 == null))
            list.put(this.getStrIngredient15().toString(),this.getStrMeasure15()==null?"not specified":this.getStrMeasure15().toString());

        return list;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "idDrink='" + idDrink + '\'' +
                ", strDrink='" + strDrink + '\'' +
                ", strDrinkAlternate=" + strDrinkAlternate +
                ", strDrinkES=" + strDrinkES +
                ", strDrinkDE=" + strDrinkDE +
                ", strDrinkFR=" + strDrinkFR +
                ", strDrinkZHHANS=" + strDrinkZHHANS +
                ", strDrinkZHHANT=" + strDrinkZHHANT +
                ", strTags='" + strTags + '\'' +
                ", strVideo=" + strVideo +
                ", strCategory='" + strCategory + '\'' +
                ", strIBA='" + strIBA + '\'' +
                ", strAlcoholic='" + strAlcoholic + '\'' +
                ", strGlass='" + strGlass + '\'' +
                ", strInstructions='" + strInstructions + '\'' +
                ", strInstructionsES=" + strInstructionsES +
                ", strInstructionsDE='" + strInstructionsDE + '\'' +
                ", strInstructionsFR=" + strInstructionsFR +
                ", strInstructionsZHHANS=" + strInstructionsZHHANS +
                ", strInstructionsZHHANT=" + strInstructionsZHHANT +
                ", strDrinkThumb='" + strDrinkThumb + '\'' +
                ", strIngredient1='" + strIngredient1 + '\'' +
                ", strIngredient2='" + strIngredient2 + '\'' +
                ", strIngredient3='" + strIngredient3 + '\'' +
                ", strIngredient4='" + strIngredient4 + '\'' +
                ", strIngredient5=" + strIngredient5 +
                ", strIngredient6=" + strIngredient6 +
                ", strIngredient7=" + strIngredient7 +
                ", strIngredient8=" + strIngredient8 +
                ", strIngredient9=" + strIngredient9 +
                ", strIngredient10=" + strIngredient10 +
                ", strIngredient11=" + strIngredient11 +
                ", strIngredient12=" + strIngredient12 +
                ", strIngredient13=" + strIngredient13 +
                ", strIngredient14=" + strIngredient14 +
                ", strIngredient15=" + strIngredient15 +
                ", strMeasure1='" + strMeasure1 + '\'' +
                ", strMeasure2='" + strMeasure2 + '\'' +
                ", strMeasure3='" + strMeasure3 + '\'' +
                ", strMeasure4=" + strMeasure4 +
                ", strMeasure5=" + strMeasure5 +
                ", strMeasure6=" + strMeasure6 +
                ", strMeasure7=" + strMeasure7 +
                ", strMeasure8=" + strMeasure8 +
                ", strMeasure9=" + strMeasure9 +
                ", strMeasure10=" + strMeasure10 +
                ", strMeasure11=" + strMeasure11 +
                ", strMeasure12=" + strMeasure12 +
                ", strMeasure13=" + strMeasure13 +
                ", strMeasure14=" + strMeasure14 +
                ", strMeasure15=" + strMeasure15 +
                ", strCreativeCommonsConfirmed='" + strCreativeCommonsConfirmed + '\'' +
                ", dateModified='" + dateModified + '\'' +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
