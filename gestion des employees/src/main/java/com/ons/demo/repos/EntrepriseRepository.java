package com.ons.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ons.demo.entities.Entreprise;

public interface EntrepriseRepository extends JpaRepository<Entreprise, Long> {

}
