
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class member {
	String birthDate;
	String firstName;
	String lastName;
	String cityName;
	int zipCode;
	String regNum;
    
	material loanedMaterial[] = new material [5];
	public int materialCount = 0;
    //String birthDate;
    Scanner input = new Scanner(System.in);
    
	public member() throws Exception {
		
    System.out.println("Enter Date of Birth: ");
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
      System.out.println("Continue with Membership");

      System.out.println("Enter First Name: ");
      this.firstName = input.next();

      System.out.println("Enter Last Name: ");
      this.lastName = input.next();

      System.out.println("Enter City Name: ");
      this.cityName = input.next();

      System.out.println("Enter Zip Code: ");
      this.zipCode = input.nextInt();

      System.out.println("Enter Registration Number: ");
      this.regNum = input.next();
 
    }
    else{
      System.out.println("Your Below 18, Ask Parent or Guardian for Membership");
    }

  }
}