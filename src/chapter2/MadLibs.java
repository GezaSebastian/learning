package chapter2;

import java.util.Scanner;

public class MadLibs {

  public static void main(String[] arg) {

    //1. Ask for season of the year name
    System.out.println("What season of the year is this!?");
    Scanner scanner = new Scanner(System.in);
    String season = scanner.next();

    //2. Ask for intiger number

    System.out.println("In a scale of 1 to 5 how sleepy you are?");
    int cups = scanner.nextInt();

    //3. Ask for an adjective describing season

    System.out.println("What is the first thing that comes to your mind when you look outside?");
    String adjective = scanner.next();
      scanner.close();

    //4. Print complete the sentence
    System.out.println("On a " + adjective +" " + season + " day, I drink a minimum of " + cups + " cups of coffee.");

  }
}
