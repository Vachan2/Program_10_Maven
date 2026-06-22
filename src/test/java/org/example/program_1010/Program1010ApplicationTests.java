package org.example.program_1010;
import org.junit.Assert.*;
import org.junit.Test;
public class Program1010ApplicationTests {
    @Test
    public void tests() {
        Program1010Application tesssst = new Program1010Application();
        int result = tesssst.add(2, 3);
        System.out.println("the result of 2 + 3 = " + result);
        org.junit.Assert.assertEquals(5,result);
    }
}
