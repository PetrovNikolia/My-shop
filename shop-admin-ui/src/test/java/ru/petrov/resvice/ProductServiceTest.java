package ru.petrov.resvice;

import org.junit.jupiter.api.BeforeEach;
import ru.petrov.persist.repo.ProductRepository;
import ru.petrov.service.ProductService;
import ru.petrov.service.ProductServiceImpl;

import static org.mockito.Mockito.mock;

public class ProductServiceTest {

    private ProductService productService;

    private ProductRepository productRepository;

    @BeforeEach
    public void init() {
        productRepository = mock(ProductRepository.class);
    }
}
