package com.samuellcocktails.app.generate_sql_scripts;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.samuellcocktails.app.generate_sql_scripts.pojo_models.Drink;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import  java.net.*;
import java.util.*;

public class Generator {

    public static void main(String[] args) throws IOException {
        Integer [] idcka = {14029, 15395, 15423, 14588, 15346, 17060, 15288, 13899, 15300, 13581, 14598, 17105, 13940, 14229, 178318, 16108, 15200, 17831, 16943, 15675, 17832, 16405, 14564, 17005, 17833, 14560, 17222, 17834, 17223, 13501, 17835, 12790, 14374, 14372, 14360, 15597, 14107, 15024, 17224, 16134, 17836, 17225, 14610, 17837, 17226, 16333, 15567, 17227, 17228, 14272, 17229, 17838, 17839, 17840, 11010, 13807, 15182, 11011, 13162, 11012, 11013, 11014, 11019, 11020, 17094, 11021, 11022, 11023, 16082, 11024, 11025, 178321, 12792, 11026, 11027, 15194, 13731, 11028, 14306, 16100, 14578, 17168, 16202, 11029, 15941, 11034, 12794, 178325, 16289, 16958, 13683, 11046, 16311, 11050, 15849, 178319, 11052, 14622, 17118, 11053};
        String url_string;
        String inputLine;
        StringBuffer content = new StringBuffer();
        List<Drink> drinkList = new ArrayList<>();
        ObjectMapper objectMapper = new ObjectMapper();
        Map<String,String> zoznamIng = new HashMap<>();
        Set<String> allIngredients = new HashSet<>();
        StringBuilder ingredientsScript = new StringBuilder();
        StringBuilder cocktailsScript = new StringBuilder();
        StringBuilder cocktailXIngredientScript = new StringBuilder();
        StringBuilder measuresInDrink = new StringBuilder();

        //získanie respondu z API
        for (int i=0; i<idcka.length;i++){
            url_string = "https://www.thecocktaildb.com/api/json/v1/1/lookup.php?i="+idcka[i];
            URL url = new URL(url_string);

            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("Content-Type", "application/json");

            BufferedReader in = new BufferedReader( new InputStreamReader(con.getInputStream()));
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }

            content = content.delete(0,11);
            content = content.delete(content.length()-2,content.length());

            //nasetovanie objektov z JSON prestredníctvom JACKSON-u
            ObjectMapper mapper = new ObjectMapper();
            Drink drink = mapper.readValue(content.toString(), Drink.class);
            drinkList.add(drink);

            content=new StringBuffer();
        }

        //vygenerovanie SQL scirptov pre DB
        for (int i=0; i<idcka.length;i++) {
            zoznamIng = drinkList.get(i).getListOfIngr();

            //vygenerovanie skriptu pre naplnenie tabuľky co.t_ingredients
            /*for (Map.Entry<String,String> entry : zoznamIng.entrySet())
                allIngredients.add("INSERT INTO co.t_ingredients (name) VALUES ('"+ (entry.getKey()==""?"not specified":entry.getKey().toLowerCase())+"');");
            */

            //vygenerovanie skriptu pre naplnenie tabuľky co.t_cocktails
            /*System.out.println("INSERT INTO co.t_cocktails (instructions, name, url) VALUES" +
                    "('" + drinkList.get(i).getStrInstructions().replace("\n"," ").replace("'","").replace("\\","") + "','" + drinkList.get(i).getStrDrink().replace("'","").replace("\\","") + "','" + drinkList.get(i).getStrDrinkThumb() + "');\n");
            */

            //vygenerovanie skriptu pre naplnenie tabuľky co.t_cocktails
            /*for (Map.Entry<String,String> entry : zoznamIng.entrySet()){
                System.out.println("Insert into co.t_cocktails_x_ingredients (cocktail_id,ingredient_id,measure) " +
                        "values ((Select cocktail_id from co.t_cocktails where name='" + drinkList.get(i).getStrDrink().replace("'","").replace("\\","") +
                        "'), (Select ingredient_id from co.t_ingredients where name='"+ (entry.getKey()==""?"not specified":entry.getKey().toLowerCase()) +"')," +
                        "'"+(entry.getValue().equals("")?"not specified":entry.getValue().toLowerCase())+"');");

            }*/
        }
    }
}
