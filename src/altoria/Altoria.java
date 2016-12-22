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
        
        input = in.nextLine();
        
        responseGenerator.analyzeAndRespond(input);
    }
}
    
            
     
   