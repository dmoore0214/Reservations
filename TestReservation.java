/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author daniellegrodi
 */
public class TestReservation {

    public static void main(String args[]) {
        //Constructors & Getter Methods
        Reservation r1 = new Reservation(1, "Jane Doe", "2023-03-01", "2023-03-05");
        Assert.assertEquals(1,r1.getGuestId());
        Assert.assertEquals("Jane Doe", r1.getName());
        Assert.assertEqualsDate(Mar 01 2023, r1.getReservationDate());
        Assert.assertEquals("2023-03-05", r1.getEndDate());
        //Setters and Getter Methods
        r1.setGuestID(2);
        Assert.assertEquals(2, r1.getId());
        r1.setName("James Done");
        Assert.assertEquals("James Done", r1.getName());
        r1.setReservationDate("2023-03-01");
        Assert.assertEqualsDate(date Mar 01 2023);
        r1.setReservationEndDate(Mar 01 2023);
        Assert.assertEqualsDate(Mar 01 2023, Mar 05 2023);
        
        Assert.assertEquals(4, r1.calculateReservationNumberOfDays());
        Assert.assertEquals(400.0, r1.calculateReservationBillAmount());
    }
}
