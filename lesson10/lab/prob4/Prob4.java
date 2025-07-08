package lesson10.lab.prob4;

import java.util.ArrayList;
import java.util.List;

public class Prob4 {

    public static void main(String[] args) {
        Prob4 p = new Prob4();
        System.out.println(p.countWords(List.of("Orgil","Oumar","Ola"),'l', 'a', 5));
    }

    public int countWords(List<String> words, char c, char d, int len){
        int count = 0;
        for(String word : words){
            if(word.length() == len && word.indexOf(c) > 0 && word.indexOf(d) < 0){
                count++;
            }
        }

        return count;
    }
}
