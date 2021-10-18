package com.JHTuhin;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Player Ryan= new Player("Ryan",13,21);
        System.out.println(Ryan.toString());
        saveObjects(Ryan);
        Ryan.setWeapon("MK14");
        Ryan.setHitPoints(9);
        System.out.println(Ryan);
        saveObjects(Ryan);
        loadObjects(Ryan);
        System.out.println(Ryan);

        ISaveable Biden= new Monster("Biden",26,45);
        System.out.println(Biden.toString());
        System.out.println(((Monster)Biden).getName());;
    }
    public static ArrayList<String> readValues(){
        ArrayList<String> values= new ArrayList<>();
        Scanner scanner= new Scanner(System.in);
        boolean quit=false;
        int index=0;
        System.out.println("Choose\n"+"1 to enter a string and 0 to quit");
        while (!quit){
            System.out.println("Enter a choice: ");
            int choice=scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    quit=true;
                    break;
                case 1:
                    System.out.println("Enter a string:");
                    String stringInput=scanner.nextLine();
                    values.add(index,stringInput);
                    index++;
                    break;
            }
        }

        return values;
    }

    public static void saveObjects(ISaveable objectsToSave){
        for(int i=0;i<objectsToSave.write().size();i++){
            System.out.println("Saving "+objectsToSave.write().get(i)+" to storage device.");
        }
    }

    public static void loadObjects(ISaveable objectsToLoad){
        ArrayList<String> values=readValues();
        objectsToLoad.read(values);
    }
}
