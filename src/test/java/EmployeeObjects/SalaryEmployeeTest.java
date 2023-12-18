package EmployeeObjects;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SalaryEmployeeTest {
    @Test
    public void testCalculateWeeklyPay () {
        SalaryEmployee emp = new SalaryEmployee("Steve", "Rodgers", 3781, "Sales", "Manager", 64325);

        double weeklyPay = emp.calculateWeeklyPay();
        assertEquals(1237.02, weeklyPay, 0.01);
    }



}