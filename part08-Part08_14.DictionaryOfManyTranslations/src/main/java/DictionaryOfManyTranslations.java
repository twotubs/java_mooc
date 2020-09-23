
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jongore
 */
public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> dictionary;
    
    public DictionaryOfManyTranslations(){
        this.dictionary = new HashMap<>();
    }
    
    //method for pulling up the array list and adding the translation
    public void add(String word, String translation){
        //// an empty list has to be added for a new user if one has not already been added
        this.dictionary.putIfAbsent(word, new ArrayList());
        
        //get the array list out of the hashmap and add the translation
        ArrayList<String> words = this.dictionary.get(word);
        words.add(translation);
        
    }
    
    //method for pulling up the arraylist and removing the word and its translations
    public void remove(String word){
        this.dictionary.remove(word);
    }
    
    //method for printing the list of translations for word
    public ArrayList<String> translate(String word){
        return dictionary.getOrDefault(word, new ArrayList<>());
   }
}
    

