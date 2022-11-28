import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String myFavoriteSoda;
        final int NUM = 1892;
        String word = " CocaCola ";
        myFavoriteSoda = word +"was released in " + NUM;
        System.out.println(myFavoriteSoda);


        String allVariables = myFavoriteSoda + word + NUM;
        System.out.println(allVariables);



        if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число");
        }else  if (NUM > 0) {
            System.out.println("Вы сохранили положительное число");
        }else {
            System.out.println("Вы сохранили ноль");
        }



        Scanner sc = new Scanner(System.in);
        System.out.println("Введите ваше имя: ");
        String name = sc.nextLine();
        System.out.println("Hello " + name + "!");
    }
}