// Andre Leos (aleos5@toromail.csudh.edu)
// Byron Lacanal Jr. (blacanal1@toromail.csudh.edu)
//Jonathan Rios, (jrios85@toromail.csudh.edu)
// CSC 123 Final Project

import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class member {
	//variables
	private static int regNumCounter  = 1000 ;
	//Adult if Guardian is null, or Child w/ Guardian
	String birthDate;
	String firstName;
	String lastName;
	String cityName;
	String zipCode;
	//Guardian fields
	String birthDateGuardian;
	String firstNameGuardian;
	String lastNameGuardian;
	String cityNameGuardian;
	String zipCodeGuardian;
	//flags account as child, disallows r18 checkouts
	boolean isAdult = true;
	//reg number
	int regNum;
	//Members can only take out 5 of whatever materials
	material loanedMaterial[] = new material [5];
	public int materialCount = 0;
    //String birthDate;
    Scanner input = new Scanner(System.in);    
	public member() throws Exception {
	//Does an immediate check to see if child or adult
    System.out.println("Enter Date of Birth (in MM/DD/YYYY format): ");
    this.birthDate = input.next();
    Calendar today = Calendar.getInstance();
    Calendar dob = Calendar.getInstance();
    SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy");
    Date userDoB = df.parse(birthDate);
    System.out.println(userDoB);
    dob.setTime(userDoB);
    int birthYear = dob.get(Calendar.YEAR);
    int thisYear = today.get(Calendar.YEAR);
    //prints year out
    System.out.println(thisYear-birthYear);
    //if over 18, you can sign up as normal member
    if(thisYear-birthYear >=18){
      System.out.println(input.nextLine());
      System.out.println("Continue with Membership"); 
      System.out.println("Enter First Name: ");
      this.firstName = input.nextLine();
      System.out.println("Enter Last Name: ");
      this.lastName = input.nextLine();
      System.out.println("Enter City Name: ");
      this.cityName = input.nextLine();
      System.out.println("Enter Zip Code: ");
      this.zipCode = input.nextLine();
	  this.regNum = ++regNumCounter;
      System.out.println("Your registered number with us is: " +regNum);
  	  this.birthDateGuardian = null;
  	  this.firstNameGuardian = null;
  	  this.lastNameGuardian  = null;
  	  this.cityNameGuardian  = null;
    }
    //under 18, you need guardianship
    else{
      System.out.println(input.nextLine());
      System.out.println("Your Below 18, Enter Parent or Guardian information first for Membership");
      System.out.println("Enter Guardian's First Name: ");
      this.firstNameGuardian = input.nextLine();
      System.out.println("Enter Guardian's Last Name: ");
      this.lastNameGuardian = input.nextLine();
      System.out.println("Enter Guardian's Date of Birth(in MM/DD/YYYY format): ");
      this.birthDateGuardian = input.nextLine();
      System.out.println("Enter City Guardian lives within: ");
      this.cityNameGuardian = input.nextLine();
      System.out.println("Enter Zip Code of that city: ");
      this.zipCodeGuardian = input.nextLine();
      System.out.println("Continue with Membership");      
      System.out.println("Enter First Name: ");
      this.firstName = input.nextLine();
      System.out.println("Enter Last Name: ");
      this.lastName = input.nextLine();
      System.out.println("Enter City Name: ");
      this.cityName = input.nextLine();
      System.out.println("Enter Zip Code: ");
      this.zipCode = input.nextLine();
	  this.regNum = ++regNumCounter;
      System.out.println("Your registered number with us is: " +regNum);
	  this.isAdult = false;
    }
  }
}