import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void addCeleb(ArrayList<Celebrity> celebsArrList, Celebrity celeb) {
        celebsArrList.add(celeb);

    }

    public static String getTraits() {
        return "gender, occupation, age, and hair color";
    }

    public static void compareGuess(Celebrity celeb, String guess) {
        if (celeb.getName().toLowerCase().equals(guess.toLowerCase()) || celeb.getGender().toLowerCase().equals(guess.toLowerCase()) || celeb.getOccupation().toLowerCase().equals(guess.toLowerCase()) || celeb.getHairColor().toLowerCase().equals(guess.toLowerCase())) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect!");
        }
    }

    public static void compareAge(Celebrity celeb, String guess) {
        if (Integer.parseInt(guess) > Integer.parseInt(celeb.getAge())) {
            System.out.println("Incorrect, celebrity is younger!");
        } else if (Integer.parseInt(guess) < Integer.parseInt(celeb.getAge())) {
            System.out.println("Incorrect, celebrity is older!");
        } else {
            System.out.println("Correct!");
        }
    }

    public static boolean compareCeleb(Celebrity celeb, String guess) {
        if (celeb.getName().toLowerCase().equals(guess.toLowerCase())) {
            return true;
        }
        return false; 
    }

    
    public static void main(String[] args) {
        Celebrity kevinHart = new Celebrity("Kevin Hart", "Male", "Comedian", "43",  "Black");
        Celebrity taylorSwift = new Celebrity("Taylor Swift", "Female", "Singer", "33", "Blonde");
        Celebrity ryanReynolds = new Celebrity("Ryan Reynolds", "Male", "Actor", "46", "Brown");
        Celebrity kanyeWest = new Celebrity("Kanye West", "Male", "Rapper", "45", "Black");
        Celebrity jimmyFallon = new Celebrity("Jimmy Fallon", "Male", "Comedian", "48", "Brown");
        Celebrity katyPerry = new Celebrity("Katy Perry", "Female", "Singer", "38", "Black");
        Celebrity badBunny = new Celebrity("Bad Bunny", "Male", "Rapper", "28", "Black");
        Celebrity jenniferAniston = new Celebrity("Jennifer Aniston", "Female", "Actress", "53", "Blonde");
        Celebrity mikeTyson = new Celebrity("Mike Tyson", "Male", "Boxer", "56", "Black");
        Celebrity johnnyDepp =  new Celebrity("Johnny Depp", "Male", "Actor", "59", "Brown");

        ArrayList<Celebrity> celebs = new ArrayList<Celebrity>(Arrays.asList(kevinHart, taylorSwift, ryanReynolds, kanyeWest, jimmyFallon, katyPerry, badBunny, jenniferAniston, mikeTyson, johnnyDepp));

        Celebrity randoCeleb = celebs.get((int) Math.floor(Math.random() * celebs.size()));
        boolean gameOver = false; 
        Scanner myObj = new Scanner(System.in);
        System.out.println("Guess a celebrity using the following traits: " + getTraits());
        while (gameOver != true) {
            System.out.println("What trait would you like to guess?");
            String trait = myObj.nextLine();
            System.out.println("Enter your guess:");
            String guess = myObj.nextLine();
            if (trait.toLowerCase().equals("age")) {
                compareAge(randoCeleb, guess);
            } else {
                compareGuess(randoCeleb, guess);
            }
            System.out.println("Do you want to guess a celebrity? (\"y\" for yes, n for \"no\")");
            String isReady = myObj.nextLine();
            if (isReady.equals("y")) {
                System.out.println("Enter your guess:");
                String celebGuess = myObj.nextLine();
                if(compareCeleb(randoCeleb, celebGuess)) {
                    System.out.println("YOU WIN");
                    gameOver = true;
                    myObj.close();
                } else {
                    System.out.println("NOPE, try again");
                }
            }


        }
    }
}
