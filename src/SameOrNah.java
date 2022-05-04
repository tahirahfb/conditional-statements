import java.util.Scanner;

public class SameOrNah {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word:");
        String firstWord = input.nextLine(); 

        System.out.println("Enter another word:");
        String secondWord = input.nextLine();

        if (firstWord.equalsIgnoreCase(secondWord)){
            System.out.println("The words are the same!");
        } else {
            System.out.println("The words are different!");
        }
    }
}
