package com.shoe.platform.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shoe.platform.model.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer>{

}
