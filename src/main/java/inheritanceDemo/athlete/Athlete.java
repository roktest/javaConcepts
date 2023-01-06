package inheritanceDemo.athlete;

public abstract class Athlete {
    //to stop other classes to overwrite use private
    private String name;
    private String nickName;
    private int yearOfBirth;
    private String team;
    private int numberOfCompetitions;

    public Athlete(String name, String nickName, int yearOfBirth, String team, int numberOfCompetitions) {
        this.name = name;
        this.nickName = nickName;
        this.yearOfBirth = yearOfBirth;
        this.team = team;
        this.numberOfCompetitions = numberOfCompetitions;
    }

    public String getName() {
        return name;
    }

    public void getBio(){
        System.out.println(name + " (" + nickName + ")");
        System.out.println("Born in " + yearOfBirth);
        System.out.println("Last Team " + team);
        System.out.println("Took part in " + numberOfCompetitions + " competitions");
    }

    public void compete(){
        System.out.println(name + " took part in a competition");
        numberOfCompetitions++;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public abstract String getBodyType();
}
