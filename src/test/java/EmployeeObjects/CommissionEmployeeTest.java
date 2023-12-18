package EmployeeObjects;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CommissionEmployeeTest {
    @Test
    public void testIncreaseSalesPositive() {
        CommissionEmployee emp = new CommissionEmployee("Clint", "Barton", 6847, "Sales", "Customer Representative", .0265);

        emp.increaseSales(1000);
        assertEquals(1000.0, emp.getSales(), 0.01);
    }

    @Test
    public void testIncreaseSalesNegative() {
        CommissionEmployee emp = new CommissionEmployee("Clint", "Barton", 6847, "Sales", "Customer Representative", 0.0265);

        emp.increaseSales(-500); // Adding negative sales (should not change)
        assertEquals(0.0, emp.getSales(), 0.01);
    }
    @Test
    public void testHolidayBonus() {
        CommissionEmployee emp = new CommissionEmployee("Clint", "Barton", 6847, "Sales", "Customer Representative", 0.0265);

        double bonus = emp.holidayBonus();
        assertEquals(0.0, bonus, 0.01);
    }

    @Test
    public void testAnnualRaise() {
        CommissionEmployee emp = new CommissionEmployee("Clint", "Barton", 6847, "Sales", "Customer Representative", 0.0265);

        emp.annualRaise(); // annual raise
        emp.annualRaise(); // Applying annual raise again

        assertEquals(0.0305, emp.getRate(), 0.0001);
    }


}