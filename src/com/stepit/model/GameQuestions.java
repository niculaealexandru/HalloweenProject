package com.stepit.model;

import java.io.File;
import java.util.Scanner;

public class GameQuestions {

    private final static Scanner SCANNER = new Scanner(System.in);

    public void questions() {
        File snake = new File("snake.wav");
        File spider = new File("spider.wav");
        File skull = new File("skull.wav");
        File win = new File("win.wav");
        File laugh = new File("laugh.wav");
        Image sc = new Image();
        File happy = new File("happy.wav");


        int input = SCANNER.nextInt();
        Realms realm = Realms.getEnumById(input);
        boolean aux;
        if (input == 1) {
            System.out.println(" Your choice is  " + realm.getName() + "\n" + realm.getCaracter() + "\n" +
                    "To find the way out, you have to answer the 3 questions!\n" +
                    "PS: You have only one life!\n" +
                    "Are you ready?\n");
            Sound.playSound(skull);
            aux = InputUser.inputMethod("Which of them has a main role in the film Kong: Skull Island!\n",
                    "Vin Diesel",
                    "Jason Statham",
                    "Tom Hiddleston",
                    "c");
            if (aux) {
                System.out.println("You're lucky!\nTake care, you have only one life!");
                Sound.playSound(laugh);
                aux = InputUser.inputMethod("\nIn what year did the movie Kong: Skull Island appear!\n",
                        "2018",
                        "2019",
                        "2017",
                        "c");
            }
            if (aux) {
                System.out.println("You're lucky!\nTake care, you have only one life!");
                Sound.playSound(laugh);
                aux = InputUser.inputMethod("\nLast question, how lucky you are?\n" +
                                "Choose the lucky number!\n",
                        "13",
                        "12",
                        "14",
                        "a");
                if (aux) {
                    System.out.println("Congratulation!\nYou Won!");
                    sc.displayImage("happy.jpg", "win.wav");
                }
            }
        } else if (input == 2) {
            System.out.println(" Your choice is  " + realm.getName() + "\n" + realm.getCaracter() + "\n" +
                    "To find the way out, you have to answer the 3 questions!\n" +
                    "PS: You have only one life!\n" +
                    "Are you ready?\n");
            Sound.playSound(snake);
            aux = InputUser.inputMethod("Which is the largest snake in the world?\n",
                    "Green Anaconda",
                    "King cobra",
                    "Cape cobra",
                    "a");
            if (aux) {
                System.out.println("You're lucky!\nTake care, you have only one life!");
                Sound.playSound(laugh);
                aux = InputUser.inputMethod("Which is the most poisonous snake in the world?\n",
                        "Black Tiger Snake",
                        "Inland Taipan",
                        "Forest Cobra",
                        "b");
            } if(aux) {
                System.out.println("You're lucky!\nTake care, you have only one life!");
                Sound.playSound(laugh);
                aux = InputUser.inputMethod("\nLast question, how lucky you are? \n" +
                                "What length it can reach Green Anaconda?\n",
                        "8 - 10 meters",
                        "10 - 12 meters",
                        "14 - 16 meters",
                        "b");
            } if (aux) {
                System.out.println("Congratulation!\nYou Won!");
                sc.displayImage("happy.jpg", "win.wav");
            }
        } else {
            System.out.println(" Your choice is " + realm.getName() + "\n" + realm.getCaracter() + "\n" +
                    "To find the way out, you have to answer the 3 questions!\n" +
                    "PS: You have only one life!\n" +
                    "Are you ready?\n");
            Sound.playSound(spider);
            aux = InputUser.inputMethod("What is the smallest spider in the world?\n",
                    "Patu digua",
                    "Latrodectus geometricus",
                    "Sicarius hahni",
                    "a");
            if (aux) {
                System.out.println("You're lucky!\nTake care, you have only one life!");
                Sound.playSound(laugh);
                aux = InputUser.inputMethod("What is the largest spider in the world?\n",
                        "Altrax robustus",
                        "Latrodectus hasselti",
                        "Theraphosa blondi",
                        "c");
            } if(aux) {
                System.out.println("You're lucky!\nTake care, you have only one life!");
                Sound.playSound(laugh);
                aux = InputUser.inputMethod("\nLast question, how lucky you are? \n" +
                                "What is the most venomous snake in the world?\n",
                        "Phoneutria",
                        "Loxosceles reclusa",
                        "Latrodectus geometricus",
                        "a");
            } if (aux) {
                System.out.println("Congratulation!\nYou Won!");
                sc.displayImage("happy.jpg", "win.wav");
            }
        }
    }
}
