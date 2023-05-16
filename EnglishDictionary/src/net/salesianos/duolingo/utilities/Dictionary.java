package net.salesianos.duolingo.utilities;

import java.util.*;

public class Dictionary {
    final static Scanner KEYBOARD = new Scanner(System.in);
    Set<String> words = new HashSet<>();
    Map<String, Set> wordlist = new HashMap<>();

    public Dictionary() { }
    public void addWord(String word) {
        String initial = word.substring(0,1);
        if (wordlist.containsKey(initial)) {
            Set<String> wordsBooked = wordlist.get(initial);
            wordsBooked.add(word);
            wordlist.put(initial, wordsBooked);
            System.out.println("La palabra ya se encontraba almacenada");
        } else if (!wordlist.containsValue(word)){
            Set<String> newWords = new HashSet<>();
            newWords.add(word);
            wordlist.put(initial, newWords);
            System.out.println("Palabra añadida con éxito");
        }

    }

    public void existWord(String word) {
        String initial = word.substring(0,1);
        if (wordlist.containsKey(initial)) {
            if (wordlist.get(initial).contains(word)) {
                System.out.println("La palabra ya se encontraba registrada");
            } else {
                System.out.println("La palabra no esta registrada");
            }
        } else if (!wordlist.containsKey(initial)){
            System.out.println("La palabra no se encuentra registrada");
        }
    }

    public  void deleteWord(String word) {
        System.out.println("Escriba la palabra a eliminar");
        String initial = word.substring(0,1);
        if (wordlist.containsKey(initial)) {
            Set<String> wordsBooked = wordlist.get(initial);
            wordsBooked.remove(word);
            wordlist.remove(initial, word);
        }
    }


    public void showInitials() {
        System.out.println(wordlist.keySet());
    }

    public void showWords() {
        System.out.println("Introduzca la letra de la que desea ver las palabras");
        String letter = KEYBOARD.nextLine();
        System.out.println(wordlist.get(letter));
    }


}