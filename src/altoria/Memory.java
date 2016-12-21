package altoria;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Memory {
    
    private FileReader fileReader;
    private BufferedReader bufferedReader;
    
    public Memory(){
        try{
            fileReader = new FileReader("responses.txt");
        }catch(FileNotFoundException e){
            System.out.println("ERROR: File not found.");
        }
        
        bufferedReader = new BufferedReader(fileReader);
    }
    
    
}
