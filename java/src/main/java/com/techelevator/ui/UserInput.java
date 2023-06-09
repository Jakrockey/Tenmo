package com.techelevator.ui;

import com.techelevator.application.VendingMachine;
import com.techelevator.models.Snacks;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Responsibilities: This class should handle receiving ALL input from the User
 *
 * Dependencies: None
 */
public class UserInput// purchase method
{
    private static Scanner scanner = new Scanner(System.in);

    public String getHomeScreenOption() {
        System.out.println("What would you like to do?");
        System.out.println();

        System.out.println("D) Display Vending Machine Items");
        System.out.println("P) Purchase");
        System.out.println("E) Exit");

        System.out.println();
        System.out.print("Please select an option: ");

        String selectedOption = scanner.nextLine();
        String option = selectedOption.trim().toLowerCase();

        if (option.equals("d")) {
            return "display";
        } else if (option.equals("p")) {
            return "purchase";
        } else if (option.equals("e")) {
            return "exit";
        } else {
            return "";
        }
    }

    public String getPurchase() {
        System.out.println("Please enter the item you would like to purchase");
        String itemsToPurchase = scanner.nextLine();
        return itemsToPurchase;
    }

    public String getPurchaseScreenOptions() {

        System.out.println("S) Select Item");
        System.out.println("M) Feed Money");
        System.out.println("F) Finish Transaction");

        System.out.println();
        System.out.println("Please select an option");
        String selectedOption = scanner.nextLine();
        String option = selectedOption.toLowerCase().trim();

        if (selectedOption.equals("s")){
            return "select item";
        } else if (selectedOption.equals("m")){
            return "feed money";
        }
        else if (selectedOption.equals("f")){
            return "exit";
        }
    return "";
    }






        public String  moneyOptions(){
            int moneyDeposited = 0;
            System.out.println("How much money would you like to deposit?");
            System.out.println();
            System.out.println("A) $1");
            System.out.println("B) $5");
            System.out.println("C) $10");
            System.out.println("D) $20");
            System.out.println("Please enter your selection: ");
            String moneyDepositedSelection = scanner.nextLine();



        return moneyDepositedSelection;
        }





    }