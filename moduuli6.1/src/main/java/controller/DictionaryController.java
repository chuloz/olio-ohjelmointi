// DictionaryController.java
package controller;

import model.Dictionary;

public class DictionaryController {
    private final Dictionary dictionary;

    public DictionaryController() {
        dictionary = new Dictionary();
        // Temporary solution: hardcoding some words into the dictionary
        dictionary.addWord("kahvila", "paikka jossa juodaan kahvia.");
        dictionary.addWord("sali", "Sinne mennään painaa duunia.");
        dictionary.addWord("FcBarcelona", "Historian paras joukkue.");
    }

    public String searchWord(String word) {
        return dictionary.searchWord(word);
    }
}