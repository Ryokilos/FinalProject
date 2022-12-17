// Import scanner
import java.util.Scanner;
//class
public class materialArray {
	    // Class data members
	    material materialArray[] = new material[999999999];
	    public static int count;
	    Scanner scan = new Scanner(System.in);
	    // To display all books
	    public void showAllMaterials() {
	     System.out.println("Showing all Materials\n");
	     System.out.println("Unique Identifier | Title | Location Identifier | Author | ISBN | Released | Length |Suitable for Children? | Available?");
	     for (int i = 0; i < count; i++) {
	     System.out.println("Unique Identifier: " + materialArray[i].uniqueNo + "\t | Title: " + materialArray[i].title + "\t | Location Identifier: " + materialArray[i].locName + "." + materialArray[i].locNo
	    		 		  + "\t | Author: " + materialArray[i].authorName + "\t | ISBN: " + materialArray[i].isbn + "\t | Released: " + materialArray[i].released + "\t | Length: " + materialArray[i].length 
	    		 		  + "\t | Suitable for Children?: " + materialArray[i].r18 + "\t | Available?: " + materialArray[i].availablity);
	    }
	    }
	    public int compareBookObjects(material b1, material b2) throws Exception {
	 
	        // If book name matches
	        if (b1.title.equalsIgnoreCase(b2.title)) {
	            // Printing book exists
	            System.out.println(
	                "Book of this Name Already Exists.");
	            return 0;
	        }
	    // if book serial matches
	    if (b1.uniqueNo == b2.uniqueNo) {
	    // Print book exists
	    System.out.println("Book of this Serial No Already Exists.");
	    return 0;
	    }
	    return 1;
	    }
	    public void addMaterial(material b) throws Exception {
	        for (int i = 0; i < count; i++) {
	            if (this.compareBookObjects(b, this.materialArray[i])
	                == 0)
	                return;
	        }
	        if (count < 50) {
	        	materialArray[count] = b;
	            count++;
	        }
	        else {
	            System.out.println(
	                "No Space to Add More Books.");
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
	 
	        for (int i = 0; i < count; i++) {
	            if (uniqueNo == materialArray[i].uniqueNo) {
	                if (materialArray[i].availablity = true) {
	                    System.out.println(
	                        "Book is Available.");
	                    return i;
	                }
	                System.out.println("Book is Unavailable");
	                return -1;
	            }
	        }
	 
	        System.out.println("No Book of Serial Number "
	                           + " Available in Library.");
	        return -1;
	    }
	    // To remove the book from the library
	    public material checkOutMaterial() throws Exception {
	        System.out.println("Enter Unique Number of Book to Check Out.");
	        int uniqueNo = scan.nextInt();
	        int bookIndex = isAvailable(uniqueNo);
	        if (bookIndex != -1) {
	        	materialArray[bookIndex].availablity = false;
	            return materialArray[bookIndex];
	        }
	        return null;
	    }
	    // To return materials Library
	    public void checkInMaterial(material b) throws Exception {
	        for (int i = 0; i < count; i++) {
	            if (b.equals(materialArray[i])) {
	            	materialArray[i].availablity = true;
	                return;
	            }
	        }
	    }
	}