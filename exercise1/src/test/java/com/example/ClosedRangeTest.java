package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("整数の閉区間とその変換規則を扱う ClosedRange クラス")
class ClosedRangeTest {

    private ClosedRange range;

    @BeforeEach
    void setUp() {
        range = new ClosedRange(3, 8);
    }

    @Nested
    class 下端点_上端点の取得 {

        @Test
        void 閉区間3_8を与えたときに下端点3を返す(){
            assertEquals(3, range.getLowerEndpoint());
        }

        @Test
        void 閉区間3_8を与えたときに上端点8を返す(){
            assertEquals(8, range.getUpperEndpoint());
        }
    }

    @Nested
    class 閉区間を文字列で返す {

        @Test
        void 閉区間3_8を与えたときにtoStringメゾットを実行すると3_8を返す() {
            assertEquals("[3,8]", range.toString());
        }
    }

    @Nested
    class 閉区間の中に指定した値が含まれているか判定 {

        @Test
        void 閉区間3_8を与えたときに指定した値5を含むか判定する() {
            assertTrue(range.contains(5));
        }

        @Test
        void 閉区間3_8を与えたときに指定した値マイナス1を含むか判定する() {
            assertFalse(range.contains(-1));
        }
    }

    @Nested
    class 閉区間Aが閉区間Bを完全に含むかどうかの判定 {
        @Test
        void 閉区間A3_8_閉区間B3_8の時にtrueを返す (){
            assertTrue(range.isIncluded(new ClosedRange(3, 8)));
        }
    }
}