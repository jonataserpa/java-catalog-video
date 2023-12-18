package com.fullcycle.FCCatalogo.domain.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class GenreTests {
    
    @Test
    public void throwIllegalArgumentExceptionWhenNameIsNull() {
        assertThrows(IllegalArgumentException.class, () -> new Genre(null));
    }

    @Test
    public void throwIllegalArgumentExceptionWhenNameIsBlank() {
        assertThrows(IllegalArgumentException.class, () -> new Genre(""));
    }    
        
    @Test
    public void throwIllegalArgumentExceptionWhenNameIsNullAndCategoriesIsNull() {
        assertThrows(IllegalArgumentException.class, () -> new Genre((String) null, null));
    }

    @Test
    public void throwIllegalArgumentExceptionWhenNameIsBlankAndCategoriesIsNull() {
        assertThrows(IllegalArgumentException.class, () -> new Genre((String) "", null));
    }        

    @Test
    public void createGenreTest() {
        final Genre entity = new Genre("Genre 1");
        
        assertNotNull(entity);
        assertEquals(entity.getName(), "Genre 1");
        assertTrue(entity.isValidUUID(entity.getId().toString()));
    }


    @Test
    public void addCategoryToGenreTest(){
        final Genre entity = new Genre("Genre 1");
        assertNotNull(entity);
        assertNotNull(entity.getCategories());
        final Category category1 = new Category("Category 1");
        final Category category2 = new Category("Category 2");
        entity.addCategory(category1);
        entity.addCategory(category2);
        assertEquals(2, entity.getCategories().size());
    }
}
