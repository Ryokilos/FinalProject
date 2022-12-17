// Andre Leos (aleos5@toromail.csudh.edu)
// Byron Lacanal Jr. (blacanal1@toromail.csudh.edu)
// CSC 123 Final Project

import java.util.Scanner;
class Main {
  public static void main(String[] args) throws Exception {
	  // Class
	  // Create scanner
	  Scanner scan = new Scanner(System.in);
	  // Displaying menu
	  System.out.println("Libary Menu");
	  // Create object of material class
	  materialArray ob = new materialArray();
	  // Create object of member class
	  memberArray obMember = new memberArray();
	  int choice;
	  // menu
	  do {
		  ob.menu();
	      choice = scan.nextInt();
	      // Switch case start
	      switch (choice) {
	      // Case 1, this adds a new member
          case 1:
          member s = new member();
          obMember.addMember(s);
          break;	 
	      // Case 2, this adds materials
	      case 2:
	      material b = new material();
	      ob.addMaterial(b);
	      break;
		  // Case 3, this checks out materials
	      case 3:
          obMember.checkOutMaterial(ob);
          break;
          // Case 4 this returns materials
          case 4:
          obMember.checkInMaterial(ob);
          break;
          // Case 5 this shows all books within material array
          case 5:
          ob.showAllMaterials();
          break;
          // Case 6, this displays all loans within the system
	      case 6:
	      //obMember.showAllLoans();
	      break;
	      // Case 7 this checks for a member in the member array
          case 7:
          obMember.isMember();
          break; 
	      //case ?, this lets you search books using Unique Identifying number
	      //ob.searchByuniqueNo();
          //break;
	      //case ?, this displays all members
	      //ob.showAllMembers();
          //break;
	      // if above cases don't match
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
	