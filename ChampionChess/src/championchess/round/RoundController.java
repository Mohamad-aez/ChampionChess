package championchess.round;

import championchess.Players.Player;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class RoundController {

    public static void startTournament(ArrayList<Player> playerList){
        System.out.println("All Players Info. : \n");
        playerList.forEach(player -> System.out.println("Name: " + player.getName() + " , Age: " + player.getAge() + " , Level: " + player.getPlayerCategory()));
    }

    public static ArrayList<Player> roundResults(Round round, ArrayList<Player> playerList){

        System.out.println("\n \n------------  Ronde " + round.name +"  ------------    \n\n");



        ArrayList<Player> firstGroup = new ArrayList();
        ArrayList<Player> secondGroup = new ArrayList();

        for (int i = 0; i < playerList.size(); i = i + 2) {
            firstGroup.add(playerList.get(i));
            secondGroup.add(playerList.get(i + 1));
        }

        ArrayList<Player> winnenPlayers = new ArrayList();

        for (int i = 0; i < firstGroup.size(); i++) {
            System.out.println("\n   Game " + (i + 1) + ": ");
            System.out.println(firstGroup.get(i).getName() + " VS " + secondGroup.get(i).getName());

            if (firstGroup.get(i).getPlayerCategory().equals(secondGroup.get(i).getPlayerCategory())) {
                int player1Score = 1 + (int) (Math.random() * ((50 - 1) + 1));
                int player2Score = 1 + (int) (Math.random() * ((50 - 1) + 1));
                if (player1Score > player2Score) {
                    winnenPlayers.add(firstGroup.get(i));
                } else if (player1Score < player2Score) {
                    winnenPlayers.add(secondGroup.get(i));
                } else {
                    winnenPlayers.add(secondGroup.get(i));
                }
            } else {
                if (firstGroup.get(i).getPlayerCategory() == "Professional" && secondGroup.get(i).getPlayerCategory() == "Amateur") {
                    int player1Score = 1 + (int) (Math.random() * ((50 - 1) + 1));
                    int player2Score = 1 + (int) (Math.random() * ((25 - 1) + 1));
                    if (player1Score > player2Score) {
                        winnenPlayers.add(firstGroup.get(i));
                    } else if (player1Score < player2Score) {
                        winnenPlayers.add(secondGroup.get(i));
                    } else {
                        winnenPlayers.add(firstGroup.get(i));
                    }
                } else {
                    int player1Score = 1 + (int) (Math.random() * ((25 - 1) + 1));
                    int player2Score = 1 + (int) (Math.random() * ((50 - 1) + 1));
                    if (player1Score > player2Score) {
                        winnenPlayers.add(firstGroup.get(i));
                    } else if (player1Score < player2Score) {
                        winnenPlayers.add(secondGroup.get(i));
                    } else {
                        winnenPlayers.add(firstGroup.get(i));
                    }
                }
            }

        }

        System.out.println("\n\n ------------- Rond "+ round.name +"Winning Players ------------- \n\n ");
        winnenPlayers.forEach(player -> System.out.println("Name: " + player.getName() + " , Age: " + player.getAge() + " , Level: " + player.getPlayerCategory()));
        return winnenPlayers;
    }

    public static void endTournament(Player player){
        System.out.println("\n\n ------------- Winning Player ------------- \n\n ");
        System.out.println("Name: " + player.getName() + " , Age: " + player.getAge() + " , Level: " + player.getPlayerCategory());
        System.out.println("\n\n ------------- End Of Champion ------------- \n\n ");

    }
}
