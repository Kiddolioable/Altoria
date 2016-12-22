package altoria;

//Main class for the chatbot

import java.util.Scanner;

public class Altoria 
{
    private static ResponseGenerator responseGenerator;
    
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        String input;
        responseGenerator = new ResponseGenerator();
        System.out.println("/-------------------------------\\"
                       + "\n| A L T O R I A  C H A T  B O T |"
                      + "\n\\-------------------------------/");    
        
        while(true){
            //Requesting user input
            System.out.print("\nYou: ");
            input = in.nextLine();
            //Response algorithm
            System.out.print("\nAltoria: ");
            responseGenerator.analyzeAndRespond(input);
        } 
    }
}
    
            
     
   