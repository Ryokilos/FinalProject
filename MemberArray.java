// CSC 123 Final Project

import java.util.Scanner;
public class MemberArray {
	
	// Creating objects of Scanner and students class
    Scanner input = new Scanner(System.in);
	member theMembers[] = new member[50];
	
	public static int count = 0;
	
	
	// Method 1
    // Displaying all students
    public void showAllMembers(){
        // Printing Member Name and corresponding Information
        System.out.println("First Name\t\tLast Name\t\tBirth Date\t\tCity\t\tZip Code\t\tRegistration Number");
		
        for (int i = 0; i < count; i++){
 
            System.out.println(theMembers[i].firstName +"\t\t" + theMembers[i].lastName +"\t\t" + theMembers[i].birthDate + "\t\t" + theMembers[i].cityName + "\t\t" + theMembers[i].zipCode + "\t\t"+ theMembers[i].regNum);
        }
    }
    
    
    // Method 2
    // To check for the Member
    public int isMember(){
        // Display message only
        System.out.println("Enter Registration Number:");
 
        String regNum = input.nextLine();
 
        for (int i = 0; i < count; i++) {
 
            if (theMembers[i].regNum.equalsIgnoreCase(regNum)){
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
    public void checkOutMaterial(materialArray material){
        int memberIndex = this.isMember();
 
        if (memberIndex != -1){
            System.out.println("Checking out");
 
            material.showAllMaterial();
            material b = material.checkOutMaterial();
 
            System.out.println("Checking out");
            if (b != null){
 
                if (theMembers[memberIndex].materialCount<= 3){
 
                    System.out.println("Adding book");
                    theMembers[memberIndex].borrowedMaterial[theMembers[memberIndex].materialCount]= b;
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
    public void checkInMaterial(materialArray material){
        int memberIndex = this.isMember();
        if (memberIndex != -1){
 
            // Printing credentials corresponding to member
            System.out.println("S.No\t\t\tBook Name\t\t\tAuthor Name");
 
            member s = theMembers[memberIndex];
 
            for (int i = 0; i < s.materialCount; i++){
 
                System.out.println(s.borrowedMaterial[i].sNo + "\t\t\t" + s.borrowedMaterial[i].bookName + "\t\t\t" + s.borrowedMaterial[i].authorName);
            }
 
            // Display message only
            System.out.println("Enter Serial Number of Material to be Checked In:");
 
            int sNo = input.nextInt();
 
            for (int i = 0; i < s.materialCount; i++){
                if (sNo == s.borrowedMaterial[i].sNo){
                    material.checkInMaterial(s.borrowedMaterial[i]);
                    s.borrowedMaterial[i] = null;
 
                    return;
                }
            }
 
            System.out.println("Material of Serial No " + sNo + "Not Found");
        }
    }
	
}