package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String >();

        addInOrder(placesToVisit,"sydney");
        addInOrder(placesToVisit,"Melbourne");
        addInOrder(placesToVisit,"Manali");
        addInOrder(placesToVisit,"Kufri");
        addInOrder(placesToVisit,"Spiti");
        addInOrder(placesToVisit,"Leh");
        addInOrder(placesToVisit,"Ladakh");
        addInOrder(placesToVisit,"Goa");
        printList(placesToVisit);


        addInOrder(placesToVisit,"Senghai");
        addInOrder(placesToVisit,"Goa");
        printList(placesToVisit);

        visit(placesToVisit);

//        placesToVisit.add("Sidney");
//        placesToVisit.add("Melbourne");
//        placesToVisit.add("Manali");
//        placesToVisit.add("Kufri");
//        placesToVisit.add("Spiti");
//        placesToVisit.add("Leh");
//        placesToVisit.add("Ladakh");
//        placesToVisit.add("Goa");
//
//        printList(placesToVisit);
//        placesToVisit.add(1,"Coimbatore");
//        printList(placesToVisit);
//
//        placesToVisit.remove(4);
//        printList(placesToVisit);

    }
    private static void printList(LinkedList<String> linkedList){
//        using iterator
        Iterator<String> i = linkedList.iterator();
        while(i.hasNext()){
            System.out.println("will visit : " + i.next());
        }
        System.out.println("=========================================");
//        using for loop to iterate through linkedList:
//        for (int i=0; i<linkedList.size(); i++){
//            System.out.println(i + " -> " + linkedList.get(i));
//        }
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity){
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while (stringListIterator.hasNext()){
            int comparison = stringListIterator.next().compareTo(newCity);
            if (comparison == 0){
                // equal, do not add
                System.out.println(newCity + " already exists in list");
                return false;
            }
            else if (comparison > 0){
                // new city appear before this one
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            }
            else if (comparison < 0){
                //move on the next record
            }
        }
        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList cities){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();

        if (cities.isEmpty()){
            System.out.println("NO cities in the item list");
            return;
        }
        else{
            System.out.println("now visiting " + listIterator.next());
            printMenu();
        }

        while (!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action){
                case 0:
                    System.out.println("Vacation Over");
                    break;
                case 1:
                    if (!goingForward){
                        if (listIterator.hasNext()){
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if (listIterator.hasNext()){
                        System.out.println("Now Visiting : " + listIterator.next());
                    }
                    else {
                        System.out.println("we're at the end of the list");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if (goingForward){
                        if (listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (listIterator.hasPrevious()){
                        System.out.println("Now Visiting : " + listIterator.previous());
                    }
                    else{
                        System.out.println("we're at the start of the list ");
                        goingForward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }
    }
    private static void printMenu(){
        System.out.println("Available options:\nPress");
        System.out.println("0 - to quit\n" +
                "1 - go to next place\n" +
                "2 - go to previous city\n" +
                "3 - to print menu");
    }
}
