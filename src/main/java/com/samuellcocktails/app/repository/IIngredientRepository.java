package com.samuellcocktails.app.repository;

import com.samuellcocktails.app.model.TIngredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IIngredientRepository extends JpaRepository<TIngredient, Long> {
}
