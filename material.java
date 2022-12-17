import java.util.Scanner;
// Class
public class material {

// Class data members
// generated
private static int uniqueNoCounter  = 1000 ;
private static int locNoCounter     = 100  ;
//functionality
public int         inputValidCheck  = 0    ;
public int 		   r18Check  		= 0    ;
//overlapping attributes, DVD, MAG, BOOK all have these
char               locName                 ;
public int         locNo            = 0    ;
public int         loanTime         = 0    ;
public int         replaceValue     = 0    ;
public int         uniqueNo         = 0    ;
public Boolean     availablity      = true ;
public Boolean     r18              = false;
public String      length                  ;
public String      released                ;
public String      title                   ;
//book specific
public String      authorName              ;
public String      isbn                    ;
//mag specific
public String      issueNumber             ;
 
// Create scanner
Scanner scan = new Scanner(System.in);
   // uniqueNo = ++uniqueNoCounter;

// Display message for taking scan
public material () throws Exception {
	while (inputValidCheck == 0) {
		System.out.println("What type of material are you adding today? Please type: B for book, D for DVD, or M for Magzine!");
		this.locName = scan.next().charAt(0);
		System.out.println(scan.nextLine());
			if (locName == 66 || locName == 68 ||locName == 77 ||locName == 98 || locName == 100 || locName == 109) {
				System.out.println(locName);
				inputValidCheck++;
		} else {
			System.out.println("Please enter a valid input!");
		}
	}
	System.out.println("Enter the title of the media:");
	this.title = scan.nextLine();
	
	if (locName == 66 ||locName == 98) {
		System.out.println("Enter Author Name:");
		this.authorName = scan.nextLine();
		System.out.println("Enter Book ISBN:");
		this.isbn = scan.nextLine();
		} else {
		  this.authorName = null;
		  this.isbn       = null;
		}
	System.out.println("Enter length of media, for books and magazines put page length, for DVDs put video length in minutes:");
	this.length = scan.nextLine();
	System.out.println("Enter release year of media:");
	this.released = scan.nextLine();
	System.out.println("Enter value to replace the items if damaged:");
	this.replaceValue = scan.nextInt();
	System.out.println(scan.nextLine());
	if (locName == 77 ||locName == 109) {
		System.out.println("Enter Magazine Issue Number:");
		this.issueNumber = scan.nextLine();
		}	else {
		this.issueNumber = null;
		}
	inputValidCheck = 0;
	while (inputValidCheck == 0) {
		System.out.println("Is this material sutible for children? Y or N?");
		r18Check = scan.next().charAt(0);
		System.out.println(scan.nextLine());
			if (r18Check == 89 || r18Check == 121 ){
				inputValidCheck++; 
			} else if (r18Check == 78 || r18Check == 110 ) {
					this.r18              = true;
					inputValidCheck++;
			} else {
			System.out.println("Please enter a valid input!");
			}
		    this.uniqueNo = ++uniqueNoCounter;
		    this.locNo 	  = ++locNoCounter;
			}
	//debug
	System.out.println(title);                                              //
	System.out.println("Location Zone:" + locName);                         //
	System.out.println("Author Name:" + authorName);                        //
	System.out.println("ISBN:" + isbn);                                     //
	System.out.println("Length:" + length);                                 //
	System.out.println("Released:" + released);
	System.out.println("issueNumber:" + issueNumber);
	System.out.println("R18:" + r18);                                       //
	System.out.println("Location Number:" + locNoCounter);
	System.out.println("Unique Identifier for item:" + uniqueNo);           //
	System.out.println("Unique Identifier Total Count:" + uniqueNoCounter); //
	System.out.println("Location Identifier for item:" + locName + "." + locNo);
	System.out.println("Location Identifier Total Count:" + locNoCounter);
	}
	}