package Marathon;

public abstract class Obstacle {
    public abstract void doIt(Competitor competitor);

}

class Wall extends Obstacle {
    int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.jump(height);
    }
}

class Water extends Obstacle {
    int length;

    public Water(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.swim(length);
    }
}

class Cross extends Obstacle {
    int length;

    public Cross(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.run(length);
    }
}

class MainCross {
    public static void main(String[] args) {

        Course c = new Course();
        Team team = new Team("Сборная");
        team.showTeam();

        c.doIt(team);
        System.out.println();
        team.showOnDistance();


    }
}
