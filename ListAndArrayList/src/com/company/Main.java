package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList =new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit){
            System.out.println("Enter your choice : ");
            choice = scanner.nextInt();

            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeIem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }
    public static void printInstructions(){
        System.out.println("\nPress ");
        System.out.println("\t 0- To print choice Options. ");
        System.out.println("\t 1 - To print grocery list. ");
        System.out.println("\t 2- To add an item to the list. ");
        System.out.println("\t 3- To modify item in the list. ");
        System.out.println("\t 4- To remove item from the list. ");
        System.out.println("\t 5- To search item in the list. ");
        System.out.println("\t 5- To close the application. ");
    }
    public static void addItem(){
        System.out.println("Please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
        scanner.nextLine();
    }
    public static void modifyItem(){
        System.out.println("Enter item number : ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter replacement item : ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNo-1,newItem);
    }
    public static void removeIem(){
        System.out.println("Enter item number : ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        groceryList.removeGroceryItem(itemNo-1);
    }
    public static void searchForItem(){
        System.out.print("Enter item name to search for: ");
        String searchItem = scanner.nextLine();
        if (groceryList.findItem(searchItem) != null){
            System.out.println("Found "+ searchItem + " in or grocery list");
        }
        else{
            System.out.println("search item is not in the shopping list.");
        }

    }
}
