package com.projetoudemy.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoudemy.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
