/*
 *Time   :- 5:59 PM
 *Author :- Ramesh Dilshan
 *Special Thing :-
 */

package com.edu.gadgetMaster.service.impl;


import com.edu.gadgetMaster.entity.Category;
import com.edu.gadgetMaster.exception.RecordNotFoundException;
import com.edu.gadgetMaster.repository.CategoryRepository;
import com.edu.gadgetMaster.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;
    private static final String MSG = "Category not Found";

    @Override
    public Category addCategory(Category category) {
        category.setStatus("1");
        return categoryRepository.save(category);
    }

    @Override
    public Category updateCategory(long id, Category category) {
        Category category1 = categoryRepository.findById(id).orElseThrow(() -> new RecordNotFoundException(MSG));
        if (category1 == null) {
            return null;
        } else {
            if (category1.getStatus().equalsIgnoreCase("1")){
                category.setStatus("1");
                category.setId(category1.getId());
                return categoryRepository.save(category);
            }else{
                return null;
            }

        }
    }

    @Override
    public Category deleteCategory(long id) {
        Category category = categoryRepository.findById(id).orElseThrow(() -> new RecordNotFoundException(MSG));
        if (category == null) {
            return null;
        } else {
            category.setStatus("0");
            return categoryRepository.save(category);

        }
    }

    @Override
    public Category searchCategory(long id) {
        return categoryRepository.findById(id).orElseThrow(() -> new RecordNotFoundException(MSG));
    }

    @Override
    public List<Category> getAllCategorys() {
        return categoryRepository.findAll();
    }
}
