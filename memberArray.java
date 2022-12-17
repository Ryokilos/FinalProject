// Andre Leos (aleos5@toromail.csudh.edu)
// Byron Lacanal Jr. (blacanal1@toromail.csudh.edu)
//Jonathan Rios, (jrios85@toromail.csudh.edu)
// CSC 123 Final Project

import java.util.Scanner;
import java.util.Calendar;
public class memberArray {
	
	// Creating objects of Scanner and students class
    Scanner input = new Scanner(System.in);
	member theMembers[] = new member[99999];
	
	public static int count = 0;
	

    public void addMember(member s) throws Exception {
        for (int i = 0; i < count; i++) {
 
            if (s.regNum == theMembers[i].regNum) {
 
                // Print statement
                System.out.println(
                    "Student of Reg Num " + s.regNum
                    + " is Already Registered.");
 
                return;
            }
        }
 
        if (count <= 50) {
            theMembers[count] = s;
            count++;
        }
    }
	// Method 1
    // Displaying all students
    public void showAllMembers() throws Exception {
        // Printing Member Name and corresponding Information
        System.out.println("First:\t\t\tLast:\t\t\tBoD:\t\t\tCity:\t\t\tZip:\t\tRegistration Number:");
		
        for (int i = 0; i < count; i++){
 
            System.out.println(theMembers[i].firstName +"\t\t" + theMembers[i].lastName +"\t\t" + theMembers[i].birthDate + "\t\t" + theMembers[i].cityName + "\t\t" + theMembers[i].zipCode + "\t\t"+ theMembers[i].regNum); if (theMembers[i].isAdult == false) System.out.println("Guardian Info for: "+ theMembers[i].firstName + "\n" + theMembers[i].firstNameGuardian +"\t\t" + theMembers[i].lastNameGuardian +"\t\t" + theMembers[i].birthDateGuardian + "\t\t" + theMembers[i].cityNameGuardian + "\t\t" + theMembers[i].zipCodeGuardian);
        }
    }
    
    
    // Method 2
    // To check for the Member
    public int isMember() throws Exception {
        // Display message only
        System.out.println("Enter Registration Number:");
 
        int regNum = input.nextInt();
 
        for (int i = 0; i < count; i++) {
 
            if (theMembers[i].regNum == regNum){
            	System.out.println("First Name: " + theMembers[i].firstName +"\t Last Name: " + theMembers[i].lastName +"\t Date of Birth: " + theMembers[i].birthDate + "\t City: " + theMembers[i].cityName + "\t Zip: " + theMembers[i].zipCode + "\t Register Number: "+ theMembers[i].regNum); if (theMembers[i].isAdult == false) System.out.println("Guardian Info for: "+ theMembers[i].firstName + "\nFirst Name: " + theMembers[i].firstNameGuardian +"\t Last Name: " + theMembers[i].lastNameGuardian +"\t DOB of Guardian: " + theMembers[i].birthDateGuardian + "\t City: " + theMembers[i].cityNameGuardian + "\t Zip: " + theMembers[i].zipCodeGuardian);
            	return i;
            }
        }
 
        // Print statements
        System.out.println("Member is not Registered.");
        System.out.println("Get Registered First.");
        return -1;
    }
	
	
	// Method 3
    // To remove Material
    public void checkOutMaterial(materialArray material) throws Exception {
        int memberIndex = this.isMember();
 
        if (memberIndex != -1){
            System.out.println("Checking out");
 
            material.showAllMaterials();
            material b = material.checkOutMaterial();
 
            System.out.println("Checking out");
            if (b != null){
 
                if (theMembers[memberIndex].materialCount<= 5){
 
                    System.out.println("Adding book");
                    theMembers[memberIndex].loanedMaterial[theMembers[memberIndex].materialCount]= b;
                    theMembers[memberIndex].materialCount++;
 
                    return;
                }
                else{
 
                    System.out.println("Member Can not Borrow more than 5 Material.");
                    return;
                }
            }
            System.out.println("Material is not Available.");
        }
    }
	
	
	
	
	// Method 4
    // To add the Book / Magazines / DVD's
    public void checkInMaterial(materialArray material) throws Exception {
        int memberIndex = this.isMember();
        if (memberIndex != -1){
 
            // Printing credentials corresponding to member
            System.out.println("S.No\t\t\tBook Name\t\t\tAuthor Name");
 
            member s = theMembers[memberIndex];
 
            for (int i = 0; i < s.materialCount; i++){
 
                System.out.println(s.loanedMaterial[i].uniqueNo + "\t\t\t" + s.loanedMaterial[i].title + "\t\t\t" + s.loanedMaterial[i].authorName);
            }
 
            // Display message only
            System.out.println("Enter Unique Identifying Number of Material to be Checked In:");
 
            int uniqueNo = input.nextInt();
 
            for (int i = 0; i < s.materialCount; i++){
                if (uniqueNo == s.loanedMaterial[i].uniqueNo){
                    material.checkInMaterial(s.loanedMaterial[i]);
                    s.loanedMaterial[i] = null;
 
                    return;
                }
            }
 
            System.out.println("Material of Serial No " + uniqueNo + "Not Found");
        }
    }
    
    
    
    
    public void showAllLoans() throws Exception {
            for (int memberIndex = 0; memberIndex < count; memberIndex++){
                member s = theMembers[memberIndex];
                System.out.println(theMembers[memberIndex].firstName +"\t\t" + theMembers[memberIndex].lastName + "\t ID Number: "+ theMembers[memberIndex].regNum +"Is an adult:"+ theMembers[memberIndex].isAdult); if (theMembers[memberIndex].isAdult == false) System.out.println("Guardian Info for: "+ theMembers[memberIndex].firstName + "\n" + theMembers[memberIndex].firstNameGuardian +"\t\t" + theMembers[memberIndex].lastNameGuardian);
                for (int i = 0; i < s.materialCount; i++){     
                    System.out.println("Unique Identifying Number:" + s.loanedMaterial[i].uniqueNo + "\t\t Title: " + s.loanedMaterial[i].title + "\t\t Author Name: " + s.loanedMaterial[i].authorName + "Days to return item:"+ s.loanedMaterial[i].loanTime);
            }
            // Printing credentials corresponding to member
    }
	
}
}