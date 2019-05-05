package service.impl;

import model.Category;
import repository.CategoryRepository;
import service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;

public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public Iterable<Category> findAll() {
        return categoryRepository.findAll();
    }

    public Category findById(Long id) {
        return categoryRepository.findOne(id);
    }

    public void remove(Long id) {
        categoryRepository.delete(id);
    }

    public void save(Category category) {
        categoryRepository.save(category);
    }
}