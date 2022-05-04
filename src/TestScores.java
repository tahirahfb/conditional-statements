import java.util.Scanner;

public class TestScores {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number between 0 and 100");
        double score = Double.valueOf(input.nextLine());

        if (score >= 90 && score <= 100 ){
            System.out.println("Your grade is an A!");
        } else if (score >= 80 && score < 90){
            System.out.println("Your grade is a B!");
        } else if (score >= 70 && score < 80){
            System.out.println("Your grade is a C!");
        } else if (score >= 60 && score < 70){
            System.out.println("Your grade is a D!");
        } else if (score >= 0 && score < 59) {
            System.out.println("Your grade is an F! :(");
        } else {
            System.out.println("You entered a number outside of the specified range!");
        }
    }
}
