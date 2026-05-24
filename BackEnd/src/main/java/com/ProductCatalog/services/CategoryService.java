package com.ProductCatalog.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ProductCatalog.entities.Category;
import com.ProductCatalog.repositories.CategoryRepository;

@Service
public class CategoryService {


    @Autowired
    private CategoryRepository repository;

    public List<Category>findAll(){
  
        return repository.findAll();

    }


}
