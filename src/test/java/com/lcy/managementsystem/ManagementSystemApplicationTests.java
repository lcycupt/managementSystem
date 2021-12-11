package com.lcy.managementsystem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ManagementSystemApplicationTests {

    @Test
    void contextLoads() {
    }
    @Test
    public void testAssertions(){
        int cal=cal(3,2);
       assertEquals(5,cal);
        assertArrayEquals(new int[]{2,1},new int[]{1,2});
       Object obj1=new Object();
       Object obj2=new Object();
       assertSame(obj1,obj2);

    }
    public int cal(int i,int j){
        return i+j;
    }
}
