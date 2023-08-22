
import java.util.Random;
import java.util.Scanner;

class prince {
    int computer;

    public prince() {
        Random num = new Random();
        computer = num.nextInt(100);
        System.out.println("Guess the Number between  1 to 100");
    }

    public int computerNo() {
        return computer;
    }
}

public class problem1 {
    static int takeUserInput() {
        int user;
        System.out.println("Guess the number ");
        Scanner sc = new Scanner(System.in);
        user = sc.nextInt();
        return user;
    }

    static void isCorrectNumber(int i, int j){
        if(i==j){
            System.out.println("Correct NO. Guess");
        }
        else if(i>j){
            System.out.println("Your No. is Big than computer No.");
        }
        else {
            System.out.println("Your No. is Small than computer No.");
        }
    }


    public static void main(String[] args) {
        int user=0,computer=0,itteration=0;
        prince sc = new prince();
        do {
            user = takeUserInput();
            computer = sc.computerNo();
            isCorrectNumber(user, computer);
            itteration++;
        }while (user!=computer);
        System.out.println("YOU GUESS NO IN "+ itteration+" ITTERATIONS");
    }
}

