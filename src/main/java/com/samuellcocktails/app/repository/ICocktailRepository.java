package com.samuellcocktails.app.repository;

import com.samuellcocktails.app.model.TCocktail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICocktailRepository extends JpaRepository<TCocktail, Long> {

}
