package ru.stqa.pft.sandbox;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Михаил on 07.03.2017.
 */
public class Collection {
    public static void main(String[] args) {
        String[] langs = new String[4];
        langs[0] = "Java";
        langs[1] = "C#";
        langs[2] = "Pyton";
        langs[3] = "PHP";

         for(String R : langs){
             System.out.println("Я хочу выучить " + R);

         }


        List<String> languages = Arrays.asList("Java", "C#", "Pyton", "PHP");
//            languages.add("Java");
        //          languages.add("C#");
        //        languages.add("Python");
        for (int i =0; i <languages.size();i++) {
            System.out.println("Я хочу выучить " + languages.get(i));


        }
    }
}

