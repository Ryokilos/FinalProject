//this is a light version of main, this is mostly for debugging your clases
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
	  //member s = new member();
	  //material a = new material();	 
	  // Class
	  // Creating object of Scanner class
	  // to take input from user
	  Scanner scan = new Scanner(System.in);
	  // Displaying menu
	  System.out.println("Libary Menu");
	  // Creating object of material class
	  materialArray ob = new materialArray();
	  // Creating object of students class
	  //member obStudent = new member();
	  int choice;
	  // menu
	  do {
		  ob.menu();
	      choice = scan.nextInt();
	      // Switch case
	      switch (choice) {
	      // Case 1, this adds a new member
          case 1:
          //member s = new member();
          //obStudent.addMember(s);
          break;	 
	      // Case 2, this adds materials
	      case 2:
	      material b = new material();
	      ob.addMaterial(b);
	      break;
		  // Case 3, this checks out materials
	      case 3:
          //ob.members.checkInMaterial(ob);
          break;
          // Case 4 this returns materials
          case 4:
          //ob.members.checkOutMaterial(ob);
          break;
          // Case 5 this shows all books within material array
          case 5:
          ob.showAllBooks();
          break;
	      //case ?, this lets you search books using Unique Identifying number
	      //ob.searchByuniqueNo();
          //break;
          // Case 6, this displays all loans within the system
	      case 6:
	      //ob.showAllLoans();
	      break;
	      // Case 7 this shows all the members in the member array
          case 7:
	      //ob.showAllMembers();
          break; 
	      // if above cases dont match
	      default:
	      // Print statement
	      System.out.println("...");
	        }
	        }
	        // 8 is to exit system
	        while (choice != 8);
      System.out.println("Exiting System");
	  }
}
	