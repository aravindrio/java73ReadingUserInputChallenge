import java.util.Scanner;

public class ReadingUserInputChallenge {

    public static void main(String[] args) {

        int x = 1;
        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        while(x < 11) {
            System.out.println("Enter number " + x +" :");

            if(scanner.hasNextInt()) {
                int number = scanner.nextInt();
               // scanner.nextLine();
                sum += number;
                x++;
            } else{
                System.out.println("InvalidNumber");
            }
            scanner.nextLine();
        }
        scanner.close();
        System.out.println("Total: " + sum);
    }



}
