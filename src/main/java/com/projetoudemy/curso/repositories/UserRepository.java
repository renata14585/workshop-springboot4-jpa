package com.projetoudemy.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoudemy.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
