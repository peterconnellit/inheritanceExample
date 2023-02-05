/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package overseasstudenttest;

/**
 *
 * @author peter
 */
public class Student {

    private String pr_name;
    protected int pr_stuNum;

    public Student(String na, int sn) //data constructor: sets name and number
    {
        pr_name = na;
        setStuNum(sn);
    }

    public String getName() //pre:
    //post: returns name
    {
        return pr_name;
    }

    public int getNum() //pre:
    //post: returns number
    {
        return pr_stuNum;
    }

    public void setStuNum(int sn) {
        if (sn >= 1 && sn <= 10000) {
            pr_stuNum = sn;
        } else {
            System.out.println("Error: Invalid student number.");
        }
    }

    public void alter() {
        // alters code
    }

}
