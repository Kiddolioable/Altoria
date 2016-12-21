package altoria;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

//Retrieves all known words to the chat bot, with an expandable dictionary of words/phrases
public class Memory{
    private BufferedReader bufferedReader;

    //Constructor
    public Memory(){
        try{
            //Greetings
            bufferedReader = new BufferedReader(new FileReader("greetings.txt"));
        }catch(FileNotFoundException e){
            System.out.println("ERROR: File not found.");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    //Returns all words/phrases
    public ArrayList fillList(ArrayList arrayList){
        String line;
        
        try{
            while((line = bufferedReader.readLine()) != null){
                arrayList.add(line);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        
        return arrayList;
    }
      
}
