import java.util.Scanner;
import java.io.File;

public class SearchString {

    public static void main(String args[]){
        String pattern;
        String fileName;
        //Check that input is correct
        if(args.length == 2){ 
            pattern = args[0].toLowerCase();
            fileName = args[1];
            try {
                Scanner sc = new Scanner(new File(fileName));
                while(sc.hasNextLine()){
                    String nextLine = sc.nextLine();
                    if(nextLine.toLowerCase().contains(pattern)){
                        System.out.println(nextLine);
                    }
                    
                }
            } catch (Exception e) {
                System.out.println("File does not exist!");
                System.exit(0);
            }


        }else{
            System.out.println("Wrong amount of inputs!");
            System.exit(0);
        }
       
    }
}
