package com.techelevator.application;

import com.techelevator.logger.Logger;
import com.techelevator.models.*;
import com.techelevator.ui.UserInput;
import com.techelevator.ui.UserOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VendingMachine {
    private UserOutput userOutput;
    private UserInput userInput;
    private List<Snacks> snacksList;

    public VendingMachine() {
        userInput = new UserInput();
        userOutput = new UserOutput();
        snacksList = new ArrayList<>();
    }

    public void run() {// next bogo sale, if statments and create code;
        readInFromFile();
        userOutput.displayHomeScreen();
        while (true) {
            String choice = userInput.getHomeScreenOption();
            if (choice.equals("display")) {
                // display the vending machine slots
                userOutput.displayMessage("Location   Name   Price  Type");
                for (Snacks snack : snacksList) {
                    userOutput.displayMessage(snack.getLocation() + "   " + snack.getName() + "   " + snack.getPrice() + "  " + snack.getType() + "  " + snack.getQuantity());
                }

            } else if (choice.equals("purchase")) {
                userInput.getPurchaseScreenOptions();
                String purchaseMenuChoice = userInput.getPurchaseScreenOptions();
                if (purchaseMenuChoice.equals("feed money")) {
                    userInput.moneyOptions();
                    int moneyDeposited = 0;
                    userInput.moneyOptions();
                    if (userInput.moneyOptions().equals("a")) {
                        moneyDeposited = 1;
                    } else if (userInput.moneyOptions().equals("b")) {
                        moneyDeposited = 5;
                    } else if (userInput.moneyOptions().equals("c")) {
                        moneyDeposited = 10;
                    } else if (userInput.moneyOptions().equals("d")) {
                        moneyDeposited = 20;
                    }
                    // make a purchase
                    String cart = userInput.getPurchase();
                    userOutput.displayMessage("You chose to purchase " + cart);
                } else if (purchaseMenuChoice.equals("Select Item")) {
                    userOutput.displayList(snacksList);
                }

                else if (choice.equals("exit")) {
                    // good bye
                    break;
                }
            }
        }
    }

        public void readInFromFile(){
            File file = new File("C:\\Users\\Student\\myworkspace\\java-green-minicapstonemodule1-team5\\java\\catering.csv");
            try (Scanner fileScanner = new Scanner(file)) {

                while (fileScanner.hasNextLine()) {
                    String line = fileScanner.nextLine();
                    String[] snackProperties = line.split(",");
                    String location = snackProperties[0];
                    String name = snackProperties[1];
                    BigDecimal price = new BigDecimal(snackProperties[2]);
                    String type = snackProperties[3];

                    if (type.equals("Candy")) {
                        Candy candy = new Candy(location, name, price, type, 6);
                        snacksList.add(candy);

                    } else if (type.equals("Munchy")) {
                        Munchy munchy = new Munchy(location, name, price, type, 6);
                        snacksList.add(munchy);
                    } else if (type.equals("Drink")) {
                        Drink drink = new Drink(location, name, price, type, 6);
                        snacksList.add(drink);
                    } else if (type.equals("Gum")) {
                        Gum gum = new Gum(location, name, price, type, 6);
                        snacksList.add(gum);


                    }


                }


            } catch (FileNotFoundException e) {
                System.out.println("file not found");
            }

        }

}



