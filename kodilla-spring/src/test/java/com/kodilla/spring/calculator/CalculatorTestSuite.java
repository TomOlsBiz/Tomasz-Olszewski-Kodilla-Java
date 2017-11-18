package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testCalculator() {

        //Given
        ApplicationContext context =  new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        double resultAAddB = calculator.add(1,2);
        double resultASubB = calculator.sub(3,0.5);
        double resultAMulB = calculator.mul(2, 0.5);
        double resultADivB = calculator.div(2,2);

        //Then
        Assert.assertEquals(3, resultAAddB,0.001);
        Assert.assertEquals(2.5, resultASubB, 0.001);
        Assert.assertEquals(1, resultAMulB, 0.001);
        Assert.assertEquals(1, resultADivB, 0.001);
    }
}
