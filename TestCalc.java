package package4;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestCalc extends TestCase {  


  Calc obj=new Calc();  
  @Test
    public void testAdd() {  
      
        assertEquals(25,obj.add(10, 15));  
    }  
   @Test
    public void testSub() {  
      
        assertEquals(5,obj.subtract(15, 10));  
    }  
}  