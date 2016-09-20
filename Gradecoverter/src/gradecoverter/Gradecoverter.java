/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradecoverter;

/**
 *
 * @author Chad
 */
public class Gradecoverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int grade = readInt("What is your grade?");
        if(grade >= 90)
        {
            System.out.println("A");
        }
        if(grade >= 80 && grade < 90)
            {
                System.out.print("B");
            }
        if(grade >= 70 && grade < 80)
            {
                System.out.println("C");
            }
        else
            {
                System.out.println("F");
            }   
    }
    
}
