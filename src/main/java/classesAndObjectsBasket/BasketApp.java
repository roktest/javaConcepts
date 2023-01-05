package classesAndObjectsBasket;

public class BasketApp {

    public static void main(String[] args) {

        BasketBallPlayer manu = new BasketBallPlayer("Emanuel David Ginóbili", "Manu", 1977, "San Antonio Spurs", 84.0, 13.3, 1057);
        BasketBallPlayer kobe = new BasketBallPlayer("Kobe Bryant", "Black Mamba", 1978, "Lakers", 83.7, 25.0, 1346);
        BasketBallPlayer jordan = new BasketBallPlayer("Michael Jordan", "MJ", 1963, "Chicago Bulls", 83.5, 30.1, 1072);
        BasketBallPlayer magic = new BasketBallPlayer("Earvin Johnson", "Magic", 1959, "lakers", 84.8, 19.5, 906);

        BasketBallPlayer[] basketBallPlayers = new BasketBallPlayer[4];

        basketBallPlayers[0] = manu;
        basketBallPlayers[1] = kobe;
        basketBallPlayers[2] = jordan;
        basketBallPlayers[3] = magic;

        for (BasketBallPlayer basketBallPlayer : basketBallPlayers){
            System.out.println(basketBallPlayer.name);
            basketBallPlayer.freeThrow();
            System.out.println();
        }

    }

}
