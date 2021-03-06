package ChattyBot;

import java.util.Scanner;

public class SimpleBot {
    final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        greet("Ken", "2020");
        remindName();
        guessAge();
        count();
        test();
        end();
    }

    static void greet(String assistantName, String birthYear) {
        System.out.println("Hello! My name is " + assistantName + ".");
        System.out.println("I was created in " + birthYear + ".");
        System.out.println("Please, remind me your name.");
    }

    static void remindName() {
        String name = sc.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }

    static void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Say me remainders of dividing your age by 3, 5 and 7.");
        int rem3 = sc.nextInt();
        int rem5 = sc.nextInt();
        int rem7 = sc.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }

    static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int num = sc.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.println(i + "!");
        }
    }

    static void test() {
        System.out.println("Let's test your programming knowledge.");
        System.out.println("Why do we use methods?");
        System.out.println("1. To repeat a statement multiple times.");
        System.out.println("2. To decompose a program into several small subroutines.");
        System.out.println("3. To determine the execution time of a program.");
        System.out.println("4. To interrupt the execution of a program.");

        boolean flag = true;

        while(flag) {
            int ans = sc.nextInt();

            if(ans == 1) {
                System.out.println("Please, try again.");
            }
            else if(ans == 2) {
            flag = false;
            }
            else if(ans == 3) {
                System.out.println("Please, try again.");
            }
            else if(ans == 4) {
                System.out.println("Please, try again.");
            }
        }
    }


    static void end() {
        System.out.println("Congratulations, have a nice day!");
    }
}
