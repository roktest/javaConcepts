package inheritanceDemo.athlete;

import java.util.Random;

public class BasketBallPlayer extends Athlete{

    //to stop other classes to overwrite use private
    private double freeThrowPercentage;
    private double pointsPerGame;



    public BasketBallPlayer(String name, String nickName, int yearOfBirth, String team, double freeThrowPercentage, double pointsPerGame, int gamesPlayed) {
        super(name, nickName, yearOfBirth, team, gamesPlayed);
        this.freeThrowPercentage = freeThrowPercentage;
        this.pointsPerGame = pointsPerGame;
    }

    public void freeThrow(){
        Random randomNumberGenerator = new Random();
        double expectedFreeThrowPercentage = randomNumberGenerator.nextDouble() * 100;
        if(expectedFreeThrowPercentage > freeThrowPercentage){
            // random.nextDouble() returns a number between 1..0 if we need we can multiply the result to get other results
            System.out.println(super.getName() + " - Failed to score free throw. Expected: " + expectedFreeThrowPercentage + " - Actual: " + freeThrowPercentage);
        } else {
            System.out.println(super.getName() + " - Scored free throw. Expected: " + expectedFreeThrowPercentage + " - Actual: " + freeThrowPercentage);
        }
    }

    @Override
    public void getBio(){
        super.getBio();
        System.out.println("Free throw percentage " + freeThrowPercentage);
        System.out.println("Points per game " + pointsPerGame);
    }

    @Override
    public void playGame(){
        super.playGame();
        freeThrow();
    }

    public void setFreeThrowPercentage(double freeThrowPercentage) {
        this.freeThrowPercentage = freeThrowPercentage;
    }

    public void setPointsPerGame(double pointsPerGame) {
        this.pointsPerGame = pointsPerGame;
    }

}
