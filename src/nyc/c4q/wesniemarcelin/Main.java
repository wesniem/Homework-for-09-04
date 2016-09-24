package nyc.c4q.wesniemarcelin;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        System.out.println("$$$$$$$$\\                        $$\\       $$\\                  $$$$$$\\                                $$\\                     $$\\ \n" +
                "\\____$$  |                       $$ |      \\__|                $$  __$$\\                               \\__|                    $$ |\n" +
                "    $$  / $$$$$$\\  $$$$$$\\$$$$\\  $$$$$$$\\  $$\\  $$$$$$\\        $$ /  \\__|$$\\   $$\\  $$$$$$\\ $$\\    $$\\ $$\\ $$\\    $$\\ $$$$$$\\  $$ |\n" +
                "   $$  / $$  __$$\\ $$  _$$  _$$\\ $$  __$$\\ $$ |$$  __$$\\       \\$$$$$$\\  $$ |  $$ |$$  __$$\\\\$$\\  $$  |$$ |\\$$\\  $$  |\\____$$\\ $$ |\n" +
                "  $$  /  $$ /  $$ |$$ / $$ / $$ |$$ |  $$ |$$ |$$$$$$$$ |       \\____$$\\ $$ |  $$ |$$ |  \\__|\\$$\\$$  / $$ | \\$$\\$$  / $$$$$$$ |$$ |\n" +
                " $$  /   $$ |  $$ |$$ | $$ | $$ |$$ |  $$ |$$ |$$   ____|      $$\\   $$ |$$ |  $$ |$$ |       \\$$$  /  $$ |  \\$$$  / $$  __$$ |$$ |\n" +
                "$$$$$$$$\\\\$$$$$$  |$$ | $$ | $$ |$$$$$$$  |$$ |\\$$$$$$$\\       \\$$$$$$  |\\$$$$$$  |$$ |        \\$  /   $$ |   \\$  /  \\$$$$$$$ |$$ |\n" +
                "\\________|\\______/ \\__| \\__| \\__|\\_______/ \\__| \\_______|       \\______/  \\______/ \\__|         \\_/    \\__|    \\_/    \\_______|\\__|\n" +
                "                                                                                                                                   \n" +
                "                                                                                                                                   \n" +
                "                                                                                                                                   ");
        beginStory();
    }

    public static void beginStory() {
        System.out.println("It is night time and you have awoken in an unfamiliar location with no cell phone .  You look around and see no one " +
                "in sight. In front of you lies a red button. What should you do next");
        System.out.println("A) Get up and begin running");
        System.out.println("B) Get up and start yelling ");
        System.out.println("C) Push that red button");
        Scanner scanner = new Scanner(System.in);
        String letter = scanner.next();
        letter = letter.toUpperCase();
        firstMove(letter);
    }

    //New Feature: Added a second round
    private static void nextRound(){
        ArrayList<String> roundTwo = new ArrayList<>();
        roundTwo.add("(                                            \n" +
                " )\\ )                (       *   )            \n" +
                "(()/(      (         )\\ )  ` )  /((  (        \n" +
                " /(_))(   ))\\  (    (()/(   ( )(_))\\))(   (   \n" +
                "(_))  )\\ /((_) )\\ )  ((_)) (_(_()|(_)()\\  )\\  \n" +
                "| _ \\((_|_))( _(_/(  _| |  |_   _|(()((_)((_) \n" +
                "|   / _ \\ || | ' \\)) _` |    | | \\ V  V / _ \\ \n" +
                "|_|_\\___/\\_,_|_||_|\\__,_|    |_|  \\_/\\_/\\___/ ");
        System.out.println(roundTwo);
        System.out.println("Congratulations! You've made it to the second round. Press 1 to proceed or 2 to exit.");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if(input==1) {
            System.out.println("You have now been awoken in another unfamiliar place....A FOREST! \n You begin scanning the area" +
                    "looking for clues.  On one adjacent tree, you've spotted a: \n A) Bow and arrow \n& on another tree\n B) A slingshot.  \nWhich one do you choose as your weapon?");
            Scanner scanner1 = new Scanner(System.in);
            String scanner2= scanner1.next();
            firstMove2(scanner2);
        }
        else if (input == 2){
            System.out.println("Thanks for playing! Goodbye.");
            rePlay();
        }
        else{
            System.out.println("Invalid input. Goodbye.");
            rePlay();
        }
    }


    private static void firstMove2(String userChoice) {
        userChoice = userChoice.toUpperCase();

        switch (userChoice) {
            case "A":
                System.out.println("Once you've gotten your bow and arrow, you realize that an army of hungry \n zombies has spotted you and" +
                        "wants you for dinner. Your next move is to :" +
                        "\n A)Immediately Use your bow and arrow to kill the zombies in the front\n B)Climb one of the trees and shoot the zombies with\n" +
                        "your bow and arrows\n C)Run as fast as your can!");
                Scanner scanner3 = new Scanner(System.in);
                String nextWord = scanner3.next();
                secondMove2(nextWord);

                break;
            case "B":
                System.out.println("You've gotten the slingshot and you begin walking around\nand while walking you hear something in the " +
                        "distance \n that sounds like water.  So you walk towards the sound. Once you've found where the sound is coming from, you realize\n" +
                        "that it is in fact a waterfall and on the other side, there's a pot of gold and some hungry looking zombies.  What's your next move?\n" +
                        "A) Swim to the other side to get those gold coins!\n B) Swim underneath the waterfall to see if there's something hidden behind it\n" +
                        "C)Look for a way to get to the other side quietly without getting into the water");
                Scanner scanner4 = new Scanner(System.in);
                String nextWord1 = scanner4.next();
                secondMove_2(nextWord1);
                break;
        }
    }

    private static void secondMove2(String move){
        move = move.toUpperCase();
        switch (move){
            case "A":
                System.out.println("The army of zombies was too overpowering and you did not survive this round.  Goodbye!");
                rePlay();
                break;
            case "B":
                System.out.println("SMART MOVE! You managed to climb to the top of the tree and the zombies had a difficult time catching up\n" +
                        "They continue to try to get to you but you remember your bow and arrows and begin using it. After an hour, of waiting the zombies get distracted and\n" +
                        "move in another direction. You have survived the final round! Congratulations!");
                rePlay();
                break;
            case "C":
                System.out.println("You appear to have ran so fast that you outran the zombies and\n" +
                        " found a nearby village that welcomed you and offers you shelter.  Great Job! You have survived the final round!");
                rePlay();
                break;


        }
    }

    private static void secondMove_2(String move) {
        move = move.toUpperCase();
        switch (move) {
            case "A":
                System.out.println("So you've gotten the gold coins but in doing so, you've caught the attention of the zombies\n" +
                        "You attempt to run with your coins but the pot is much too heavy. \n Should you:\n A)Dump out 50% of the pot and run with it" +
                        "\n B)Stuff as many coins as possible in your drenched clothes and run\n C) Leave the gold, use your slingshot a few times and RUN!");
                Scanner scanner = new Scanner(System.in);
                String nextWord = scanner.next();
                thirdMove_2(nextWord);
                break;
            case "B":
                System.out.println("You have found an underground cave underneath the waterfall and to your surprise\n it's" +
                        " filled with even more gold coins and jewels.  You then decide to \n A)Grab some of these goodies and swim to see if there's another exit." +
                        "\n B)Swim further in to see what lies at the other end of the cave ");
                Scanner scanner1 = new Scanner(System.in);
                String nextWord1 = scanner1.next();
                thirdMove_2(nextWord1);
                break;
            case "C":
                System.out.println("While roaming the land, you bump into some zombies and they\n are more than happy to have bumped into you and they proceed to attack!\n" +
                        "Unfortunately your running and weapon aren't enough and the zombies end up having you for lunch.\n GAME OVER!");
                rePlay();
                break;

        }
    }

        private static void thirdMove_2(String word){
            word = word.toUpperCase();
        switch (word){
            case "A":
                System.out.println("By doing this, you were able to find a way out and escaped any oncoming zombie traffic\n" +
                        "Congratulations! you survived the final round!");
                rePlay();
                break;
            case "B":
                System.out.println("Unfortunately, you end up bumping into some zombies who aren't very nice. GAME OVER!");
                rePlay();
                break;
            case "C":
                System.out.println("You did it! You managed to outrun the zombies and have completed the final round.");
                rePlay();
                break;
        }
    }

    private static void firstMove(String move) {
        move = move.toUpperCase();
        switch (move) {
            case "A":
                System.out.println("Okay, so you've begun running.  After a while you begin to slow down because it looks as though you saw something or someone run past in the distance. Your next move is: ");
                System.out.println("A) Run towards the direction of what you saw");
                System.out.println("B) Run in the opposite direction of what you saw");
                System.out.println("C)Go back to your starting point");
                Scanner scanner = new Scanner(System.in);
                String x = scanner.next();
                secondMove(x);
                break;
            case "B":
                System.out.println("As you look into the distance, you notice that your yelling has brought some attention " +
                        "and you begin to panic. When you look to your right, you notice that there's a passageway " +
                        "that leads to a door. Your next move is ?");
                System.out.println("A)Run to the door as fast as you can");
                System.out.println("B)Stay put and hope that help is on the way");
                System.out.println("C)Lay flat on the floor and hope that you didn't bring attention to yourself");
                Scanner scanner2 = new Scanner(System.in);
                String y = scanner2.next();
                secondMove(y);
                break;
            case "C":
                System.out.println("So you push the red button, and next thing you know, the ground beneath lets out and you're falling into a deep dark pit.  You start screaming and reaching out to try to grip onto anything you can find to stop your fall but no luck.  You then end up reaching the end of the hole and it's complete darkness!  Your next move is to:");
                System.out.println("A) Panic!");
                System.out.println("B) Get up and run!");
                Scanner scanner3 = new Scanner(System.in);
                String w = scanner3.next();
                secondMove(w);
                break;
            default:
                System.out.println("Invalid input. Game Over!");
                break;

        }
    }
//Bug Fix: Case B is modified to have the correct output
    private static void secondMove(String nextMove) {
        nextMove = nextMove.toUpperCase();
        switch (nextMove){
            case "A":
                System.out.println("It looks as though by doing this, you have gotten unwanted attention and you now have zombies running after you.  How will you survive? ");
                System.out.println("A) Let the zombies come after you and fight them off");
                System.out.println("B) Run!");
                Scanner scanner = new Scanner(System.in);
                String last = scanner.next();
                thirdMove(last);
            case "B":
                System.out.println("\n");
                System.out.println("---------------------------------------------------------------------------------------------------------");
                System.out.println("MMMMMMMMMMM++MMMMMMMMMMM=NMMMMMMMMMMMMM\n" +
                        "MMMMMMMMM=+MZZZZZZZZZZZZZZZM+=MMMMMMMMMM\n" +
                        "MMMMMMMMM7==+OMMMMMMMMMMMD++++MMMMMMMMMM\n" +
                        "MMIMMMIMM$7IIIII?=====+?7777$$MOIMMMIMMM\n" +
                        "MMIMMMIMM$7I+++++IIIIIII$$$$$$MMIMMMIMMM\n" +
                        "MMIMMM$IN$7I+++++IIIII=ZZZ$$$$$I$MMMIMMM\n" +
                        "MMMIMMMMOM7I?+ZO=ZIII$ZZZ$$$$MZMMMMIMMMM\n" +
                        "MMM$7MMMMM$II=ZZZZIIIIIZZ$$$$MMMMNI$MMMM\n" +
                        "MMM8$IMMMMZ7I+OZZZZIIIIZZ$$$OMMMMI$MMMMM\n" +
                        "MMMMMMZMMMM$II+Z+=ZIII=Z$$$$MMMM$MMMMMMM\n" +
                        "MMMMMMMM$$8N7I+++III=ZZZ=$$MZ$$MMMMMMMMM\n" +
                        "MMMMMMMMMMMM$7I?+IIIII7ZZZ$MMMMMMMMMMMMM\n" +
                        "MMMMMMMMMMMMM$7I++III7$$$$MMMMMMMMMMMMMM\n" +
                        "MMMMMMMMMMMMMMM77II77$$$$MMMMMMMMMMMMMMM\n" +
                        "MMMMMMMMMMMMMMMM$777$$$M+MMMMMMMMMMMMMMM\n" +
                        "MMMMMMMMMMMMMMMM+MMMMMI+MMMMMMMMMMMMMMMM\n" +
                        "MMMMMMMMMMMMMMMMM$Z++?ZMMMMMMMMMMMMMMMMM\n" +
                        "MMMMMMMMMMMMMMMMMZ77$$MMMMMMMMMMMMMMMMMM\n" +
                        "MMMMMMMMMMMMMMMMZIII$$$MMMMMMMMMMMMMMMMM\n" +
                        "MMMMMMMMMMMMMMM7++II7$$$$MMMMMMMMMMMMMMM\n" +
                        "MMMMMMMMMMMM+M7+++III7$$$$M+MMMMMMMMMMMM\n" +
                        "MMMMMMMMMMMMZ+MM777II7$$MM+$MMMMMMMMMMMM\n" +
                        "MMMMMMMMMMM~MMI++++?=++=7$MM~MMMMMMMMMMM\n" +
                        "MMMMMMMMMMMM+~~MMMMMMMMMM~~~MMMMMMMMMMMM\n" +
                        "MMMMMMMMMMMMMMMMMMM~~,MMMMMMMMMMMMMMMMMM");
                System.out.println("\n");
                System.out.println("-----------------------------------------------------------------------------------------------------");
                System.out.println("It appears that you have survived the game.  Well done! Your trophy is above.");
                nextRound();
                break;
            case "C":
                System.out.println("Unfortunately, what you saw was a ZOMBIE and it has a very strong human sensor and you have been caught on its radar.  You have not survived this round. Goodbye!");
                System.out.println("\n");
                System.out.println("---------------------------------------------------------------------------------------------------------");
                rePlay();
                break;
            default:
                System.out.println("Invalid input! Game Over.");
                System.out.println("\n");
                System.out.println("---------------------------------------------------------------------------------------------------------");
                break;
        }
    }

    private static void thirdMove(String lastMove){
        lastMove = lastMove.toUpperCase();
        switch (lastMove){
            case "A":
                System.out.println("\n");
                System.out.println("---------------------------------------------------------------------------------------------------------");
                System.out.println("\n");
                System.out.println("                         \"MMMMMMMMM=+MZZZZZZZZZZZZZZZM+=MMMMMMMMMM\\n\" +\n" +
                        "                        \"MMMMMMMMM7==+OMMMMMMMMMMMD++++MMMMMMMMMM\\n\" +\n" +
                        "                        \"MMIMMMIMM$7IIIII?=====+?7777$$MOIMMMIMMM\\n\" +\n" +
                        "                        \"MMIMMMIMM$7I+++++IIIIIII$$$$$$MMIMMMIMMM\\n\" +\n" +
                        "                        \"MMIMMM$IN$7I+++++IIIII=ZZZ$$$$$I$MMMIMMM\\n\" +\n" +
                        "                        \"MMMIMMMMOM7I?+ZO=ZIII$ZZZ$$$$MZMMMMIMMMM\\n\" +\n" +
                        "                        \"MMM$7MMMMM$II=ZZZZIIIIIZZ$$$$MMMMNI$MMMM\\n\" +\n" +
                        "                        \"MMM8$IMMMMZ7I+OZZZZIIIIZZ$$$OMMMMI$MMMMM\\n\" +\n" +
                        "                        \"MMMMMMZMMMM$II+Z+=ZIII=Z$$$$MMMM$MMMMMMM\\n\" +\n" +
                        "                        \"MMMMMMMM$$8N7I+++III=ZZZ=$$MZ$$MMMMMMMMM\\n\" +\n" +
                        "                        \"MMMMMMMMMMMM$7I?+IIIII7ZZZ$MMMMMMMMMMMMM\\n\" +\n" +
                        "                        \"MMMMMMMMMMMMM$7I++III7$$$$MMMMMMMMMMMMMM\\n\" +\n" +
                        "                        \"MMMMMMMMMMMMMMM77II77$$$$MMMMMMMMMMMMMMM\\n\" +\n" +
                        "                        \"MMMMMMMMMMMMMMMM$777$$$M+MMMMMMMMMMMMMMM\\n\" +\n" +
                        "                        \"MMMMMMMMMMMMMMMM+MMMMMI+MMMMMMMMMMMMMMMM\\n\" +\n" +
                        "                        \"MMMMMMMMMMMMMMMMM$Z++?ZMMMMMMMMMMMMMMMMM\\n\" +\n" +
                        "                        \"MMMMMMMMMMMMMMMMMZ77$$MMMMMMMMMMMMMMMMMM\\n\" +\n" +
                        "                        \"MMMMMMMMMMMMMMMMZIII$$$MMMMMMMMMMMMMMMMM\\n\" +\n" +
                        "                        \"MMMMMMMMMMMMMMM7++II7$$$$MMMMMMMMMMMMMMM\\n\" +\n" +
                        "                        \"MMMMMMMMMMMM+M7+++III7$$$$M+MMMMMMMMMMMM\\n\" +\n" +
                        "                        \"MMMMMMMMMMMMZ+MM777II7$$MM+$MMMMMMMMMMMM\\n\" +\n" +
                        "                        \"MMMMMMMMMMM~MMI++++?=++=7$MM~MMMMMMMMMMM\\n\" +\n" +
                        "                        \"MMMMMMMMMMMM+~~MMMMMMMMMM~~~MMMMMMMMMMMM\\n\" +\n" +
                        "                        \"MMMMMMMMMMMMMMMMMMM~~,MMMMMMMMMMMMMMMMMM");
                System.out.println("You are definitely a warrior because you have managed to fight off the zombies with your courage and strength. Great Job, your trophy is above!");
                System.out.println("----------------------------------------------------------------------------");
                System.out.println("\n");
                nextRound();
                break;
            case "B":
                System.out.println("It appears that you weren't able to run faster than the zombies and you haven't succeed this round. GAME OVER!");
                System.out.println("\n");
                System.out.println("---------------------------------------------------------------------------------------------------------");
                rePlay();
                break;
            default:
                System.out.println("Invalid input. GAME OVER!");
                System.out.println("\n");
                System.out.println("---------------------------------------------------------------------------------------------------------");
                rePlay();
                break;
        }

    }
    private static void rePlay(){
        System.out.println("Would you like to play again? Y(YES) or N(NO)");
        Scanner scanner = new Scanner(System.in);
        String newWord = scanner.next();
        if (newWord.equalsIgnoreCase("N") || newWord.equalsIgnoreCase("NO")){
            System.out.println("Thanks for playing!");
            System.out.println("\n");
            System.out.println("$$$$$$$$\\                        $$\\       $$\\                  $$$$$$\\                                $$\\                     $$\\ \n" +
                    "\\____$$  |                       $$ |      \\__|                $$  __$$\\                               \\__|                    $$ |\n" +
                    "    $$  / $$$$$$\\  $$$$$$\\$$$$\\  $$$$$$$\\  $$\\  $$$$$$\\        $$ /  \\__|$$\\   $$\\  $$$$$$\\ $$\\    $$\\ $$\\ $$\\    $$\\ $$$$$$\\  $$ |\n" +
                    "   $$  / $$  __$$\\ $$  _$$  _$$\\ $$  __$$\\ $$ |$$  __$$\\       \\$$$$$$\\  $$ |  $$ |$$  __$$\\\\$$\\  $$  |$$ |\\$$\\  $$  |\\____$$\\ $$ |\n" +
                    "  $$  /  $$ /  $$ |$$ / $$ / $$ |$$ |  $$ |$$ |$$$$$$$$ |       \\____$$\\ $$ |  $$ |$$ |  \\__|\\$$\\$$  / $$ | \\$$\\$$  / $$$$$$$ |$$ |\n" +
                    " $$  /   $$ |  $$ |$$ | $$ | $$ |$$ |  $$ |$$ |$$   ____|      $$\\   $$ |$$ |  $$ |$$ |       \\$$$  /  $$ |  \\$$$  / $$  __$$ |$$ |\n" +
                    "$$$$$$$$\\\\$$$$$$  |$$ | $$ | $$ |$$$$$$$  |$$ |\\$$$$$$$\\       \\$$$$$$  |\\$$$$$$  |$$ |        \\$  /   $$ |   \\$  /  \\$$$$$$$ |$$ |\n" +
                    "\\________|\\______/ \\__| \\__| \\__|\\_______/ \\__| \\_______|       \\______/  \\______/ \\__|         \\_/    \\__|    \\_/    \\_______|\\__|\n" +
                    "                                                                                                                                   \n" +
                    "                                                                                                                                   \n" +
                    "                                                                                                                                   ");
            return;
        }
        else if (newWord.equalsIgnoreCase("Y")|| newWord.equalsIgnoreCase("YES")){
            beginStory();
        }
        else {
            System.out.println("Invalid input. GAME OVER!");
            return;
        }
    }
}

