import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("What you want?\n\n1. CubRub\n2. RandomValue\n\n>> ");
        String choice = scan.nextLine();
        switch (choice) {
            case "1":
                CubRub();
                break;
            case "2":
                RandomValue();
                break;
            default:
                System.out.println("Error. Please, try again!");
        }
    }

    private static void RandomValue() {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.print("How much you want to number?: ");
        short num = scan.nextShort();
        System.out.print("How to much number to you want?: ");
        int value = scan.nextInt();
        for(byte to_nub = 0; to_nub < num; to_nub++) {
            int values = rand.nextInt(value);
            System.out.println(values);
        }
    }

    private static void CubRub() {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("How time you want to play?: ");
        int how_time = sc.nextInt();
        for(int score = 0; score < how_time; score++) {
            int number_cub = rand.nextInt(6);
            System.out.print("How number (1 to 6): ");
            byte number_choice = sc.nextByte();
            if (number_choice == number_cub) {
                System.out.println("Is right! You number is " + number_cub);
            } else {
                System.out.println("Miss! This is " + number_cub);
            }
        }
    }
//    private static void Calculator() {
//        ScriptEngineManager manager = new ScriptEngineManager();
//        ScriptEngine engine = manager.getEngineByName("JavaScript");
//        Random rnd = new Random();
//        Scanner sc = new Scanner(System.in);
//        System.out.print("How time you want to play?: ");
//        int how_time = sc.nextInt();
//        for(int score = 0; score < how_time; score++) {
//            String[] operation = {"+", "-", "*", "/"};
//            int random_computer_card = rnd.nextInt(operation.length);
//            int one_number = rnd.nextInt(1000);
//            int two_number = rnd.nextInt(1000);
//            String choice = String.format("%s %s %s", one_number, operation[random_computer_card], two_number);
//            Object result = engine.eval(choice);
//            if () {
//                System.out.println();
//            } else {
//                System.out.println();
//            }
//        }
//    }
}