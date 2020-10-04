package ru.geekbrains.guess_the_number;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ваша задача угадать число.");
        int range=10;
        int j=1;// число попыток
        int number = (int)(Math.random()*range);
        while(true){
            System.out.println("Угадайте число от 0 до "+range);
            int input_number = scanner.nextInt();
            if (j>2){
                System.out.println("Вы проиграли");
                break;
            } else {
                if (input_number == number) {
                    System.out.println("Вы угадали!");
                    break;
                } else if (input_number > number) {
                    j++;
                    System.out.println("Загаданное число меньше");
                } else {
                    j++;
                    System.out.println("Загаданное число больше");
                }
            }

            }
        }


    }

