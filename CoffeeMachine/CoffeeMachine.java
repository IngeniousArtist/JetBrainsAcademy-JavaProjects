package CoffeeMachine;
import java.util.*;

public class CoffeeMachine {
    public static void main(String[] args){
        int[] stonks = {400,540,120,9,550};
        machine(stonks);
    }
    
    static void machine(int[] stonks) {
        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("Write action (buy, fill, take, remaining, exit): ");
            String action = sc.nextLine();
            
            switch(action){
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                    String in = sc.nextLine();
                    stonks = buy(in, stonks);
                    break;
                case "fill":
                    int[] f = new int[4];
                    System.out.println("Write how many ml of water do you want to add:");
                    f[0] = sc.nextInt();
                    System.out.println("Write how many ml of milk do you want to add:");
                    f[1] = sc.nextInt();
                    System.out.println("Write how many grams of coffee beans do you want to add:");
                    f[2] = sc.nextInt();
                    System.out.println("Write how many disposable cups of coffee do you want to add:");
                    f[3] = sc.nextInt();
                    stonks = fill(f, stonks);
                    break;
                case "take":
                    System.out.println("I gave you $" + stonks[4]);
                    stonks[4] = 0;
                    break;
                case "remaining":
                    stat(stonks);
                    break;
                case "exit":
                    System.exit(0);
                    break;
            }
        }
    }
    
    static void stat(int[] s){
        System.out.println("The coffee machine has:");
        System.out.println(s[0] + " of water");
        System.out.println(s[1] + " of milk");
        System.out.println(s[2] + " of coffee beans");
        System.out.println(s[3] + " of disposable cups");
        System.out.println("$" + s[4] + " of money");
    }
    
    static int[] buy(String i,int[] stonks){
        switch(i){
            case "1":
                if(stonks[0]<250){
                    System.out.println("Sorry, not enough water!");
                    break;
                }
                else{
                    stonks[0] -= 250;
                }
                if(stonks[2]<16){
                    System.out.println("Sorry, not enough coffee beans!");
                    break;
                }
                else{
                    stonks[2] -= 16;
                }
                if(stonks[3]<1){
                    System.out.println("Sorry, not enough disposable cups!");
                    break;
                }
                else{
                    stonks[3] -= 1;
                }
                
                stonks[4] += 4;
                System.out.println("I have enough resources, making you a coffee!");
                break;
            case "2":
                if(stonks[0]<350){
                    System.out.println("Sorry, not enough water!");
                    break;
                }
                else{
                    stonks[0] -= 350;
                }
                if(stonks[1]<75){
                    System.out.println("Sorry, not enough milk!");
                    break;
                }
                else{
                    stonks[1] -= 75;
                }
                if(stonks[2]<20){
                    System.out.println("Sorry, not enough coffee beans!");
                    break;
                }
                else{
                    stonks[2] -= 20;
                }
                if(stonks[3]<1){
                    System.out.println("Sorry, not enough disposable cups!");
                    break;
                }
                else{
                    stonks[3] -= 1;
                }

                stonks[4] += 7;
                System.out.println("I have enough resources, making you a coffee!");
                break;
            case "3":
                if(stonks[0]<200){
                    System.out.println("Sorry, not enough water!");
                    break;
                }
                else{
                    stonks[0] -= 200;
                }
                if(stonks[1]<100){
                    System.out.println("Sorry, not enough milk!");
                    break;
                }
                else{
                    stonks[1] -= 100;
                }
                if(stonks[2]<12){
                    System.out.println("Sorry, not enough coffee beans!");
                    break;
                }
                else{
                    stonks[2] -= 12;
                }
                if(stonks[3]<1){
                    System.out.println("Sorry, not enough disposable cups!");
                    break;
                }
                else{
                    stonks[3] -= 1;
                }
                
                stonks[4] += 6;
                System.out.println("I have enough resources, making you a coffee!");
                break;
            case "back":
                machine(stonks);
        }
        return stonks;
    }
    
    static int[] fill(int[] f, int[] stonks){
        stonks[0] += f[0];
        stonks[1] += f[1];
        stonks[2] += f[2];
        stonks[3] += f[3];
        
        return stonks;
    }
}
