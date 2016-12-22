package altoria;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

//Analyze user input and generate an appropriate response
public class ResponseGenerator {
    private ArrayList<String> greetings = new ArrayList<String>();
    
    private Memory memory;
    
    public ResponseGenerator(){
        //Initializing memory
        memory = new Memory();
        //Filling array lists with responses
        memory.fillList(greetings);
    }
    
    public void analyzeAndRespond(String userInput){
        //Questions
        if(userInput.endsWith("?")){
            System.out.println("You asked a question.");
        }
        //Affirmation
    }
}
