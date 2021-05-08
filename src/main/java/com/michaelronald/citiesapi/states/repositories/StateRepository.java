package com.michaelronald.citiesapi.states.repositories;

import com.michaelronald.citiesapi.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
