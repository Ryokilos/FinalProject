
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class member {
	public static void main(String[] args) throws Exception {

    //String birthDate;
    Scanner input = new Scanner(System.in);

    System.out.println("Enter Date of Birth: ");
    String birthDate = input.next();


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
      String firstName = input.next();

      System.out.println("Enter Last Name: ");
      String lastName = input.next();

      System.out.println("Enter City Name: ");
      String cityName = input.next();

      System.out.println("Enter Zip Code: ");
      int zipCode = input.nextInt();

      System.out.println("Enter Registration Number: ");
      int regNum = input.nextInt();
 
    }
    else{
      System.out.println("Your Below 18, Ask Parent or Guardian for Membership");
    }

  }
}