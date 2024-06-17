package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClosedRangeTest {
    @Test
    void 閉区間3_8を与えたときに下端点3を返す(){
        //準備
        ClosedRange range = new ClosedRange(3, 8);
        //実行
        //検証
        assertEquals(3, range.getLowerEndpoint());
    }
}