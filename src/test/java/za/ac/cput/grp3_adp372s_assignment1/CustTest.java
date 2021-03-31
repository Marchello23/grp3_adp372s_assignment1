package za.ac.cput.grp3_adp372s_assignment1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.*;
class CustTest {

    private Cust cust;
    private Cust cust2;
    private Cust cust4;

    @BeforeEach
    void setup()
    {
        cust = new Cust();
        cust2 = new Cust();
        cust4 = new Cust();

        cust = cust4;
    }

    @Test
    void testIdentity()
    {
        assertSame(cust, cust4);
    }

    @Test
    void testEquality()
    {
        assertEquals(cust, cust4);

    }

    @Disabled
    @Test
    void testEqualitys()
    {
        assertEquals(cust, cust4);

    }

    @Test
    void FailingTest()
    {
        assertSame(cust2, cust4);
    }


    @Test
    @Timeout(10)
    void timeoutCheck()
    {
        for (int i =0 ; i<100 ; i++)
            System.out.println(i);
    }
}