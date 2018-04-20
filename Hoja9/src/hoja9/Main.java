
package hoja9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeMap;


/**
 *
 * @author Andres
 * @author Antonio
 */
public class Main {
    public static void main(String [] args) throws FileNotFoundException, IOException{
        
        BinaryTree arbol = new BinaryTree();
        
        File words = new File("C:\\Users\\Antonio\\Documents\\NetBeansProjects\\Lab-7\\Hoja_6_Arboles\\src\\hoja_7_arboles\\palabras");
        FileReader read = new FileReader(words);
        BufferedReader buff = new BufferedReader(read);
        
        String line;
        int contadorYLlave = 0;
        
        while((line = buff.readLine()) != null){
            String[] separate = line.split(",");
            String word_english = separate[0];
            String word_spanish = separate[1];
            arbol.insertNode(word_english.hashCode(), word_english, word_spanish);
            System.out.println(word_english + " " + word_spanish);
            
        }
        
        File sentence = new File("C:\\Users\\Antonio\\Documents\\NetBeansProjects\\HT7\\Hoja_6_Arboles\\src\\hoja_7_arboles\\oraciones");
        FileReader readSentence = new FileReader(sentence);
        BufferedReader buffSentence = new BufferedReader(readSentence);
        
        String linea;
        
        while((linea = buffSentence.readLine()) != null){
            String[] allWords = linea.split(" ");
            for (int i = 0; i < allWords.length; i++){
                String variable = allWords[i];
                System.out.print(arbol.find(variable, variable.hashCode()));
                
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
