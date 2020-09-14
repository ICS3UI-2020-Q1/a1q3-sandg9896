import java.util.Scanner;
/**
 *
 * @author Gavin Sandhar
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // calculate how much it would cost to purchase different quantities of computer parts
   String name;
   System.out.println("Welcome! Enter which computer parts you would like to purchase along with a quantity:");
   System.out.println("How many Chromebook Chargers would you like?:");
    // Creates a Scanner used for input
    Scanner input = new Scanner(System.in);
     int chromebookCharger = input.nextInt();


    System.out.println("How many Replacement Motherboards would you like?:");   
     int replacementMotherboard = input.nextInt();
    
    System.out.println("How many Computer Mouses would you like?:");
     int computerMouse = input.nextInt();

     double Subtotal = (chromebookCharger*34.99 + replacementMotherboard*127.50 + computerMouse*18.00);

     double Tax = (1.13);

     // declare and calculate the quotient
   System.out.println(Subtotal*1.13);



    
    
  }
}
