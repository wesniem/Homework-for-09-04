package nyc.c4q.wesniemarcelin;

/**
 * Created by wesniemarcelin on 9/24/16.
 */
public class Array {
    public static void main(String[] args) {
        System.out.println(zombieArray()[2].length());
    }

    public static String[] zombieArray() {
        String[] zombie = {
                "$$$$$$$$\\                        $$\\       $$\\                  $$$$$$\\                                $$\\                     $$\\ \n",
                "\\____$$  |                       $$ |      \\__|                $$  __$$\\                               \\__|                    $$ |\n",
                "    $$  / $$$$$$\\  $$$$$$\\$$$$\\  $$$$$$$\\  $$\\  $$$$$$\\        $$ /  \\__|$$\\   $$\\  $$$$$$\\ $$\\    $$\\ $$\\ $$\\    $$\\ $$$$$$\\  $$ |\n",
                "   $$  / $$  __$$\\ $$  _$$  _$$\\ $$  __$$\\ $$ |$$  __$$\\       \\$$$$$$\\  $$ |  $$ |$$  __$$\\\\$$\\  $$  |$$ |\\$$\\  $$  |\\____$$\\ $$ |\n",
                "  $$  /  $$ /  $$ |$$ / $$ / $$ |$$ |  $$ |$$ |$$$$$$$$ |       \\____$$\\ $$ |  $$ |$$ |  \\__|\\$$\\$$  / $$ | \\$$\\$$  / $$$$$$$ |$$ |\n",
                " $$  /   $$ |  $$ |$$ | $$ | $$ |$$ |  $$ |$$ |$$   ____|      $$\\   $$ |$$ |  $$ |$$ |       \\$$$  /  $$ |  \\$$$  / $$  __$$ |$$ |\n",
                "$$$$$$$$\\\\$$$$$$  |$$ | $$ | $$ |$$$$$$$  |$$ |\\$$$$$$$\\       \\$$$$$$  |\\$$$$$$  |$$ |        \\$  /   $$ |   \\$  /  \\$$$$$$$ |$$ |\n",
                "\\________|\\______/ \\__| \\__| \\__|\\_______/ \\__| \\_______|       \\______/  \\______/ \\__|         \\_/    \\__|    \\_/    \\_______|\\__|\n"};
        return zombie;
    }

}

