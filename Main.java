import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
  
class Main extends Process{
    public static void main(String[] args) 
    {
        while(true)
        {
            System.out.println("Choose an option");
            System.out.println("1. Add New Song\n2. Remove a Song\n3. Print all songs\n4. Print Song for number of plays");
            Scanner scan = new Scanner(System.in); 
            
            int option = scan.nextInt();
            
            switch (option)
            {
                case 1:
                    inputSong();
                default:
                    System.out.println("Please select a valid option!");
                    continue;
    
            }
        }
    }

}



  

