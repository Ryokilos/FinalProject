import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class member {
	private static int regNumCounter  = 1000 ;
	String birthDate;
	String firstName;
	String lastName;
	String cityName;
	String zipCode;
	String birthDateGuardian;
	String firstNameGuardian;
	String lastNameGuardian;
	String cityNameGuardian;
	String zipCodeGuardian;
	boolean isAdult = true;
	int regNum;
    
	material loanedMaterial[] = new material [5];
	public int materialCount = 0;
    //String birthDate;
    Scanner input = new Scanner(System.in);
    
	public member() throws Exception {
		
		
		
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

    System.out.println(thisYear-birthYear);

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