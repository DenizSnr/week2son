package döngüler;

import java.util.Scanner;

public class Year {
    public static void main(String[] args){
        System.out.println("Please enter your salary: ");
        System.out.println("Please enter your working year: ");
        Scanner scanner = new Scanner(System.in);
        int salary = scanner.nextInt();
        int year = scanner.nextInt();
        int toplam=0 ;

        scanner.close();
        if (year == 1){
                toplam = (int) (salary + (salary * 0.05));
                System.out.println("New salary is: " + toplam);
        }
        else if (year == 2){
           toplam = (int) (salary + (salary * 0.10));
            System.out.println("New salary is: " + toplam);
        }
        else if (year == 3){
            toplam = (int) (salary +(salary * 0.15));
            System.out.println("New salary is: " + toplam);
        }
        else if (year == 4){
            toplam = (int) (salary + (salary * 0.20));
            System.out.println("New salary is: " + toplam);
        }
        else if (year >= 5){
            toplam = (int) (salary +(salary * 0.25));
            System.out.println("New salary is: " + toplam);
        }
        else if (year < 1){
            toplam = salary;
            System.out.println("New salary is" + toplam);
        }

    }
}

