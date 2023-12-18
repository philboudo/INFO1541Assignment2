package EmployeeObjects;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HourlyEmployeeTest {

    @Test
    public void testIncreaseHoursPositive() {
        HourlyEmployee emp = new HourlyEmployee("Tony", "Stark", 5749, "Service", "Lead Service Manager", 32.85);

        emp.increaseHours(5); // Adding 5 hours (positive)
        assertEquals(5.0, emp.getHoursWorked(), 0.01);
    }
    @Test
    public void testIncreaseHoursNegative() {
        HourlyEmployee emp = new HourlyEmployee("Tony", "Stark", 5749, "Service", "Lead Service Manager", 32.85);

        emp.increaseHours(-2); // Adding -2 hours (negative, should not change)
        assertEquals(0.0, emp.getHoursWorked(), 0.01);
    }

    @Test
    public void testAnnualRaise() {
        HourlyEmployee emp = new HourlyEmployee("Tony", "Stark", 5749, "Service", "Lead Service Manager", 32.85);

        emp.annualRaise(); // Applying annual raise
        assertEquals(34.49, emp.getWage(), 0.01);
    }

    @Test
    public void testCalculateWeeklyPayNormalHours() {
        HourlyEmployee emp = new HourlyEmployee("Tony", "Stark", 5749, "Service", "Lead Service Manager", 32.85);

        emp.increaseHours(35); // Adding 35 hours (no overtime)
        double weeklyPay = emp.calculateWeeklyPay();
        assertEquals(1149.75, weeklyPay, 0.01);
    }
    @Test
    public void testCalculateWeeklyPayWithOvertime() {
        HourlyEmployee emp = new HourlyEmployee("Tony", "Stark", 5749, "Service", "Lead Service Manager", 32.85);

        emp.increaseHours(45); // Adding 45 hours (with overtime)
        double weeklyPay = emp.calculateWeeklyPay();
        assertEquals(1560.38, weeklyPay, 0.01);
    }


}