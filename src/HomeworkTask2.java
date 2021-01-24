import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeworkTask2 {
    public static void main(String[] args) {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        userPlaying(words);
    }

    private static void userPlaying(String[] words){
        StringBuilder sb = new StringBuilder("###############");
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        String inputWord;
        String settedWord = words[rand.nextInt(25)];
        System.out.println("Игра началась!");
        System.out.println("Для проверки: "+settedWord);
        System.out.println("Отгадайте одно из этих слов:");
        System.out.println(Arrays.toString(words));
        do {
            System.out.println("Введите ваше слово:");
            inputWord = scan.next();
            if(inputWord.equals(settedWord)){
                System.out.println("------------");
                System.out.println("Вы победили!");
                System.out.println("------------");
                break;
            }
            if(inputWord.length() > settedWord.length()){
                for (int i = 0; i < settedWord.length(); i++) {
                    if(inputWord.charAt(i) == settedWord.charAt(i)){
                        sb.setCharAt(i,inputWord.charAt(i));
                    }
                }
            }
            if(inputWord.length() < settedWord.length()){
                for (int i = 0; i < inputWord.length(); i++) {
                    if(inputWord.charAt(i) == settedWord.charAt(i)){
                        sb.setCharAt(i,inputWord.charAt(i));
                    }
                }
            }
            System.out.println("Вы не угадали! Но теперь знаете некоторые символы из загаданного слова! Попробуйте еще раз!");
            System.out.println(sb);
        }while(!inputWord.equals(settedWord));


    }
}
