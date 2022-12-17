// Andre Leos (aleos5@toromail.csudh.edu)
// Byron Lacanal Jr. (blacanal1@toromail.csudh.edu)
// CSC 123 Final Project
// Import scanner
import java.util.Scanner;
//class
public class materialArray {
	    // Class data members
	    material materialArray[] = new material[99999999];
	    public static int count;
	    Scanner scan = new Scanner(System.in);
	    // To display all books
	    public void showAllMaterials() {
	     System.out.println("Showing all Materials\n");
	     for (int i = 0; i < count; i++) {
	     System.out.println("\nUnique Identifier: " + materialArray[i].uniqueNo + "\t | Title: " + materialArray[i].title + "\t | Location Identifier: " + materialArray[i].locName + "." + materialArray[i].locNo); 
	     if (materialArray[i].authorName != null && materialArray[i].locName == 66 ||materialArray[i].locName == 98) System.out.print("| Author: " + materialArray[i].authorName + "\t | ISBN: " + materialArray[i].isbn); 
	     if (materialArray[i].issueNumber != null && materialArray[i].locName == 77 ||materialArray[i].locName == 109) System.out.print("| Magzine Issue:" + materialArray[i].issueNumber);
	     System.out.print("| Released: " + materialArray[i].released + "\t | Length: " + materialArray[i].length + "| Suitable for Children?: " + materialArray[i].r18 + "\t | Available?: " + materialArray[i].availablity);
	    }
	    }
	    public int compareMaterialObjects(material b1, material b2) throws Exception {
	        //If matches
	    if (b1.title.equalsIgnoreCase(b2.title)) {
	        //depreciated
	        System.out.println("Material of this type already exists within the system.");
	       return 0;
	        }
	    	 if (b1.uniqueNo == b2.uniqueNo) {
	    		 // Print 
	    		 System.out.println("Unique Identifying Number Error");
	    		 return 0;
	    	 	}
	    	 	return 1;
	    		}
	    //adds materials to library
	    //theoretically we could store 50 of the same item
	    public void addMaterial(material b) throws Exception {
	        for (int i = 0; i < count; i++) {
	            if (this.compareMaterialObjects(b, this.materialArray[i])
	                == 0)
	                return;
	        }
	        if (count < 50) {
	        	materialArray[count] = b;
	            count++;
	        }
	        else {
	            System.out.println("No Space to Add Materials.");
	    }
	    } 
	    // To create menu
	    public void menu() throws Exception {
	        // Displaying menu
	        System.out.println("1 - New Membership");
	        System.out.println("2 - Add Material");
	        System.out.println("3 - Issue Item");
	        System.out.println("4 - Return Item");
	        System.out.println("5 - Report Inventory");
	        System.out.println("6 - Report Loans");
	        System.out.println("7 - Lookup Membership");
	        System.out.println("8 - Exit");
	  	  	System.out.println("Please enter your choice:");
	    }
	    // To search the library
	    public int isAvailable(int uniqueNo) throws Exception {
	    	//searches array
	        for (int i = 0; i < count; i++) {
	        //checks if material is available
	            if (uniqueNo == materialArray[i].uniqueNo) {
	            	//if it is available
	                if (materialArray[i].availablity = true) {
	                    System.out.println("Material is Available.");
	                    return i;
	                }
	                //if not available
	                System.out.println("Material is Unavailable");
	                return -1;
	            }
	        }
	 
	        System.out.println("Unique Identifying Number "
	                           + " Available in Library.");
	        return -1;
	    }
	    // To check out book
	    public material checkOutMaterial() throws Exception {
	        System.out.println("Enter Unique Identifying Number to Check Out.");
	        int uniqueNo = scan.nextInt();
	        int bookIndex = isAvailable(uniqueNo);
	        if (bookIndex != -1) {
	        	materialArray[bookIndex].availablity = false;
	            return materialArray[bookIndex];
	        }
	        return null;
	    }
	    // To return materials
	    public void checkInMaterial(material b) throws Exception {
	    	//searches array
	        for (int i = 0; i < count; i++) {
	        //sets availability to true
	            if (b.equals(materialArray[i])) {
	            	materialArray[i].availablity = true;
	                return;
	            }
	        }
	    }
	}