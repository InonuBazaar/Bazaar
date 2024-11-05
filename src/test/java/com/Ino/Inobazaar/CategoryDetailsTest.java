package com.Ino.Inobazaar;

import com.Ino.Inobazaar.category.domain.CategoryDetailsEntity;
import com.Ino.Inobazaar.category.facade.CategoryDetailsFacade;
import com.Ino.Inobazaar.category.service.CategoryDetailsService;
import com.Ino.Inobazaar.category.web.rest.CategoryDetailsResource;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class CategoryDetailsResourceTest {

    @Mock
    private CategoryDetailsFacade categoryDetailsFacade;

    @Mock
    private CategoryDetailsService categoryDetailsService;

    @InjectMocks
    private CategoryDetailsResource categoryDetailsResource;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        when(categoryDetailsFacade.getService()).thenReturn(categoryDetailsService);
    }

    @Test
    void testGetLoggerClass() {
        Class<?> loggerClass = categoryDetailsResource.getLoggerClass();
        assertEquals(CategoryDetailsResource.class, loggerClass, "Logger class should be CategoryDetailsResource");
    }

    @Test
    void testGetAlls() {
        CategoryDetailsEntity entity1 = new CategoryDetailsEntity();
        CategoryDetailsEntity entity2 = new CategoryDetailsEntity();
        List<CategoryDetailsEntity> expectedEntities = Arrays.asList(entity1, entity2);

        when(categoryDetailsService.findAll()).thenReturn(expectedEntities);

        List<CategoryDetailsEntity> result = categoryDetailsResource.getAlls();

        assertEquals(expectedEntities, result, "The returned list of entities should match the expected list");

        verify(categoryDetailsService, times(1)).findAll();
    }
}
