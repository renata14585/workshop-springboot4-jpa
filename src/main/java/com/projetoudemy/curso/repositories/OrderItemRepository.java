package com.projetoudemy.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoudemy.curso.entities.OrderItem;
import com.projetoudemy.curso.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
