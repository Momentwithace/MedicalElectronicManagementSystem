package MedicalManagementSystem;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RecordTest {
    Record record;
    @BeforeEach
    void setUp(){
        record = new Record(1001, "Ace", "black", 23,
                "ace@gmail.com", "0908685467",
                "50kg", "5.4inches");
    }

    @Test
    void testThatWeCanGetRecordId(){
        assertEquals(1001, record.getRecordId());
    }

    @Test
    void testThatWECanGetRecordHolderFirstName(){
        assertEquals("Ace", record.getRecordHolderFirstName());
    }

    @Test
    void testThatWeCanGetRecordHolderSecondName(){
        assertEquals("black", record.getRecordHolderSecondName());
    }

    @Test
    void testThatWeCanGetRecordHolderAge(){
        assertEquals(23, record.getRecordHolderAge());
    }

    @Test
    void testThatWeCanGetRecordHolderEmail(){
        assertEquals("ace@gmail.com", record.getRecordHolderEmail());
    }

    @Test
    void testThatWeCanGetRecordHolderPhoneNumber(){
        assertEquals("0908685467", record.getRecordHolderPhoneNumber());
    }

    @Test
    void testThatWeCanGetReCordHolderWeight(){
        assertEquals("50kg", record.getRecordHolderWeight());
    }

    @Test
    void testThatWeCanGetRecordHolderHeight(){
        assertEquals("5.4inches", record.getRecordHolderHeight());
    }

}
