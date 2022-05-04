import java.util.Scanner;

public class BoilingWater {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number greater than 212:");
        int twoTwelve = Integer.valueOf(input.nextLine());

        if (twoTwelve > 212){
            System.out.println("Water is boiling!");
        }

    }
}
