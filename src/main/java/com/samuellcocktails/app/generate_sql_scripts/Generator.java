package com.samuellcocktails.app.generate_sql_scripts;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.samuellcocktails.app.generate_sql_scripts.pojo_models.Drink;


import java.io.*;
import java.net.*;
import java.util.*;

public class Generator {
    //nasetovanie objektov z JSON-u
    private static List<Drink> jsonToObject(Integer[] idcka, List<Drink> drinkList) throws IOException {
        String url_string;
        String inputLine;
        StringBuffer content = new StringBuffer();

        System.out.println("-> Generating objects from API response");

        for (int i = 0; i < idcka.length; i++) {
            url_string = "https://www.thecocktaildb.com/api/json/v1/1/lookup.php?i=" + idcka[i];
            URL url = new URL(url_string);

            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("Content-Type", "application/json");

            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }

            content = content.delete(0, 11);
            content = content.delete(content.length() - 2, content.length());

            //nasetovanie objektov z JSON prestredníctvom JACKSON-u
            ObjectMapper mapper = new ObjectMapper();
            Drink drink = mapper.readValue(content.toString(), Drink.class);
            drinkList.add(drink);

            content = new StringBuffer();
        }

        System.out.println("-> Object generating successful");
        return drinkList;
    }

    //vygenerovanie skriptu pre naplnenie tabuľky co.t_ingredients
    private static void generateInsertScriptForIngredients(Integer[] idcka, List<Drink> drinkList) throws IOException {
        String file = "D:\\Programovanie\\Tvorba Java aplikácie KURZ\\SamuellCocktails\\src\\main\\java\\com\\samuellcocktails\\app\\sql_scripts\\02-feed-t_ingredients.sql";
        Set<String> allIngredients = new HashSet<>();
        Map<String, String> zoznamIng;
        StringBuilder builder= new StringBuilder();

        System.out.println("-> Generating SQL script for table co.t_ingredients");


        for (int i = 0; i < idcka.length; i++) {
            zoznamIng = drinkList.get(i).getListOfIngr();

            for (Map.Entry<String, String> entry : zoznamIng.entrySet())
                allIngredients.add("INSERT INTO co.t_ingredients (name) VALUES ('" + (entry.getKey().isEmpty() ? "not specified" : entry.getKey().toLowerCase()) + "');\n");
        }
        builder.append(allIngredients.toString());
        WriteToFile(file,builder);

    }

    //vygenerovanie skriptu pre naplnenie tabuľky co.t_cocktails
    private static void generateInsertScriptForCocktails(Integer[] idcka, List<Drink> drinkList) throws IOException {
        StringBuilder allCocktails= new StringBuilder();
        String file = "D:\\Programovanie\\Tvorba Java aplikácie KURZ\\SamuellCocktails\\src\\main\\java\\com\\samuellcocktails\\app\\sql_scripts\\03-feed-t_cocktails.sql";

        System.out.println("-> Generating SQL script for table co.t_cocktails");

        for (int i = 0; i < idcka.length; i++) {
            allCocktails.append("INSERT INTO co.t_cocktails (instructions, name, url) VALUES" +
                    "('" + (drinkList.get(i).getStrInstructions().replaceAll("[<(\\[{^\\-=$!|\\]})?*+'\\n\\r]", "")) + "'," +
                    "'" + (drinkList.get(i).getStrDrink().replaceAll("[<(\\[{^\\-=$!|\\]})?*+'\\n\\r]", "")) + "'," +
                    "'" + (drinkList.get(i).getStrDrinkThumb()) + "');\n");
        }

        WriteToFile(file,allCocktails);
    }

    //vygenerovanie skriptu pre naplnenie tabuľky co.t_cocktails
    private static void generateInsertScriptForCocktailsXIngredients(Integer[] idcka, List<Drink> drinkList) throws IOException {
        StringBuilder krizovaTabulka= new StringBuilder();
        Map<String, String> zoznamIng;
        String file = "D:\\Programovanie\\Tvorba Java aplikácie KURZ\\SamuellCocktails\\src\\main\\java\\com\\samuellcocktails\\app\\sql_scripts\\04-feed-coctail-x-ingredient.sql";

        System.out.println("-> Generating SQL script for table co.t_cocktails_x_ingredients");

        for (int i = 0; i < idcka.length; i++) {
            zoznamIng = drinkList.get(i).getListOfIngr();

            for (Map.Entry<String, String> entry : zoznamIng.entrySet()) {
                krizovaTabulka.append("Insert into co.t_cocktails_x_ingredients (cocktail_id,ingredient_id,measure) " +
                        "values ((Select cocktail_id from co.t_cocktails where name='" + (drinkList.get(i).getStrDrink().replaceAll("[<(\\[{^\\-=$!|\\]})?*+'\\n\\r]", "").trim()) + "')," +
                        "(Select ingredient_id from co.t_ingredients where name='" + (entry.getKey() == "" ? "not specified" : entry.getKey().toLowerCase().trim()) + "')," +
                        "'" + (entry.getValue().equals("") ? "not specified" : entry.getValue().toLowerCase().trim()) + "');\n");

            }
        }
        WriteToFile(file,krizovaTabulka);
    }

    //zápis scriptu do súboru
    private static void WriteToFile(String filename,StringBuilder script) throws IOException {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
            writer.write(script.toString());
            writer.close();
            System.out.println("Print to file - SUCCESS");
            System.out.println("Generate file in path: " + filename);
        }
        catch (Exception e){
            System.out.println("Error while print into file");
        }


    }

    //main metóda
    public static void main(String[] args) throws IOException {
        //id drinkov ziskanych z API
        Integer[] idcka = {14029, 15395, 15423, 14588, 15346, 17060, 15288, 13899, 15300, 13581, 14598, 17105, 13940, 14229, 178318, 16108, 15200, 17831, 16943, 15675, 17832, 16405, 14564, 17005, 17833, 14560, 17222, 17834, 17223, 13501, 17835, 12790, 14374, 14372, 14360, 15597, 14107, 15024, 17224, 16134, 17836, 17225, 14610, 17837, 17226, 16333, 15567, 17227, 17228, 14272, 17229, 17838, 17839, 17840, 11010, 13807, 15182, 11011, 13162, 11012, 11013, 11014, 11019, 11020, 17094, 11021, 11022, 11023, 16082, 11024, 11025, 178321, 12792, 11026, 11027, 15194, 13731, 11028, 14306, 16100, 14578, 17168, 16202, 11029, 15941, 11034, 12794, 178325, 16289, 16958, 13683, 11046, 16311, 11050, 15849, 178319, 11052, 14622, 17118, 11053};
        List<Drink> drinkList = new ArrayList<>();
        Scanner myObj = new Scanner(System.in);
        String answer="y";

        drinkList = jsonToObject(idcka, drinkList);

        while (answer.toLowerCase().equals("y")){
            System.out.print("Script generator{a - ingredients, b - cocktails, c - cocktails_x_ingredients}: ");
            answer = myObj.nextLine();

            switch (answer){
                case "a":
                    generateInsertScriptForIngredients(idcka,drinkList);break;
                case "b":
                    generateInsertScriptForCocktails(idcka,drinkList);break;
                case "c":
                    generateInsertScriptForCocktailsXIngredients(idcka,drinkList);break;
                default:
                    System.out.println("Invalid input !!!");break;
            }
            System.out.print("Work again?(Y/N): ");
            answer = myObj.nextLine();

            if(answer.toLowerCase().equals("n"))
                break;
            else if(!answer.toLowerCase().equals("y"))
                System.out.println("Invalid inpur");
            else
                continue;
        }
        System.out.print("------------------\nSQL script generator for DB tables \nBy: Samuell Belusky\n------------------");
    }

}

