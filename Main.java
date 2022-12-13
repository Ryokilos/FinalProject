//Andre J Leos aleos5@toromail.csudh.edu
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int LoopExit = 0;
		int ChoiceCheck = 0;
		int Choice = 0;
    int i = 0; 
		String FirstName = null;
		String LastName = null;
		String EAddress = null;
		ArrayList<String> FName = new ArrayList<String>();
		ArrayList<String> LName = new ArrayList<String>();
		ArrayList<String> Email = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Hello!\n");
			while (1 > LoopExit) {
				System.out.println("1 - Register User");
				System.out.println("2 - List Users");
				System.out.println("3 - Exit\n");
				System.out.println("Please select an option between 1 and 3:\n");
					Choice = scan.nextInt();
						while (1 > ChoiceCheck) {
							if (Choice < 1 || Choice > 4) {
								System.out.println("Sorry, you have selected an invalid choice... Your options are:");
								System.out.println("1 - Register User");
								System.out.println("2 - List Users");
								System.out.println("3 - Exit");
								System.out.println("Please select a valid option between 1 and 3:");
								Choice = scan.nextInt();
							} else if (Choice > 0 && Choice < 4) {
								++ChoiceCheck; 
								}
						} if(Choice > 0 && Choice < 2) {
							FirstName = null;
							LastName = null;
							EAddress = null;
							scan.nextLine();
							System.out.println("\nYou have selected choice 1, Starting the registering process!");
							System.out.println("Please enter first name:");
							FirstName = scan.nextLine();
							FName.add(FirstName);
							System.out.println("Please enter last name:");
							LastName = scan.nextLine();
							LName.add(LastName);
							System.out.println("Please enter your email:");
							EAddress = scan.nextLine();
							Email.add(EAddress);
              System.out.println("Press enter to continue...");
							scan.nextLine();
							System.out.println("Thank you, " + FirstName +" " + LastName + " for registering your email: "+ EAddress + " with us, is there anything else you'd like to do today?\n");
						} else if(Choice > 1 && Choice < 3) {
							System.out.println("\nFirst Name | Last Name | Email Address");
              while (i < Email.size()) {
              System.out.print(i+1 + ":");
							System.out.print(" " + FName.get(i));
							System.out.print(" " + LName.get(i));
							System.out.print("| " + Email.get(i) + "\n");
              i++;
            }
							System.out.println("These are all the registered users so far.\n");	
              System.out.println("Is there anything else you'd like to do?\n");	
						} else if (Choice > 2 && Choice < 4) {
							System.out.println("\nYou have selected choice 3, closing the program...");								
							++ChoiceCheck;
							++LoopExit;
					}
				}
			scan.close();
			System.out.println("Thank you for using User Manager, the program has now closed! Goodbye!");
		}
	}