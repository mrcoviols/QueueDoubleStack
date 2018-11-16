package com.exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
	    Queue<Integer> queue = new Queue<>();
        boolean quit = false;
        while (!quit) {

            System.out.println(
                    "What do you want to do?\n" +
                            "\tadd\t: put an item in the queue\n" +
                            "\tremove\t: remove the first item in the queue\n" +
                            "\tpeek\t: see the first item in the queue\n" +
                            "\tisEmpty\t: know if the queue is empty.\n" +
                            "\tquit\t: quit the program.\n"
            );
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String s = "";
            try {
                s = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }

            switch (s) {
                case "add":
                    System.out.print("Please insert a number: ");
                    int num;
                    try {
                        num = Integer.parseInt(br.readLine());
                        queue.add(num);
                    } catch (IOException e) {
                        System.out.println("Error:\n");
                        e.printStackTrace();
                    }
                    break;
                case "remove":
                    Integer rem = queue.remove();
                    if (rem==null) {
                        System.out.println("There are no more numbers in the queue!");
                    }
                    else{
                        System.out.println("I removed the number: " + rem);
                    }
                    break;
                case "peek":
                    Integer seen = queue.peek();
                    if (seen==null) {
                        System.out.println("There are no more numbers in the queue!");
                    }
                    else{
                        System.out.println("I saw the number: " + seen);
                    }
                    break;
                case "isEmpty":
                    System.out.println("The queue is "+(queue.isEmpty()? "empty." : "not empty."));
                    break;
                case "quit" :
                    quit = true;
                    System.out.println("Bye!");
                    break;
                default:
                    System.out.println("I did not understand.");
            }
            System.out.print("\n");
        }
    }
}
