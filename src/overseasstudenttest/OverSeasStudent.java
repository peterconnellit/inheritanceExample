/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package overseasstudenttest;

/**
 *
 * @author peter
 */
public class OverSeasStudent extends Student {

    private String pr_homeCountry;

    public OverSeasStudent(String na, int sn, String co) //data constructor: constructs superclass, sets country
    {
        super(na, sn); // called constructor in Student
        setHomeCountry(co);
    }

    public String country() //pre:
    //post: returns country
    {
        return pr_homeCountry;
    }

    public void setHomeCountry(String co) {
        String[] validCountries = {"Spain", "Nigeria", "France"};
        boolean isValid = false;
        for (String country : validCountries) {
            if (co.equals(country)) {
                isValid = true;
                break;
            }
        }
        if (isValid) {
            pr_homeCountry = co;
        } else {
            System.out.println("Error: Invalid home country.");
        }
    }

}
