package finals;

import java.util.Scanner;
// Class
public class material {
// Class data members
public int uniqueNo;
public String Title;
public String authorName;
public String ISBN;
public String length;
public int LoanTime;
public Boolean Availablity;
public int Replacement;
public Boolean R18;
	

// Creating object of Scanner class to
// read input from users
Scanner scan = new Scanner(System.in);

// Method
// To add material
public void Book,magazine,dvd(int id,String t, String s, String a, boolean issued)    

    int currentIdNumber;
	currentIdNumber++;
    int bookID;
	if(id==-1)
    {
        bookID = currentIdNumber;
    }
    else
        bookID=id;
    
    Title = t;
    String subject = s;
	private java.lang.String a;
    String author = a;
    boolean Issued = issued;

// Display message for taking input

System.out.println("Enter Serial No of Book:");

this.uniqueNo = input.nextInt();
input.nextLine();

System.out.println("Enter Book Name:");
this.bookName = input.nextLine();

System.out.println("Enter Author Name:");
this.authorName = input.nextLine();

System.out.println("Enter Book ISBN:");
this.bookName = input.nextLine();

System.out.println("Enter Book length:");
this.bookName = input.nextLine();

System.out.println("Enter Book Avalability:");
this.bookName = input.nextBoolean();

System.out.println("Enter Book Replacement:");
this.bookName = input.nextint();

System.out.println("Enter Book Name if over 18:");
this.bookName = input.nextBoolean();


System.out.println("Enter Serial No of Magazine:");

this.uniqueNo = input.nextInt();
input.nextLine();

System.out.println("Enter Magazine Name:");
this.magazineName = input.nextLine();

System.out.println("Enter publication date:");
this.publicationdatee = input.nextLine();

System.out.println("Enter Magazine Issue Number:");
this.magazineissuenum = input.nextLine();

System.out.println("Enter magazine length:");
this.bookName = input.nextLine();

System.out.println("Enter magazine Avalability:");
this.magazineName = input.nextBoolean();

System.out.println("Enter magazine Replacement:");
this.magazineName = input.nextint();

System.out.println("Enter magazine name if over 18:");
this.magazineName = input.nextBoolean();

System.out.println("Enter Serial No of dvd:");

this.uniqueNo = input.nextInt();
input.nextLine();

System.out.println("Enter dvd Name:");
this.dvdName = input.nextLine();

System.out.println("Enter release date:");
this.dvdreleasedate = input.nextLine();

System.out.println("Enter dvd duration:");
this.dvdduration = input.nextLine();

System.out.println("Enter dvd Avalability:");
this.dvdname = input.nextBoolean();

System.out.println("Enter dvd Replacement:");
this.dvdname = input.nextint();

System.out.println("Enter dvd name if over 18:");
this.dvdName = input.nextBoolean();


}