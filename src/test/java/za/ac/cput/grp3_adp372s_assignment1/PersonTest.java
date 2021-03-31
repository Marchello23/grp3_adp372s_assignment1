/*
 * @author:219169640 - Casey Michael Keven Crafford
 * ADP372S Assignment 1 Term 1
 * Using Github, Maven and Test Driven Development
 */

package za.ac.cput.grp3_adp372s_assignment1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

public class PersonTest
{
    private int num1,num2;
    private Person[] personList = new Person[3];

    @BeforeEach
    public void setUp()  {
        personList[0]=new Person();
        personList[1]=new Person();
        personList[2]=personList[0];

        num1=10;
        num2=10;
    }

    @Test
    public void testObjectEquality(){
        assertEquals(num1,num2);
    }

    @Test
    public void testObjectIdentity(){
        assertSame(personList[0],personList[2]);
    }

    @Disabled
    @Test
    public void failingTest(){
        assertSame(personList[0],personList[1]);
    }

    @Timeout(10)
    @Test
    public void timeoutTest(){
        for(int i=1;i<=3;i++){
            System.out.println(personList[i]);
        }
    }
}

