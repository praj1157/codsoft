import java.util.Scanner;

public class problem3 {

    static class ATMM {
        float Balance;
        int PIN = 9199;
        Scanner sc = new Scanner(System.in);

        public void checkpin() {
            int attempts = 2;
            while (attempts > 0) {
                System.out.println("Enter your pin: ");
                int enterpin = sc.nextInt();
                if (enterpin == PIN) {
                    menu();
                    return;
                } else {
                    System.out.println("Incorrect PIN. Attempts remaining: " + (--attempts));
                }
            }
            System.out.println("Too many incorrect attempts. Exiting.");
        }

        public void menu() {
            System.out.println("Enter your choice");
            System.out.println("1. Check A/c Balance");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Deposit Money");
            System.out.println("4. Exit");
            int number = sc.nextInt();
            switch (number) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    WithdrawMoney();
                    break;
                case 3:
                    DepositMoney();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice. Please retry.");
                    menu();
            }
        }

        public void checkBalance() {
            System.out.println("Balance: " + Balance);
            menu();
        }

        public void WithdrawMoney() {
            System.out.println("Enter Withdraw amount: ");
            float withdrawAmount = sc.nextFloat();
            if (withdrawAmount > Balance) {
                System.out.println("Insufficient Balance!");
            } else {
                Balance -= withdrawAmount;
                System.out.println("Successful");
            }
            menu();
        }

        public void DepositMoney() {
            System.out.println("Enter Amount: ");
            float depositAmount = sc.nextFloat();
            if (depositAmount < 0) {
                System.out.println("Invalid Amount!");
            } else {
                Balance += depositAmount;
                System.out.println("Deposit Successful");
            }
            menu();
        }
    }

    public static void main(String[] args) {
        ATMM obj = new ATMM();
        obj.checkpin();
    }
}
