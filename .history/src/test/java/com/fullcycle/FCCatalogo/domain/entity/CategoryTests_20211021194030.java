package com.fullcycle.FCCatalogo.domain.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class CategoryTests {
    
    @BeforeAll
    void initAll() {
        System.out.println("===== @BeforeAll ======");        
    }

    @BeforeEach
    void init() {
        System.out.println("===== @BeforeEach ======");        
    }

    @Test
    public void sum() {
        assertEquals(2+2, 4);
    }

    @AfterEach
    void initAfter() {
        System.out.println("===== @AfterEach ======");        
    }

    @AfterAll
    void initAfterAll() {
        System.out.println("===== @AfterAll ======");        
    }
}
