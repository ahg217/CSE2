//Anna Gillis
//CSE 2
//hw 03 root
//Write a program that prompts the user to enter a double and then prints out a crude estimate of the cube root of the number and the value of this crude guess when cubed.

import java.util.Scanner; //necessary to use scanner class

public class Root {
        //main method required for ever java program
        public static void main(String[ ] args) {
            
            Scanner myScanner; //decalre instance of scanner object
            myScanner = new Scanner (System.in); //tells it will take input
            
            System.out.print("Enter a number as" +
            " a double (in the form xx.xx) : " ) ; //print out
            double number = myScanner.nextDouble (); //accept next double
            
            double guess1;
            
            guess1=(number/3); //divide by three
            
            double guess2;
            
            guess2=(2*guess1*guess1*guess1+number)/(3*guess1*guess1); //more acurate
            
            System.out.print ("The cube root is"+ guess2); //print
            
        }
}
     