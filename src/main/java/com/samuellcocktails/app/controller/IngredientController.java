package com.samuellcocktails.app.controller;

import java.util.*;

import com.samuellcocktails.app.model.TCocktail;
import com.samuellcocktails.app.model.TCocktailXIngredient;
import com.samuellcocktails.app.model.form_model.CocktailMatchModel;
import com.samuellcocktails.app.model.form_model.IngredientsFormModel;
import com.samuellcocktails.app.repository.ICocktailRepository;
import com.samuellcocktails.app.repository.ICocktailXIngredientRepository;
import com.samuellcocktails.app.repository.IIngredientRepository;
import com.samuellcocktails.app.service.ICocktailXIngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class IngredientController {

    @Autowired
    private IIngredientRepository ingredientRepository;

    @Autowired
    private ICocktailXIngredientService cocktailXIngredientService;

    @Autowired
    private ICocktailXIngredientRepository cocktailXIngredientRepository;

    @Autowired
    private ICocktailRepository cocktailRepository;

    private static final double MIN_PERCENTAGE_MATCH = 0.0;

    public IngredientController() {
    }

    @GetMapping("/ingredients") // local url: http://localhost:8080/LuigiCocktails/ingredients
    public String getIngredients(Model model) {

        model.addAttribute("ingredients", ingredientRepository.findAll());
        model.addAttribute("ingredientsFormModel", new IngredientsFormModel());

        return "ingredients";  // return ingredients.html from /templates
    }

    @PostMapping("/result")
    public String result(@ModelAttribute IngredientsFormModel formModel, Model model) {
        Long[] ingredientIds = formModel.getIngredientIds();

        // cocktail id, percentage match
        Map<Long, Integer> percentageMatch = new HashMap<>();

        List<TCocktailXIngredient> cocktailIngredientList =
                cocktailXIngredientService.findAllCocktailsByIngredientsId(new ArrayList<>(Arrays.asList(formModel.getIngredientIds())));

        // ADDED CODE
//        List<CocktailMatchModel> matches = new LinkedList<>();
//
////
//        for (TCocktailXIngredient tCocktailXIngredient : cocktailIngredientList) {
//            matches.add(new CocktailMatchModel(tCocktailXIngredient.getCocktail().getName(), " 0 %", tCocktailXIngredient.getCocktail().getUrl()));
//        }
        //#ADDED CODE

        for (Iterator<TCocktailXIngredient> iterator = cocktailIngredientList.iterator(); iterator.hasNext();) {
            TCocktailXIngredient cocktailXIngredient = iterator.next();

            List<TCocktailXIngredient> cocktailIngredientList2 =
                    cocktailXIngredientRepository.findIngredientsByCocktailId(cocktailXIngredient.getCocktail().getCocktailId());

            int listSize = cocktailIngredientList2.size();

            int matchCount = 0;

            for (Iterator<TCocktailXIngredient> iterator2 = cocktailIngredientList2.iterator(); iterator2.hasNext();) {
                TCocktailXIngredient cocktailXIngredient2 = (TCocktailXIngredient) iterator2.next();

                for (int i = 0; i < ingredientIds.length; i++) {
                    if (ingredientIds[i].equals(cocktailXIngredient2.getIngredient().getIngredientId())) {
                        matchCount++;
                    }
                }
            }

            // if percentage match is higher as 50 percent
            if ((((double) matchCount) / ((double) listSize)) > MIN_PERCENTAGE_MATCH) {
                percentageMatch.put(cocktailXIngredient.getCocktail().getCocktailId(),
                        Integer.valueOf((int) ((((double) matchCount) / ((double) listSize)) * 100)));
            }
        }

        Object[] percentageMatchArr = percentageMatch.entrySet().toArray();

        // sort by percentage
        Arrays.sort(percentageMatchArr, (Object o1, Object o2) -> ((Map.Entry<String, Integer>) o2).getValue()
                .compareTo(((Map.Entry<String, Integer>) o1).getValue()));

        List<CocktailMatchModel> matches = new LinkedList<>();

        for (int i = 0; i < percentageMatchArr.length; i++) {

            // entry key = id, entry value = percentage match
            Map.Entry<Long, Integer> entry = (Map.Entry<Long, Integer>) percentageMatchArr[i];

            TCocktail cocktail = this.cocktailRepository.getOne(entry.getKey());

            matches.add(new CocktailMatchModel(cocktail.getName(), (entry.getValue() + " %"), cocktail.getUrl()));

        }

        model.addAttribute("matches", matches);
        model.addAttribute("matches", matches);

        return "result"; // return result.html from /templates
    }
}