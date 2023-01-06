package inheritanceDemo.athlete;

public class SwimmerCompetitor extends Athlete implements SwimmingInterface{

    //international swimming federation
    private int finaPoints;

    public SwimmerCompetitor(String name, String nickName, int yearOfBirth, String team, int numberOfCompetitions, int finaPoints) {
        super(name, nickName, yearOfBirth, team, numberOfCompetitions);
        this.finaPoints = finaPoints;
    }

    @Override
    public void getBio() {
        super.getBio();
        System.out.println("Fina points " + finaPoints);
    }

    @Override
    public String getBodyType() {
        return "Lean muscle, long torso and flexible ankles";
    }

    @Override
    public void freeStyle() {
        System.out.println("swimming free style very fast");
    }

    @Override
    public void freeStyle(int distanceInMeters) {
        System.out.println("swimming " + distanceInMeters + "m freestyle very fast");
    }

    @Override
    public void compete() {
        super.compete();
        freeStyle();
    }
}
