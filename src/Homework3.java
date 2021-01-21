import java.util.Random;
import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int count = 3;
        System.out.println("Игра началась!");
        int settedVar = rand.nextInt(10);
        userPlaying(count, settedVar);
    }

    public static void userPlaying(int count, int settedVar) {
        int rematch;
        Random rand = new Random();
        boolean inGame = true;
        Scanner scan = new Scanner(System.in);
        while(inGame){
            while(count != 0){
                System.out.println("Введите ваше число:");
                int inputVar = scan.nextInt();
                if(inputVar > settedVar){
                    System.out.println("Введенное вами число больше!");
                }else if (inputVar < settedVar){
                    System.out.println("Введенное вами число меньше!");
                }else{
                    System.out.println("------------");
                    System.out.println("Вы победили!");
                    System.out.println("------------");
                    count = 0;
                    inGame = false;
                }
                if(count != 0 ){
                    count--;
                }
            }
            if(count == 0 && inGame == true){
                System.out.println("-------------");
                System.out.println("Вы проиграли!");
                System.out.println("-------------");
            }
            inGame = false;
        }
        System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
        rematch = scan.nextInt();
        if(rematch == 1){
            userPlaying(3, rand.nextInt(10));
        }
    }
}
