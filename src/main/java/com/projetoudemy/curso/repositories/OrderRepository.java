package com.projetoudemy.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoudemy.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
