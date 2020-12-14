package ru.petrov.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.petrov.controller.rep.ProductRepr;
import ru.petrov.persist.model.Brand;
import ru.petrov.persist.model.Category;
import ru.petrov.persist.model.Product;
import ru.petrov.persist.repo.ProductRepository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ProductServiceTest {

    private ProductService productService;

    private ProductRepository productRepository;

    @BeforeEach
    public void init() {
        productRepository = mock(ProductRepository.class);
        productService = new ProductServiceImpl(productRepository);
    }

    @Test
    public void testFindById() {
        Category expectedCategory = new Category();
        expectedCategory.setId(1L);
        expectedCategory.setName("Category name");

        Brand expectedBrand = new Brand();
        expectedBrand.setId(1L);
        expectedBrand.setName("Brand name");

        Product expectedProduct = new Product();
        expectedProduct.setId(1L);
        expectedProduct.setName("Product name");
        expectedProduct.setCategory(expectedCategory);
        expectedProduct.setBrand(expectedBrand);
        expectedProduct.setPictures(new ArrayList<>());
        expectedProduct.setPrice(new BigDecimal(12345));

        when(productRepository.findById(eq(1L)))
                .thenReturn(Optional.of(expectedProduct));

        Optional<ProductRepr> opt = productService.findById(1L);

        assertTrue(opt.isPresent());
        assertEquals(expectedProduct.getId(), opt.get().getId());
        assertEquals(expectedProduct.getName(), opt.get().getName());
    }

    @Test
    public void testFindAll(){
        Category expectedCategory = new Category();
        expectedCategory.setId(2L);
        expectedCategory.setName("Category name2");

        Brand expectedBrand = new Brand();
        expectedBrand.setId(2L);
        expectedBrand.setName("Brand name2");

        Product expectedProduct = new Product();
        expectedProduct.setId(2L);
        expectedProduct.setName("Product name2");
        expectedProduct.setCategory(expectedCategory);
        expectedProduct.setBrand(expectedBrand);
        expectedProduct.setPictures(new ArrayList<>());
        expectedProduct.setPrice(new BigDecimal(12345));

        Category expectedCategory3 = new Category();
        expectedCategory3.setId(3L);
        expectedCategory3.setName("Category name3");

        Brand expectedBrand3 = new Brand();
        expectedBrand3.setId(3L);
        expectedBrand3.setName("Brand name3");

        Product expectedProduct3 = new Product();
        expectedProduct3.setId(3L);
        expectedProduct3.setName("Product name3");
        expectedProduct.setCategory(expectedCategory3);
        expectedProduct.setBrand(expectedBrand3);
        expectedProduct.setPictures(new ArrayList<>());
        expectedProduct.setPrice(new BigDecimal(54321));

        when(productRepository.findAll());

        List<ProductRepr> list = productService.findAll();
    }
}
