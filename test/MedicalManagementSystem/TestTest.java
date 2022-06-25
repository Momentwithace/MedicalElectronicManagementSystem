package MedicalManagementSystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TestTest {
    MyTest test;
    @BeforeEach
    void setMyTest(){
        test = new MyTest(1,"HIV/AIDS");
    }
    @Test
     void testThatWeHaveTest(){
        assertNotNull(test);
    }
    @Test
    void testThatWeCanGetTestId(){
        assertEquals(1,test.getTestId());
    }
    @Test
    void testThatWeCanGetTestType(){
        assertEquals("HIV/AIDS", test.getTestType());
    }


}
