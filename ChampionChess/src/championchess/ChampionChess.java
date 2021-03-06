
package championchess;

import championchess.Players.*;
import championchess.round.Round;
import championchess.round.RoundController;

import java.util.ArrayList;
import java.util.Collections;

public class ChampionChess {


    public static void main(String[] args) {

        String[] professionalListName = {"Ahmad", "Samar", "Amr", "Kamal", "Nour", "Nahed", "Mohamad", "Mira"};
        int[] professionalListAge = {29, 30, 31, 32, 33, 34, 35, 36};

        String[] amateurlListName = {"Jack", "Joun", "Mimy", "Kees", "Zlataan", "Suha", "Myram", "Dani"};
        int[] amateurListAge = {21, 22, 23, 24, 25, 26, 27, 28};
        ArrayList<Player> fullPlayersList = new ArrayList();
        for (int i = 0; i < professionalListName.length; i++) {
            fullPlayersList.add(new Professional(professionalListName[i], professionalListAge[i]));
        }
        for (int i = 0; i < amateurlListName.length; i++) {
            fullPlayersList.add(new Amateur(amateurlListName[i], amateurListAge[i]));
        }

        Collections.shuffle(fullPlayersList);


        Round round = new Round("One");
        Round round2 = new Round("Two");
        Round round3 = new Round("Three");
        Round round4 = new Round("Four");

        RoundController.startTournament(fullPlayersList);
        ArrayList<Player> round1Winners = RoundController.roundResults(round, fullPlayersList);
        ArrayList<Player> round2Winners = RoundController.roundResults(round2, round1Winners);
        ArrayList<Player> round3Winners = RoundController.roundResults(round3, round2Winners);
        ArrayList<Player> round4Winners = RoundController.roundResults(round4, round3Winners);

        RoundController.endTournament(round4Winners.get(0));
        // First Rond

        /*


        /*
        System.out.println("\n \n------------  Second Rond  ------------    \n\n");

        ArrayList<Player> firstGroupR2 = new ArrayList();
        ArrayList<Player> secondGroupR2 = new ArrayList();

        for (int i = 0; i < winnenPlayersR1.size(); i = i + 2) {
            firstGroupR2.add(winnenPlayersR1.get(i));
            secondGroupR2.add(winnenPlayersR1.get(i + 1));
        }

        ArrayList<Player> winnenPlayersR2 = new ArrayList();

        for (int i = 0; i < firstGroupR2.size(); i++) {
            System.out.println("\n   Game " + (i + 1) + ": ");
            System.out.println(firstGroupR2.get(i).getName() + " VS " + secondGroupR2.get(i).getName());

            if (firstGroupR2.get(i).getPlayerCategory().equals(secondGroupR2.get(i).getPlayerCategory())) {
                int player1Score = 1 + (int) (Math.random() * ((50 - 1) + 1));
                int player2Score = 1 + (int) (Math.random() * ((50 - 1) + 1));
                if (player1Score > player2Score) {
                    winnenPlayersR2.add(firstGroupR2.get(i));
                } else if (player1Score < player2Score) {
                    winnenPlayersR2.add(secondGroupR2.get(i));
                } else {
                    winnenPlayersR2.add(secondGroupR2.get(i));
                }
            } else {
                if (firstGroupR2.get(i).getPlayerCategory() == "Professional" && secondGroupR2.get(i).getPlayerCategory() == "Amateur") {
                    int player1Score = 1 + (int) (Math.random() * ((50 - 1) + 1));
                    int player2Score = 1 + (int) (Math.random() * ((25 - 1) + 1));
                    if (player1Score > player2Score) {
                        winnenPlayersR2.add(firstGroupR2.get(i));
                    } else if (player1Score < player2Score) {
                        winnenPlayersR2.add(secondGroupR2.get(i));
                    } else {
                        winnenPlayersR2.add(firstGroupR2.get(i));
                    }
                } else {
                    int player1Score = 1 + (int) (Math.random() * ((25 - 1) + 1));
                    int player2Score = 1 + (int) (Math.random() * ((50 - 1) + 1));
                    if (player1Score > player2Score) {
                        winnenPlayersR2.add(firstGroupR2.get(i));
                    } else if (player1Score < player2Score) {
                        winnenPlayersR2.add(secondGroupR2.get(i));
                    } else {
                        winnenPlayersR2.add(firstGroupR2.get(i));
                    }
                }
            }

        }
        System.out.println("\n\n ------------- Rond Two Winning Players ------------- \n\n ");
        winnenPlayersR2.forEach(player -> System.out.println("Name: " + player.getName() + " , Age: " + player.getAge() + " , Level: " + player.getPlayerCategory()));


        //////////////

        System.out.println("\n \n------------  Third Rond  ------------    \n\n");

        ArrayList<Player> firstGroupR3 = new ArrayList();
        ArrayList<Player> secondGroupR3 = new ArrayList();

        for (int i = 0; i < winnenPlayersR2.size(); i = i + 2) {
            firstGroupR3.add(winnenPlayersR2.get(i));
            secondGroupR3.add(winnenPlayersR2.get(i + 1));
        }

        ArrayList<Player> winnenPlayersR3 = new ArrayList();

        for (int i = 0; i < firstGroupR3.size(); i++) {
            System.out.println("\n   Game " + (i + 1) + ": ");
            System.out.println(firstGroupR3.get(i).getName() + " VS " + secondGroupR3.get(i).getName());

            if (firstGroupR3.get(i).getPlayerCategory().equals(secondGroupR3.get(i).getPlayerCategory())) {
                int player1Score = 1 + (int) (Math.random() * ((50 - 1) + 1));
                int player2Score = 1 + (int) (Math.random() * ((50 - 1) + 1));
                if (player1Score > player2Score) {
                    winnenPlayersR3.add(firstGroupR3.get(i));
                } else if (player1Score < player2Score) {
                    winnenPlayersR3.add(secondGroupR3.get(i));
                } else {
                    winnenPlayersR3.add(secondGroupR3.get(i));
                }
            } else {
                if (firstGroupR3.get(i).getPlayerCategory() == "Professional" && secondGroupR3.get(i).getPlayerCategory() == "Amateur") {
                    int player1Score = 1 + (int) (Math.random() * ((50 - 1) + 1));
                    int player2Score = 1 + (int) (Math.random() * ((25 - 1) + 1));
                    if (player1Score > player2Score) {
                        winnenPlayersR3.add(firstGroupR3.get(i));
                    } else if (player1Score < player2Score) {
                        winnenPlayersR3.add(secondGroupR3.get(i));
                    } else {
                        winnenPlayersR3.add(firstGroupR3.get(i));
                    }
                } else {
                    int player1Score = 1 + (int) (Math.random() * ((25 - 1) + 1));
                    int player2Score = 1 + (int) (Math.random() * ((50 - 1) + 1));
                    if (player1Score > player2Score) {
                        winnenPlayersR3.add(firstGroupR3.get(i));
                    } else if (player1Score < player2Score) {
                        winnenPlayersR3.add(secondGroupR3.get(i));
                    } else {
                        winnenPlayersR3.add(firstGroupR3.get(i));
                    }
                }
            }

        }
        System.out.println("\n\n ------------- Rond Three Winning Players ------------- \n\n ");
        winnenPlayersR3.forEach(player -> System.out.println("Name: " + player.getName() + " , Age: " + player.getAge() + " , Level: " + player.getPlayerCategory()));


        /////////////

        System.out.println("\n \n------------  Final Rond  ------------    \n\n");


        ArrayList<Player> winningPlayer = new ArrayList();


        System.out.println(winnenPlayersR3.get(0).getName() + " VS " + secondGroupR3.get(1).getName());

        if (winnenPlayersR3.get(0).getPlayerCategory().equals(winnenPlayersR3.get(1).getPlayerCategory())) {
            int player1Score = 1 + (int) (Math.random() * ((50 - 1) + 1));
            int player2Score = 1 + (int) (Math.random() * ((50 - 1) + 1));
            if (player1Score > player2Score) {
                winningPlayer.add(winnenPlayersR3.get(0));
            } else if (player1Score < player2Score) {
                winningPlayer.add(winnenPlayersR3.get(1));
            } else {
                winningPlayer.add(winnenPlayersR3.get(0));
            }
        } else {
            if (winnenPlayersR3.get(0).getPlayerCategory() == "Professional" && winnenPlayersR3.get(1).getPlayerCategory() == "Amateur") {
                int player1Score = 1 + (int) (Math.random() * ((50 - 1) + 1));
                int player2Score = 1 + (int) (Math.random() * ((25 - 1) + 1));
                if (player1Score > player2Score) {
                    winningPlayer.add(winnenPlayersR3.get(0));
                } else if (player1Score < player2Score) {
                    winningPlayer.add(winnenPlayersR3.get(1));
                } else {
                    winningPlayer.add(winnenPlayersR3.get(0));
                }
            } else {
                int player1Score = 1 + (int) (Math.random() * ((25 - 1) + 1));
                int player2Score = 1 + (int) (Math.random() * ((50 - 1) + 1));
                if (player1Score > player2Score) {
                    winningPlayer.add(winnenPlayersR3.get(0));
                } else if (player1Score < player2Score) {
                    winningPlayer.add(winnenPlayersR3.get(1));
                } else {
                    winningPlayer.add(winnenPlayersR3.get(0));
                }
            }
        }


        System.out.println("\n\n ------------- Winning Player ------------- \n\n ");
        winningPlayer.forEach(player -> System.out.println("Name: " + player.getName() + " , Age: " + player.getAge() + " , Level: " + player.getPlayerCategory()));
        System.out.println("\n\n ------------- End Of Champion ------------- \n\n ");
*/

    }

}