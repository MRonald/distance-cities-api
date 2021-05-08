package com.michaelronald.citiesapi.countries.repositories;

import com.michaelronald.citiesapi.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
