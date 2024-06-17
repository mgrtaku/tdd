package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClosedRangeTest {

    private ClosedRange range;

    @BeforeEach
    void setUp() {
        range = new ClosedRange(3, 8);
    }

    @Test
    void 閉区間3_8を与えたときに下端点3を返す(){
        assertEquals(3, range.getLowerEndpoint());
    }

    @Test
    void 閉区間3_8を与えたときに上端点8を返す(){
        assertEquals(8, range.getUpperEndpoint());
    }
}