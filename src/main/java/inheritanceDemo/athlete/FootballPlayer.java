package inheritanceDemo.athlete;

public class FootballPlayer extends Athlete{

    private int completions;
    private int passingYards;

    public FootballPlayer(String name, String nickName, int yearOfBirth, String team, int gamesPlayed, int completions, int passingYards){
        super(name, nickName, yearOfBirth, team, gamesPlayed);
        this.completions = completions;
        this.passingYards = passingYards;
    }

    @Override
    public void getBio(){
        super.getBio();
        System.out.println("Completions " + completions);
        System.out.println("Passing Yards " + passingYards);
    }

    public void increaseCompletions(int completions){
        this.completions = this.completions + completions;
    }

    public void increasePassingYards(int passingYards){
        this.passingYards = this.passingYards + passingYards;
    }
}
