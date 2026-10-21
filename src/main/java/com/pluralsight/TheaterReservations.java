package com.pluralsight;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TheaterReservations {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String userName = read.nextLine();

        System.out.print("What date will you be coming (MM/dd/yyyy): ");
        String showDate = read.nextLine();

        System.out.print("How many tickets would you like?: ");
        int ticketCount = read.nextInt();


        DateTimeFormatter formatter;
        formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate theaterDay = LocalDate.parse(showDate, formatter);

        DateTimeFormatter formatter2 =  DateTimeFormatter.ofPattern("yyyy-MM-dd");






        //LocalDate.parse(showDate,formatter);


        //DateTimeFormatter

       //  LocalDate

        //ticket(s) reserved
        if (ticketCount == 1){
            System.out.println("1 ticket reserved for" + " " + theaterDay.format(formatter2) + " " + "under" + " " + userName);
        }else{
            System.out.println(ticketCount + " tickets reserved for" + " " + theaterDay.format(formatter2) + " " + "under" + " " + userName);

        }


        //date



        //LastName, FirstName




        //output:# ticket(s) reserved for (date) under (LastName, FirstName)



    }
}
