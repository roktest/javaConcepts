package inheritanceDemo.athlete;

public class AthleteApp {

    public static void main(String[] args) {

        BasketBallPlayer manu = new BasketBallPlayer("Emanuel David Ginóbili", "Manu", 1977, "San Antonio Spurs", 84.0, 13.3, 1057);
        BasketBallPlayer kobe = new BasketBallPlayer("Kobe Bryant", "Black Mamba", 1978, "Lakers", 83.7, 25.0, 1346);
        BasketBallPlayer jordan = new BasketBallPlayer("Michael Jordan", "MJ", 1963, "Chicago Bulls", 83.5, 30.1, 1072);
        BasketBallPlayer magic = new BasketBallPlayer("Earvin Johnson", "Magic", 1959, "lakers", 84.8, 19.5, 906);
        kobe.setFreeThrowPercentage(83.8);
        kobe.setPointsPerGame(25.5);

        BasketBallPlayer[] basketBallPlayers = new BasketBallPlayer[4];

        basketBallPlayers[0] = manu;
        basketBallPlayers[1] = kobe;
        basketBallPlayers[2] = jordan;
        basketBallPlayers[3] = magic;

        for (BasketBallPlayer basketBallPlayer : basketBallPlayers){
            // System.out.println(basketBallPlayer.name); // won't be allowed once the variables of the class are private
            basketBallPlayer.playGame();
            basketBallPlayer.getBio();
            System.out.println();
        }

        FootballPlayer kosta = new FootballPlayer("Kosta Karageorge", "Kosta", 1992, "Ohio State University", 400, 210, 670);
        FootballPlayer thomas = new FootballPlayer("Thomas Edward Patrick Brady, Jr.", "Tom Brady", 1977, "Tampa Bay Buccaneers", 285, 9988, 6377);
        FootballPlayer damar = new FootballPlayer("Damar Romeyelle Hamlin", "Damar Hamlin", 1998 , "Bills", 568, 234, 956);
        FootballPlayer chris = new FootballPlayer("Chris Henry", "Chris", 1983, "Cincinnati Bengals", 897, 346, 876);
        kosta.setTeam("River Plate");
        kosta.increaseCompletions(10);
        kosta.increasePassingYards(20);

        FootballPlayer[] footballPlayers = new FootballPlayer[4];

        footballPlayers[0] = kosta;
        footballPlayers[1] = thomas;
        footballPlayers[2] = damar;
        footballPlayers[3] = chris;

        for(FootballPlayer footballPlayer: footballPlayers){
            footballPlayer.playGame();
            footballPlayer.getBio();
            System.out.println();
        }

    }

}
