package Marathon;

public class Course {
    private Obstacle[] course;

    public Course() {
        Obstacle[] course =
                {
                        new Cross(80),
                        new Wall(5),
                        new Water(3)
                };
        this.course = course;
    }

    public void doIt(Team team) {
        Competitor[] competitors = team.competitors;
        for (Competitor c : competitors) {

            for (Obstacle o : course) {
                o.doIt(c);
                if (!c.isOnDistance()) {
                    break;
                }
            }
        }
    }
}
