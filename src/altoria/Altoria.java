package altoria;

//Main class for the chatbot
public class Altoria 
{
    private static ResponseGenerator responseGenerator;
    
    public static void main(String[] args) 
    {
        responseGenerator = new ResponseGenerator();
        System.out.println("/-------------------------------\\"
                       + "\n| A L T O R I A  C H A T  B O T |"
                      + "\n\\-------------------------------/");
        
        responseGenerator.test();
    }
}
    
            
     
   