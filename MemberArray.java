// CSC 123 Final Project

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
    // To remove Material
    public void checkOutBook(materialArray material){
        int memberIndex = this.isStudent();
 
        if (studentIndex != -1){
            System.out.println("Checking out");
 
            book.showAllBooks();
            book b = book.checkOutBook();
 
            System.out.println("Checking out");
            if (b != null){
 
                if (theMembers[studentIndex].booksCount<= 3){
 
                    System.out.println("Adding book");
                    theMembers[memberIndex].borrowedBooks[theMembers[memberIndex].booksCount]= b;
                    theMembers[memberIndex].booksCount++;
 
                    return;
                }
                else{
 
                    System.out.println("Member Can not Borrow more than 3 Books.");
                    return;
                }
            }
            System.out.println("Book is not Available.");
        }
    }
	
	
	
	
	// Method 3
    // To add the Book / Magazines / DVD's
    public void checkInBook(materialArray material){
        int memberIndex = this.isStudent();
        if (memberIndex != -1){
 
            // Printing credentials corresponding to student
            System.out.println("S.No\t\t\tBook Name\t\t\tAuthor Name");
 
            member s = theMembers[memberIndex];
 
            for (int i = 0; i < s.booksCount; i++){
 
                System.out.println(s.borrowedBooks[i].sNo + "\t\t\t" + s.borrowedBooks[i].bookName + "\t\t\t" + s.borrowedBooks[i].authorName);
            }
 
            // Display message only
            System.out.println("Enter Serial Number of Book to be Checked In:");
 
            int sNo = input.nextInt();
 
            for (int i = 0; i < s.booksCount; i++){
                if (sNo == s.borrowedBooks[i].sNo){
                    book.checkInBook(s.borrowedBooks[i]);
                    s.borrowedBooks[i] = null;
 
                    return;
                }
            }
 
            System.out.println("Book of Serial No " + sNo + "not Found");
        }
    }
	
}