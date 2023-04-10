package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class CardTest {

    Card card;

    @BeforeEach                                         
    void setUp() {
        card = new Card(7, "testFunc");
    }

    @Test                                               
    @DisplayName("Simple multiplication should work")   
    void testCardValue() {
        assertEquals(7, card.value,     
                "Regular multiplication should work");  
    }

    @Test                                               
    @DisplayName("Simple multiplication should work")   
    void testCardFunc() {
        assertEquals("testFunc", card.func,     
                "Regular multiplication should work");  
    }

}