package com.ProductCatalog.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ProductCatalog.DTO.CategoryDTO;
import com.ProductCatalog.entities.Category;
import com.ProductCatalog.repositories.CategoryRepository;
import com.ProductCatalog.services.exceptions.EntityNotFoundException;




@Service
public class CategoryService {


    @Autowired
    private CategoryRepository repository;


    @Transactional(readOnly = true)
    public List<CategoryDTO>findAll(){
       List<Category> list = repository.findAll();
       return list.stream().map(x -> new CategoryDTO(x)).collect(Collectors.toList());
    
    }


    @Transactional
    public CategoryDTO findById (Long id){

        Optional<Category> obj = repository.findById(id);
        Category entity = obj.orElseThrow(() -> new EntityNotFoundException("Entity not found"));
        return new CategoryDTO(entity);

    }



}
