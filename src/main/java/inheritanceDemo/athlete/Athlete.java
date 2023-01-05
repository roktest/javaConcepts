package inheritanceDemo.athlete;

public class Athlete {
    //to stop other classes to overwrite use private
    private String name;
    private String nickName;
    private int yearOfBirth;
    private String team;
    private int gamesPlayed;

    public Athlete(String name, String nickName, int yearOfBirth, String team, int gamesPlayed) {
        this.name = name;
        this.nickName = nickName;
        this.yearOfBirth = yearOfBirth;
        this.team = team;
        this.gamesPlayed = gamesPlayed;
    }

    public String getName() {
        return name;
    }

    public void getBio(){
        System.out.println(name + " (" + nickName + ")");
        System.out.println("Born in " + yearOfBirth);
        System.out.println("Last Team " + team);
        System.out.println("Games played " + gamesPlayed);
    }
}
