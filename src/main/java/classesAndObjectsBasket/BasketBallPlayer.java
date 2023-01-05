package classesAndObjectsBasket;

import java.util.Random;

public class BasketBallPlayer {

    String name;
    String nickName;
    int yearOfBirth;
    String team;

    double freeThrowPercentage;
    double pointsPerGame;
    int gamesPlayed;

    public BasketBallPlayer(String name, String nickName, int yearOfBirth, String team, double freeThrowPercentage, double pointsPerGame, int gamesPlayed) {
        this.name = name;
        this.nickName = nickName;
        this.yearOfBirth = yearOfBirth;
        this.team = team;
        this.freeThrowPercentage = freeThrowPercentage;
        this.pointsPerGame = pointsPerGame;
        this.gamesPlayed = gamesPlayed;
    }

    public void freeThrow(){
        Random randomNumberGenerator = new Random();
        double expectedFreeThrowPercentage = randomNumberGenerator.nextDouble() * 100;
        if(expectedFreeThrowPercentage > freeThrowPercentage){
            // random.nextDouble() returns a number between 1..0 if we need we can multiply the result to get other results
            System.out.println("Failed to score free throw. Expected: " + expectedFreeThrowPercentage + " - Actual: " + freeThrowPercentage);
        } else {
            System.out.println("Scored free throw. Expected: " + expectedFreeThrowPercentage + " - Actual: " + freeThrowPercentage);
        }
    }
}
