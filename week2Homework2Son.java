package döngüler;

import java.util.Scanner;

public class week2Homework2Son {
    public int Year;
    public static void main(String[] args) {


        System.out.println("Please enter your weekly base salary");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();


        Year deniz = new salary();
        Year.salary = salary;
        System.out.println("New salary is" + toplam);


        if (salary < 1000){
            System.out.println("Please enter a valid salary. Weekly salary must be at least 1000$");
        }
        else {
            double baseHour = salary / 40;
            System.out.println("Please enter working hours in weekdays");
            int weekdayWorkingHours = scanner.nextInt();
            System.out.println("Please enter working hours in weekend");
            int weekendWorkingHours = scanner.nextInt();

            int totalWorkingHours = weekdayWorkingHours + weekendWorkingHours;
            if(totalWorkingHours <= 40 ){
                salary = salary - ((40 - totalWorkingHours) * baseHour);
            }
            else{
                if(weekdayWorkingHours < 40 ){
                    salary = salary + ((totalWorkingHours - 40) * baseHour * 2);
                }
                else{
                    if(weekendWorkingHours < 10){
                        salary = salary + ((weekdayWorkingHours - 40) * baseHour * 1.5) + (weekendWorkingHours * baseHour * 2) ;
                    }
                    else{
                        salary = salary + ((weekdayWorkingHours - 40) * baseHour * 1.5) + (weekendWorkingHours * baseHour * 2) + 500 ;
                        System.out.println("Congratulations, you earned 500$ bonus !!");
                    }
                }
            }
        }
}
}
