import java.util.Scanner;

public class Kabo {
    public static void main(String[] args) throws Exception {
        Helpers.clearConsole();
        Deck deck = new Deck();
        Player player1 = new Player("Dennis", deck);
        Player player2 = new Player("Simone", deck);

        // Set Active Player
        Player activate_player = null;
        if (activate_player == null | activate_player == player2) {
            activate_player = player1;
        } else {
            activate_player = player2;
        }


        Card drawnCard = activate_player.draw(deck);

        Scanner input = new Scanner(System.in);
        System.out.println("1: Get" + "\t|" + "2: Activate" + "\t|" + "3: Nothing");
        String option = input.nextLine();
        Helpers.clearConsole();

        switch (option) {
            case "1":
                System.out.println("Which card to change?");
                option = input.nextLine();
                activate_player.takeDrawnCard(Integer.parseInt(option), drawnCard);
            case "2":
                break;
            case "3":
                break;
        }

        Helpers.clearConsole();
        System.out.println("Wanna CABO?");
        option = input.nextLine();

        input.close();
    }

    

    public void changeActivePlayer() {
    }

    
}
