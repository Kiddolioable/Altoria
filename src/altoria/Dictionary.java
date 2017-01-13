package altoria;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Dictionary {
    FileReader file;
    BufferedReader bufferedReader;
    
    public Dictionary(){
        String line;
        try{
            //Reading adjectives to a B-tree
            file = new FileReader("memory/Adjectives.txt");
            bufferedReader = new BufferedReader(file);
            while((line = bufferedReader.readLine()) != null){
                //treeObject.addNode(line);
            }
            System.out.println("Adjectives successfully loaded to tree");
            
            //Reading adverbs to a B-tree
            file = new FileReader("memory/Adverbs.txt");
            bufferedReader = new BufferedReader(file);
            while((line = bufferedReader.readLine()) != null){
                //treeObject.addNode(line);
            }
            System.out.println("Adverbs successfully loaded to tree");
            
            //Reading articles to a B-tree
            file = new FileReader("memory/Articles.txt");
            bufferedReader = new BufferedReader(file);
            while((line = bufferedReader.readLine()) != null){
                //treeObject.addNode(line);
            }            
            System.out.println("Articles successfully loaded to tree");
            
            //Reading nouns to a B-tree
            file = new FileReader("memory/Nouns.txt");
            bufferedReader = new BufferedReader(file);
            while((line = bufferedReader.readLine()) != null){
                //treeObject.addNode(line);
            }
            System.out.println("Nouns successfully loaded to tree");
             
            //Reading verbs to a B-tree
            file = new FileReader("memory/Verbs.txt");
            bufferedReader = new BufferedReader(file);
            while((line = bufferedReader.readLine()) != null){
                //treeObject.addNode(line);
            }
            System.out.println("Verbs successfully loaded to tree");
            
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
