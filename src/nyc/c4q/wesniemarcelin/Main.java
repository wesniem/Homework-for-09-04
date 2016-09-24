package nyc.c4q.wesniemarcelin;


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

    private static void beginStory() {
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
                System.out.println("It appears that you what you saw in the distance was in fact a ZOMBIE and by taking action, you have survived the game.  Well done! Your trophy is above.");
                rePlay();
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
                rePlay();
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

