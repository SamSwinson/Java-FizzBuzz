import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final int FIVE = 5;
        final int THREE = 3;
        String result = "";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int userNumber = scanner.nextInt();



        if (userNumber % FIVE == 0 && userNumber % THREE == 0){
            result = "FiveThree";
        }
        else if (userNumber % FIVE == 0) {
            result = "Five";
        }
        else if (userNumber % THREE == 0) {
            result = "Three";
        }
        
        switch (result) {
                case "FiveThree":
                    System.out.println("FizzBuzz");
                    break;
                case "Five":
                    System.out.println("Fizz");
                    break;
                case "Three":
                    System.out.println("Buzz");
                    break;
                default:
                    System.out.println(userNumber);
            }

    
    }
}