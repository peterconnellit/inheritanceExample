/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package overseasstudenttest;

/**
 *
 * @author peter
 */
public class OverSeasStudentTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student homeStud = new Student("Keith", 123);
        System.out.println(homeStud.getName() + " number " + homeStud.getNum());

        OverSeasStudent overStud = new OverSeasStudent("Pierre", 1235, "France");
        System.out.print(overStud.getName() + " number " + overStud.getNum() + " ");

        System.out.println("Country " + overStud.country());
        overStud.alter();
    }

    //Validation is in relevant classes
}
