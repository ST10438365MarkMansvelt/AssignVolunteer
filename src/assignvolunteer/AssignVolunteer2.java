/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignvolunteer;
import java.util.Scanner;

/**
 *
 * @author Mark Mansvelt    ST10438365@vcconnect.edu.za   ST10438365
 */
public class AssignVolunteer2
{

    public static void main(String[] args)
    {
        
     int donationType;
     String volunteer;
     final int CLOTHING_CODE = 1;
     final int OTHER_CODE = 2;
     final String CLOTHING_PRICER = "Regina";
     final String OTHER_PRICER = "Marco";
     String message;
     
     
     Scanner input = new Scanner(System.in);
        System.out.println("What type of donation is this?");
        System.out.println("Enter " + CLOTHING_CODE + " for clothing, " + OTHER_CODE + " for anything else...");
        donationType = input.nextInt();
        
        if(donationType == CLOTHING_CODE)
        {
            volunteer = CLOTHING_PRICER;
            message = "a clothing donation";
        }
        else
        {
            volunteer = OTHER_PRICER;
            message = "a non-clothing donation";
        }
        
        System.out.println("You enetered " + donationType);
        System.out.println("The volunteer who will price this item is " + volunteer);
        System.out.println("This is " + message);
     
       
        


    }
    
}
