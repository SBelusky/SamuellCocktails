package com.samuellcocktails.app.service.service_impl;

import com.samuellcocktails.app.model.TCocktailXIngredient;
import com.samuellcocktails.app.repository.ICocktailRepository;
import com.samuellcocktails.app.repository.ICocktailXIngredientRepository;
import com.samuellcocktails.app.service.ICocktailXIngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CocktailXIngredientServiceImpl implements ICocktailXIngredientService {
    @Autowired
    ICocktailXIngredientRepository iCocktailXIngredientRepository;

    @Override
    public List<TCocktailXIngredient> findAllCocktailsByIngredientsId(List<Long> ingredientIds) {
        return iCocktailXIngredientRepository.findAll()
                .stream()
                .filter(record -> ingredientIds.contains(record.getIngredient().getIngredientId()))
                .distinct()
                .collect(Collectors.toList());
    }
    @Override
    public List<TCocktailXIngredient> findAllCocktails() {
        return iCocktailXIngredientRepository.findAll();

    }

}
