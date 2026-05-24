package com.ProductCatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ProductCatalog.entities.Category;


@Repository
public interface CategoryRepository extends JpaRepository <Category, Long>{

    

    

}
