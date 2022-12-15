public class main {

book theBooks[] = new book[50];    
public static int count;   
Scanner input = new Scanner(System.in);




public int compareBookObjects(book b1, book b2){

    if (b1.bookName.equalsIgnoreCase(b2.bookName)){

        System.out.println("Book of this Name Already Exists.");
        return 0;

    }
    if (b1.sNo==b2.sNo){

        System.out.println("Book of this Serial No Already Exists.");
        return 0;
    }
    return 1;
}

public void newmembership(book b){

    for (int i=0; i<count; i++){

        if (this.compareBookObjects(b, this.theBooks[i]) == 0)
            return;

    }

    if (count<50){

        theBooks[count] = b;
        count++;

    }
    else{

        System.out.println("No Space to Add More Books.");

    }

}

public void searchBySno(){

    System.out.println("\t\t\t\tSEARCH BY SERIAL NUMBER\n");

    int sNo;
    System.out.println("Enter Serial No of Book:");
    sNo = input.nextInt();

    int flag = 0;
    System.out.println("S.No\t\tName\t\tAuthor\t\tAvailable\Isbn\t\tTotal ");
    for (int i=0; i<count; i++){

        if (sNo == theBooks[i].sNo){

            System.out.println(theBooks[i].sNo + "\t\t" + theBooks[i].bookName + "\t\t" + theBooks[i].authorName + "\t\t" + 
                theBooks[i].bookCopy + "\t\t" + theBooks[i].book);
            flag++;
            return;

        }

    }
    if (flag == 0)
        System.out.println("No Book for Serial No " + sNo + " Found.");

}

public void searchByAuthorName(){

    System.out.println("\t\t\t\tSEARCH BY AUTHOR'S NAME");
    input.nextLine();
    System.out.println("Enter Author Name:");
    String authorName = input.nextLine();
    int flag = 0;
    System.out.println("S.No\t\tName\t\tAuthor\t\tAvailable \t\tTotal ");
    for (int i=0; i<count; i++){

        if (authorName.equalsIgnoreCase(theBooks[i].authorName)){

            System.out.println(theBooks[i].sNo + "\t\t" + theBooks[i].bookName + "\t\t" + theBooks[i].authorName + "\t\t" + 
                theBooks[i].bookCopy + "\t\t" + theBooks[i].book);
            flag++;
        }

    }
    if (flag == 0)
        System.out.println("No Books of " + authorName + " Found.");

}


public void returnitem(){

    System.out.println("\t\t\t\tReturning Item\n");
    System.out.println("S.No\t\tName\t\tAuthor\t\tAvailable\replacement\r18\publisher\length \t\");
    for (int i=0; i<count; i++){

        System.out.println(theBooks[i].sNo + "\t\t" + theBooks[i].bookName + "\t\t" + theBooks[i].authorName + "\t\t" + 
                theBooks[i].bookCopy + "\t\t" + theBooks[i].book);


    }

}

public void addmaterial(){

    System.out.println("\t\t\t\t what do you want to take out?\n");
    System.out.println("Enter Serial No of Book");
    System.out.println("Enter Unique Id of Magazine");
    System.out.println("Enter Unique Id of Dvd");
    int sNo = input.nextInt();
    for (int i=0; i<count; i++){

        if (sNo == theBooks[i].sNo){

            System.out.println("Enter No of Books,magazines,or dvd to be Added:");
            int adding = input.nextInt();
            theBooks[i].book += adding;
            theBooks[i].bookCopy += adding;
            
            Magazine[i].magazine += adding;
            Magazine[i].magazineCopy += adding;
            
            dvd[i].dvd += adding;
            dvd[i].dvdCopy += adding;
            return;

        }

    }

}


public void dispMenu(){

  
   
    System.out.println("Enter 1 to New Membership.");
    System.out.println("Enter 2 to Add Material.");
    System.out.println("Enter 3 to Issue Item.");
    System.out.println("Enter 4 to che User.");
    System.out.println("Enter 5 to Report Inventory.");
    System.out.println("Enter 6 to Report loans.");
    System.out.println("Enter 7 to Lookup Membership");
    System.out.println("Enter 8 to Exit Application.");
  

}

public int isAvailable(int sNo){

    //returns the index number if available



    for (int i=0; i<count; i++){

        if (sNo == theBooks[i].sNo){
            if(theBooks[i].bookCopy > 0){

                System.out.println("Book is Available.");
                return i;

                if (uid == magazine[i].sNo){
                    if(magazine[i].magazineCopy > 0){

                
                
                if(magazine[i].bookCopy > 0){

                    System.out.println("magazine is Available.");
                    return i;
            
            System.out.println("magazine is Unavailable");
            return -1;
            
            if (uid == dvd[i].sNo){
                if(dvd[i].dvdCopy > 0){

            
            
            if(dvd[i].dvdCopy > 0){

                System.out.println("dvd is Available.");
                return i;
        
        System.out.println("dvd is Unavailable");
        return -1;


        }

    }

    System.out.println("No Book of Serial Number " + " Available in Library.");
    return -1;


}

public book reportloans(){

    System.out.println("Enter Serial No of Book to be Checked Out.");
    int sNo = input.nextInt();

    int bookIndex =isAvailable(sNo);

    if (bookIndex!=-1){

        //int bookIndex = isAvailable(sNo);
        theBooks[bookIndex].bookCopy--;

        return theBooks[bookIndex];
    }

    return null;

}

public void lookupmembership(book b){

    for (int i=0; i<count; i++){

        if (b.equals(theBooks[i]) ){

            theBooks[i].bookCopy++;
            return;

        }

    }

}







 }