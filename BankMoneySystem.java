package Hw.sec01;

import java.util.Scanner;

public class BankMoneySystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true; 
        int balance = 0; // 잔고

        while (run) {
            System.out.println("---------------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("---------------------------------------");
            System.out.print("선택> ");

            String menu = scanner.nextLine(); 

            if (menu.equals("1")) {
                System.out.print("예금액> ");
                int amount = scanner.nextInt(); 
                
                balance += amount; 
                scanner.nextLine(); 
                
            } else if (menu.equals("2")) {
                System.out.print("출금액> ");
                int amount = scanner.nextInt(); 
                
                if (amount > balance) {
                    System.out.println("잔고가 부족.");
                } else {
                    balance -= amount; 
                }
                
                scanner.nextLine(); 
                
            } else if (menu.equals("3")) {
                System.out.println("잔고> " + balance);
                
            } else if (menu.equals("4")) {
                run = false;
                
            } else {
                System.out.println("잘못된 메뉴 번호");
            }
        }

        System.out.println("프로그램 종료");
        scanner.close();
    }
}