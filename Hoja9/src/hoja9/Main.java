
package hoja9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;



/**
 *
 * @author Andres
 * @author Antonio
 */
public class Main {
    public static void main(String [] args) throws FileNotFoundException, IOException{
        
        SplayTree arbol = new SplayTree();
        
   
        File words = new File("src/hoja9/freedict-eng-spa.txt");
        FileReader read = new FileReader(words);
        BufferedReader buff = new BufferedReader(read);
        
        String line;
        int contadorYLlave = 0;
        
        
        while((line = buff.readLine()) != null){
            String linea = line.replace("\t", ",");
            String[] separate = linea.split(",");
            //System.out.println(Arrays.toString(separate));
            String word_english;
            String word_spanish;
            for(int i = 0; i < separate.length; i++){                                
                word_english = separate[i];            
                word_spanish = separate[separate.length-1];
                arbol.insert(word_english.hashCode(), word_english, word_spanish);
                //System.out.println(word_english + "------" + word_spanish);
            }
            
            
        }
        
        File sentence = new File("src/hoja9/oraciones.txt");
        FileReader readSentence = new FileReader(sentence);
        BufferedReader buffSentence = new BufferedReader(readSentence);
        
        String linea;
        
        while((linea = buffSentence.readLine()) != null){
            String[] allWords = linea.split(" ");
            for (int i = 0; i < allWords.length; i++){
                String variable = allWords[i];
                System.out.print(arbol.find(variable.hashCode()));
                
            }
            
        }
        
        System.out.println("");
        System.out.println("------------------------------------");
        System.out.println("------------------------------------");
        
        /*
        System.out.println("house".hashCode());
        System.out.println("homework".hashCode());
        System.out.println("town".hashCode());
        System.out.println("yes".hashCode());
        */
    }
    
}
